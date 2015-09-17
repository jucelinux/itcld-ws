package com.itcld.imoveis_ws.bo;

import static com.itcld.imoveis_ws.util.SegmentoImovel.getSegmentoImovel;

import com.itcld.imoveis_ws.schema._123i.Carga.Imoveis;
import com.itcld.imoveis_ws.schema._123i.Imovel;
import com.itcld.imoveis_ws.schema._123i.Imovel123IRequest;
import com.itcld.imoveis_ws.schema._123i.Imovel123IResponse;
import com.itcld.imoveis_ws.util.AppUtils;
import com.itcld.imoveis_ws.util.SegmentoImovel;

public class _123iBO {

	public void validaRequest(Imovel123IRequest request,Imovel123IResponse response){
		for(Imoveis imoveis : request.getCarga().getImoveis()){
			for(Imovel imovel : imoveis.getImovel()){
				defineSegmentoImovel(imovel);
				validaMarina(imovel);
				validaSauna(imovel);
				validaAndarInteiro(imovel);
				validaArmario(imovel);
				validaFrenteMar(imovel);
				validaCarpete(imovel);
				validaPisoMadeira(imovel);
				validaPisoFrio(imovel);
				validaPisoLaminado(imovel);
			}
		}
	}

	private void defineSegmentoImovel(Imovel imovel) {
		String tipoImovel = imovel.getTipoImovel();
		SegmentoImovel seg = getSegmentoImovel(tipoImovel);
		imovel.setTipoImovel(seg.tipo);
		imovel.setSubTipoImovel(seg.subtipo);
		imovel.setCategoriaImovel(seg.categoria);
	}

	private void validaMarina(Imovel imovel) {
		if(AppUtils.checkLongOrConditions(imovel.getUnidade().getMarinaVagaMolhada(), imovel.getUnidade().getMarinaVagaSeca())){
			imovel.getUnidade().setMarina(1L);
		}
		
		if(AppUtils.checkLongOrConditions(imovel.getCondominio().getMarinaVagaMolhada(), imovel.getCondominio().getMarinaVagaSeca())){
			imovel.getCondominio().setMarina(1L);
		}
	}
	
	private void validaSauna(Imovel imovel) {
		if(AppUtils.checkLongOrConditions(imovel.getUnidade().getSaunaSeca(), imovel.getUnidade().getSaunaUmida())){
			imovel.getUnidade().setSauna(1L);
		}
		
		if(AppUtils.checkLongOrConditions(imovel.getCondominio().getSaunaSeca(), imovel.getCondominio().getSaunaSeca())){
			imovel.getCondominio().setSauna(1L);
		}
	}
	
	private void validaAndarInteiro(Imovel imovel) {
		if(imovel.getQtdUnidadesAndar() != null && imovel.getQtdAndar() == 1){
			imovel.getUnidade().setAndarInteiro(1L);
		}
	}
	
	private void validaArmario(Imovel imovel) {
		boolean uCk;
		uCk = AppUtils.checkLongOrConditions(
				imovel.getUnidade().getArmarioAreaServico(), 
				imovel.getUnidade().getArmarioCozinha(),
				imovel.getUnidade().getArmarioEmpregada(),
				imovel.getUnidade().getArmarioSala(),
				imovel.getUnidade().getArmarioBanheiro(),
				imovel.getUnidade().getArmarioCorredor(),
				imovel.getUnidade().getArmarioEscritorio(),
				imovel.getUnidade().getArmarioHomeTheater(),
				imovel.getUnidade().getArmarioDormitorios()
				);
				
		if(uCk){
			imovel.getUnidade().setArmarioEmbutido(1L);
		}
	}
	

	private void validaFrenteMar(Imovel imovel) {
		if(imovel.getUnidade().getVista() != null && imovel.getUnidade().getVista().toLowerCase().equals(AppUtils.VISTA_PARA)){
			imovel.getUnidade().setFrenteMar(1L);
		}
	}
	
	private void validaCarpete(Imovel imovel) {
		
	}
	
	private void validaPisoMadeira(Imovel imovel) {
		
	}
	
	private void validaPisoFrio(Imovel imovel) {
		
	}

	private void validaPisoLaminado(Imovel imovel) {
		
	}
}
