//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.02.04 às 10:50:34 AM BRST 
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
 * <p>Classe Java de listing complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="listing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ListingID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://www.vivareal.com/schemas/1.0/VRSync}transactionType"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DetailViewUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VirtualTourUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.vivareal.com/schemas/1.0/VRSync}location"/>
 *         &lt;element name="Details" type="{http://www.vivareal.com/schemas/1.0/VRSync}details"/>
 *         &lt;element name="Media" type="{http://www.vivareal.com/schemas/1.0/VRSync}media" minOccurs="0"/>
 *         &lt;element name="ContactInfo" type="{http://www.vivareal.com/schemas/1.0/VRSync}contactInfo"/>
 *         &lt;element name="Status" type="{http://www.vivareal.com/schemas/1.0/VRSync}status" minOccurs="0"/>
 *         &lt;element name="Featured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listing", propOrder = {

})
public class VRSyncListing {

    @XmlElement(name = "ListingID", required = true)
    protected String listingID;
    @XmlElement(name = "AccountID")
    protected String accountID;
    @XmlElement(name = "ListDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar listDate;
    @XmlElement(name = "LastUpdateDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastUpdateDate;
    @XmlElement(name = "TransactionType", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected String transactionType;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "DetailViewUrl")
    protected String detailViewUrl;
    @XmlElement(name = "TrackingCode")
    protected String trackingCode;
    @XmlElement(name = "VirtualTourUrl")
    protected String virtualTourUrl;
    @XmlElement(name = "Location", required = true)
    protected Location location;
    @XmlElement(name = "Details", required = true)
    protected Details details;
    @XmlElement(name = "Media")
    protected Media media;
    @XmlElement(name = "ContactInfo", required = true)
    protected ContactInfo contactInfo;
    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "Featured")
    protected Boolean featured;

    /**
     * Obtém o valor da propriedade listingID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListingID() {
        return listingID;
    }

    /**
     * Define o valor da propriedade listingID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingID(String value) {
        this.listingID = value;
    }

    /**
     * Obtém o valor da propriedade accountID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Define o valor da propriedade accountID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

    /**
     * Obtém o valor da propriedade listDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getListDate() {
        return listDate;
    }

    /**
     * Define o valor da propriedade listDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListDate(Calendar value) {
        this.listDate = value;
    }

    /**
     * Obtém o valor da propriedade lastUpdateDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Define o valor da propriedade lastUpdateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateDate(Calendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Obtém o valor da propriedade transactionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Define o valor da propriedade transactionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Obtém o valor da propriedade title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define o valor da propriedade title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtém o valor da propriedade detailViewUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailViewUrl() {
        return detailViewUrl;
    }

    /**
     * Define o valor da propriedade detailViewUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailViewUrl(String value) {
        this.detailViewUrl = value;
    }

    /**
     * Obtém o valor da propriedade trackingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingCode() {
        return trackingCode;
    }

    /**
     * Define o valor da propriedade trackingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingCode(String value) {
        this.trackingCode = value;
    }

    /**
     * Obtém o valor da propriedade virtualTourUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualTourUrl() {
        return virtualTourUrl;
    }

    /**
     * Define o valor da propriedade virtualTourUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualTourUrl(String value) {
        this.virtualTourUrl = value;
    }

    /**
     * Obtém o valor da propriedade location.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Define o valor da propriedade location.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Obtém o valor da propriedade details.
     * 
     * @return
     *     possible object is
     *     {@link Details }
     *     
     */
    public Details getDetails() {
        return details;
    }

    /**
     * Define o valor da propriedade details.
     * 
     * @param value
     *     allowed object is
     *     {@link Details }
     *     
     */
    public void setDetails(Details value) {
        this.details = value;
    }

    /**
     * Obtém o valor da propriedade media.
     * 
     * @return
     *     possible object is
     *     {@link Media }
     *     
     */
    public Media getMedia() {
        return media;
    }

    /**
     * Define o valor da propriedade media.
     * 
     * @param value
     *     allowed object is
     *     {@link Media }
     *     
     */
    public void setMedia(Media value) {
        this.media = value;
    }

    /**
     * Obtém o valor da propriedade contactInfo.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo }
     *     
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Define o valor da propriedade contactInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setContactInfo(ContactInfo value) {
        this.contactInfo = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade featured.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeatured() {
        return featured;
    }

    /**
     * Define o valor da propriedade featured.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeatured(Boolean value) {
        this.featured = value;
    }

}
