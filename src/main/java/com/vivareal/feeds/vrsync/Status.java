//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.06 às 11:32:09 AM BRST 
//


package com.vivareal.feeds.vrsync;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Classe Java de status complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="status">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="PropertyStatus" type="{http://www.vivareal.com/schemas/1.0/VRSync}propertyStatus"/>
 *         &lt;element name="StatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ClosingPrice" type="{http://www.vivareal.com/schemas/1.0/VRSync}price" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "status", propOrder = {

})
public class Status {

    @XmlElement(name = "PropertyStatus", required = true)
    protected PropertyStatus propertyStatus;
    @XmlElement(name = "StatusDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar statusDate;
    @XmlElement(name = "ClosingPrice")
    protected Price closingPrice;

    /**
     * Obtém o valor da propriedade propertyStatus.
     * 
     * @return
     *     possible object is
     *     {@link PropertyStatus }
     *     
     */
    public PropertyStatus getPropertyStatus() {
        return propertyStatus;
    }

    /**
     * Define o valor da propriedade propertyStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyStatus }
     *     
     */
    public void setPropertyStatus(PropertyStatus value) {
        this.propertyStatus = value;
    }

    /**
     * Obtém o valor da propriedade statusDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStatusDate() {
        return statusDate;
    }

    /**
     * Define o valor da propriedade statusDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDate(Calendar value) {
        this.statusDate = value;
    }

    /**
     * Obtém o valor da propriedade closingPrice.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getClosingPrice() {
        return closingPrice;
    }

    /**
     * Define o valor da propriedade closingPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setClosingPrice(Price value) {
        this.closingPrice = value;
    }

}
