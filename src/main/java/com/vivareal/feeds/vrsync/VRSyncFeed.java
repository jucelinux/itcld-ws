//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.02.04 às 09:43:18 AM BRST 
//


package com.vivareal.feeds.vrsync;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de listingDataFeed complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="listingDataFeed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.vivareal.com/schemas/1.0/VRSync}header"/>
 *         &lt;element name="Listings" type="{http://www.vivareal.com/schemas/1.0/VRSync}listings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listingDataFeed", propOrder = {
    "header",
    "listings"
})
public class VRSyncFeed {

    @XmlElement(name = "Header", required = true)
    protected Header header;
    @XmlElement(name = "Listings")
    protected Listings listings;

    /**
     * Obtém o valor da propriedade header.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Define o valor da propriedade header.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Obtém o valor da propriedade listings.
     * 
     * @return
     *     possible object is
     *     {@link Listings }
     *     
     */
    public Listings getListings() {
        return listings;
    }

    /**
     * Define o valor da propriedade listings.
     * 
     * @param value
     *     allowed object is
     *     {@link Listings }
     *     
     */
    public void setListings(Listings value) {
        this.listings = value;
    }

}
