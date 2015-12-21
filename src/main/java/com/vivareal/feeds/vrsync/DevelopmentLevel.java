//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.21 às 04:08:27 PM BRST 
//


package com.vivareal.feeds.vrsync;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de developmentLevel.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="developmentLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Under Construction"/>
 *     &lt;enumeration value="Renovation"/>
 *     &lt;enumeration value="Plan Only"/>
 *     &lt;enumeration value="Land Only"/>
 *     &lt;enumeration value="Built"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "developmentLevel")
@XmlEnum
public enum DevelopmentLevel {

    @XmlEnumValue("Under Construction")
    UNDER_CONSTRUCTION("Under Construction"),
    @XmlEnumValue("Renovation")
    RENOVATION("Renovation"),
    @XmlEnumValue("Plan Only")
    PLAN_ONLY("Plan Only"),
    @XmlEnumValue("Land Only")
    LAND_ONLY("Land Only"),
    @XmlEnumValue("Built")
    BUILT("Built");
    private final String value;

    DevelopmentLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevelopmentLevel fromValue(String v) {
        for (DevelopmentLevel c: DevelopmentLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
