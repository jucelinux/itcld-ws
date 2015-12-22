//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.22 às 02:16:01 PM BRST 
//


package com.vivareal.feeds.vrsync;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de details complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ListPrice" type="{http://www.vivareal.com/schemas/1.0/VRSync}price" minOccurs="0"/>
 *         &lt;element name="RentalPrice" type="{http://www.vivareal.com/schemas/1.0/VRSync}periodPrice" minOccurs="0"/>
 *         &lt;element name="AvailableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PropertyAdministrationFee" type="{http://www.vivareal.com/schemas/1.0/VRSync}periodPrice" minOccurs="0"/>
 *         &lt;element name="PropertyType" type="{http://www.vivareal.com/schemas/1.0/VRSync}propertyType"/>
 *         &lt;element name="ConstructedArea" type="{http://www.vivareal.com/schemas/1.0/VRSync}area" minOccurs="0"/>
 *         &lt;element name="LotArea" type="{http://www.vivareal.com/schemas/1.0/VRSync}area" minOccurs="0"/>
 *         &lt;element name="LivingArea" type="{http://www.vivareal.com/schemas/1.0/VRSync}area" minOccurs="0"/>
 *         &lt;element name="DevelopmentLevel" type="{http://www.vivareal.com/schemas/1.0/VRSync}developmentLevel" minOccurs="0"/>
 *         &lt;element name="YearBuilt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Bedrooms" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Bathrooms" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Suites" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Garage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *                 &lt;attribute name="type" type="{http://www.vivareal.com/schemas/1.0/VRSync}garagetype" default="Garage" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UnitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Features" type="{http://www.vivareal.com/schemas/1.0/VRSync}features" minOccurs="0"/>
 *         &lt;element name="Estrato" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "details", propOrder = {

})
public class Details {

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "ListPrice")
    protected Price listPrice;
    @XmlElement(name = "RentalPrice")
    protected PeriodPrice rentalPrice;
    @XmlElement(name = "AvailableDate", type = String.class)
    @XmlJavaTypeAdapter(org.w3._2001.xmlschema.Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar availableDate;
    @XmlElement(name = "PropertyAdministrationFee")
    protected PeriodPrice propertyAdministrationFee;
    @XmlElement(name = "PropertyType", required = true)
    @XmlJavaTypeAdapter(com.vivareal.feeds.vrsync.Adapter1 .class)
    protected String propertyType;
    @XmlElement(name = "ConstructedArea")
    protected Area constructedArea;
    @XmlElement(name = "LotArea", defaultValue = "0.0")
    protected Area lotArea;
    @XmlElement(name = "LivingArea")
    protected Area livingArea;
    @XmlElement(name = "DevelopmentLevel")
    protected DevelopmentLevel developmentLevel;
    @XmlElement(name = "YearBuilt")
    protected Integer yearBuilt;
    @XmlElement(name = "Bedrooms", defaultValue = "0.0")
    protected BigDecimal bedrooms;
    @XmlElement(name = "Bathrooms", defaultValue = "0.0")
    protected BigDecimal bathrooms;
    @XmlElement(name = "Suites")
    protected BigDecimal suites;
    @XmlElement(name = "Garage")
    protected Details.Garage garage;
    @XmlElement(name = "UnitNumber")
    protected String unitNumber;
    @XmlElement(name = "Features")
    protected Features features;
    @XmlElement(name = "Estrato")
    protected Integer estrato;

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade listPrice.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getListPrice() {
        return listPrice;
    }

    /**
     * Define o valor da propriedade listPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setListPrice(Price value) {
        this.listPrice = value;
    }

    /**
     * Obtém o valor da propriedade rentalPrice.
     * 
     * @return
     *     possible object is
     *     {@link PeriodPrice }
     *     
     */
    public PeriodPrice getRentalPrice() {
        return rentalPrice;
    }

    /**
     * Define o valor da propriedade rentalPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodPrice }
     *     
     */
    public void setRentalPrice(PeriodPrice value) {
        this.rentalPrice = value;
    }

    /**
     * Obtém o valor da propriedade availableDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getAvailableDate() {
        return availableDate;
    }

    /**
     * Define o valor da propriedade availableDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableDate(Calendar value) {
        this.availableDate = value;
    }

    /**
     * Obtém o valor da propriedade propertyAdministrationFee.
     * 
     * @return
     *     possible object is
     *     {@link PeriodPrice }
     *     
     */
    public PeriodPrice getPropertyAdministrationFee() {
        return propertyAdministrationFee;
    }

    /**
     * Define o valor da propriedade propertyAdministrationFee.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodPrice }
     *     
     */
    public void setPropertyAdministrationFee(PeriodPrice value) {
        this.propertyAdministrationFee = value;
    }

    /**
     * Obtém o valor da propriedade propertyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * Define o valor da propriedade propertyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyType(String value) {
        this.propertyType = value;
    }

    /**
     * Obtém o valor da propriedade constructedArea.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getConstructedArea() {
        return constructedArea;
    }

    /**
     * Define o valor da propriedade constructedArea.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setConstructedArea(Area value) {
        this.constructedArea = value;
    }

    /**
     * Obtém o valor da propriedade lotArea.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getLotArea() {
        return lotArea;
    }

    /**
     * Define o valor da propriedade lotArea.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setLotArea(Area value) {
        this.lotArea = value;
    }

    /**
     * Obtém o valor da propriedade livingArea.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getLivingArea() {
        return livingArea;
    }

    /**
     * Define o valor da propriedade livingArea.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setLivingArea(Area value) {
        this.livingArea = value;
    }

    /**
     * Obtém o valor da propriedade developmentLevel.
     * 
     * @return
     *     possible object is
     *     {@link DevelopmentLevel }
     *     
     */
    public DevelopmentLevel getDevelopmentLevel() {
        return developmentLevel;
    }

    /**
     * Define o valor da propriedade developmentLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link DevelopmentLevel }
     *     
     */
    public void setDevelopmentLevel(DevelopmentLevel value) {
        this.developmentLevel = value;
    }

    /**
     * Obtém o valor da propriedade yearBuilt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearBuilt() {
        return yearBuilt;
    }

    /**
     * Define o valor da propriedade yearBuilt.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearBuilt(Integer value) {
        this.yearBuilt = value;
    }

    /**
     * Obtém o valor da propriedade bedrooms.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBedrooms() {
        return bedrooms;
    }

    /**
     * Define o valor da propriedade bedrooms.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBedrooms(BigDecimal value) {
        this.bedrooms = value;
    }

    /**
     * Obtém o valor da propriedade bathrooms.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBathrooms() {
        return bathrooms;
    }

    /**
     * Define o valor da propriedade bathrooms.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBathrooms(BigDecimal value) {
        this.bathrooms = value;
    }

    /**
     * Obtém o valor da propriedade suites.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuites() {
        return suites;
    }

    /**
     * Define o valor da propriedade suites.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuites(BigDecimal value) {
        this.suites = value;
    }

    /**
     * Obtém o valor da propriedade garage.
     * 
     * @return
     *     possible object is
     *     {@link Details.Garage }
     *     
     */
    public Details.Garage getGarage() {
        return garage;
    }

    /**
     * Define o valor da propriedade garage.
     * 
     * @param value
     *     allowed object is
     *     {@link Details.Garage }
     *     
     */
    public void setGarage(Details.Garage value) {
        this.garage = value;
    }

    /**
     * Obtém o valor da propriedade unitNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitNumber() {
        return unitNumber;
    }

    /**
     * Define o valor da propriedade unitNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitNumber(String value) {
        this.unitNumber = value;
    }

    /**
     * Obtém o valor da propriedade features.
     * 
     * @return
     *     possible object is
     *     {@link Features }
     *     
     */
    public Features getFeatures() {
        return features;
    }

    /**
     * Define o valor da propriedade features.
     * 
     * @param value
     *     allowed object is
     *     {@link Features }
     *     
     */
    public void setFeatures(Features value) {
        this.features = value;
    }

    /**
     * Obtém o valor da propriedade estrato.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstrato() {
        return estrato;
    }

    /**
     * Define o valor da propriedade estrato.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstrato(Integer value) {
        this.estrato = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
     *       &lt;attribute name="type" type="{http://www.vivareal.com/schemas/1.0/VRSync}garagetype" default="Garage" />
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
    public static class Garage {

        @XmlValue
        protected int value;
        @XmlAttribute(name = "type")
        protected Garagetype type;

        /**
         * Obtém o valor da propriedade value.
         * 
         */
        public int getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         */
        public void setValue(int value) {
            this.value = value;
        }

        /**
         * Obtém o valor da propriedade type.
         * 
         * @return
         *     possible object is
         *     {@link Garagetype }
         *     
         */
        public Garagetype getType() {
            if (type == null) {
                return Garagetype.GARAGE;
            } else {
                return type;
            }
        }

        /**
         * Define o valor da propriedade type.
         * 
         * @param value
         *     allowed object is
         *     {@link Garagetype }
         *     
         */
        public void setType(Garagetype value) {
            this.type = value;
        }

    }

}
