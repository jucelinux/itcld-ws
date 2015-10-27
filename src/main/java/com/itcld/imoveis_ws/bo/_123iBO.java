package com.itcld.imoveis_ws.bo;

import static com.itcld.imoveis_ws.util.SegmentoImovel.getSegmentoImovel;
import static com.itcld.imoveis_ws.util.AppUtils.*;
import com.itcld.imoveis_ws.schema._123i.Carga.Imoveis;
import com.itcld.imoveis_ws.schema._123i.Imovel;
import com.itcld.imoveis_ws.schema._123i.Imovel123IRequest;
import com.itcld.imoveis_ws.util.AppUtils;
import com.itcld.imoveis_ws.util.SegmentoImovel;

public class _123iBO {

	public void validaRequest(Imovel123IRequest request){
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
		if(checkLongOrConditions(imovel.getUnidade().getMarinaVagaMolhada(), imovel.getUnidade().getMarinaVagaSeca())){
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
	
	public static boolean validaCarpete(Imovel i){
		String areaLazer   = i.getUnidade().getAcabamentoAreaLazer();
		String cozinha     = i.getUnidade().getAcabamentoCozinha();
		String living      = i.getUnidade().getAcabamentoLiving();
		String banheiros   = i.getUnidade().getAcabamentoBanheiros();
		String dormitorios = i.getUnidade().getAcabamentoDormitorios();
		
		boolean check = false;
		
		check = check || (areaLazer != null && areaLazer.toLowerCase().equals(CARPETE));
		check = check || (cozinha != null && cozinha.toLowerCase().equals(CARPETE));
		check = check || (living != null && living.toLowerCase().equals(CARPETE));
		check = check || (banheiros != null && banheiros.toLowerCase().equals(CARPETE));
		check = check || (dormitorios != null && dormitorios.toLowerCase().equals(CARPETE));
		
		return check;
	}
	
	public static boolean validaPisoMadeira(Imovel i){
		String areaLazer   = i.getUnidade().getAcabamentoAreaLazer();
		String cozinha     = i.getUnidade().getAcabamentoCozinha();
		String living      = i.getUnidade().getAcabamentoLiving();
		String banheiros   = i.getUnidade().getAcabamentoBanheiros();
		String dormitorios = i.getUnidade().getAcabamentoDormitorios();
		
		boolean check = false;
		
		check = check || (areaLazer != null && (areaLazer.toLowerCase().equals(PISO_MADEIRA_1) || areaLazer.toLowerCase().equals(PISO_MADEIRA_2)));
		check = check || (cozinha != null && (cozinha.toLowerCase().equals(PISO_MADEIRA_1) || cozinha.toLowerCase().equals(PISO_MADEIRA_2)));
		check = check || (living != null && (living.toLowerCase().equals(PISO_MADEIRA_1) || living.toLowerCase().equals(PISO_MADEIRA_2)));
		check = check || (banheiros != null && (banheiros.toLowerCase().equals(PISO_MADEIRA_1) || banheiros.toLowerCase().equals(PISO_MADEIRA_2)));
		check = check || (dormitorios != null && (dormitorios.toLowerCase().equals(PISO_MADEIRA_1) || dormitorios.toLowerCase().equals(PISO_MADEIRA_2)));
		
		return check;
	}
	
	public static boolean validaPisoFrio(Imovel i){
		String areaLazer   = i.getUnidade().getAcabamentoAreaLazer();
		String cozinha     = i.getUnidade().getAcabamentoCozinha();
		String living      = i.getUnidade().getAcabamentoLiving();
		String banheiros   = i.getUnidade().getAcabamentoBanheiros();
		String dormitorios = i.getUnidade().getAcabamentoDormitorios();
		
		boolean check = false;
		
		check = check || (areaLazer != null && (areaLazer.toLowerCase().equals(PISO_FRIO_1) || areaLazer.toLowerCase().equals(PISO_FRIO_2) || dormitorios.toLowerCase().equals(PISO_FRIO_3)));
		check = check || (cozinha != null && (cozinha.toLowerCase().equals(PISO_FRIO_1) || cozinha.toLowerCase().equals(PISO_FRIO_2) || dormitorios.toLowerCase().equals(PISO_FRIO_3)));
		check = check || (living != null && (living.toLowerCase().equals(PISO_FRIO_1) || living.toLowerCase().equals(PISO_FRIO_2) || dormitorios.toLowerCase().equals(PISO_FRIO_3)));
		check = check || (banheiros != null && (banheiros.toLowerCase().equals(PISO_FRIO_1) || banheiros.toLowerCase().equals(PISO_FRIO_2) || dormitorios.toLowerCase().equals(PISO_FRIO_3)));
		check = check || (dormitorios != null && (dormitorios.toLowerCase().equals(PISO_FRIO_1) || dormitorios.toLowerCase().equals(PISO_FRIO_2) || dormitorios.toLowerCase().equals(PISO_FRIO_3)));
		
		return check;
	}
	
	public static boolean validaPisoLaminado(Imovel i){
		String areaLazer   = i.getUnidade().getAcabamentoAreaLazer();
		String cozinha     = i.getUnidade().getAcabamentoCozinha();
		String living      = i.getUnidade().getAcabamentoLiving();
		String banheiros   = i.getUnidade().getAcabamentoBanheiros();
		String dormitorios = i.getUnidade().getAcabamentoDormitorios();
		
		boolean check = false;
		
		check = check || (areaLazer != null && areaLazer.toLowerCase().equals(PISO_LAMINADO));
		check = check || (cozinha != null && cozinha.toLowerCase().equals(PISO_LAMINADO));
		check = check || (living != null && living.toLowerCase().equals(PISO_LAMINADO));
		check = check || (banheiros != null && banheiros.toLowerCase().equals(PISO_LAMINADO));
		check = check || (dormitorios != null && dormitorios.toLowerCase().equals(PISO_LAMINADO));
		
		return check;
	}
}
