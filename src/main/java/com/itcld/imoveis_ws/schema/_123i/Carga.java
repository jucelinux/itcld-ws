//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.06 às 11:32:09 AM BRST 
//


package com.itcld.imoveis_ws.schema._123i;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Carga complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Carga">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Imoveis">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Imovel" type="{http://itcld.com/imoveis-ws/schema/123i}Imovel" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Carga", propOrder = {
    "imoveis"
})
public class Carga {

    @XmlElement(name = "Imoveis", required = true)
    protected Carga.Imoveis imoveis;

    /**
     * Obtém o valor da propriedade imoveis.
     * 
     * @return
     *     possible object is
     *     {@link Carga.Imoveis }
     *     
     */
    public Carga.Imoveis getImoveis() {
        return imoveis;
    }

    /**
     * Define o valor da propriedade imoveis.
     * 
     * @param value
     *     allowed object is
     *     {@link Carga.Imoveis }
     *     
     */
    public void setImoveis(Carga.Imoveis value) {
        this.imoveis = value;
    }


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
     *         &lt;element name="Imovel" type="{http://itcld.com/imoveis-ws/schema/123i}Imovel" maxOccurs="unbounded"/>
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
        "imovel"
    })
    public static class Imoveis {

        @XmlElement(name = "Imovel", required = true)
        protected List<Imovel> imovel;

        /**
         * Gets the value of the imovel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the imovel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImovel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Imovel }
         * 
         * 
         */
        public List<Imovel> getImovel() {
            if (imovel == null) {
                imovel = new ArrayList<Imovel>();
            }
            return this.imovel;
        }

    }

}
