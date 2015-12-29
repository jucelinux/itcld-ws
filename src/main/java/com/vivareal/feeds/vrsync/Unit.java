//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.28 às 11:40:17 AM BRST 
//


package com.vivareal.feeds.vrsync;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de unit.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="unit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="acres"/>
 *     &lt;enumeration value="feet"/>
 *     &lt;enumeration value="hectares"/>
 *     &lt;enumeration value="square kilometers"/>
 *     &lt;enumeration value="metres"/>
 *     &lt;enumeration value="square feet"/>
 *     &lt;enumeration value="square metres"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "unit")
@XmlEnum
public enum Unit {

    @XmlEnumValue("acres")
    ACRES("acres"),
    @XmlEnumValue("feet")
    FEET("feet"),
    @XmlEnumValue("hectares")
    HECTARES("hectares"),
    @XmlEnumValue("square kilometers")
    SQUARE_KILOMETERS("square kilometers"),
    @XmlEnumValue("metres")
    METRES("metres"),
    @XmlEnumValue("square feet")
    SQUARE_FEET("square feet"),
    @XmlEnumValue("square metres")
    SQUARE_METRES("square metres");
    private final String value;

    Unit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Unit fromValue(String v) {
        for (Unit c: Unit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
