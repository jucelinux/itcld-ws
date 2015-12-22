//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.22 às 02:16:01 PM BRST 
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
 * <p>Classe Java de Condominio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Condominio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcademiaFitness" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AcessoDeficiente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Administradora" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AndaresPredio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AreaVerde" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AutomacaoPredial" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Bicicletario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Brinquedoteca" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CampoFutebol" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CampoGolfe" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CasaBoneca" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Caseiro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CentralLimpezaGovernanca" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CentralTelefonica" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CentroEstetica" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ChildrenCare" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Churrasqueira" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CoffeeShop" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EdificioInteligente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EscritorioVirtual" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EspacoGourmet" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EspacoZen" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="GarageBand" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Gerador" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Guarita" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Heliponto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Horta" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="InternetCompartilhada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Jardim" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Lanhouse" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Lavanderia" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Marina" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MarinaVagaMolhada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MarinaVagaSeca" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Massagista" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MiniArvorismo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NumeroTorres" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OfficeSpace" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PermiteAnimais" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PersonalTraining" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Pesqueiro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PetPlay" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PianoBar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Piscina" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PiscinaAquecida" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PiscinaClimatizada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PiscinaCoberta" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PiscinaInfantil" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PistaCooper" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PistaSkate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Playground" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Pomar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Portaria24h" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PortariaControlada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PostoBancario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QuadraPoliesportiva" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QuadraSquash" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QuadraTenis" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QuantidadeElevadores" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Redario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RedeTelefonica" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Restaurante" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RuasAsfaltadas" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaCinema" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaGinastica" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaoConvencoes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaoFestas" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaoJogos" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaReunioes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaTV" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Sauna" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SaunaSeca" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SaunaUmida" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ServicosEscritorio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SistemaAlarme" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SistemaIncendio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Solarium" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VagaDeVisitante" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Vestiario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VestiarioEmpregado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Vigilancia24h" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "administradora",
    "andaresPredio",
    "areaVerde",
    "automacaoPredial",
    "bicicletario",
    "brinquedoteca",
    "campoFutebol",
    "campoGolfe",
    "casaBoneca",
    "caseiro",
    "centralLimpezaGovernanca",
    "centralTelefonica",
    "centroEstetica",
    "childrenCare",
    "churrasqueira",
    "coffeeShop",
    "edificioInteligente",
    "escritorioVirtual",
    "espacoGourmet",
    "espacoZen",
    "garageBand",
    "gerador",
    "guarita",
    "heliponto",
    "horta",
    "internetCompartilhada",
    "jardim",
    "lanhouse",
    "lavanderia",
    "marina",
    "marinaVagaMolhada",
    "marinaVagaSeca",
    "massagista",
    "miniArvorismo",
    "numeroTorres",
    "officeSpace",
    "permiteAnimais",
    "personalTraining",
    "pesqueiro",
    "petPlay",
    "pianoBar",
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
    "postoBancario",
    "quadraPoliesportiva",
    "quadraSquash",
    "quadraTenis",
    "quantidadeElevadores",
    "redario",
    "redeTelefonica",
    "restaurante",
    "ruasAsfaltadas",
    "salaCinema",
    "salaGinastica",
    "salaoConvencoes",
    "salaoFestas",
    "salaoJogos",
    "salaReunioes",
    "salaTV",
    "sauna",
    "saunaSeca",
    "saunaUmida",
    "servicosEscritorio",
    "sistemaAlarme",
    "sistemaIncendio",
    "solarium",
    "vagaDeVisitante",
    "vestiario",
    "vestiarioEmpregado",
    "vigilancia24H"
})
public class Condominio {

    @XmlElement(name = "AcademiaFitness", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long academiaFitness;
    @XmlElement(name = "AcessoDeficiente", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long acessoDeficiente;
    @XmlElement(name = "Administradora", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long administradora;
    @XmlElement(name = "AndaresPredio", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long andaresPredio;
    @XmlElement(name = "AreaVerde", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long areaVerde;
    @XmlElement(name = "AutomacaoPredial", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long automacaoPredial;
    @XmlElement(name = "Bicicletario", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long bicicletario;
    @XmlElement(name = "Brinquedoteca", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long brinquedoteca;
    @XmlElement(name = "CampoFutebol", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long campoFutebol;
    @XmlElement(name = "CampoGolfe", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long campoGolfe;
    @XmlElement(name = "CasaBoneca", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long casaBoneca;
    @XmlElement(name = "Caseiro", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long caseiro;
    @XmlElement(name = "CentralLimpezaGovernanca", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long centralLimpezaGovernanca;
    @XmlElement(name = "CentralTelefonica", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long centralTelefonica;
    @XmlElement(name = "CentroEstetica", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long centroEstetica;
    @XmlElement(name = "ChildrenCare", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long childrenCare;
    @XmlElement(name = "Churrasqueira", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long churrasqueira;
    @XmlElement(name = "CoffeeShop", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long coffeeShop;
    @XmlElement(name = "EdificioInteligente", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long edificioInteligente;
    @XmlElement(name = "EscritorioVirtual", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long escritorioVirtual;
    @XmlElement(name = "EspacoGourmet", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long espacoGourmet;
    @XmlElement(name = "EspacoZen", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long espacoZen;
    @XmlElement(name = "GarageBand", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long garageBand;
    @XmlElement(name = "Gerador", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long gerador;
    @XmlElement(name = "Guarita", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long guarita;
    @XmlElement(name = "Heliponto", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long heliponto;
    @XmlElement(name = "Horta", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long horta;
    @XmlElement(name = "InternetCompartilhada", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long internetCompartilhada;
    @XmlElement(name = "Jardim", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long jardim;
    @XmlElement(name = "Lanhouse", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long lanhouse;
    @XmlElement(name = "Lavanderia", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long lavanderia;
    @XmlElement(name = "Marina", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long marina;
    @XmlElement(name = "MarinaVagaMolhada", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long marinaVagaMolhada;
    @XmlElement(name = "MarinaVagaSeca", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long marinaVagaSeca;
    @XmlElement(name = "Massagista", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long massagista;
    @XmlElement(name = "MiniArvorismo", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long miniArvorismo;
    @XmlElement(name = "NumeroTorres", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long numeroTorres;
    @XmlElement(name = "OfficeSpace", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long officeSpace;
    @XmlElement(name = "PermiteAnimais", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long permiteAnimais;
    @XmlElement(name = "PersonalTraining", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long personalTraining;
    @XmlElement(name = "Pesqueiro", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long pesqueiro;
    @XmlElement(name = "PetPlay", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long petPlay;
    @XmlElement(name = "PianoBar", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long pianoBar;
    @XmlElement(name = "Piscina", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long piscina;
    @XmlElement(name = "PiscinaAquecida", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long piscinaAquecida;
    @XmlElement(name = "PiscinaClimatizada", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long piscinaClimatizada;
    @XmlElement(name = "PiscinaCoberta", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long piscinaCoberta;
    @XmlElement(name = "PiscinaInfantil", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long piscinaInfantil;
    @XmlElement(name = "PistaCooper", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long pistaCooper;
    @XmlElement(name = "PistaSkate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long pistaSkate;
    @XmlElement(name = "Playground", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long playground;
    @XmlElement(name = "Pomar", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long pomar;
    @XmlElement(name = "Portaria24h", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long portaria24H;
    @XmlElement(name = "PortariaControlada", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long portariaControlada;
    @XmlElement(name = "PostoBancario", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long postoBancario;
    @XmlElement(name = "QuadraPoliesportiva", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long quadraPoliesportiva;
    @XmlElement(name = "QuadraSquash", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long quadraSquash;
    @XmlElement(name = "QuadraTenis", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long quadraTenis;
    @XmlElement(name = "QuantidadeElevadores", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long quantidadeElevadores;
    @XmlElement(name = "Redario", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long redario;
    @XmlElement(name = "RedeTelefonica", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long redeTelefonica;
    @XmlElement(name = "Restaurante", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long restaurante;
    @XmlElement(name = "RuasAsfaltadas", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long ruasAsfaltadas;
    @XmlElement(name = "SalaCinema", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long salaCinema;
    @XmlElement(name = "SalaGinastica", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long salaGinastica;
    @XmlElement(name = "SalaoConvencoes", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long salaoConvencoes;
    @XmlElement(name = "SalaoFestas", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long salaoFestas;
    @XmlElement(name = "SalaoJogos", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long salaoJogos;
    @XmlElement(name = "SalaReunioes", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long salaReunioes;
    @XmlElement(name = "SalaTV", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long salaTV;
    @XmlElement(name = "Sauna", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long sauna;
    @XmlElement(name = "SaunaSeca", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long saunaSeca;
    @XmlElement(name = "SaunaUmida", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long saunaUmida;
    @XmlElement(name = "ServicosEscritorio", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long servicosEscritorio;
    @XmlElement(name = "SistemaAlarme", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long sistemaAlarme;
    @XmlElement(name = "SistemaIncendio", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long sistemaIncendio;
    @XmlElement(name = "Solarium", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long solarium;
    @XmlElement(name = "VagaDeVisitante", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long vagaDeVisitante;
    @XmlElement(name = "Vestiario", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long vestiario;
    @XmlElement(name = "VestiarioEmpregado", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long vestiarioEmpregado;
    @XmlElement(name = "Vigilancia24h", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long vigilancia24H;

    /**
     * Obtém o valor da propriedade academiaFitness.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAcademiaFitness() {
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
    public void setAcademiaFitness(Long value) {
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
    public Long getAcessoDeficiente() {
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
    public void setAcessoDeficiente(Long value) {
        this.acessoDeficiente = value;
    }

    /**
     * Obtém o valor da propriedade administradora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAdministradora() {
        return administradora;
    }

    /**
     * Define o valor da propriedade administradora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministradora(Long value) {
        this.administradora = value;
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
    public Long getAreaVerde() {
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
    public void setAreaVerde(Long value) {
        this.areaVerde = value;
    }

    /**
     * Obtém o valor da propriedade automacaoPredial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAutomacaoPredial() {
        return automacaoPredial;
    }

    /**
     * Define o valor da propriedade automacaoPredial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomacaoPredial(Long value) {
        this.automacaoPredial = value;
    }

    /**
     * Obtém o valor da propriedade bicicletario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getBicicletario() {
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
    public void setBicicletario(Long value) {
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
    public Long getBrinquedoteca() {
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
    public void setBrinquedoteca(Long value) {
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
     * Obtém o valor da propriedade casaBoneca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCasaBoneca() {
        return casaBoneca;
    }

    /**
     * Define o valor da propriedade casaBoneca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasaBoneca(Long value) {
        this.casaBoneca = value;
    }

    /**
     * Obtém o valor da propriedade caseiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCaseiro() {
        return caseiro;
    }

    /**
     * Define o valor da propriedade caseiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseiro(Long value) {
        this.caseiro = value;
    }

    /**
     * Obtém o valor da propriedade centralLimpezaGovernanca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCentralLimpezaGovernanca() {
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
    public void setCentralLimpezaGovernanca(Long value) {
        this.centralLimpezaGovernanca = value;
    }

    /**
     * Obtém o valor da propriedade centralTelefonica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCentralTelefonica() {
        return centralTelefonica;
    }

    /**
     * Define o valor da propriedade centralTelefonica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentralTelefonica(Long value) {
        this.centralTelefonica = value;
    }

    /**
     * Obtém o valor da propriedade centroEstetica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCentroEstetica() {
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
    public void setCentroEstetica(Long value) {
        this.centroEstetica = value;
    }

    /**
     * Obtém o valor da propriedade childrenCare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getChildrenCare() {
        return childrenCare;
    }

    /**
     * Define o valor da propriedade childrenCare.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildrenCare(Long value) {
        this.childrenCare = value;
    }

    /**
     * Obtém o valor da propriedade churrasqueira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getChurrasqueira() {
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
    public void setChurrasqueira(Long value) {
        this.churrasqueira = value;
    }

    /**
     * Obtém o valor da propriedade coffeeShop.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCoffeeShop() {
        return coffeeShop;
    }

    /**
     * Define o valor da propriedade coffeeShop.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoffeeShop(Long value) {
        this.coffeeShop = value;
    }

    /**
     * Obtém o valor da propriedade edificioInteligente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEdificioInteligente() {
        return edificioInteligente;
    }

    /**
     * Define o valor da propriedade edificioInteligente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdificioInteligente(Long value) {
        this.edificioInteligente = value;
    }

    /**
     * Obtém o valor da propriedade escritorioVirtual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEscritorioVirtual() {
        return escritorioVirtual;
    }

    /**
     * Define o valor da propriedade escritorioVirtual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscritorioVirtual(Long value) {
        this.escritorioVirtual = value;
    }

    /**
     * Obtém o valor da propriedade espacoGourmet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEspacoGourmet() {
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
    public void setEspacoGourmet(Long value) {
        this.espacoGourmet = value;
    }

    /**
     * Obtém o valor da propriedade espacoZen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEspacoZen() {
        return espacoZen;
    }

    /**
     * Define o valor da propriedade espacoZen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspacoZen(Long value) {
        this.espacoZen = value;
    }

    /**
     * Obtém o valor da propriedade garageBand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getGarageBand() {
        return garageBand;
    }

    /**
     * Define o valor da propriedade garageBand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGarageBand(Long value) {
        this.garageBand = value;
    }

    /**
     * Obtém o valor da propriedade gerador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getGerador() {
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
    public void setGerador(Long value) {
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
    public Long getGuarita() {
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
    public void setGuarita(Long value) {
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
    public Long getHeliponto() {
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
    public void setHeliponto(Long value) {
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
    public Long getHorta() {
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
    public void setHorta(Long value) {
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
    public Long getInternetCompartilhada() {
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
    public void setInternetCompartilhada(Long value) {
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
    public Long getJardim() {
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
    public void setJardim(Long value) {
        this.jardim = value;
    }

    /**
     * Obtém o valor da propriedade lanhouse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getLanhouse() {
        return lanhouse;
    }

    /**
     * Define o valor da propriedade lanhouse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanhouse(Long value) {
        this.lanhouse = value;
    }

    /**
     * Obtém o valor da propriedade lavanderia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getLavanderia() {
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
    public void setLavanderia(Long value) {
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
    public Long getMarina() {
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
    public void setMarina(Long value) {
        this.marina = value;
    }

    /**
     * Obtém o valor da propriedade marinaVagaMolhada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMarinaVagaMolhada() {
        return marinaVagaMolhada;
    }

    /**
     * Define o valor da propriedade marinaVagaMolhada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarinaVagaMolhada(Long value) {
        this.marinaVagaMolhada = value;
    }

    /**
     * Obtém o valor da propriedade marinaVagaSeca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMarinaVagaSeca() {
        return marinaVagaSeca;
    }

    /**
     * Define o valor da propriedade marinaVagaSeca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarinaVagaSeca(Long value) {
        this.marinaVagaSeca = value;
    }

    /**
     * Obtém o valor da propriedade massagista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMassagista() {
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
    public void setMassagista(Long value) {
        this.massagista = value;
    }

    /**
     * Obtém o valor da propriedade miniArvorismo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMiniArvorismo() {
        return miniArvorismo;
    }

    /**
     * Define o valor da propriedade miniArvorismo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiniArvorismo(Long value) {
        this.miniArvorismo = value;
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
     * Obtém o valor da propriedade officeSpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getOfficeSpace() {
        return officeSpace;
    }

    /**
     * Define o valor da propriedade officeSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeSpace(Long value) {
        this.officeSpace = value;
    }

    /**
     * Obtém o valor da propriedade permiteAnimais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPermiteAnimais() {
        return permiteAnimais;
    }

    /**
     * Define o valor da propriedade permiteAnimais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermiteAnimais(Long value) {
        this.permiteAnimais = value;
    }

    /**
     * Obtém o valor da propriedade personalTraining.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPersonalTraining() {
        return personalTraining;
    }

    /**
     * Define o valor da propriedade personalTraining.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalTraining(Long value) {
        this.personalTraining = value;
    }

    /**
     * Obtém o valor da propriedade pesqueiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPesqueiro() {
        return pesqueiro;
    }

    /**
     * Define o valor da propriedade pesqueiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesqueiro(Long value) {
        this.pesqueiro = value;
    }

    /**
     * Obtém o valor da propriedade petPlay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPetPlay() {
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
    public void setPetPlay(Long value) {
        this.petPlay = value;
    }

    /**
     * Obtém o valor da propriedade pianoBar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPianoBar() {
        return pianoBar;
    }

    /**
     * Define o valor da propriedade pianoBar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPianoBar(Long value) {
        this.pianoBar = value;
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
    public Long getPistaCooper() {
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
    public void setPistaCooper(Long value) {
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
    public Long getPistaSkate() {
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
    public void setPistaSkate(Long value) {
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
    public Long getPlayground() {
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
    public void setPlayground(Long value) {
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
    public Long getPomar() {
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
    public void setPomar(Long value) {
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
    public Long getPortaria24H() {
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
    public void setPortaria24H(Long value) {
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
    public Long getPortariaControlada() {
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
    public void setPortariaControlada(Long value) {
        this.portariaControlada = value;
    }

    /**
     * Obtém o valor da propriedade postoBancario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPostoBancario() {
        return postoBancario;
    }

    /**
     * Define o valor da propriedade postoBancario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostoBancario(Long value) {
        this.postoBancario = value;
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
     * Obtém o valor da propriedade redario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getRedario() {
        return redario;
    }

    /**
     * Define o valor da propriedade redario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedario(Long value) {
        this.redario = value;
    }

    /**
     * Obtém o valor da propriedade redeTelefonica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getRedeTelefonica() {
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
    public void setRedeTelefonica(Long value) {
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
    public Long getRestaurante() {
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
    public void setRestaurante(Long value) {
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
    public Long getRuasAsfaltadas() {
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
    public void setRuasAsfaltadas(Long value) {
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
    public Long getSalaCinema() {
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
    public void setSalaCinema(Long value) {
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
    public Long getSalaGinastica() {
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
    public void setSalaGinastica(Long value) {
        this.salaGinastica = value;
    }

    /**
     * Obtém o valor da propriedade salaoConvencoes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSalaoConvencoes() {
        return salaoConvencoes;
    }

    /**
     * Define o valor da propriedade salaoConvencoes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaoConvencoes(Long value) {
        this.salaoConvencoes = value;
    }

    /**
     * Obtém o valor da propriedade salaoFestas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSalaoFestas() {
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
    public void setSalaoFestas(Long value) {
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
    public Long getSalaoJogos() {
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
    public void setSalaoJogos(Long value) {
        this.salaoJogos = value;
    }

    /**
     * Obtém o valor da propriedade salaReunioes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSalaReunioes() {
        return salaReunioes;
    }

    /**
     * Define o valor da propriedade salaReunioes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaReunioes(Long value) {
        this.salaReunioes = value;
    }

    /**
     * Obtém o valor da propriedade salaTV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSalaTV() {
        return salaTV;
    }

    /**
     * Define o valor da propriedade salaTV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaTV(Long value) {
        this.salaTV = value;
    }

    /**
     * Obtém o valor da propriedade sauna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSauna() {
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
    public void setSauna(Long value) {
        this.sauna = value;
    }

    /**
     * Obtém o valor da propriedade saunaSeca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSaunaSeca() {
        return saunaSeca;
    }

    /**
     * Define o valor da propriedade saunaSeca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaunaSeca(Long value) {
        this.saunaSeca = value;
    }

    /**
     * Obtém o valor da propriedade saunaUmida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSaunaUmida() {
        return saunaUmida;
    }

    /**
     * Define o valor da propriedade saunaUmida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaunaUmida(Long value) {
        this.saunaUmida = value;
    }

    /**
     * Obtém o valor da propriedade servicosEscritorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getServicosEscritorio() {
        return servicosEscritorio;
    }

    /**
     * Define o valor da propriedade servicosEscritorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicosEscritorio(Long value) {
        this.servicosEscritorio = value;
    }

    /**
     * Obtém o valor da propriedade sistemaAlarme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSistemaAlarme() {
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
    public void setSistemaAlarme(Long value) {
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
    public Long getSistemaIncendio() {
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
    public void setSistemaIncendio(Long value) {
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
    public Long getSolarium() {
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
    public void setSolarium(Long value) {
        this.solarium = value;
    }

    /**
     * Obtém o valor da propriedade vagaDeVisitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getVagaDeVisitante() {
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
    public void setVagaDeVisitante(Long value) {
        this.vagaDeVisitante = value;
    }

    /**
     * Obtém o valor da propriedade vestiario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getVestiario() {
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
    public void setVestiario(Long value) {
        this.vestiario = value;
    }

    /**
     * Obtém o valor da propriedade vestiarioEmpregado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getVestiarioEmpregado() {
        return vestiarioEmpregado;
    }

    /**
     * Define o valor da propriedade vestiarioEmpregado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVestiarioEmpregado(Long value) {
        this.vestiarioEmpregado = value;
    }

    /**
     * Obtém o valor da propriedade vigilancia24H.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getVigilancia24H() {
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
    public void setVigilancia24H(Long value) {
        this.vigilancia24H = value;
    }

}
