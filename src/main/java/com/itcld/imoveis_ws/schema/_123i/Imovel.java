//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.21 às 04:08:27 PM BRST 
//


package com.itcld.imoveis_ws.schema._123i;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Classe Java de Imovel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Imovel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Local" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoImovel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CategoriaImovel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoImovel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubTipoImovel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PrecoVenda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrecoLocacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrecoCondominio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IptuAnual" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QtdDormitorios" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdSuites" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdSalas" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdBanheiros" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdUnidadesAndar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AnoConstrucao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdVagas" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdAndar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdElevador" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AreaUtil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AreaTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TituloImovel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Observacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fotos" type="{http://itcld.com/imoveis-ws/schema/123i}Fotos" minOccurs="0"/>
 *         &lt;element name="Condominio" type="{http://itcld.com/imoveis-ws/schema/123i}Condominio" minOccurs="0"/>
 *         &lt;element name="Detalhes" type="{http://itcld.com/imoveis-ws/schema/123i}Detalhes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Imovel", propOrder = {
    "local",
    "codigoCliente",
    "codigoImovel",
    "categoriaImovel",
    "tipoImovel",
    "subTipoImovel",
    "cidade",
    "bairro",
    "endereco",
    "numero",
    "cep",
    "precoVenda",
    "precoLocacao",
    "precoCondominio",
    "iptuAnual",
    "qtdDormitorios",
    "qtdSuites",
    "qtdSalas",
    "qtdBanheiros",
    "qtdUnidadesAndar",
    "anoConstrucao",
    "qtdVagas",
    "qtdAndar",
    "qtdElevador",
    "areaUtil",
    "areaTotal",
    "tituloImovel",
    "observacao",
    "fotos",
    "condominio",
    "detalhes"
})
public class Imovel {

    @XmlElement(name = "Local", required = true)
    protected String local;
    @XmlElement(name = "CodigoCliente", required = true)
    protected String codigoCliente;
    @XmlElement(name = "CodigoImovel", required = true)
    protected String codigoImovel;
    @XmlElement(name = "CategoriaImovel", required = true)
    protected String categoriaImovel;
    @XmlElement(name = "TipoImovel", required = true)
    protected String tipoImovel;
    @XmlElement(name = "SubTipoImovel", required = true)
    protected String subTipoImovel;
    @XmlElement(name = "Cidade", required = true)
    protected String cidade;
    @XmlElement(name = "Bairro", required = true)
    protected String bairro;
    @XmlElement(name = "Endereco", required = true)
    protected String endereco;
    @XmlElement(name = "Numero", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long numero;
    @XmlElement(name = "CEP", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long cep;
    @XmlElement(name = "PrecoVenda", required = true)
    protected String precoVenda;
    @XmlElement(name = "PrecoLocacao", required = true)
    protected String precoLocacao;
    @XmlElement(name = "PrecoCondominio", required = true)
    protected String precoCondominio;
    @XmlElement(name = "IptuAnual", required = true)
    protected String iptuAnual;
    @XmlElement(name = "QtdDormitorios", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long qtdDormitorios;
    @XmlElement(name = "QtdSuites", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long qtdSuites;
    @XmlElement(name = "QtdSalas", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long qtdSalas;
    @XmlElement(name = "QtdBanheiros", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long qtdBanheiros;
    @XmlElement(name = "QtdUnidadesAndar", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long qtdUnidadesAndar;
    @XmlElement(name = "AnoConstrucao", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long anoConstrucao;
    @XmlElement(name = "QtdVagas", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long qtdVagas;
    @XmlElement(name = "QtdAndar", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long qtdAndar;
    @XmlElement(name = "QtdElevador", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long qtdElevador;
    @XmlElement(name = "AreaUtil", required = true)
    protected String areaUtil;
    @XmlElement(name = "AreaTotal", required = true)
    protected String areaTotal;
    @XmlElement(name = "TituloImovel", required = true)
    protected String tituloImovel;
    @XmlElement(name = "Observacao", required = true)
    protected String observacao;
    @XmlElement(name = "Fotos")
    protected Fotos fotos;
    @XmlElement(name = "Condominio")
    protected Condominio condominio;
    @XmlElement(name = "Detalhes")
    protected Detalhes detalhes;

    /**
     * Obtém o valor da propriedade local.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocal() {
        return local;
    }

    /**
     * Define o valor da propriedade local.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocal(String value) {
        this.local = value;
    }

    /**
     * Obtém o valor da propriedade codigoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Define o valor da propriedade codigoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCliente(String value) {
        this.codigoCliente = value;
    }

    /**
     * Obtém o valor da propriedade codigoImovel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoImovel() {
        return codigoImovel;
    }

    /**
     * Define o valor da propriedade codigoImovel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoImovel(String value) {
        this.codigoImovel = value;
    }

    /**
     * Obtém o valor da propriedade categoriaImovel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaImovel() {
        return categoriaImovel;
    }

    /**
     * Define o valor da propriedade categoriaImovel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaImovel(String value) {
        this.categoriaImovel = value;
    }

    /**
     * Obtém o valor da propriedade tipoImovel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoImovel() {
        return tipoImovel;
    }

    /**
     * Define o valor da propriedade tipoImovel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoImovel(String value) {
        this.tipoImovel = value;
    }

    /**
     * Obtém o valor da propriedade subTipoImovel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTipoImovel() {
        return subTipoImovel;
    }

    /**
     * Define o valor da propriedade subTipoImovel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTipoImovel(String value) {
        this.subTipoImovel = value;
    }

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade bairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o valor da propriedade bairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairro(String value) {
        this.bairro = value;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(Long value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCEP() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEP(Long value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade precoVenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecoVenda() {
        return precoVenda;
    }

    /**
     * Define o valor da propriedade precoVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecoVenda(String value) {
        this.precoVenda = value;
    }

    /**
     * Obtém o valor da propriedade precoLocacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecoLocacao() {
        return precoLocacao;
    }

    /**
     * Define o valor da propriedade precoLocacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecoLocacao(String value) {
        this.precoLocacao = value;
    }

    /**
     * Obtém o valor da propriedade precoCondominio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecoCondominio() {
        return precoCondominio;
    }

    /**
     * Define o valor da propriedade precoCondominio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecoCondominio(String value) {
        this.precoCondominio = value;
    }

    /**
     * Obtém o valor da propriedade iptuAnual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIptuAnual() {
        return iptuAnual;
    }

    /**
     * Define o valor da propriedade iptuAnual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIptuAnual(String value) {
        this.iptuAnual = value;
    }

    /**
     * Obtém o valor da propriedade qtdDormitorios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQtdDormitorios() {
        return qtdDormitorios;
    }

    /**
     * Define o valor da propriedade qtdDormitorios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdDormitorios(Long value) {
        this.qtdDormitorios = value;
    }

    /**
     * Obtém o valor da propriedade qtdSuites.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQtdSuites() {
        return qtdSuites;
    }

    /**
     * Define o valor da propriedade qtdSuites.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdSuites(Long value) {
        this.qtdSuites = value;
    }

    /**
     * Obtém o valor da propriedade qtdSalas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQtdSalas() {
        return qtdSalas;
    }

    /**
     * Define o valor da propriedade qtdSalas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdSalas(Long value) {
        this.qtdSalas = value;
    }

    /**
     * Obtém o valor da propriedade qtdBanheiros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQtdBanheiros() {
        return qtdBanheiros;
    }

    /**
     * Define o valor da propriedade qtdBanheiros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdBanheiros(Long value) {
        this.qtdBanheiros = value;
    }

    /**
     * Obtém o valor da propriedade qtdUnidadesAndar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQtdUnidadesAndar() {
        return qtdUnidadesAndar;
    }

    /**
     * Define o valor da propriedade qtdUnidadesAndar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdUnidadesAndar(Long value) {
        this.qtdUnidadesAndar = value;
    }

    /**
     * Obtém o valor da propriedade anoConstrucao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAnoConstrucao() {
        return anoConstrucao;
    }

    /**
     * Define o valor da propriedade anoConstrucao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoConstrucao(Long value) {
        this.anoConstrucao = value;
    }

    /**
     * Obtém o valor da propriedade qtdVagas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQtdVagas() {
        return qtdVagas;
    }

    /**
     * Define o valor da propriedade qtdVagas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdVagas(Long value) {
        this.qtdVagas = value;
    }

    /**
     * Obtém o valor da propriedade qtdAndar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQtdAndar() {
        return qtdAndar;
    }

    /**
     * Define o valor da propriedade qtdAndar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdAndar(Long value) {
        this.qtdAndar = value;
    }

    /**
     * Obtém o valor da propriedade qtdElevador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQtdElevador() {
        return qtdElevador;
    }

    /**
     * Define o valor da propriedade qtdElevador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdElevador(Long value) {
        this.qtdElevador = value;
    }

    /**
     * Obtém o valor da propriedade areaUtil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaUtil() {
        return areaUtil;
    }

    /**
     * Define o valor da propriedade areaUtil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaUtil(String value) {
        this.areaUtil = value;
    }

    /**
     * Obtém o valor da propriedade areaTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaTotal() {
        return areaTotal;
    }

    /**
     * Define o valor da propriedade areaTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaTotal(String value) {
        this.areaTotal = value;
    }

    /**
     * Obtém o valor da propriedade tituloImovel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloImovel() {
        return tituloImovel;
    }

    /**
     * Define o valor da propriedade tituloImovel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloImovel(String value) {
        this.tituloImovel = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Obtém o valor da propriedade fotos.
     * 
     * @return
     *     possible object is
     *     {@link Fotos }
     *     
     */
    public Fotos getFotos() {
        return fotos;
    }

    /**
     * Define o valor da propriedade fotos.
     * 
     * @param value
     *     allowed object is
     *     {@link Fotos }
     *     
     */
    public void setFotos(Fotos value) {
        this.fotos = value;
    }

    /**
     * Obtém o valor da propriedade condominio.
     * 
     * @return
     *     possible object is
     *     {@link Condominio }
     *     
     */
    public Condominio getCondominio() {
        return condominio;
    }

    /**
     * Define o valor da propriedade condominio.
     * 
     * @param value
     *     allowed object is
     *     {@link Condominio }
     *     
     */
    public void setCondominio(Condominio value) {
        this.condominio = value;
    }

    /**
     * Obtém o valor da propriedade detalhes.
     * 
     * @return
     *     possible object is
     *     {@link Detalhes }
     *     
     */
    public Detalhes getDetalhes() {
        return detalhes;
    }

    /**
     * Define o valor da propriedade detalhes.
     * 
     * @param value
     *     allowed object is
     *     {@link Detalhes }
     *     
     */
    public void setDetalhes(Detalhes value) {
        this.detalhes = value;
    }

}
