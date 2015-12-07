//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.06 às 11:32:09 AM BRST 
//


package com.vivareal.feeds.vrsync;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de garagetype.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="garagetype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Parking Space"/>
 *     &lt;enumeration value="Garage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "garagetype")
@XmlEnum
public enum Garagetype {

    @XmlEnumValue("Parking Space")
    PARKING_SPACE("Parking Space"),
    @XmlEnumValue("Garage")
    GARAGE("Garage");
    private final String value;

    Garagetype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Garagetype fromValue(String v) {
        for (Garagetype c: Garagetype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
