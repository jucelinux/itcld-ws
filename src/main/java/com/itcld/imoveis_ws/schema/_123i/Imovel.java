//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.08.26 às 12:35:59 PM BRT 
//


package com.itcld.imoveis_ws.schema._123i;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CodigoCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoImovel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CategoriaImovel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoImovel" type="{http://itcld.com/imoveis-ws/schema/123i}TipoImovel"/>
 *         &lt;element name="SubTipoImovel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PrecoVenda" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PrecoLocacao" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PrecoCondominio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="IptuAnual" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="QtdDormitorios" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdSuites" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdSalas" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QtdBanheiros" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdUnidadesAndar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AnoConstrucao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdVagas" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdAndar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdElevador" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AreaUtil" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AreaTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TituloImovel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Observacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fotos" type="{http://itcld.com/imoveis-ws/schema/123i}Fotos" minOccurs="0"/>
 *         &lt;element name="Condominio" type="{http://itcld.com/imoveis-ws/schema/123i}Condominio" minOccurs="0"/>
 *         &lt;element name="Unidade" type="{http://itcld.com/imoveis-ws/schema/123i}Unidade" minOccurs="0"/>
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
    "unidade"
})
public class Imovel {

    @XmlElement(name = "CodigoCliente", required = true)
    protected String codigoCliente;
    @XmlElement(name = "CodigoImovel", required = true)
    protected String codigoImovel;
    @XmlElement(name = "CategoriaImovel", required = true)
    protected String categoriaImovel;
    @XmlElement(name = "TipoImovel", required = true)
    protected TipoImovel tipoImovel;
    @XmlElement(name = "SubTipoImovel", required = true)
    protected String subTipoImovel;
    @XmlElement(name = "Cidade", required = true)
    protected String cidade;
    @XmlElement(name = "Bairro", required = true)
    protected String bairro;
    @XmlElement(name = "Endereco", required = true)
    protected String endereco;
    @XmlElement(name = "Numero", required = true)
    protected String numero;
    @XmlElement(name = "CEP")
    protected long cep;
    @XmlElement(name = "PrecoVenda")
    protected double precoVenda;
    @XmlElement(name = "PrecoLocacao")
    protected double precoLocacao;
    @XmlElement(name = "PrecoCondominio")
    protected double precoCondominio;
    @XmlElement(name = "IptuAnual")
    protected double iptuAnual;
    @XmlElement(name = "QtdDormitorios")
    protected long qtdDormitorios;
    @XmlElement(name = "QtdSuites")
    protected long qtdSuites;
    @XmlElement(name = "QtdSalas", required = true)
    protected String qtdSalas;
    @XmlElement(name = "QtdBanheiros")
    protected long qtdBanheiros;
    @XmlElement(name = "QtdUnidadesAndar", required = true)
    protected String qtdUnidadesAndar;
    @XmlElement(name = "AnoConstrucao")
    protected long anoConstrucao;
    @XmlElement(name = "QtdVagas")
    protected long qtdVagas;
    @XmlElement(name = "QtdAndar")
    protected long qtdAndar;
    @XmlElement(name = "QtdElevador")
    protected long qtdElevador;
    @XmlElement(name = "AreaUtil")
    protected double areaUtil;
    @XmlElement(name = "AreaTotal")
    protected double areaTotal;
    @XmlElement(name = "TituloImovel", required = true)
    protected String tituloImovel;
    @XmlElement(name = "Observacao", required = true)
    protected String observacao;
    @XmlElement(name = "Fotos")
    protected Fotos fotos;
    @XmlElement(name = "Condominio")
    protected Condominio condominio;
    @XmlElement(name = "Unidade")
    protected Unidade unidade;

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
     *     {@link TipoImovel }
     *     
     */
    public TipoImovel getTipoImovel() {
        return tipoImovel;
    }

    /**
     * Define o valor da propriedade tipoImovel.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoImovel }
     *     
     */
    public void setTipoImovel(TipoImovel value) {
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
    public String getNumero() {
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
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     * 
     */
    public long getCEP() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     */
    public void setCEP(long value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade precoVenda.
     * 
     */
    public double getPrecoVenda() {
        return precoVenda;
    }

    /**
     * Define o valor da propriedade precoVenda.
     * 
     */
    public void setPrecoVenda(double value) {
        this.precoVenda = value;
    }

    /**
     * Obtém o valor da propriedade precoLocacao.
     * 
     */
    public double getPrecoLocacao() {
        return precoLocacao;
    }

    /**
     * Define o valor da propriedade precoLocacao.
     * 
     */
    public void setPrecoLocacao(double value) {
        this.precoLocacao = value;
    }

    /**
     * Obtém o valor da propriedade precoCondominio.
     * 
     */
    public double getPrecoCondominio() {
        return precoCondominio;
    }

    /**
     * Define o valor da propriedade precoCondominio.
     * 
     */
    public void setPrecoCondominio(double value) {
        this.precoCondominio = value;
    }

    /**
     * Obtém o valor da propriedade iptuAnual.
     * 
     */
    public double getIptuAnual() {
        return iptuAnual;
    }

    /**
     * Define o valor da propriedade iptuAnual.
     * 
     */
    public void setIptuAnual(double value) {
        this.iptuAnual = value;
    }

    /**
     * Obtém o valor da propriedade qtdDormitorios.
     * 
     */
    public long getQtdDormitorios() {
        return qtdDormitorios;
    }

    /**
     * Define o valor da propriedade qtdDormitorios.
     * 
     */
    public void setQtdDormitorios(long value) {
        this.qtdDormitorios = value;
    }

    /**
     * Obtém o valor da propriedade qtdSuites.
     * 
     */
    public long getQtdSuites() {
        return qtdSuites;
    }

    /**
     * Define o valor da propriedade qtdSuites.
     * 
     */
    public void setQtdSuites(long value) {
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
    public String getQtdSalas() {
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
    public void setQtdSalas(String value) {
        this.qtdSalas = value;
    }

    /**
     * Obtém o valor da propriedade qtdBanheiros.
     * 
     */
    public long getQtdBanheiros() {
        return qtdBanheiros;
    }

    /**
     * Define o valor da propriedade qtdBanheiros.
     * 
     */
    public void setQtdBanheiros(long value) {
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
    public String getQtdUnidadesAndar() {
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
    public void setQtdUnidadesAndar(String value) {
        this.qtdUnidadesAndar = value;
    }

    /**
     * Obtém o valor da propriedade anoConstrucao.
     * 
     */
    public long getAnoConstrucao() {
        return anoConstrucao;
    }

    /**
     * Define o valor da propriedade anoConstrucao.
     * 
     */
    public void setAnoConstrucao(long value) {
        this.anoConstrucao = value;
    }

    /**
     * Obtém o valor da propriedade qtdVagas.
     * 
     */
    public long getQtdVagas() {
        return qtdVagas;
    }

    /**
     * Define o valor da propriedade qtdVagas.
     * 
     */
    public void setQtdVagas(long value) {
        this.qtdVagas = value;
    }

    /**
     * Obtém o valor da propriedade qtdAndar.
     * 
     */
    public long getQtdAndar() {
        return qtdAndar;
    }

    /**
     * Define o valor da propriedade qtdAndar.
     * 
     */
    public void setQtdAndar(long value) {
        this.qtdAndar = value;
    }

    /**
     * Obtém o valor da propriedade qtdElevador.
     * 
     */
    public long getQtdElevador() {
        return qtdElevador;
    }

    /**
     * Define o valor da propriedade qtdElevador.
     * 
     */
    public void setQtdElevador(long value) {
        this.qtdElevador = value;
    }

    /**
     * Obtém o valor da propriedade areaUtil.
     * 
     */
    public double getAreaUtil() {
        return areaUtil;
    }

    /**
     * Define o valor da propriedade areaUtil.
     * 
     */
    public void setAreaUtil(double value) {
        this.areaUtil = value;
    }

    /**
     * Obtém o valor da propriedade areaTotal.
     * 
     */
    public double getAreaTotal() {
        return areaTotal;
    }

    /**
     * Define o valor da propriedade areaTotal.
     * 
     */
    public void setAreaTotal(double value) {
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
     * Obtém o valor da propriedade unidade.
     * 
     * @return
     *     possible object is
     *     {@link Unidade }
     *     
     */
    public Unidade getUnidade() {
        return unidade;
    }

    /**
     * Define o valor da propriedade unidade.
     * 
     * @param value
     *     allowed object is
     *     {@link Unidade }
     *     
     */
    public void setUnidade(Unidade value) {
        this.unidade = value;
    }

}
