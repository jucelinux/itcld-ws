package com.itcld.imoveis_ws.util;

import com.itcld.imoveis_ws.schema._123i.Imovel;

public class AppUtils {

	public static final String CARPETE = "carpete";
	public static final String PISO_MADEIRA_1 = "tábua";
	public static final String PISO_MADEIRA_2 = "taco de madeira";
	public static final String PISO_FRIO_1 = "porcelanato";
	public static final String PISO_FRIO_2 = "cimento queimado";
	public static final String PISO_FRIO_3 = "cerâmica";
	public static final String PISO_LAMINADO = "carpete de madeira";
	public static final String VISTA_PARA = "frente água";
	
	public static boolean checkLongOrConditions(Long... conditions){
		boolean ret = false;
		
		for(Long condition : conditions){
			ret = ret || (condition != null && condition == 1L);
			if(ret == true)
				return true;
		}
		return ret;
	}
	
	public static boolean isCarpete(Imovel i){
		
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
	
	public static boolean isPisoMadeira(Imovel i){
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
	
	public static boolean isPisoFrio(Imovel i){
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
	
	public static boolean isPisoLaminado(Imovel i){
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
