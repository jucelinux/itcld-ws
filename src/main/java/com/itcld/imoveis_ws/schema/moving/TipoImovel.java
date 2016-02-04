//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.02.04 às 09:43:18 AM BRST 
//


package com.itcld.imoveis_ws.schema.moving;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TipoImovel.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoImovel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Apartamento"/>
 *     &lt;enumeration value="Casa"/>
 *     &lt;enumeration value="Terreno"/>
 *     &lt;enumeration value="Rural"/>
 *     &lt;enumeration value="Galpao"/>
 *     &lt;enumeration value="Negocio"/>
 *     &lt;enumeration value="Escritorio"/>
 *     &lt;enumeration value="Loja"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoImovel")
@XmlEnum
public enum TipoImovel {

    @XmlEnumValue("Apartamento")
    APARTAMENTO("Apartamento"),
    @XmlEnumValue("Casa")
    CASA("Casa"),
    @XmlEnumValue("Terreno")
    TERRENO("Terreno"),
    @XmlEnumValue("Rural")
    RURAL("Rural"),
    @XmlEnumValue("Galpao")
    GALPAO("Galpao"),
    @XmlEnumValue("Negocio")
    NEGOCIO("Negocio"),
    @XmlEnumValue("Escritorio")
    ESCRITORIO("Escritorio"),
    @XmlEnumValue("Loja")
    LOJA("Loja");
    private final String value;

    TipoImovel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoImovel fromValue(String v) {
        for (TipoImovel c: TipoImovel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
