//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.28 às 11:40:17 AM BRST 
//


package com.itcld.imoveis_ws.schema.bossanova;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Classe Java de Condominio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Condominio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcademiaFitness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcessoDeficiente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AndaresPredio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AreaVerde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bicicletario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Brinquedoteca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CampoFutebol" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CampoGolfe" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CentralLimpezaGovernanca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CentroEstetica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Churrasqueira" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EspacoGourmet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VagaDeVisitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gerador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Guarita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Heliponto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Horta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternetCompartilhada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Jardim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lavanderia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Marina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Massagista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroTorres" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PetPlay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Piscina" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PiscinaAquecida" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PiscinaClimatizada" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PiscinaCoberta" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PiscinaInfantil" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PistaCooper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PistaSkate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Playground" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pomar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Portaria24h" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortariaControlada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuadraEsportes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuadraSquash" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="QuadraTenis" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="QuadraPoliesportiva" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="QuantidadeElevadores" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RedeTelefonica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restaurante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RuasAsfaltadas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalaCinema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalaGinastica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalaoFestas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalaoJogos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sauna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SistemaAlarme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SistemaIncendio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Solarium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vestiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vigilancia24h" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Condominio", propOrder = {
    "academiaFitness",
    "acessoDeficiente",
    "andaresPredio",
    "areaVerde",
    "bicicletario",
    "brinquedoteca",
    "campoFutebol",
    "campoGolfe",
    "centralLimpezaGovernanca",
    "centroEstetica",
    "churrasqueira",
    "espacoGourmet",
    "vagaDeVisitante",
    "gerador",
    "guarita",
    "heliponto",
    "horta",
    "internetCompartilhada",
    "jardim",
    "lavanderia",
    "marina",
    "massagista",
    "numeroTorres",
    "petPlay",
    "piscina",
    "piscinaAquecida",
    "piscinaClimatizada",
    "piscinaCoberta",
    "piscinaInfantil",
    "pistaCooper",
    "pistaSkate",
    "playground",
    "pomar",
    "portaria24H",
    "portariaControlada",
    "quadraEsportes",
    "quadraSquash",
    "quadraTenis",
    "quadraPoliesportiva",
    "quantidadeElevadores",
    "redeTelefonica",
    "restaurante",
    "ruasAsfaltadas",
    "salaCinema",
    "salaGinastica",
    "salaoFestas",
    "salaoJogos",
    "sauna",
    "sistemaAlarme",
    "sistemaIncendio",
    "solarium",
    "vestiario",
    "vigilancia24H"
})
public class Condominio {

    @XmlElement(name = "AcademiaFitness")
    protected String academiaFitness;
    @XmlElement(name = "AcessoDeficiente")
    protected String acessoDeficiente;
    @XmlElement(name = "AndaresPredio", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long andaresPredio;
    @XmlElement(name = "AreaVerde")
    protected String areaVerde;
    @XmlElement(name = "Bicicletario")
    protected String bicicletario;
    @XmlElement(name = "Brinquedoteca")
    protected String brinquedoteca;
    @XmlElement(name = "CampoFutebol", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long campoFutebol;
    @XmlElement(name = "CampoGolfe", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long campoGolfe;
    @XmlElement(name = "CentralLimpezaGovernanca")
    protected String centralLimpezaGovernanca;
    @XmlElement(name = "CentroEstetica")
    protected String centroEstetica;
    @XmlElement(name = "Churrasqueira")
    protected String churrasqueira;
    @XmlElement(name = "EspacoGourmet")
    protected String espacoGourmet;
    @XmlElement(name = "VagaDeVisitante")
    protected String vagaDeVisitante;
    @XmlElement(name = "Gerador")
    protected String gerador;
    @XmlElement(name = "Guarita")
    protected String guarita;
    @XmlElement(name = "Heliponto")
    protected String heliponto;
    @XmlElement(name = "Horta")
    protected String horta;
    @XmlElement(name = "InternetCompartilhada")
    protected String internetCompartilhada;
    @XmlElement(name = "Jardim")
    protected String jardim;
    @XmlElement(name = "Lavanderia")
    protected String lavanderia;
    @XmlElement(name = "Marina")
    protected String marina;
    @XmlElement(name = "Massagista")
    protected String massagista;
    @XmlElement(name = "NumeroTorres", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long numeroTorres;
    @XmlElement(name = "PetPlay")
    protected String petPlay;
    @XmlElement(name = "Piscina", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long piscina;
    @XmlElement(name = "PiscinaAquecida", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long piscinaAquecida;
    @XmlElement(name = "PiscinaClimatizada", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long piscinaClimatizada;
    @XmlElement(name = "PiscinaCoberta", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long piscinaCoberta;
    @XmlElement(name = "PiscinaInfantil", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long piscinaInfantil;
    @XmlElement(name = "PistaCooper")
    protected String pistaCooper;
    @XmlElement(name = "PistaSkate")
    protected String pistaSkate;
    @XmlElement(name = "Playground")
    protected String playground;
    @XmlElement(name = "Pomar")
    protected String pomar;
    @XmlElement(name = "Portaria24h")
    protected String portaria24H;
    @XmlElement(name = "PortariaControlada")
    protected String portariaControlada;
    @XmlElement(name = "QuadraEsportes")
    protected String quadraEsportes;
    @XmlElement(name = "QuadraSquash", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long quadraSquash;
    @XmlElement(name = "QuadraTenis", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long quadraTenis;
    @XmlElement(name = "QuadraPoliesportiva", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long quadraPoliesportiva;
    @XmlElement(name = "QuantidadeElevadores", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long quantidadeElevadores;
    @XmlElement(name = "RedeTelefonica")
    protected String redeTelefonica;
    @XmlElement(name = "Restaurante")
    protected String restaurante;
    @XmlElement(name = "RuasAsfaltadas")
    protected String ruasAsfaltadas;
    @XmlElement(name = "SalaCinema")
    protected String salaCinema;
    @XmlElement(name = "SalaGinastica")
    protected String salaGinastica;
    @XmlElement(name = "SalaoFestas")
    protected String salaoFestas;
    @XmlElement(name = "SalaoJogos")
    protected String salaoJogos;
    @XmlElement(name = "Sauna")
    protected String sauna;
    @XmlElement(name = "SistemaAlarme")
    protected String sistemaAlarme;
    @XmlElement(name = "SistemaIncendio")
    protected String sistemaIncendio;
    @XmlElement(name = "Solarium")
    protected String solarium;
    @XmlElement(name = "Vestiario")
    protected String vestiario;
    @XmlElement(name = "Vigilancia24h")
    protected String vigilancia24H;

    /**
     * Obtém o valor da propriedade academiaFitness.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademiaFitness() {
        return academiaFitness;
    }

    /**
     * Define o valor da propriedade academiaFitness.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademiaFitness(String value) {
        this.academiaFitness = value;
    }

    /**
     * Obtém o valor da propriedade acessoDeficiente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcessoDeficiente() {
        return acessoDeficiente;
    }

    /**
     * Define o valor da propriedade acessoDeficiente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcessoDeficiente(String value) {
        this.acessoDeficiente = value;
    }

    /**
     * Obtém o valor da propriedade andaresPredio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAndaresPredio() {
        return andaresPredio;
    }

    /**
     * Define o valor da propriedade andaresPredio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAndaresPredio(Long value) {
        this.andaresPredio = value;
    }

    /**
     * Obtém o valor da propriedade areaVerde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaVerde() {
        return areaVerde;
    }

    /**
     * Define o valor da propriedade areaVerde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaVerde(String value) {
        this.areaVerde = value;
    }

    /**
     * Obtém o valor da propriedade bicicletario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBicicletario() {
        return bicicletario;
    }

    /**
     * Define o valor da propriedade bicicletario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBicicletario(String value) {
        this.bicicletario = value;
    }

    /**
     * Obtém o valor da propriedade brinquedoteca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrinquedoteca() {
        return brinquedoteca;
    }

    /**
     * Define o valor da propriedade brinquedoteca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrinquedoteca(String value) {
        this.brinquedoteca = value;
    }

    /**
     * Obtém o valor da propriedade campoFutebol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCampoFutebol() {
        return campoFutebol;
    }

    /**
     * Define o valor da propriedade campoFutebol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoFutebol(Long value) {
        this.campoFutebol = value;
    }

    /**
     * Obtém o valor da propriedade campoGolfe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCampoGolfe() {
        return campoGolfe;
    }

    /**
     * Define o valor da propriedade campoGolfe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoGolfe(Long value) {
        this.campoGolfe = value;
    }

    /**
     * Obtém o valor da propriedade centralLimpezaGovernanca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentralLimpezaGovernanca() {
        return centralLimpezaGovernanca;
    }

    /**
     * Define o valor da propriedade centralLimpezaGovernanca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentralLimpezaGovernanca(String value) {
        this.centralLimpezaGovernanca = value;
    }

    /**
     * Obtém o valor da propriedade centroEstetica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroEstetica() {
        return centroEstetica;
    }

    /**
     * Define o valor da propriedade centroEstetica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroEstetica(String value) {
        this.centroEstetica = value;
    }

    /**
     * Obtém o valor da propriedade churrasqueira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChurrasqueira() {
        return churrasqueira;
    }

    /**
     * Define o valor da propriedade churrasqueira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChurrasqueira(String value) {
        this.churrasqueira = value;
    }

    /**
     * Obtém o valor da propriedade espacoGourmet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspacoGourmet() {
        return espacoGourmet;
    }

    /**
     * Define o valor da propriedade espacoGourmet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspacoGourmet(String value) {
        this.espacoGourmet = value;
    }

    /**
     * Obtém o valor da propriedade vagaDeVisitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVagaDeVisitante() {
        return vagaDeVisitante;
    }

    /**
     * Define o valor da propriedade vagaDeVisitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVagaDeVisitante(String value) {
        this.vagaDeVisitante = value;
    }

    /**
     * Obtém o valor da propriedade gerador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGerador() {
        return gerador;
    }

    /**
     * Define o valor da propriedade gerador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGerador(String value) {
        this.gerador = value;
    }

    /**
     * Obtém o valor da propriedade guarita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarita() {
        return guarita;
    }

    /**
     * Define o valor da propriedade guarita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarita(String value) {
        this.guarita = value;
    }

    /**
     * Obtém o valor da propriedade heliponto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeliponto() {
        return heliponto;
    }

    /**
     * Define o valor da propriedade heliponto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeliponto(String value) {
        this.heliponto = value;
    }

    /**
     * Obtém o valor da propriedade horta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorta() {
        return horta;
    }

    /**
     * Define o valor da propriedade horta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorta(String value) {
        this.horta = value;
    }

    /**
     * Obtém o valor da propriedade internetCompartilhada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetCompartilhada() {
        return internetCompartilhada;
    }

    /**
     * Define o valor da propriedade internetCompartilhada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetCompartilhada(String value) {
        this.internetCompartilhada = value;
    }

    /**
     * Obtém o valor da propriedade jardim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJardim() {
        return jardim;
    }

    /**
     * Define o valor da propriedade jardim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJardim(String value) {
        this.jardim = value;
    }

    /**
     * Obtém o valor da propriedade lavanderia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLavanderia() {
        return lavanderia;
    }

    /**
     * Define o valor da propriedade lavanderia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLavanderia(String value) {
        this.lavanderia = value;
    }

    /**
     * Obtém o valor da propriedade marina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarina() {
        return marina;
    }

    /**
     * Define o valor da propriedade marina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarina(String value) {
        this.marina = value;
    }

    /**
     * Obtém o valor da propriedade massagista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMassagista() {
        return massagista;
    }

    /**
     * Define o valor da propriedade massagista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMassagista(String value) {
        this.massagista = value;
    }

    /**
     * Obtém o valor da propriedade numeroTorres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumeroTorres() {
        return numeroTorres;
    }

    /**
     * Define o valor da propriedade numeroTorres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTorres(Long value) {
        this.numeroTorres = value;
    }

    /**
     * Obtém o valor da propriedade petPlay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPetPlay() {
        return petPlay;
    }

    /**
     * Define o valor da propriedade petPlay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPetPlay(String value) {
        this.petPlay = value;
    }

    /**
     * Obtém o valor da propriedade piscina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPiscina() {
        return piscina;
    }

    /**
     * Define o valor da propriedade piscina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiscina(Long value) {
        this.piscina = value;
    }

    /**
     * Obtém o valor da propriedade piscinaAquecida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPiscinaAquecida() {
        return piscinaAquecida;
    }

    /**
     * Define o valor da propriedade piscinaAquecida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiscinaAquecida(Long value) {
        this.piscinaAquecida = value;
    }

    /**
     * Obtém o valor da propriedade piscinaClimatizada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPiscinaClimatizada() {
        return piscinaClimatizada;
    }

    /**
     * Define o valor da propriedade piscinaClimatizada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiscinaClimatizada(Long value) {
        this.piscinaClimatizada = value;
    }

    /**
     * Obtém o valor da propriedade piscinaCoberta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPiscinaCoberta() {
        return piscinaCoberta;
    }

    /**
     * Define o valor da propriedade piscinaCoberta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiscinaCoberta(Long value) {
        this.piscinaCoberta = value;
    }

    /**
     * Obtém o valor da propriedade piscinaInfantil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPiscinaInfantil() {
        return piscinaInfantil;
    }

    /**
     * Define o valor da propriedade piscinaInfantil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiscinaInfantil(Long value) {
        this.piscinaInfantil = value;
    }

    /**
     * Obtém o valor da propriedade pistaCooper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPistaCooper() {
        return pistaCooper;
    }

    /**
     * Define o valor da propriedade pistaCooper.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPistaCooper(String value) {
        this.pistaCooper = value;
    }

    /**
     * Obtém o valor da propriedade pistaSkate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPistaSkate() {
        return pistaSkate;
    }

    /**
     * Define o valor da propriedade pistaSkate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPistaSkate(String value) {
        this.pistaSkate = value;
    }

    /**
     * Obtém o valor da propriedade playground.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayground() {
        return playground;
    }

    /**
     * Define o valor da propriedade playground.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayground(String value) {
        this.playground = value;
    }

    /**
     * Obtém o valor da propriedade pomar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPomar() {
        return pomar;
    }

    /**
     * Define o valor da propriedade pomar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPomar(String value) {
        this.pomar = value;
    }

    /**
     * Obtém o valor da propriedade portaria24H.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortaria24H() {
        return portaria24H;
    }

    /**
     * Define o valor da propriedade portaria24H.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortaria24H(String value) {
        this.portaria24H = value;
    }

    /**
     * Obtém o valor da propriedade portariaControlada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortariaControlada() {
        return portariaControlada;
    }

    /**
     * Define o valor da propriedade portariaControlada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortariaControlada(String value) {
        this.portariaControlada = value;
    }

    /**
     * Obtém o valor da propriedade quadraEsportes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuadraEsportes() {
        return quadraEsportes;
    }

    /**
     * Define o valor da propriedade quadraEsportes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuadraEsportes(String value) {
        this.quadraEsportes = value;
    }

    /**
     * Obtém o valor da propriedade quadraSquash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQuadraSquash() {
        return quadraSquash;
    }

    /**
     * Define o valor da propriedade quadraSquash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuadraSquash(Long value) {
        this.quadraSquash = value;
    }

    /**
     * Obtém o valor da propriedade quadraTenis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQuadraTenis() {
        return quadraTenis;
    }

    /**
     * Define o valor da propriedade quadraTenis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuadraTenis(Long value) {
        this.quadraTenis = value;
    }

    /**
     * Obtém o valor da propriedade quadraPoliesportiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQuadraPoliesportiva() {
        return quadraPoliesportiva;
    }

    /**
     * Define o valor da propriedade quadraPoliesportiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuadraPoliesportiva(Long value) {
        this.quadraPoliesportiva = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeElevadores.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQuantidadeElevadores() {
        return quantidadeElevadores;
    }

    /**
     * Define o valor da propriedade quantidadeElevadores.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantidadeElevadores(Long value) {
        this.quantidadeElevadores = value;
    }

    /**
     * Obtém o valor da propriedade redeTelefonica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeTelefonica() {
        return redeTelefonica;
    }

    /**
     * Define o valor da propriedade redeTelefonica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeTelefonica(String value) {
        this.redeTelefonica = value;
    }

    /**
     * Obtém o valor da propriedade restaurante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestaurante() {
        return restaurante;
    }

    /**
     * Define o valor da propriedade restaurante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestaurante(String value) {
        this.restaurante = value;
    }

    /**
     * Obtém o valor da propriedade ruasAsfaltadas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuasAsfaltadas() {
        return ruasAsfaltadas;
    }

    /**
     * Define o valor da propriedade ruasAsfaltadas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuasAsfaltadas(String value) {
        this.ruasAsfaltadas = value;
    }

    /**
     * Obtém o valor da propriedade salaCinema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaCinema() {
        return salaCinema;
    }

    /**
     * Define o valor da propriedade salaCinema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaCinema(String value) {
        this.salaCinema = value;
    }

    /**
     * Obtém o valor da propriedade salaGinastica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaGinastica() {
        return salaGinastica;
    }

    /**
     * Define o valor da propriedade salaGinastica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaGinastica(String value) {
        this.salaGinastica = value;
    }

    /**
     * Obtém o valor da propriedade salaoFestas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaoFestas() {
        return salaoFestas;
    }

    /**
     * Define o valor da propriedade salaoFestas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaoFestas(String value) {
        this.salaoFestas = value;
    }

    /**
     * Obtém o valor da propriedade salaoJogos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaoJogos() {
        return salaoJogos;
    }

    /**
     * Define o valor da propriedade salaoJogos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaoJogos(String value) {
        this.salaoJogos = value;
    }

    /**
     * Obtém o valor da propriedade sauna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSauna() {
        return sauna;
    }

    /**
     * Define o valor da propriedade sauna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSauna(String value) {
        this.sauna = value;
    }

    /**
     * Obtém o valor da propriedade sistemaAlarme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaAlarme() {
        return sistemaAlarme;
    }

    /**
     * Define o valor da propriedade sistemaAlarme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaAlarme(String value) {
        this.sistemaAlarme = value;
    }

    /**
     * Obtém o valor da propriedade sistemaIncendio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaIncendio() {
        return sistemaIncendio;
    }

    /**
     * Define o valor da propriedade sistemaIncendio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaIncendio(String value) {
        this.sistemaIncendio = value;
    }

    /**
     * Obtém o valor da propriedade solarium.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolarium() {
        return solarium;
    }

    /**
     * Define o valor da propriedade solarium.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolarium(String value) {
        this.solarium = value;
    }

    /**
     * Obtém o valor da propriedade vestiario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVestiario() {
        return vestiario;
    }

    /**
     * Define o valor da propriedade vestiario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVestiario(String value) {
        this.vestiario = value;
    }

    /**
     * Obtém o valor da propriedade vigilancia24H.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigilancia24H() {
        return vigilancia24H;
    }

    /**
     * Define o valor da propriedade vigilancia24H.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigilancia24H(String value) {
        this.vigilancia24H = value;
    }

}
