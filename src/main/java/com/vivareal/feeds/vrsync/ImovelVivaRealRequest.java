//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.06 às 11:32:09 AM BRST 
//


package com.vivareal.feeds.vrsync;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListingDataFeed" type="{http://www.vivareal.com/schemas/1.0/VRSync}listingDataFeed"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listingDataFeed"
})
@XmlRootElement(name = "imovelVivaRealRequest")
public class ImovelVivaRealRequest {

    @XmlElement(name = "ListingDataFeed", required = true)
    protected VRSyncFeed listingDataFeed;

    /**
     * Obtém o valor da propriedade listingDataFeed.
     * 
     * @return
     *     possible object is
     *     {@link VRSyncFeed }
     *     
     */
    public VRSyncFeed getListingDataFeed() {
        return listingDataFeed;
    }

    /**
     * Define o valor da propriedade listingDataFeed.
     * 
     * @param value
     *     allowed object is
     *     {@link VRSyncFeed }
     *     
     */
    public void setListingDataFeed(VRSyncFeed value) {
        this.listingDataFeed = value;
    }

}
