//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.03.02 às 09:49:38 AM BRT 
//


package com.itcld.imoveis_ws.schema.bossanova;

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
 *         &lt;element name="Carga" type="{http://itcld.com/imoveis-ws/schema/bossanova}Carga"/>
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
    "carga"
})
@XmlRootElement(name = "imovelBossaNovaRequest")
public class ImovelBossaNovaRequest {

    @XmlElement(name = "Carga", required = true)
    protected Carga carga;

    /**
     * Obtém o valor da propriedade carga.
     * 
     * @return
     *     possible object is
     *     {@link Carga }
     *     
     */
    public Carga getCarga() {
        return carga;
    }

    /**
     * Define o valor da propriedade carga.
     * 
     * @param value
     *     allowed object is
     *     {@link Carga }
     *     
     */
    public void setCarga(Carga value) {
        this.carga = value;
    }

}
