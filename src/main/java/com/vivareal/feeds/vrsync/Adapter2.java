//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.03.02 às 09:49:38 AM BRT 
//


package com.vivareal.feeds.vrsync;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return new String(value);
    }

    public String marshal(String value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
