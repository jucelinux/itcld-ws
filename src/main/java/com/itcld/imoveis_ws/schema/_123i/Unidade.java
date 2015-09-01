//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.09.01 às 11:36:20 AM BRT 
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
 * <p>Classe Java de Unidade complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Unidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcademiaFitness" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AcabamentoAreaLazer" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AcabamentoCozinha" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AcabamentoLiving" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AcabamentoBanheiros" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AcabamentoDormitorios" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Acesso" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Administradora" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AguaEncanada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AndarInteiro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Aquecedor" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AquecimentoCentral" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArCondicionado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArCondicionadoCentral" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArCondicionadoEmbutido" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArCondicionadoSplit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AreaDeServico" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AreaVerde" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArmarioAreaServico" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArmarioCozinha" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArmarioEmpregada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArmarioSala" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArmarioBanheiro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArmarioCorredor" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArmarioEscritorio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArmarioHomeTheater" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArmarioDormitorios" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArmarioEmbutido" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Banheira" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BanheiraComChuveiro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Bar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Biblioteca" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Bicicletario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BoaPastagem" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Brinquedoteca" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Cachoeira" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CampoFutebol" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CampoGolfe" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Carpete" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CarpeteMadeira" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CasaBoneca" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CasaCaseiro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CasaFundo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CasaSede" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Caseiro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Celeiro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CentralLimpezaGovernanca" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CentralTelefonica" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CentroEstetica" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ChildrenCare" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ChurrasqueiraUnidade" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Closet" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CoffeeShop" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Conservacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Construcao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Copa" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CozinhaAmericana" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CozinhaGourmet" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CozinhaIndependente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Curral" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DependenciaEmpregados" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Deposito" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DepositoSubsolo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Desck" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Despensa" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Ducha" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Edicula" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EmQualAndar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EnergiaEletrica" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EntradaCaminhoes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Escritorio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EscritorioVirtual" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EspacoGourmet" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EspacoZen" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EstradaAsfaltada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EstruturaRede" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Fitness" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Fogao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FogaoEletrico" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FornoPizza" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Freezer" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FrenteMar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Galpao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="GarageBand" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="GasEncanado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Geladeira" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Geminada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Gerador" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Heliponto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Hidromassagem" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="HomeTheater" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Horta" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="InternetWireless" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="InternetCompartilhada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Isolada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Jardim" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Lago" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LanHouse" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Lareira" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Lavabo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LavaLouca" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Lavanderia" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Lavoura" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LuzEletrica" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Marina" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MarinaVagaMolhada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MarinaVagaSeca" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MeioAndar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Mezanino" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Microondas" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MiniArvorismo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Mobiliado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Paiol" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Pasto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Patio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PeDireitoAlto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Pesqueiro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PetPlay" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Piscina" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PiscinaAquecida" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PiscinaClimatizada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PiscinaCoberta" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PiscinaInfantil" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PisoElevado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PisoFrio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PisoLaminado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PisoMadeira" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PistaCooper" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PistaSkate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Playground" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Poco" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PocoArtesiano" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Pomar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PostoBancario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QuadraEsportes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QuadraPoliesportiva" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QuadraSquash" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QuadraTenis" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QuartoEmpregada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Quintal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Recuo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Redario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RedeAltaTensao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RedeTelefonica" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ReservatorioAgua" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Restaurante" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Rio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaAlmoco" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaCinema" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaGinastica" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaIntima" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaJantar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaoConvencoes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaoFestas" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaoJogos" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaReunioes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SalaTV" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Sauna" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SaunaSeca" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SaunaUmida" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Silos" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SistemaAlarme" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SistemaEsgoto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SistemaIncendio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Solarium" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TelefoneDDR" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Telhado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TerrasAraveis" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Topografia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TVaCabo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VagaDeVisitante" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Varanda" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VarandaChurrasqueira" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VarandaFechadaVidro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VarandaGourmet" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VarandaIntegradaCozinha" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Vestiario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Vista" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WcEmpregados" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Unidade", propOrder = {
    "academiaFitness",
    "acabamentoAreaLazer",
    "acabamentoCozinha",
    "acabamentoLiving",
    "acabamentoBanheiros",
    "acabamentoDormitorios",
    "acesso",
    "administradora",
    "aguaEncanada",
    "andarInteiro",
    "aquecedor",
    "aquecimentoCentral",
    "arCondicionado",
    "arCondicionadoCentral",
    "arCondicionadoEmbutido",
    "arCondicionadoSplit",
    "areaDeServico",
    "areaVerde",
    "armarioAreaServico",
    "armarioCozinha",
    "armarioEmpregada",
    "armarioSala",
    "armarioBanheiro",
    "armarioCorredor",
    "armarioEscritorio",
    "armarioHomeTheater",
    "armarioDormitorios",
    "armarioEmbutido",
    "banheira",
    "banheiraComChuveiro",
    "bar",
    "biblioteca",
    "bicicletario",
    "boaPastagem",
    "brinquedoteca",
    "cachoeira",
    "campoFutebol",
    "campoGolfe",
    "carpete",
    "carpeteMadeira",
    "casaBoneca",
    "casaCaseiro",
    "casaFundo",
    "casaSede",
    "caseiro",
    "celeiro",
    "centralLimpezaGovernanca",
    "centralTelefonica",
    "centroEstetica",
    "childrenCare",
    "churrasqueiraUnidade",
    "closet",
    "coffeeShop",
    "conservacao",
    "construcao",
    "copa",
    "cozinhaAmericana",
    "cozinhaGourmet",
    "cozinhaIndependente",
    "curral",
    "dependenciaEmpregados",
    "deposito",
    "depositoSubsolo",
    "desck",
    "despensa",
    "ducha",
    "edicula",
    "emQualAndar",
    "energiaEletrica",
    "entradaCaminhoes",
    "escritorio",
    "escritorioVirtual",
    "espacoGourmet",
    "espacoZen",
    "estradaAsfaltada",
    "estruturaRede",
    "fitness",
    "fogao",
    "fogaoEletrico",
    "fornoPizza",
    "freezer",
    "frenteMar",
    "galpao",
    "garageBand",
    "gasEncanado",
    "geladeira",
    "geminada",
    "gerador",
    "heliponto",
    "hidromassagem",
    "homeTheater",
    "horta",
    "internetWireless",
    "internetCompartilhada",
    "isolada",
    "jardim",
    "lago",
    "lanHouse",
    "lareira",
    "lavabo",
    "lavaLouca",
    "lavanderia",
    "lavoura",
    "luzEletrica",
    "marina",
    "marinaVagaMolhada",
    "marinaVagaSeca",
    "meioAndar",
    "mezanino",
    "microondas",
    "miniArvorismo",
    "mobiliado",
    "paiol",
    "pasto",
    "patio",
    "peDireitoAlto",
    "pesqueiro",
    "petPlay",
    "piscina",
    "piscinaAquecida",
    "piscinaClimatizada",
    "piscinaCoberta",
    "piscinaInfantil",
    "pisoElevado",
    "pisoFrio",
    "pisoLaminado",
    "pisoMadeira",
    "pistaCooper",
    "pistaSkate",
    "playground",
    "poco",
    "pocoArtesiano",
    "pomar",
    "postoBancario",
    "quadraEsportes",
    "quadraPoliesportiva",
    "quadraSquash",
    "quadraTenis",
    "quartoEmpregada",
    "quintal",
    "recuo",
    "redario",
    "redeAltaTensao",
    "redeTelefonica",
    "reservatorioAgua",
    "restaurante",
    "rio",
    "salaAlmoco",
    "salaCinema",
    "salaGinastica",
    "salaIntima",
    "salaJantar",
    "salaoConvencoes",
    "salaoFestas",
    "salaoJogos",
    "salaReunioes",
    "salaTV",
    "sauna",
    "saunaSeca",
    "saunaUmida",
    "silos",
    "sistemaAlarme",
    "sistemaEsgoto",
    "sistemaIncendio",
    "solarium",
    "telefoneDDR",
    "telhado",
    "terrasAraveis",
    "topografia",
    "tVaCabo",
    "vagaDeVisitante",
    "varanda",
    "varandaChurrasqueira",
    "varandaFechadaVidro",
    "varandaGourmet",
    "varandaIntegradaCozinha",
    "vestiario",
    "vista",
    "wcEmpregados"
})
public class Unidade {

    @XmlElement(name = "AcademiaFitness", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long academiaFitness;
    @XmlElement(name = "AcabamentoAreaLazer", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long acabamentoAreaLazer;
    @XmlElement(name = "AcabamentoCozinha", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long acabamentoCozinha;
    @XmlElement(name = "AcabamentoLiving", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long acabamentoLiving;
    @XmlElement(name = "AcabamentoBanheiros", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long acabamentoBanheiros;
    @XmlElement(name = "AcabamentoDormitorios", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long acabamentoDormitorios;
    @XmlElement(name = "Acesso", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long acesso;
    @XmlElement(name = "Administradora", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long administradora;
    @XmlElement(name = "AguaEncanada", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long aguaEncanada;
    @XmlElement(name = "AndarInteiro", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long andarInteiro;
    @XmlElement(name = "Aquecedor", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long aquecedor;
    @XmlElement(name = "AquecimentoCentral", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long aquecimentoCentral;
    @XmlElement(name = "ArCondicionado", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long arCondicionado;
    @XmlElement(name = "ArCondicionadoCentral", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long arCondicionadoCentral;
    @XmlElement(name = "ArCondicionadoEmbutido", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long arCondicionadoEmbutido;
    @XmlElement(name = "ArCondicionadoSplit", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long arCondicionadoSplit;
    @XmlElement(name = "AreaDeServico", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long areaDeServico;
    @XmlElement(name = "AreaVerde", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long areaVerde;
    @XmlElement(name = "ArmarioAreaServico", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long armarioAreaServico;
    @XmlElement(name = "ArmarioCozinha", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long armarioCozinha;
    @XmlElement(name = "ArmarioEmpregada", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long armarioEmpregada;
    @XmlElement(name = "ArmarioSala", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long armarioSala;
    @XmlElement(name = "ArmarioBanheiro", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long armarioBanheiro;
    @XmlElement(name = "ArmarioCorredor", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long armarioCorredor;
    @XmlElement(name = "ArmarioEscritorio", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long armarioEscritorio;
    @XmlElement(name = "ArmarioHomeTheater", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long armarioHomeTheater;
    @XmlElement(name = "ArmarioDormitorios", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long armarioDormitorios;
    @XmlElement(name = "ArmarioEmbutido", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long armarioEmbutido;
    @XmlElement(name = "Banheira", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long banheira;
    @XmlElement(name = "BanheiraComChuveiro", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long banheiraComChuveiro;
    @XmlElement(name = "Bar", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long bar;
    @XmlElement(name = "Biblioteca", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long biblioteca;
    @XmlElement(name = "Bicicletario", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long bicicletario;
    @XmlElement(name = "BoaPastagem", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long boaPastagem;
    @XmlElement(name = "Brinquedoteca", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long brinquedoteca;
    @XmlElement(name = "Cachoeira", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long cachoeira;
    @XmlElement(name = "CampoFutebol", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long campoFutebol;
    @XmlElement(name = "CampoGolfe", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long campoGolfe;
    @XmlElement(name = "Carpete", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long carpete;
    @XmlElement(name = "CarpeteMadeira", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long carpeteMadeira;
    @XmlElement(name = "CasaBoneca", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long casaBoneca;
    @XmlElement(name = "CasaCaseiro", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long casaCaseiro;
    @XmlElement(name = "CasaFundo", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long casaFundo;
    @XmlElement(name = "CasaSede", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long casaSede;
    @XmlElement(name = "Caseiro", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long caseiro;
    @XmlElement(name = "Celeiro", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long celeiro;
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
    @XmlElement(name = "ChurrasqueiraUnidade", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long churrasqueiraUnidade;
    @XmlElement(name = "Closet", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long closet;
    @XmlElement(name = "CoffeeShop", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long coffeeShop;
    @XmlElement(name = "Conservacao", required = true)
    protected String conservacao;
    @XmlElement(name = "Construcao", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long construcao;
    @XmlElement(name = "Copa", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long copa;
    @XmlElement(name = "CozinhaAmericana", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long cozinhaAmericana;
    @XmlElement(name = "CozinhaGourmet", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long cozinhaGourmet;
    @XmlElement(name = "CozinhaIndependente", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long cozinhaIndependente;
    @XmlElement(name = "Curral", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long curral;
    @XmlElement(name = "DependenciaEmpregados", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long dependenciaEmpregados;
    @XmlElement(name = "Deposito", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long deposito;
    @XmlElement(name = "DepositoSubsolo", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long depositoSubsolo;
    @XmlElement(name = "Desck", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long desck;
    @XmlElement(name = "Despensa", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long despensa;
    @XmlElement(name = "Ducha", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long ducha;
    @XmlElement(name = "Edicula", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long edicula;
    @XmlElement(name = "EmQualAndar", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long emQualAndar;
    @XmlElement(name = "EnergiaEletrica", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long energiaEletrica;
    @XmlElement(name = "EntradaCaminhoes", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long entradaCaminhoes;
    @XmlElement(name = "Escritorio", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long escritorio;
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
    @XmlElement(name = "EstradaAsfaltada", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long estradaAsfaltada;
    @XmlElement(name = "EstruturaRede", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long estruturaRede;
    @XmlElement(name = "Fitness", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long fitness;
    @XmlElement(name = "Fogao", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long fogao;
    @XmlElement(name = "FogaoEletrico", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long fogaoEletrico;
    @XmlElement(name = "FornoPizza", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long fornoPizza;
    @XmlElement(name = "Freezer", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long freezer;
    @XmlElement(name = "FrenteMar", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long frenteMar;
    @XmlElement(name = "Galpao", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long galpao;
    @XmlElement(name = "GarageBand", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long garageBand;
    @XmlElement(name = "GasEncanado", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long gasEncanado;
    @XmlElement(name = "Geladeira", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long geladeira;
    @XmlElement(name = "Geminada", required = true)
    protected String geminada;
    @XmlElement(name = "Gerador", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long gerador;
    @XmlElement(name = "Heliponto", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long heliponto;
    @XmlElement(name = "Hidromassagem", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long hidromassagem;
    @XmlElement(name = "HomeTheater", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long homeTheater;
    @XmlElement(name = "Horta", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long horta;
    @XmlElement(name = "InternetWireless", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long internetWireless;
    @XmlElement(name = "InternetCompartilhada", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long internetCompartilhada;
    @XmlElement(name = "Isolada", required = true)
    protected String isolada;
    @XmlElement(name = "Jardim", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long jardim;
    @XmlElement(name = "Lago", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long lago;
    @XmlElement(name = "LanHouse", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long lanHouse;
    @XmlElement(name = "Lareira", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long lareira;
    @XmlElement(name = "Lavabo", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long lavabo;
    @XmlElement(name = "LavaLouca", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long lavaLouca;
    @XmlElement(name = "Lavanderia", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long lavanderia;
    @XmlElement(name = "Lavoura", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long lavoura;
    @XmlElement(name = "LuzEletrica", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long luzEletrica;
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
    @XmlElement(name = "MeioAndar", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long meioAndar;
    @XmlElement(name = "Mezanino", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long mezanino;
    @XmlElement(name = "Microondas", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long microondas;
    @XmlElement(name = "MiniArvorismo", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long miniArvorismo;
    @XmlElement(name = "Mobiliado", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long mobiliado;
    @XmlElement(name = "Paiol", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long paiol;
    @XmlElement(name = "Pasto", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long pasto;
    @XmlElement(name = "Patio", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long patio;
    @XmlElement(name = "PeDireitoAlto", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long peDireitoAlto;
    @XmlElement(name = "Pesqueiro", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long pesqueiro;
    @XmlElement(name = "PetPlay", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long petPlay;
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
    @XmlElement(name = "PisoElevado", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long pisoElevado;
    @XmlElement(name = "PisoFrio", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long pisoFrio;
    @XmlElement(name = "PisoLaminado", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long pisoLaminado;
    @XmlElement(name = "PisoMadeira", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long pisoMadeira;
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
    @XmlElement(name = "Poco", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long poco;
    @XmlElement(name = "PocoArtesiano", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long pocoArtesiano;
    @XmlElement(name = "Pomar", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long pomar;
    @XmlElement(name = "PostoBancario", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long postoBancario;
    @XmlElement(name = "QuadraEsportes", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long quadraEsportes;
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
    @XmlElement(name = "QuartoEmpregada", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long quartoEmpregada;
    @XmlElement(name = "Quintal", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long quintal;
    @XmlElement(name = "Recuo")
    protected double recuo;
    @XmlElement(name = "Redario", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long redario;
    @XmlElement(name = "RedeAltaTensao", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long redeAltaTensao;
    @XmlElement(name = "RedeTelefonica", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long redeTelefonica;
    @XmlElement(name = "ReservatorioAgua", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long reservatorioAgua;
    @XmlElement(name = "Restaurante", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long restaurante;
    @XmlElement(name = "Rio", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long rio;
    @XmlElement(name = "SalaAlmoco", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long salaAlmoco;
    @XmlElement(name = "SalaCinema", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long salaCinema;
    @XmlElement(name = "SalaGinastica", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long salaGinastica;
    @XmlElement(name = "SalaIntima", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long salaIntima;
    @XmlElement(name = "SalaJantar", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long salaJantar;
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
    @XmlElement(name = "Silos", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long silos;
    @XmlElement(name = "SistemaAlarme", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long sistemaAlarme;
    @XmlElement(name = "SistemaEsgoto", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long sistemaEsgoto;
    @XmlElement(name = "SistemaIncendio", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long sistemaIncendio;
    @XmlElement(name = "Solarium", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long solarium;
    @XmlElement(name = "TelefoneDDR", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long telefoneDDR;
    @XmlElement(name = "Telhado", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long telhado;
    @XmlElement(name = "TerrasAraveis", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long terrasAraveis;
    @XmlElement(name = "Topografia", required = true)
    protected String topografia;
    @XmlElement(name = "TVaCabo", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long tVaCabo;
    @XmlElement(name = "VagaDeVisitante", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long vagaDeVisitante;
    @XmlElement(name = "Varanda", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long varanda;
    @XmlElement(name = "VarandaChurrasqueira", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long varandaChurrasqueira;
    @XmlElement(name = "VarandaFechadaVidro", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long varandaFechadaVidro;
    @XmlElement(name = "VarandaGourmet", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long varandaGourmet;
    @XmlElement(name = "VarandaIntegradaCozinha", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long varandaIntegradaCozinha;
    @XmlElement(name = "Vestiario", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long vestiario;
    @XmlElement(name = "Vista", required = true)
    protected String vista;
    @XmlElement(name = "WcEmpregados", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long wcEmpregados;

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
     * Obtém o valor da propriedade acabamentoAreaLazer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAcabamentoAreaLazer() {
        return acabamentoAreaLazer;
    }

    /**
     * Define o valor da propriedade acabamentoAreaLazer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcabamentoAreaLazer(Long value) {
        this.acabamentoAreaLazer = value;
    }

    /**
     * Obtém o valor da propriedade acabamentoCozinha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAcabamentoCozinha() {
        return acabamentoCozinha;
    }

    /**
     * Define o valor da propriedade acabamentoCozinha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcabamentoCozinha(Long value) {
        this.acabamentoCozinha = value;
    }

    /**
     * Obtém o valor da propriedade acabamentoLiving.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAcabamentoLiving() {
        return acabamentoLiving;
    }

    /**
     * Define o valor da propriedade acabamentoLiving.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcabamentoLiving(Long value) {
        this.acabamentoLiving = value;
    }

    /**
     * Obtém o valor da propriedade acabamentoBanheiros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAcabamentoBanheiros() {
        return acabamentoBanheiros;
    }

    /**
     * Define o valor da propriedade acabamentoBanheiros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcabamentoBanheiros(Long value) {
        this.acabamentoBanheiros = value;
    }

    /**
     * Obtém o valor da propriedade acabamentoDormitorios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAcabamentoDormitorios() {
        return acabamentoDormitorios;
    }

    /**
     * Define o valor da propriedade acabamentoDormitorios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcabamentoDormitorios(Long value) {
        this.acabamentoDormitorios = value;
    }

    /**
     * Obtém o valor da propriedade acesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAcesso() {
        return acesso;
    }

    /**
     * Define o valor da propriedade acesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcesso(Long value) {
        this.acesso = value;
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
     * Obtém o valor da propriedade aguaEncanada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAguaEncanada() {
        return aguaEncanada;
    }

    /**
     * Define o valor da propriedade aguaEncanada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAguaEncanada(Long value) {
        this.aguaEncanada = value;
    }

    /**
     * Obtém o valor da propriedade andarInteiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAndarInteiro() {
        return andarInteiro;
    }

    /**
     * Define o valor da propriedade andarInteiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAndarInteiro(Long value) {
        this.andarInteiro = value;
    }

    /**
     * Obtém o valor da propriedade aquecedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAquecedor() {
        return aquecedor;
    }

    /**
     * Define o valor da propriedade aquecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAquecedor(Long value) {
        this.aquecedor = value;
    }

    /**
     * Obtém o valor da propriedade aquecimentoCentral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAquecimentoCentral() {
        return aquecimentoCentral;
    }

    /**
     * Define o valor da propriedade aquecimentoCentral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAquecimentoCentral(Long value) {
        this.aquecimentoCentral = value;
    }

    /**
     * Obtém o valor da propriedade arCondicionado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getArCondicionado() {
        return arCondicionado;
    }

    /**
     * Define o valor da propriedade arCondicionado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArCondicionado(Long value) {
        this.arCondicionado = value;
    }

    /**
     * Obtém o valor da propriedade arCondicionadoCentral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getArCondicionadoCentral() {
        return arCondicionadoCentral;
    }

    /**
     * Define o valor da propriedade arCondicionadoCentral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArCondicionadoCentral(Long value) {
        this.arCondicionadoCentral = value;
    }

    /**
     * Obtém o valor da propriedade arCondicionadoEmbutido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getArCondicionadoEmbutido() {
        return arCondicionadoEmbutido;
    }

    /**
     * Define o valor da propriedade arCondicionadoEmbutido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArCondicionadoEmbutido(Long value) {
        this.arCondicionadoEmbutido = value;
    }

    /**
     * Obtém o valor da propriedade arCondicionadoSplit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getArCondicionadoSplit() {
        return arCondicionadoSplit;
    }

    /**
     * Define o valor da propriedade arCondicionadoSplit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArCondicionadoSplit(Long value) {
        this.arCondicionadoSplit = value;
    }

    /**
     * Obtém o valor da propriedade areaDeServico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAreaDeServico() {
        return areaDeServico;
    }

    /**
     * Define o valor da propriedade areaDeServico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaDeServico(Long value) {
        this.areaDeServico = value;
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
     * Obtém o valor da propriedade armarioAreaServico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getArmarioAreaServico() {
        return armarioAreaServico;
    }

    /**
     * Define o valor da propriedade armarioAreaServico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmarioAreaServico(Long value) {
        this.armarioAreaServico = value;
    }

    /**
     * Obtém o valor da propriedade armarioCozinha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getArmarioCozinha() {
        return armarioCozinha;
    }

    /**
     * Define o valor da propriedade armarioCozinha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmarioCozinha(Long value) {
        this.armarioCozinha = value;
    }

    /**
     * Obtém o valor da propriedade armarioEmpregada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getArmarioEmpregada() {
        return armarioEmpregada;
    }

    /**
     * Define o valor da propriedade armarioEmpregada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmarioEmpregada(Long value) {
        this.armarioEmpregada = value;
    }

    /**
     * Obtém o valor da propriedade armarioSala.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getArmarioSala() {
        return armarioSala;
    }

    /**
     * Define o valor da propriedade armarioSala.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmarioSala(Long value) {
        this.armarioSala = value;
    }

    /**
     * Obtém o valor da propriedade armarioBanheiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getArmarioBanheiro() {
        return armarioBanheiro;
    }

    /**
     * Define o valor da propriedade armarioBanheiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmarioBanheiro(Long value) {
        this.armarioBanheiro = value;
    }

    /**
     * Obtém o valor da propriedade armarioCorredor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getArmarioCorredor() {
        return armarioCorredor;
    }

    /**
     * Define o valor da propriedade armarioCorredor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmarioCorredor(Long value) {
        this.armarioCorredor = value;
    }

    /**
     * Obtém o valor da propriedade armarioEscritorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getArmarioEscritorio() {
        return armarioEscritorio;
    }

    /**
     * Define o valor da propriedade armarioEscritorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmarioEscritorio(Long value) {
        this.armarioEscritorio = value;
    }

    /**
     * Obtém o valor da propriedade armarioHomeTheater.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getArmarioHomeTheater() {
        return armarioHomeTheater;
    }

    /**
     * Define o valor da propriedade armarioHomeTheater.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmarioHomeTheater(Long value) {
        this.armarioHomeTheater = value;
    }

    /**
     * Obtém o valor da propriedade armarioDormitorios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getArmarioDormitorios() {
        return armarioDormitorios;
    }

    /**
     * Define o valor da propriedade armarioDormitorios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmarioDormitorios(Long value) {
        this.armarioDormitorios = value;
    }

    /**
     * Obtém o valor da propriedade armarioEmbutido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getArmarioEmbutido() {
        return armarioEmbutido;
    }

    /**
     * Define o valor da propriedade armarioEmbutido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmarioEmbutido(Long value) {
        this.armarioEmbutido = value;
    }

    /**
     * Obtém o valor da propriedade banheira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getBanheira() {
        return banheira;
    }

    /**
     * Define o valor da propriedade banheira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanheira(Long value) {
        this.banheira = value;
    }

    /**
     * Obtém o valor da propriedade banheiraComChuveiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getBanheiraComChuveiro() {
        return banheiraComChuveiro;
    }

    /**
     * Define o valor da propriedade banheiraComChuveiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanheiraComChuveiro(Long value) {
        this.banheiraComChuveiro = value;
    }

    /**
     * Obtém o valor da propriedade bar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getBar() {
        return bar;
    }

    /**
     * Define o valor da propriedade bar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBar(Long value) {
        this.bar = value;
    }

    /**
     * Obtém o valor da propriedade biblioteca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getBiblioteca() {
        return biblioteca;
    }

    /**
     * Define o valor da propriedade biblioteca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiblioteca(Long value) {
        this.biblioteca = value;
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
     * Obtém o valor da propriedade boaPastagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getBoaPastagem() {
        return boaPastagem;
    }

    /**
     * Define o valor da propriedade boaPastagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoaPastagem(Long value) {
        this.boaPastagem = value;
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
     * Obtém o valor da propriedade cachoeira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCachoeira() {
        return cachoeira;
    }

    /**
     * Define o valor da propriedade cachoeira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCachoeira(Long value) {
        this.cachoeira = value;
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
     * Obtém o valor da propriedade carpete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCarpete() {
        return carpete;
    }

    /**
     * Define o valor da propriedade carpete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarpete(Long value) {
        this.carpete = value;
    }

    /**
     * Obtém o valor da propriedade carpeteMadeira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCarpeteMadeira() {
        return carpeteMadeira;
    }

    /**
     * Define o valor da propriedade carpeteMadeira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarpeteMadeira(Long value) {
        this.carpeteMadeira = value;
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
     * Obtém o valor da propriedade casaCaseiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCasaCaseiro() {
        return casaCaseiro;
    }

    /**
     * Define o valor da propriedade casaCaseiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasaCaseiro(Long value) {
        this.casaCaseiro = value;
    }

    /**
     * Obtém o valor da propriedade casaFundo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCasaFundo() {
        return casaFundo;
    }

    /**
     * Define o valor da propriedade casaFundo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasaFundo(Long value) {
        this.casaFundo = value;
    }

    /**
     * Obtém o valor da propriedade casaSede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCasaSede() {
        return casaSede;
    }

    /**
     * Define o valor da propriedade casaSede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasaSede(Long value) {
        this.casaSede = value;
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
     * Obtém o valor da propriedade celeiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCeleiro() {
        return celeiro;
    }

    /**
     * Define o valor da propriedade celeiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeleiro(Long value) {
        this.celeiro = value;
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
     * Obtém o valor da propriedade churrasqueiraUnidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getChurrasqueiraUnidade() {
        return churrasqueiraUnidade;
    }

    /**
     * Define o valor da propriedade churrasqueiraUnidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChurrasqueiraUnidade(Long value) {
        this.churrasqueiraUnidade = value;
    }

    /**
     * Obtém o valor da propriedade closet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCloset() {
        return closet;
    }

    /**
     * Define o valor da propriedade closet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloset(Long value) {
        this.closet = value;
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
     * Obtém o valor da propriedade conservacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConservacao() {
        return conservacao;
    }

    /**
     * Define o valor da propriedade conservacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConservacao(String value) {
        this.conservacao = value;
    }

    /**
     * Obtém o valor da propriedade construcao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getConstrucao() {
        return construcao;
    }

    /**
     * Define o valor da propriedade construcao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstrucao(Long value) {
        this.construcao = value;
    }

    /**
     * Obtém o valor da propriedade copa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCopa() {
        return copa;
    }

    /**
     * Define o valor da propriedade copa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopa(Long value) {
        this.copa = value;
    }

    /**
     * Obtém o valor da propriedade cozinhaAmericana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCozinhaAmericana() {
        return cozinhaAmericana;
    }

    /**
     * Define o valor da propriedade cozinhaAmericana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCozinhaAmericana(Long value) {
        this.cozinhaAmericana = value;
    }

    /**
     * Obtém o valor da propriedade cozinhaGourmet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCozinhaGourmet() {
        return cozinhaGourmet;
    }

    /**
     * Define o valor da propriedade cozinhaGourmet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCozinhaGourmet(Long value) {
        this.cozinhaGourmet = value;
    }

    /**
     * Obtém o valor da propriedade cozinhaIndependente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCozinhaIndependente() {
        return cozinhaIndependente;
    }

    /**
     * Define o valor da propriedade cozinhaIndependente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCozinhaIndependente(Long value) {
        this.cozinhaIndependente = value;
    }

    /**
     * Obtém o valor da propriedade curral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCurral() {
        return curral;
    }

    /**
     * Define o valor da propriedade curral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurral(Long value) {
        this.curral = value;
    }

    /**
     * Obtém o valor da propriedade dependenciaEmpregados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDependenciaEmpregados() {
        return dependenciaEmpregados;
    }

    /**
     * Define o valor da propriedade dependenciaEmpregados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependenciaEmpregados(Long value) {
        this.dependenciaEmpregados = value;
    }

    /**
     * Obtém o valor da propriedade deposito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDeposito() {
        return deposito;
    }

    /**
     * Define o valor da propriedade deposito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeposito(Long value) {
        this.deposito = value;
    }

    /**
     * Obtém o valor da propriedade depositoSubsolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDepositoSubsolo() {
        return depositoSubsolo;
    }

    /**
     * Define o valor da propriedade depositoSubsolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositoSubsolo(Long value) {
        this.depositoSubsolo = value;
    }

    /**
     * Obtém o valor da propriedade desck.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDesck() {
        return desck;
    }

    /**
     * Define o valor da propriedade desck.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesck(Long value) {
        this.desck = value;
    }

    /**
     * Obtém o valor da propriedade despensa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDespensa() {
        return despensa;
    }

    /**
     * Define o valor da propriedade despensa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespensa(Long value) {
        this.despensa = value;
    }

    /**
     * Obtém o valor da propriedade ducha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDucha() {
        return ducha;
    }

    /**
     * Define o valor da propriedade ducha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDucha(Long value) {
        this.ducha = value;
    }

    /**
     * Obtém o valor da propriedade edicula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEdicula() {
        return edicula;
    }

    /**
     * Define o valor da propriedade edicula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdicula(Long value) {
        this.edicula = value;
    }

    /**
     * Obtém o valor da propriedade emQualAndar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEmQualAndar() {
        return emQualAndar;
    }

    /**
     * Define o valor da propriedade emQualAndar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmQualAndar(Long value) {
        this.emQualAndar = value;
    }

    /**
     * Obtém o valor da propriedade energiaEletrica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEnergiaEletrica() {
        return energiaEletrica;
    }

    /**
     * Define o valor da propriedade energiaEletrica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergiaEletrica(Long value) {
        this.energiaEletrica = value;
    }

    /**
     * Obtém o valor da propriedade entradaCaminhoes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEntradaCaminhoes() {
        return entradaCaminhoes;
    }

    /**
     * Define o valor da propriedade entradaCaminhoes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntradaCaminhoes(Long value) {
        this.entradaCaminhoes = value;
    }

    /**
     * Obtém o valor da propriedade escritorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEscritorio() {
        return escritorio;
    }

    /**
     * Define o valor da propriedade escritorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscritorio(Long value) {
        this.escritorio = value;
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
     * Obtém o valor da propriedade estradaAsfaltada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEstradaAsfaltada() {
        return estradaAsfaltada;
    }

    /**
     * Define o valor da propriedade estradaAsfaltada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstradaAsfaltada(Long value) {
        this.estradaAsfaltada = value;
    }

    /**
     * Obtém o valor da propriedade estruturaRede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEstruturaRede() {
        return estruturaRede;
    }

    /**
     * Define o valor da propriedade estruturaRede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstruturaRede(Long value) {
        this.estruturaRede = value;
    }

    /**
     * Obtém o valor da propriedade fitness.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFitness() {
        return fitness;
    }

    /**
     * Define o valor da propriedade fitness.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFitness(Long value) {
        this.fitness = value;
    }

    /**
     * Obtém o valor da propriedade fogao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFogao() {
        return fogao;
    }

    /**
     * Define o valor da propriedade fogao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFogao(Long value) {
        this.fogao = value;
    }

    /**
     * Obtém o valor da propriedade fogaoEletrico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFogaoEletrico() {
        return fogaoEletrico;
    }

    /**
     * Define o valor da propriedade fogaoEletrico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFogaoEletrico(Long value) {
        this.fogaoEletrico = value;
    }

    /**
     * Obtém o valor da propriedade fornoPizza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFornoPizza() {
        return fornoPizza;
    }

    /**
     * Define o valor da propriedade fornoPizza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFornoPizza(Long value) {
        this.fornoPizza = value;
    }

    /**
     * Obtém o valor da propriedade freezer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFreezer() {
        return freezer;
    }

    /**
     * Define o valor da propriedade freezer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreezer(Long value) {
        this.freezer = value;
    }

    /**
     * Obtém o valor da propriedade frenteMar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFrenteMar() {
        return frenteMar;
    }

    /**
     * Define o valor da propriedade frenteMar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrenteMar(Long value) {
        this.frenteMar = value;
    }

    /**
     * Obtém o valor da propriedade galpao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getGalpao() {
        return galpao;
    }

    /**
     * Define o valor da propriedade galpao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGalpao(Long value) {
        this.galpao = value;
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
     * Obtém o valor da propriedade gasEncanado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getGasEncanado() {
        return gasEncanado;
    }

    /**
     * Define o valor da propriedade gasEncanado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGasEncanado(Long value) {
        this.gasEncanado = value;
    }

    /**
     * Obtém o valor da propriedade geladeira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getGeladeira() {
        return geladeira;
    }

    /**
     * Define o valor da propriedade geladeira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeladeira(Long value) {
        this.geladeira = value;
    }

    /**
     * Obtém o valor da propriedade geminada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeminada() {
        return geminada;
    }

    /**
     * Define o valor da propriedade geminada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeminada(String value) {
        this.geminada = value;
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
     * Obtém o valor da propriedade hidromassagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getHidromassagem() {
        return hidromassagem;
    }

    /**
     * Define o valor da propriedade hidromassagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHidromassagem(Long value) {
        this.hidromassagem = value;
    }

    /**
     * Obtém o valor da propriedade homeTheater.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getHomeTheater() {
        return homeTheater;
    }

    /**
     * Define o valor da propriedade homeTheater.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeTheater(Long value) {
        this.homeTheater = value;
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
     * Obtém o valor da propriedade internetWireless.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getInternetWireless() {
        return internetWireless;
    }

    /**
     * Define o valor da propriedade internetWireless.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetWireless(Long value) {
        this.internetWireless = value;
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
     * Obtém o valor da propriedade isolada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsolada() {
        return isolada;
    }

    /**
     * Define o valor da propriedade isolada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsolada(String value) {
        this.isolada = value;
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
     * Obtém o valor da propriedade lago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getLago() {
        return lago;
    }

    /**
     * Define o valor da propriedade lago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLago(Long value) {
        this.lago = value;
    }

    /**
     * Obtém o valor da propriedade lanHouse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getLanHouse() {
        return lanHouse;
    }

    /**
     * Define o valor da propriedade lanHouse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanHouse(Long value) {
        this.lanHouse = value;
    }

    /**
     * Obtém o valor da propriedade lareira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getLareira() {
        return lareira;
    }

    /**
     * Define o valor da propriedade lareira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLareira(Long value) {
        this.lareira = value;
    }

    /**
     * Obtém o valor da propriedade lavabo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getLavabo() {
        return lavabo;
    }

    /**
     * Define o valor da propriedade lavabo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLavabo(Long value) {
        this.lavabo = value;
    }

    /**
     * Obtém o valor da propriedade lavaLouca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getLavaLouca() {
        return lavaLouca;
    }

    /**
     * Define o valor da propriedade lavaLouca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLavaLouca(Long value) {
        this.lavaLouca = value;
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
     * Obtém o valor da propriedade lavoura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getLavoura() {
        return lavoura;
    }

    /**
     * Define o valor da propriedade lavoura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLavoura(Long value) {
        this.lavoura = value;
    }

    /**
     * Obtém o valor da propriedade luzEletrica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getLuzEletrica() {
        return luzEletrica;
    }

    /**
     * Define o valor da propriedade luzEletrica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLuzEletrica(Long value) {
        this.luzEletrica = value;
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
     * Obtém o valor da propriedade meioAndar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMeioAndar() {
        return meioAndar;
    }

    /**
     * Define o valor da propriedade meioAndar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeioAndar(Long value) {
        this.meioAndar = value;
    }

    /**
     * Obtém o valor da propriedade mezanino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMezanino() {
        return mezanino;
    }

    /**
     * Define o valor da propriedade mezanino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMezanino(Long value) {
        this.mezanino = value;
    }

    /**
     * Obtém o valor da propriedade microondas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMicroondas() {
        return microondas;
    }

    /**
     * Define o valor da propriedade microondas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicroondas(Long value) {
        this.microondas = value;
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
     * Obtém o valor da propriedade mobiliado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMobiliado() {
        return mobiliado;
    }

    /**
     * Define o valor da propriedade mobiliado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobiliado(Long value) {
        this.mobiliado = value;
    }

    /**
     * Obtém o valor da propriedade paiol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPaiol() {
        return paiol;
    }

    /**
     * Define o valor da propriedade paiol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaiol(Long value) {
        this.paiol = value;
    }

    /**
     * Obtém o valor da propriedade pasto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPasto() {
        return pasto;
    }

    /**
     * Define o valor da propriedade pasto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasto(Long value) {
        this.pasto = value;
    }

    /**
     * Obtém o valor da propriedade patio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPatio() {
        return patio;
    }

    /**
     * Define o valor da propriedade patio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatio(Long value) {
        this.patio = value;
    }

    /**
     * Obtém o valor da propriedade peDireitoAlto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPeDireitoAlto() {
        return peDireitoAlto;
    }

    /**
     * Define o valor da propriedade peDireitoAlto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeDireitoAlto(Long value) {
        this.peDireitoAlto = value;
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
     * Obtém o valor da propriedade pisoElevado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPisoElevado() {
        return pisoElevado;
    }

    /**
     * Define o valor da propriedade pisoElevado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPisoElevado(Long value) {
        this.pisoElevado = value;
    }

    /**
     * Obtém o valor da propriedade pisoFrio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPisoFrio() {
        return pisoFrio;
    }

    /**
     * Define o valor da propriedade pisoFrio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPisoFrio(Long value) {
        this.pisoFrio = value;
    }

    /**
     * Obtém o valor da propriedade pisoLaminado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPisoLaminado() {
        return pisoLaminado;
    }

    /**
     * Define o valor da propriedade pisoLaminado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPisoLaminado(Long value) {
        this.pisoLaminado = value;
    }

    /**
     * Obtém o valor da propriedade pisoMadeira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPisoMadeira() {
        return pisoMadeira;
    }

    /**
     * Define o valor da propriedade pisoMadeira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPisoMadeira(Long value) {
        this.pisoMadeira = value;
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
     * Obtém o valor da propriedade poco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPoco() {
        return poco;
    }

    /**
     * Define o valor da propriedade poco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoco(Long value) {
        this.poco = value;
    }

    /**
     * Obtém o valor da propriedade pocoArtesiano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPocoArtesiano() {
        return pocoArtesiano;
    }

    /**
     * Define o valor da propriedade pocoArtesiano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPocoArtesiano(Long value) {
        this.pocoArtesiano = value;
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
     * Obtém o valor da propriedade quadraEsportes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQuadraEsportes() {
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
    public void setQuadraEsportes(Long value) {
        this.quadraEsportes = value;
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
     * Obtém o valor da propriedade quartoEmpregada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQuartoEmpregada() {
        return quartoEmpregada;
    }

    /**
     * Define o valor da propriedade quartoEmpregada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuartoEmpregada(Long value) {
        this.quartoEmpregada = value;
    }

    /**
     * Obtém o valor da propriedade quintal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQuintal() {
        return quintal;
    }

    /**
     * Define o valor da propriedade quintal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuintal(Long value) {
        this.quintal = value;
    }

    /**
     * Obtém o valor da propriedade recuo.
     * 
     */
    public double getRecuo() {
        return recuo;
    }

    /**
     * Define o valor da propriedade recuo.
     * 
     */
    public void setRecuo(double value) {
        this.recuo = value;
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
     * Obtém o valor da propriedade redeAltaTensao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getRedeAltaTensao() {
        return redeAltaTensao;
    }

    /**
     * Define o valor da propriedade redeAltaTensao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeAltaTensao(Long value) {
        this.redeAltaTensao = value;
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
     * Obtém o valor da propriedade reservatorioAgua.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getReservatorioAgua() {
        return reservatorioAgua;
    }

    /**
     * Define o valor da propriedade reservatorioAgua.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservatorioAgua(Long value) {
        this.reservatorioAgua = value;
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
     * Obtém o valor da propriedade rio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getRio() {
        return rio;
    }

    /**
     * Define o valor da propriedade rio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRio(Long value) {
        this.rio = value;
    }

    /**
     * Obtém o valor da propriedade salaAlmoco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSalaAlmoco() {
        return salaAlmoco;
    }

    /**
     * Define o valor da propriedade salaAlmoco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaAlmoco(Long value) {
        this.salaAlmoco = value;
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
     * Obtém o valor da propriedade salaIntima.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSalaIntima() {
        return salaIntima;
    }

    /**
     * Define o valor da propriedade salaIntima.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaIntima(Long value) {
        this.salaIntima = value;
    }

    /**
     * Obtém o valor da propriedade salaJantar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSalaJantar() {
        return salaJantar;
    }

    /**
     * Define o valor da propriedade salaJantar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaJantar(Long value) {
        this.salaJantar = value;
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
     * Obtém o valor da propriedade silos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSilos() {
        return silos;
    }

    /**
     * Define o valor da propriedade silos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSilos(Long value) {
        this.silos = value;
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
     * Obtém o valor da propriedade sistemaEsgoto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSistemaEsgoto() {
        return sistemaEsgoto;
    }

    /**
     * Define o valor da propriedade sistemaEsgoto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaEsgoto(Long value) {
        this.sistemaEsgoto = value;
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
     * Obtém o valor da propriedade telefoneDDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTelefoneDDR() {
        return telefoneDDR;
    }

    /**
     * Define o valor da propriedade telefoneDDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneDDR(Long value) {
        this.telefoneDDR = value;
    }

    /**
     * Obtém o valor da propriedade telhado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTelhado() {
        return telhado;
    }

    /**
     * Define o valor da propriedade telhado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelhado(Long value) {
        this.telhado = value;
    }

    /**
     * Obtém o valor da propriedade terrasAraveis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTerrasAraveis() {
        return terrasAraveis;
    }

    /**
     * Define o valor da propriedade terrasAraveis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerrasAraveis(Long value) {
        this.terrasAraveis = value;
    }

    /**
     * Obtém o valor da propriedade topografia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopografia() {
        return topografia;
    }

    /**
     * Define o valor da propriedade topografia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopografia(String value) {
        this.topografia = value;
    }

    /**
     * Obtém o valor da propriedade tVaCabo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTVaCabo() {
        return tVaCabo;
    }

    /**
     * Define o valor da propriedade tVaCabo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTVaCabo(Long value) {
        this.tVaCabo = value;
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
     * Obtém o valor da propriedade varanda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getVaranda() {
        return varanda;
    }

    /**
     * Define o valor da propriedade varanda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVaranda(Long value) {
        this.varanda = value;
    }

    /**
     * Obtém o valor da propriedade varandaChurrasqueira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getVarandaChurrasqueira() {
        return varandaChurrasqueira;
    }

    /**
     * Define o valor da propriedade varandaChurrasqueira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarandaChurrasqueira(Long value) {
        this.varandaChurrasqueira = value;
    }

    /**
     * Obtém o valor da propriedade varandaFechadaVidro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getVarandaFechadaVidro() {
        return varandaFechadaVidro;
    }

    /**
     * Define o valor da propriedade varandaFechadaVidro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarandaFechadaVidro(Long value) {
        this.varandaFechadaVidro = value;
    }

    /**
     * Obtém o valor da propriedade varandaGourmet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getVarandaGourmet() {
        return varandaGourmet;
    }

    /**
     * Define o valor da propriedade varandaGourmet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarandaGourmet(Long value) {
        this.varandaGourmet = value;
    }

    /**
     * Obtém o valor da propriedade varandaIntegradaCozinha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getVarandaIntegradaCozinha() {
        return varandaIntegradaCozinha;
    }

    /**
     * Define o valor da propriedade varandaIntegradaCozinha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarandaIntegradaCozinha(Long value) {
        this.varandaIntegradaCozinha = value;
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
     * Obtém o valor da propriedade vista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVista() {
        return vista;
    }

    /**
     * Define o valor da propriedade vista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVista(String value) {
        this.vista = value;
    }

    /**
     * Obtém o valor da propriedade wcEmpregados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getWcEmpregados() {
        return wcEmpregados;
    }

    /**
     * Define o valor da propriedade wcEmpregados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWcEmpregados(Long value) {
        this.wcEmpregados = value;
    }

}
