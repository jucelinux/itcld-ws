//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.09.21 às 11:01:25 AM BRT 
//


package com.itcld.imoveis_ws.schema.bossanova;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;element name="CodigoImovel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataCadastro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NomeProprietario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EmailProprietario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoImovel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubTipoImovel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BairroComercial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ComplementoEndereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoOferta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fase" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrecoVenda" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PrecoVendaMinimo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PrecoVendaMaximo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PrecoMedioM2Venda" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PrecoLocacao" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PrecoMedioM2Locacao" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PrecoCondominio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PrecoIptu" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="QtdDormitorios" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdDormitoriosMinimo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdDormitoriosMaximo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdSuites" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdSalas" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdBanheiros" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdUnidadesAndar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AnoConstrucao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdVagas" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdVagasMinimo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdVagasMaximo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdVagasCobertas" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdAndar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QtdElevador" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AreaUtil" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AreaUtilMinimo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AreaUtilMaximo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AreaTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AreaTotalMinimo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AreaTotalMaximo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TourVirtual" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnidadeMetrica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroAndar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TituloImovel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Observacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Chamada" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="Massagista" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NumeroTorres" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OfficeSpace" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PermiteAnimais" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PersonalTraining" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PianoBar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Portaria24h" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PortariaControlada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QuantidadeElevadores" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RuasAsfaltadas" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ServicosEscritorio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VestiarioEmpregado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Vigilancia24h" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AcademiaFitness" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
 *         &lt;element name="ArmarioDeCozinha" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
 *         &lt;element name="Conservacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Construcao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Copa" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CozinhaAmericana" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CozinhaGourmet" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CozinhaIndependente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Curral" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DependenciaEmpregados" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Deposito" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DepositoSubsolo" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
 *         &lt;element name="Geminada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Gerador" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Heliponto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Hidromassagem" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="HomeTheater" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Horta" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="InternetWireless" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="InternetCompartilhada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Isolada" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
 *         &lt;element name="Recuo" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
 *         &lt;element name="Silos" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SistemaAlarme" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SistemaEsgoto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SistemaIncendio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Solarium" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TelefoneDDR" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Telhado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TerrasAraveis" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Topografia" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TVaCabo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VagaDeVisitante" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Varanda" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VarandaChurrasqueira" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VarandaFechadaVidro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VarandaGourmet" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VarandaIntegradaCozinha" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Vestiario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Vista" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "Imovel", propOrder = {
    "content"
})
public class Imovel {

    @XmlElementRefs({
        @XmlElementRef(name = "QtdSuites", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtdDormitorios", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArCondicionadoCentral", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LanHouse", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Copa", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CampoFutebol", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AreaTotalMinimo", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PrecoVendaMaximo", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Acesso", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SalaoFestas", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CozinhaGourmet", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Restaurante", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Redario", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ChurrasqueiraUnidade", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Bairro", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Observacao", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BanheiraComChuveiro", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtdAndar", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Banheira", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FrenteMar", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QuartoEmpregada", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DataCadastro", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DepositoSubsolo", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ServicosEscritorio", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Chamada", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AreaUtilMaximo", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UnidadeMetrica", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Rio", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EstruturaRede", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ChildrenCare", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Microondas", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Topografia", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PrecoMedioM2Venda", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Escritorio", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VagaDeVisitante", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtdSalas", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AquecimentoCentral", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BoaPastagem", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MeioAndar", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SistemaAlarme", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Fase", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OfficeSpace", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SubTipoImovel", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SalaAlmoco", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtdUnidadesAndar", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CasaCaseiro", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Galpao", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QuadraSquash", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DataAtualizacao", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Portaria24h", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Conservacao", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PiscinaInfantil", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NomeProprietario", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Playground", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Mezanino", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Hidromassagem", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ReservatorioAgua", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VarandaGourmet", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Carpete", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Churrasqueira", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Fogao", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "WcEmpregados", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Construcao", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AreaUtil", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Geminada", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArCondicionadoSplit", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TerrasAraveis", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Status", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Biblioteca", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SistemaEsgoto", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TipoImovel", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EspacoGourmet", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TipoOferta", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtdVagasMinimo", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Paiol", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QuadraEsportes", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EscritorioVirtual", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PisoLaminado", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EmQualAndar", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CasaSede", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QuantidadeElevadores", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtdBanheiros", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CampoGolfe", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtdDormitoriosMaximo", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Horta", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ComplementoEndereco", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NumeroTorres", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EntradaCaminhoes", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HomeTheater", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CodigoImovel", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Varanda", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Bicicletario", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Lareira", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Deposito", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CoffeeShop", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Ducha", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SalaCinema", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Pomar", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtdVagasCobertas", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Bar", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FogaoEletrico", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QuadraTenis", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EdificioInteligente", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RedeTelefonica", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AndaresPredio", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GasEncanado", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Sauna", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VarandaChurrasqueira", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SalaGinastica", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FornoPizza", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MiniArvorismo", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Vestiario", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AndarInteiro", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Lavoura", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NumeroAndar", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PistaCooper", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Poco", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Celeiro", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Jardim", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CozinhaIndependente", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LuzEletrica", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Pasto", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Brinquedoteca", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Curral", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PrecoMedioM2Locacao", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtdVagas", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TituloImovel", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PistaSkate", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AreaTotal", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PianoBar", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Telhado", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AnoConstrucao", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VarandaIntegradaCozinha", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SistemaIncendio", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Solarium", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DependenciaEmpregados", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Lavabo", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Edicula", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CEP", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArmarioDeCozinha", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Vista", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Guarita", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Silos", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AutomacaoPredial", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Endereco", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PrecoLocacao", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArCondicionadoEmbutido", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GarageBand", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Vigilancia24h", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Pais", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SalaoJogos", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Caseiro", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtdVagasMaximo", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Gerador", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SalaJantar", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Lavanderia", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AcessoDeficiente", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TourVirtual", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CasaBoneca", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "latitude", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Massagista", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Mobiliado", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Administradora", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Cachoeira", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CasaFundo", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Recuo", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PisoElevado", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Aquecedor", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LavaLouca", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArmarioEmbutido", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InternetCompartilhada", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Isolada", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PisoMadeira", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PrecoVenda", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PetPlay", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Heliponto", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InternetWireless", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CozinhaAmericana", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PeDireitoAlto", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RuasAsfaltadas", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Marina", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtdElevador", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SalaReunioes", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Pesqueiro", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PrecoIptu", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PiscinaCoberta", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VestiarioEmpregado", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EmailProprietario", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Quintal", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Closet", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PortariaControlada", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArCondicionado", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EstradaAsfaltada", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AreaUtilMinimo", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QtdDormitoriosMinimo", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Piscina", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Estado", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CentralTelefonica", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "longitude", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Freezer", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PiscinaClimatizada", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Fitness", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Geladeira", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Lago", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CarpeteMadeira", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AcademiaFitness", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AreaTotalMaximo", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TVaCabo", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PisoFrio", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RedeAltaTensao", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Numero", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Patio", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PocoArtesiano", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "QuadraPoliesportiva", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AreaDeServico", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PiscinaAquecida", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SalaIntima", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Cidade", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PostoBancario", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PermiteAnimais", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CentroEstetica", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CentralLimpezaGovernanca", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EnergiaEletrica", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PrecoCondominio", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SalaoConvencoes", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BairroComercial", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AreaVerde", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VarandaFechadaVidro", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AguaEncanada", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TelefoneDDR", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PersonalTraining", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SalaTV", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PrecoVendaMinimo", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Despensa", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EspacoZen", namespace = "http://itcld.com/imoveis-ws/schema/bossanova", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> content;

    /**
     * Obtém o restante do modelo do conteúdo. 
     * 
     * <p>
     * Você está obtendo esta propriedade "catch-all" pelo seguinte motivo: 
     * O nome do campo "AcademiaFitness" é usado por duas partes diferentes de um esquema. Consulte: 
     * linha 132 de file:/C:/Users/jucelino.queiroz/Documents/workspace-sts-3.7.0.RELEASE/itcld%20app/itcld-ws/src/main/resources/schema/bossa_nova.xsd
     * linha 92 de file:/C:/Users/jucelino.queiroz/Documents/workspace-sts-3.7.0.RELEASE/itcld%20app/itcld-ws/src/main/resources/schema/bossa_nova.xsd
     * <p>
     * Para eliminar esta propriedade, aplique uma personalização de propriedade a uma 
     * das seguintes declarações, a fim de alterar seus nomes: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.content;
    }

}
