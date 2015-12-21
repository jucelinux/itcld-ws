package com.itcld.imoveis_ws.bo;

import static com.itcld.imoveis_ws.util.AppUtils.CARPETE;
import static com.itcld.imoveis_ws.util.AppUtils.PISO_FRIO_1;
import static com.itcld.imoveis_ws.util.AppUtils.PISO_FRIO_2;
import static com.itcld.imoveis_ws.util.AppUtils.PISO_FRIO_3;
import static com.itcld.imoveis_ws.util.AppUtils.PISO_LAMINADO;
import static com.itcld.imoveis_ws.util.AppUtils.PISO_MADEIRA_1;
import static com.itcld.imoveis_ws.util.AppUtils.PISO_MADEIRA_2;
import static com.itcld.imoveis_ws.util.AppUtils.checkLongOrConditions;
import static com.itcld.imoveis_ws.util.SegmentoImovel.getSegmentoImovel;

import java.util.ArrayList;
import java.util.List;

import com.itcld.imoveis_ws.schema._123i.Carga;
import com.itcld.imoveis_ws.schema._123i.Carga.Imoveis;
import com.itcld.imoveis_ws.schema._123i.Imovel;
import com.itcld.imoveis_ws.schema._123i.Imovel123IRequest;
import com.itcld.imoveis_ws.util.AppConst;
import com.itcld.imoveis_ws.util.AppUtils;
import com.itcld.imoveis_ws.util.SegmentoImovel;

public class _123iBO {
	
	private Carga cargaPraia;
	private Carga cargaCampo;
	private boolean xmlPraia;
	private boolean xmlCampo;

	public _123iBO(){
		cargaPraia = new Carga();
		cargaCampo = new Carga();
		cargaPraia.setImoveis(new Imoveis());
		cargaCampo.setImoveis(new Imoveis());
	}
	
	public void validaRequest(Imovel123IRequest request){
		
		Imoveis imoveis = request.getCarga().getImoveis();
		List<Imovel> listaRemocao = new ArrayList<Imovel>();
		
		for(Imovel imovel : imoveis.getImovel()){
			validaImovel(imovel);
			if(validaTipo(imovel)){
				listaRemocao.add(imovel);
			}
		}
		
		for(Imovel imovel : listaRemocao){
			request.getCarga().getImoveis().getImovel().remove(imovel);
		}
	}

	private boolean validaTipo(Imovel imovel) {
		
		Imovel imovelValida = imovel;
		boolean ret = false;
		
		if(imovel.getLocal().toLowerCase().contains(AppConst.CAMPO)){
			xmlCampo = true;
			ret = true;
			imovelValida.setCodigoCliente(AppConst.COD_CLI);
			cargaCampo.getImoveis().getImovel().add(imovelValida);
		}else if(imovel.getLocal().toLowerCase().contains(AppConst.PRAIA)){
			xmlPraia = true;
			ret = true;
			imovelValida.setCodigoCliente(AppConst.COD_CLI);
			cargaPraia.getImoveis().getImovel().add(imovelValida);
		}
		
		return ret;
	}

	private void validaImovel(Imovel imovel) {
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

	private void defineSegmentoImovel(Imovel imovel) {
		String tipoImovel = imovel.getTipoImovel();
		SegmentoImovel seg = getSegmentoImovel(tipoImovel);
		imovel.setTipoImovel(seg.tipo);
		imovel.setSubTipoImovel(seg.subtipo);
		imovel.setCategoriaImovel(seg.categoria);
	}

	private void validaMarina(Imovel imovel) {
		if(checkLongOrConditions(imovel.getDetalhes().getMarinaVagaMolhada(), imovel.getDetalhes().getMarinaVagaSeca())){
			imovel.getDetalhes().setMarina(1L);
		}
		
		if(AppUtils.checkLongOrConditions(imovel.getCondominio().getMarinaVagaMolhada(), imovel.getCondominio().getMarinaVagaSeca())){
			imovel.getCondominio().setMarina(1L);
		}
	}
	
	private void validaSauna(Imovel imovel) {
		if(AppUtils.checkLongOrConditions(imovel.getDetalhes().getSaunaSeca(), imovel.getDetalhes().getSaunaUmida())){
			imovel.getDetalhes().setSauna(1L);
		}
		
		if(AppUtils.checkLongOrConditions(imovel.getCondominio().getSaunaSeca(), imovel.getCondominio().getSaunaSeca())){
			imovel.getCondominio().setSauna(1L);
		}
	}
	
	private void validaAndarInteiro(Imovel imovel) {
		if(imovel.getQtdUnidadesAndar() != null){
			imovel.getDetalhes().setAndarInteiro(1L);
		}
	}
	
	private void validaArmario(Imovel imovel) {
		boolean uCk;
		uCk = AppUtils.checkLongOrConditions(
				imovel.getDetalhes().getArmarioAreaServico(), 
				imovel.getDetalhes().getArmarioCozinha(),
				imovel.getDetalhes().getArmarioEmpregada(),
				imovel.getDetalhes().getArmarioSala(),
				imovel.getDetalhes().getArmarioBanheiro(),
				imovel.getDetalhes().getArmarioCorredor(),
				imovel.getDetalhes().getArmarioEscritorio(),
				imovel.getDetalhes().getArmarioHomeTheater(),
				imovel.getDetalhes().getArmarioDormitorios()
				);
				
		if(uCk){
			imovel.getDetalhes().setArmarioEmbutido(1L);
		}
	}
	

	private void validaFrenteMar(Imovel imovel) {
		if(imovel.getDetalhes().getVista() != null && imovel.getDetalhes().getVista().toLowerCase().equals(AppUtils.VISTA_PARA)){
			imovel.getDetalhes().setFrenteMar(1L);
		}
	}
	
	public static boolean validaCarpete(Imovel i){
		String areaLazer   = i.getDetalhes().getAcabamentoAreaLazer();
		String cozinha     = i.getDetalhes().getAcabamentoCozinha();
		String living      = i.getDetalhes().getAcabamentoLiving();
		String banheiros   = i.getDetalhes().getAcabamentoBanheiros();
		String dormitorios = i.getDetalhes().getAcabamentoDormitorios();
		
		boolean check = false;
		
		check = check || (areaLazer != null && areaLazer.toLowerCase().equals(CARPETE));
		check = check || (cozinha != null && cozinha.toLowerCase().equals(CARPETE));
		check = check || (living != null && living.toLowerCase().equals(CARPETE));
		check = check || (banheiros != null && banheiros.toLowerCase().equals(CARPETE));
		check = check || (dormitorios != null && dormitorios.toLowerCase().equals(CARPETE));
		
		return check;
	}
	
	public static boolean validaPisoMadeira(Imovel i){
		String areaLazer   = i.getDetalhes().getAcabamentoAreaLazer();
		String cozinha     = i.getDetalhes().getAcabamentoCozinha();
		String living      = i.getDetalhes().getAcabamentoLiving();
		String banheiros   = i.getDetalhes().getAcabamentoBanheiros();
		String dormitorios = i.getDetalhes().getAcabamentoDormitorios();
		
		boolean check = false;
		
		check = check || (areaLazer != null && (areaLazer.toLowerCase().equals(PISO_MADEIRA_1) || areaLazer.toLowerCase().equals(PISO_MADEIRA_2)));
		check = check || (cozinha != null && (cozinha.toLowerCase().equals(PISO_MADEIRA_1) || cozinha.toLowerCase().equals(PISO_MADEIRA_2)));
		check = check || (living != null && (living.toLowerCase().equals(PISO_MADEIRA_1) || living.toLowerCase().equals(PISO_MADEIRA_2)));
		check = check || (banheiros != null && (banheiros.toLowerCase().equals(PISO_MADEIRA_1) || banheiros.toLowerCase().equals(PISO_MADEIRA_2)));
		check = check || (dormitorios != null && (dormitorios.toLowerCase().equals(PISO_MADEIRA_1) || dormitorios.toLowerCase().equals(PISO_MADEIRA_2)));
		
		return check;
	}
	
	public static boolean validaPisoFrio(Imovel i){
		String areaLazer   = i.getDetalhes().getAcabamentoAreaLazer();
		String cozinha     = i.getDetalhes().getAcabamentoCozinha();
		String living      = i.getDetalhes().getAcabamentoLiving();
		String banheiros   = i.getDetalhes().getAcabamentoBanheiros();
		String dormitorios = i.getDetalhes().getAcabamentoDormitorios();
		
		boolean check = false;
		
		check = check || (areaLazer != null && (areaLazer.toLowerCase().equals(PISO_FRIO_1) || areaLazer.toLowerCase().equals(PISO_FRIO_2) || dormitorios.toLowerCase().equals(PISO_FRIO_3)));
		check = check || (cozinha != null && (cozinha.toLowerCase().equals(PISO_FRIO_1) || cozinha.toLowerCase().equals(PISO_FRIO_2) || dormitorios.toLowerCase().equals(PISO_FRIO_3)));
		check = check || (living != null && (living.toLowerCase().equals(PISO_FRIO_1) || living.toLowerCase().equals(PISO_FRIO_2) || dormitorios.toLowerCase().equals(PISO_FRIO_3)));
		check = check || (banheiros != null && (banheiros.toLowerCase().equals(PISO_FRIO_1) || banheiros.toLowerCase().equals(PISO_FRIO_2) || dormitorios.toLowerCase().equals(PISO_FRIO_3)));
		check = check || (dormitorios != null && (dormitorios.toLowerCase().equals(PISO_FRIO_1) || dormitorios.toLowerCase().equals(PISO_FRIO_2) || dormitorios.toLowerCase().equals(PISO_FRIO_3)));
		
		return check;
	}
	
	public static boolean validaPisoLaminado(Imovel i){
		String areaLazer   = i.getDetalhes().getAcabamentoAreaLazer();
		String cozinha     = i.getDetalhes().getAcabamentoCozinha();
		String living      = i.getDetalhes().getAcabamentoLiving();
		String banheiros   = i.getDetalhes().getAcabamentoBanheiros();
		String dormitorios = i.getDetalhes().getAcabamentoDormitorios();
		
		boolean check = false;
		
		check = check || (areaLazer != null && areaLazer.toLowerCase().equals(PISO_LAMINADO));
		check = check || (cozinha != null && cozinha.toLowerCase().equals(PISO_LAMINADO));
		check = check || (living != null && living.toLowerCase().equals(PISO_LAMINADO));
		check = check || (banheiros != null && banheiros.toLowerCase().equals(PISO_LAMINADO));
		check = check || (dormitorios != null && dormitorios.toLowerCase().equals(PISO_LAMINADO));
		
		return check;
	}

	public Carga getCargaPraia() {
		return cargaPraia;
	}

	public Carga getCargaCampo() {
		return cargaCampo;
	}

	public boolean isXmlCampo() {
		return xmlCampo;
	}

	public void setXmlCampo(boolean xmlCampo) {
		this.xmlCampo = xmlCampo;
	}

	public boolean isXmlPraia() {
		return xmlPraia;
	}

	public void setXmlPraia(boolean xmlPraia) {
		this.xmlPraia = xmlPraia;
	}
}	
