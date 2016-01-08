//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.01.08 às 08:33:50 AM BRST 
//


package com.vivareal.feeds.vrsync;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java de location complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="location">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Country" type="{http://www.vivareal.com/schemas/1.0/VRSync}geoarea"/>
 *         &lt;element name="State" type="{http://www.vivareal.com/schemas/1.0/VRSync}geoarea"/>
 *         &lt;element name="Province" type="{http://www.vivareal.com/schemas/1.0/VRSync}geoarea" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.vivareal.com/schemas/1.0/VRSync}geoarea"/>
 *         &lt;element name="Zone" type="{http://www.vivareal.com/schemas/1.0/VRSync}geoarea" minOccurs="0"/>
 *         &lt;element name="Neighborhood" type="{http://www.vivareal.com/schemas/1.0/VRSync}geoarea" minOccurs="0"/>
 *         &lt;element name="Address" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="publiclyVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "location", propOrder = {

})
public class Location {

    @XmlElement(name = "Country", required = true)
    protected Geoarea country;
    @XmlElement(name = "State", required = true)
    protected Geoarea state;
    @XmlElement(name = "Province")
    protected Geoarea province;
    @XmlElement(name = "City", required = true)
    protected Geoarea city;
    @XmlElement(name = "Zone")
    protected Geoarea zone;
    @XmlElement(name = "Neighborhood")
    protected Geoarea neighborhood;
    @XmlElement(name = "Address")
    protected Location.Address address;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "Latitude", defaultValue = "0.0")
    protected BigDecimal latitude;
    @XmlElement(name = "Longitude", defaultValue = "0.0")
    protected BigDecimal longitude;

    /**
     * Obtém o valor da propriedade country.
     * 
     * @return
     *     possible object is
     *     {@link Geoarea }
     *     
     */
    public Geoarea getCountry() {
        return country;
    }

    /**
     * Define o valor da propriedade country.
     * 
     * @param value
     *     allowed object is
     *     {@link Geoarea }
     *     
     */
    public void setCountry(Geoarea value) {
        this.country = value;
    }

    /**
     * Obtém o valor da propriedade state.
     * 
     * @return
     *     possible object is
     *     {@link Geoarea }
     *     
     */
    public Geoarea getState() {
        return state;
    }

    /**
     * Define o valor da propriedade state.
     * 
     * @param value
     *     allowed object is
     *     {@link Geoarea }
     *     
     */
    public void setState(Geoarea value) {
        this.state = value;
    }

    /**
     * Obtém o valor da propriedade province.
     * 
     * @return
     *     possible object is
     *     {@link Geoarea }
     *     
     */
    public Geoarea getProvince() {
        return province;
    }

    /**
     * Define o valor da propriedade province.
     * 
     * @param value
     *     allowed object is
     *     {@link Geoarea }
     *     
     */
    public void setProvince(Geoarea value) {
        this.province = value;
    }

    /**
     * Obtém o valor da propriedade city.
     * 
     * @return
     *     possible object is
     *     {@link Geoarea }
     *     
     */
    public Geoarea getCity() {
        return city;
    }

    /**
     * Define o valor da propriedade city.
     * 
     * @param value
     *     allowed object is
     *     {@link Geoarea }
     *     
     */
    public void setCity(Geoarea value) {
        this.city = value;
    }

    /**
     * Obtém o valor da propriedade zone.
     * 
     * @return
     *     possible object is
     *     {@link Geoarea }
     *     
     */
    public Geoarea getZone() {
        return zone;
    }

    /**
     * Define o valor da propriedade zone.
     * 
     * @param value
     *     allowed object is
     *     {@link Geoarea }
     *     
     */
    public void setZone(Geoarea value) {
        this.zone = value;
    }

    /**
     * Obtém o valor da propriedade neighborhood.
     * 
     * @return
     *     possible object is
     *     {@link Geoarea }
     *     
     */
    public Geoarea getNeighborhood() {
        return neighborhood;
    }

    /**
     * Define o valor da propriedade neighborhood.
     * 
     * @param value
     *     allowed object is
     *     {@link Geoarea }
     *     
     */
    public void setNeighborhood(Geoarea value) {
        this.neighborhood = value;
    }

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link Location.Address }
     *     
     */
    public Location.Address getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link Location.Address }
     *     
     */
    public void setAddress(Location.Address value) {
        this.address = value;
    }

    /**
     * Obtém o valor da propriedade postalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Define o valor da propriedade postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Obtém o valor da propriedade latitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Define o valor da propriedade latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Obtém o valor da propriedade longitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Define o valor da propriedade longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="publiclyVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Address {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "publiclyVisible")
        protected Boolean publiclyVisible;

        /**
         * Obtém o valor da propriedade value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtém o valor da propriedade publiclyVisible.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isPubliclyVisible() {
            if (publiclyVisible == null) {
                return true;
            } else {
                return publiclyVisible;
            }
        }

        /**
         * Define o valor da propriedade publiclyVisible.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPubliclyVisible(Boolean value) {
            this.publiclyVisible = value;
        }

    }

}
