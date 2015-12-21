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
 * <p>Classe Java de propertyStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="propertyStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="In Negotiation"/>
 *     &lt;enumeration value="Sold"/>
 *     &lt;enumeration value="Rented"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "propertyStatus")
@XmlEnum
public enum PropertyStatus {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("In Negotiation")
    IN_NEGOTIATION("In Negotiation"),
    @XmlEnumValue("Sold")
    SOLD("Sold"),
    @XmlEnumValue("Rented")
    RENTED("Rented");
    private final String value;

    PropertyStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyStatus fromValue(String v) {
        for (PropertyStatus c: PropertyStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
