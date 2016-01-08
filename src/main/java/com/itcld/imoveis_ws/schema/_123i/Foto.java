//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.01.08 às 08:33:50 AM BRST 
//


package com.itcld.imoveis_ws.schema._123i;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Foto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Foto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NomeArquivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="URLArquivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Principal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Foto", propOrder = {
    "nomeArquivo",
    "urlArquivo",
    "principal"
})
public class Foto {

    @XmlElement(name = "NomeArquivo", required = true)
    protected String nomeArquivo;
    @XmlElement(name = "URLArquivo", required = true)
    protected String urlArquivo;
    @XmlElement(name = "Principal")
    protected int principal;

    /**
     * Obtém o valor da propriedade nomeArquivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeArquivo() {
        return nomeArquivo;
    }

    /**
     * Define o valor da propriedade nomeArquivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeArquivo(String value) {
        this.nomeArquivo = value;
    }

    /**
     * Obtém o valor da propriedade urlArquivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLArquivo() {
        return urlArquivo;
    }

    /**
     * Define o valor da propriedade urlArquivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLArquivo(String value) {
        this.urlArquivo = value;
    }

    /**
     * Obtém o valor da propriedade principal.
     * 
     */
    public int getPrincipal() {
        return principal;
    }

    /**
     * Define o valor da propriedade principal.
     * 
     */
    public void setPrincipal(int value) {
        this.principal = value;
    }

}
