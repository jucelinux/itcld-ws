package com.itcld.imoveis_ws.util;

public class AppUtils {

	public static final String CARPETE = "carpete";
	public static final String PISO_MADEIRA_1 = "tábua";
	public static final String PISO_MADEIRA_2 = "taco de madeira";
	public static final String PISO_FRIO_1 = "porcelanato";
	public static final String PISO_FRIO_2 = "cimento queimado";
	public static final String PISO_FRIO_3 = "cerâmica";
	public static final String PISO_LAMINADO = "carpete de madeira";
	public static final String VISTA_PARA = "frente água";
	
	public static boolean checkOrConditions(Long... conditions){
		boolean ret = false;
		
		for(Long condition : conditions){
			ret = ret || (condition != null && condition == 1L);
			if(ret == true)
				return true;
		}
		return ret;
	}
}
