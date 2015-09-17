//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.09.17 às 03:18:33 PM BRT 
//


package com.itcld.imoveis_ws.schema._123i;

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
 *         &lt;element name="StatusCod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UrlArquivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "statusCod",
    "status",
    "urlArquivo"
})
@XmlRootElement(name = "imovel123iResponse")
public class Imovel123IResponse {

    @XmlElement(name = "StatusCod")
    protected int statusCod;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "UrlArquivo", required = true)
    protected String urlArquivo;

    /**
     * Obtém o valor da propriedade statusCod.
     * 
     */
    public int getStatusCod() {
        return statusCod;
    }

    /**
     * Define o valor da propriedade statusCod.
     * 
     */
    public void setStatusCod(int value) {
        this.statusCod = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade urlArquivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlArquivo() {
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
    public void setUrlArquivo(String value) {
        this.urlArquivo = value;
    }

}
