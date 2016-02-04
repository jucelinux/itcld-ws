//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.02.04 às 09:43:18 AM BRST 
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
 * <p>Classe Java de Imovel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Imovel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Condominio" type="{http://itcld.com/imoveis-ws/schema/bossanova}Condominio"/>
 *         &lt;element name="PosicaoDestaque" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PosicaoSuperDestaque " type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PublicarValorSite " type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="PrecoVenda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrecoVendaMinimo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrecoVendaMaximo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrecoMedioM2Venda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrecoLocacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrecoMedioM2Locacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrecoCondominio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrecoIptu" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="AreaUtil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AreaUtilMinimo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AreaUtilMaximo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AreaTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AreaTotalMinimo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AreaTotalMaximo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TourVirtual" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnidadeMetrica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroAndar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TituloImovel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Observacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Chamada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NomeCondominio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AcademiaFitness" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AcessoDeficiente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Administradora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AndaresPredio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AreaVerde" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AutomacaoPredial" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Bicicletario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Brinquedoteca" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CampoFutebol" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CampoGolfe" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
 *         &lt;element name="Acesso" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AguaEncanada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AndarInteiro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Aquecedor" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AquecimentoCentral" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArCondicionado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArCondicionadoCentral" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArCondicionadoEmbutido" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArCondicionadoSplit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AreaDeServico" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArmarioDeCozinha" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArmarioEmbutido" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Banheira" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BanheiraComChuveiro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Bar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Biblioteca" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BoaPastagem" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Cachoeira" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Carpete" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CarpeteMadeira" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CasaBoneca" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CasaCaseiro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CasaFundo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CasaSede" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Celeiro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Closet" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
 *         &lt;element name="EstradaAsfaltada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EstruturaRede" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Fitness" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Fogao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FogaoEletrico" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FornoPizza" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Freezer" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FrenteMar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Galpao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="GasEncanado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Geladeira" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Geminada" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Hidromassagem" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="HomeTheater" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="InternetWireless" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="InternetCompartilhada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Isolada" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *         &lt;element name="Topografia" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="Fotos" type="{http://itcld.com/imoveis-ws/schema/bossanova}Fotos" minOccurs="0"/>
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
    "condominio",
    "posicaoDestaque",
    "posicaoSuperDestaque0020",
    "publicarValorSite0020",
    "codigoImovel",
    "dataCadastro",
    "dataAtualizacao",
    "nomeProprietario",
    "emailProprietario",
    "tipoImovel",
    "subTipoImovel",
    "cidade",
    "bairro",
    "bairroComercial",
    "endereco",
    "numero",
    "cep",
    "complementoEndereco",
    "estado",
    "pais",
    "latitude",
    "longitude",
    "tipoOferta",
    "status",
    "fase",
    "precoVenda",
    "precoVendaMinimo",
    "precoVendaMaximo",
    "precoMedioM2Venda",
    "precoLocacao",
    "precoMedioM2Locacao",
    "precoCondominio",
    "precoIptu",
    "qtdDormitorios",
    "qtdDormitoriosMinimo",
    "qtdDormitoriosMaximo",
    "qtdSuites",
    "qtdSalas",
    "qtdBanheiros",
    "qtdUnidadesAndar",
    "anoConstrucao",
    "qtdVagas",
    "qtdVagasMinimo",
    "qtdVagasMaximo",
    "qtdVagasCobertas",
    "qtdAndar",
    "qtdElevador",
    "areaUtil",
    "areaUtilMinimo",
    "areaUtilMaximo",
    "areaTotal",
    "areaTotalMinimo",
    "areaTotalMaximo",
    "tourVirtual",
    "unidadeMetrica",
    "numeroAndar",
    "tituloImovel",
    "observacao",
    "chamada",
    "nomeCondominio",
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
    "massagista",
    "numeroTorres",
    "officeSpace",
    "permiteAnimais",
    "personalTraining",
    "pianoBar",
    "portaria24H",
    "portariaControlada",
    "quantidadeElevadores",
    "ruasAsfaltadas",
    "servicosEscritorio",
    "vestiarioEmpregado",
    "vigilancia24H",
    "acesso",
    "aguaEncanada",
    "andarInteiro",
    "aquecedor",
    "aquecimentoCentral",
    "arCondicionado",
    "arCondicionadoCentral",
    "arCondicionadoEmbutido",
    "arCondicionadoSplit",
    "areaDeServico",
    "armarioDeCozinha",
    "armarioEmbutido",
    "banheira",
    "banheiraComChuveiro",
    "bar",
    "biblioteca",
    "boaPastagem",
    "cachoeira",
    "carpete",
    "carpeteMadeira",
    "casaBoneca",
    "casaCaseiro",
    "casaFundo",
    "casaSede",
    "celeiro",
    "closet",
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
    "despensa",
    "ducha",
    "edicula",
    "emQualAndar",
    "energiaEletrica",
    "entradaCaminhoes",
    "escritorio",
    "estradaAsfaltada",
    "estruturaRede",
    "fitness",
    "fogao",
    "fogaoEletrico",
    "fornoPizza",
    "freezer",
    "frenteMar",
    "galpao",
    "gasEncanado",
    "geladeira",
    "geminada",
    "hidromassagem",
    "homeTheater",
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
    "wcEmpregados",
    "fotos"
})
public class Imovel {

    @XmlElement(name = "Condominio", required = true)
    protected Condominio condominio;
    @XmlElement(name = "PosicaoDestaque", required = true)
    protected String posicaoDestaque;
    @XmlElement(name = "PosicaoSuperDestaque ", required = true)
    protected String posicaoSuperDestaque0020;
    @XmlElement(name = "PublicarValorSite ", required = true)
    protected String publicarValorSite0020;
    @XmlElement(name = "CodigoImovel", required = true)
    protected String codigoImovel;
    @XmlElement(name = "DataCadastro", required = true)
    protected String dataCadastro;
    @XmlElement(name = "DataAtualizacao", required = true)
    protected String dataAtualizacao;
    @XmlElement(name = "NomeProprietario", required = true)
    protected String nomeProprietario;
    @XmlElement(name = "EmailProprietario", required = true)
    protected String emailProprietario;
    @XmlElement(name = "TipoImovel", required = true)
    protected String tipoImovel;
    @XmlElement(name = "SubTipoImovel", required = true)
    protected String subTipoImovel;
    @XmlElement(name = "Cidade", required = true)
    protected String cidade;
    @XmlElement(name = "Bairro", required = true)
    protected String bairro;
    @XmlElement(name = "BairroComercial", required = true)
    protected String bairroComercial;
    @XmlElement(name = "Endereco", required = true)
    protected String endereco;
    @XmlElement(name = "Numero", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long numero;
    @XmlElement(name = "CEP", required = true)
    protected String cep;
    @XmlElement(name = "ComplementoEndereco", required = true)
    protected String complementoEndereco;
    @XmlElement(name = "Estado", required = true)
    protected String estado;
    @XmlElement(name = "Pais", required = true)
    protected String pais;
    @XmlElement(required = true)
    protected String latitude;
    @XmlElement(required = true)
    protected String longitude;
    @XmlElement(name = "TipoOferta", required = true)
    protected String tipoOferta;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "Fase", required = true)
    protected String fase;
    @XmlElement(name = "PrecoVenda", required = true)
    protected String precoVenda;
    @XmlElement(name = "PrecoVendaMinimo", required = true)
    protected String precoVendaMinimo;
    @XmlElement(name = "PrecoVendaMaximo", required = true)
    protected String precoVendaMaximo;
    @XmlElement(name = "PrecoMedioM2Venda", required = true)
    protected String precoMedioM2Venda;
    @XmlElement(name = "PrecoLocacao", required = true)
    protected String precoLocacao;
    @XmlElement(name = "PrecoMedioM2Locacao", required = true)
    protected String precoMedioM2Locacao;
    @XmlElement(name = "PrecoCondominio", required = true)
    protected String precoCondominio;
    @XmlElement(name = "PrecoIptu", required = true)
    protected String precoIptu;
    @XmlElement(name = "QtdDormitorios", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long qtdDormitorios;
    @XmlElement(name = "QtdDormitoriosMinimo", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long qtdDormitoriosMinimo;
    @XmlElement(name = "QtdDormitoriosMaximo", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long qtdDormitoriosMaximo;
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
    @XmlElement(name = "QtdVagasMinimo", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long qtdVagasMinimo;
    @XmlElement(name = "QtdVagasMaximo", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long qtdVagasMaximo;
    @XmlElement(name = "QtdVagasCobertas", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long qtdVagasCobertas;
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
    @XmlElement(name = "AreaUtilMinimo", required = true)
    protected String areaUtilMinimo;
    @XmlElement(name = "AreaUtilMaximo", required = true)
    protected String areaUtilMaximo;
    @XmlElement(name = "AreaTotal", required = true)
    protected String areaTotal;
    @XmlElement(name = "AreaTotalMinimo", required = true)
    protected String areaTotalMinimo;
    @XmlElement(name = "AreaTotalMaximo", required = true)
    protected String areaTotalMaximo;
    @XmlElement(name = "TourVirtual", required = true)
    protected String tourVirtual;
    @XmlElement(name = "UnidadeMetrica", required = true)
    protected String unidadeMetrica;
    @XmlElement(name = "NumeroAndar", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long numeroAndar;
    @XmlElement(name = "TituloImovel", required = true)
    protected String tituloImovel;
    @XmlElement(name = "Observacao", required = true)
    protected String observacao;
    @XmlElement(name = "Chamada", required = true)
    protected String chamada;
    @XmlElement(name = "NomeCondominio", required = true)
    protected String nomeCondominio;
    @XmlElement(name = "AcademiaFitness", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long academiaFitness;
    @XmlElement(name = "AcessoDeficiente", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long acessoDeficiente;
    @XmlElement(name = "Administradora", required = true)
    protected String administradora;
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
    @XmlElement(name = "Massagista", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long massagista;
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
    @XmlElement(name = "PianoBar", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long pianoBar;
    @XmlElement(name = "Portaria24h", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long portaria24H;
    @XmlElement(name = "PortariaControlada", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long portariaControlada;
    @XmlElement(name = "QuantidadeElevadores", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long quantidadeElevadores;
    @XmlElement(name = "RuasAsfaltadas", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long ruasAsfaltadas;
    @XmlElement(name = "ServicosEscritorio", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long servicosEscritorio;
    @XmlElement(name = "VestiarioEmpregado", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long vestiarioEmpregado;
    @XmlElement(name = "Vigilancia24h", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long vigilancia24H;
    @XmlElement(name = "Acesso", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long acesso;
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
    @XmlElement(name = "ArmarioDeCozinha", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long armarioDeCozinha;
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
    @XmlElement(name = "BoaPastagem", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long boaPastagem;
    @XmlElement(name = "Cachoeira", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long cachoeira;
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
    @XmlElement(name = "Celeiro", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long celeiro;
    @XmlElement(name = "Closet", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long closet;
    @XmlElement(name = "Conservacao", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long conservacao;
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
    @XmlElement(name = "FrenteMar")
    protected boolean frenteMar;
    @XmlElement(name = "Galpao", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long galpao;
    @XmlElement(name = "GasEncanado", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long gasEncanado;
    @XmlElement(name = "Geladeira", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long geladeira;
    @XmlElement(name = "Geminada")
    protected boolean geminada;
    @XmlElement(name = "Hidromassagem", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long hidromassagem;
    @XmlElement(name = "HomeTheater", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long homeTheater;
    @XmlElement(name = "InternetWireless", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long internetWireless;
    @XmlElement(name = "InternetCompartilhada", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long internetCompartilhada;
    @XmlElement(name = "Isolada")
    protected boolean isolada;
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
    @XmlElement(name = "Recuo", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long recuo;
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
    @XmlElement(name = "Vista", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long vista;
    @XmlElement(name = "WcEmpregados", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "long")
    protected Long wcEmpregados;
    @XmlElement(name = "Fotos")
    protected Fotos fotos;

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
     * Obtém o valor da propriedade posicaoDestaque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosicaoDestaque() {
        return posicaoDestaque;
    }

    /**
     * Define o valor da propriedade posicaoDestaque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosicaoDestaque(String value) {
        this.posicaoDestaque = value;
    }

    /**
     * Obtém o valor da propriedade posicaoSuperDestaque0020.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosicaoSuperDestaque_0020() {
        return posicaoSuperDestaque0020;
    }

    /**
     * Define o valor da propriedade posicaoSuperDestaque0020.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosicaoSuperDestaque_0020(String value) {
        this.posicaoSuperDestaque0020 = value;
    }

    /**
     * Obtém o valor da propriedade publicarValorSite0020.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicarValorSite_0020() {
        return publicarValorSite0020;
    }

    /**
     * Define o valor da propriedade publicarValorSite0020.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicarValorSite_0020(String value) {
        this.publicarValorSite0020 = value;
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
     * Obtém o valor da propriedade dataCadastro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCadastro() {
        return dataCadastro;
    }

    /**
     * Define o valor da propriedade dataCadastro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCadastro(String value) {
        this.dataCadastro = value;
    }

    /**
     * Obtém o valor da propriedade dataAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    /**
     * Define o valor da propriedade dataAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAtualizacao(String value) {
        this.dataAtualizacao = value;
    }

    /**
     * Obtém o valor da propriedade nomeProprietario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProprietario() {
        return nomeProprietario;
    }

    /**
     * Define o valor da propriedade nomeProprietario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProprietario(String value) {
        this.nomeProprietario = value;
    }

    /**
     * Obtém o valor da propriedade emailProprietario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailProprietario() {
        return emailProprietario;
    }

    /**
     * Define o valor da propriedade emailProprietario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailProprietario(String value) {
        this.emailProprietario = value;
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
     * Obtém o valor da propriedade bairroComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairroComercial() {
        return bairroComercial;
    }

    /**
     * Define o valor da propriedade bairroComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairroComercial(String value) {
        this.bairroComercial = value;
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
    public String getCEP() {
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
    public void setCEP(String value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade complementoEndereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    /**
     * Define o valor da propriedade complementoEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoEndereco(String value) {
        this.complementoEndereco = value;
    }

    /**
     * Obtém o valor da propriedade estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define o valor da propriedade estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtém o valor da propriedade pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define o valor da propriedade pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtém o valor da propriedade latitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Define o valor da propriedade latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Obtém o valor da propriedade longitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Define o valor da propriedade longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Obtém o valor da propriedade tipoOferta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOferta() {
        return tipoOferta;
    }

    /**
     * Define o valor da propriedade tipoOferta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOferta(String value) {
        this.tipoOferta = value;
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
     * Obtém o valor da propriedade fase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFase() {
        return fase;
    }

    /**
     * Define o valor da propriedade fase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFase(String value) {
        this.fase = value;
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
     * Obtém o valor da propriedade precoVendaMinimo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecoVendaMinimo() {
        return precoVendaMinimo;
    }

    /**
     * Define o valor da propriedade precoVendaMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecoVendaMinimo(String value) {
        this.precoVendaMinimo = value;
    }

    /**
     * Obtém o valor da propriedade precoVendaMaximo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecoVendaMaximo() {
        return precoVendaMaximo;
    }

    /**
     * Define o valor da propriedade precoVendaMaximo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecoVendaMaximo(String value) {
        this.precoVendaMaximo = value;
    }

    /**
     * Obtém o valor da propriedade precoMedioM2Venda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecoMedioM2Venda() {
        return precoMedioM2Venda;
    }

    /**
     * Define o valor da propriedade precoMedioM2Venda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecoMedioM2Venda(String value) {
        this.precoMedioM2Venda = value;
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
     * Obtém o valor da propriedade precoMedioM2Locacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecoMedioM2Locacao() {
        return precoMedioM2Locacao;
    }

    /**
     * Define o valor da propriedade precoMedioM2Locacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecoMedioM2Locacao(String value) {
        this.precoMedioM2Locacao = value;
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
     * Obtém o valor da propriedade precoIptu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecoIptu() {
        return precoIptu;
    }

    /**
     * Define o valor da propriedade precoIptu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecoIptu(String value) {
        this.precoIptu = value;
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
     * Obtém o valor da propriedade qtdDormitoriosMinimo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQtdDormitoriosMinimo() {
        return qtdDormitoriosMinimo;
    }

    /**
     * Define o valor da propriedade qtdDormitoriosMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdDormitoriosMinimo(Long value) {
        this.qtdDormitoriosMinimo = value;
    }

    /**
     * Obtém o valor da propriedade qtdDormitoriosMaximo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQtdDormitoriosMaximo() {
        return qtdDormitoriosMaximo;
    }

    /**
     * Define o valor da propriedade qtdDormitoriosMaximo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdDormitoriosMaximo(Long value) {
        this.qtdDormitoriosMaximo = value;
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
     * Obtém o valor da propriedade qtdVagasMinimo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQtdVagasMinimo() {
        return qtdVagasMinimo;
    }

    /**
     * Define o valor da propriedade qtdVagasMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdVagasMinimo(Long value) {
        this.qtdVagasMinimo = value;
    }

    /**
     * Obtém o valor da propriedade qtdVagasMaximo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQtdVagasMaximo() {
        return qtdVagasMaximo;
    }

    /**
     * Define o valor da propriedade qtdVagasMaximo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdVagasMaximo(Long value) {
        this.qtdVagasMaximo = value;
    }

    /**
     * Obtém o valor da propriedade qtdVagasCobertas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getQtdVagasCobertas() {
        return qtdVagasCobertas;
    }

    /**
     * Define o valor da propriedade qtdVagasCobertas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdVagasCobertas(Long value) {
        this.qtdVagasCobertas = value;
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
     * Obtém o valor da propriedade areaUtilMinimo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaUtilMinimo() {
        return areaUtilMinimo;
    }

    /**
     * Define o valor da propriedade areaUtilMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaUtilMinimo(String value) {
        this.areaUtilMinimo = value;
    }

    /**
     * Obtém o valor da propriedade areaUtilMaximo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaUtilMaximo() {
        return areaUtilMaximo;
    }

    /**
     * Define o valor da propriedade areaUtilMaximo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaUtilMaximo(String value) {
        this.areaUtilMaximo = value;
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
     * Obtém o valor da propriedade areaTotalMinimo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaTotalMinimo() {
        return areaTotalMinimo;
    }

    /**
     * Define o valor da propriedade areaTotalMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaTotalMinimo(String value) {
        this.areaTotalMinimo = value;
    }

    /**
     * Obtém o valor da propriedade areaTotalMaximo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaTotalMaximo() {
        return areaTotalMaximo;
    }

    /**
     * Define o valor da propriedade areaTotalMaximo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaTotalMaximo(String value) {
        this.areaTotalMaximo = value;
    }

    /**
     * Obtém o valor da propriedade tourVirtual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourVirtual() {
        return tourVirtual;
    }

    /**
     * Define o valor da propriedade tourVirtual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourVirtual(String value) {
        this.tourVirtual = value;
    }

    /**
     * Obtém o valor da propriedade unidadeMetrica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadeMetrica() {
        return unidadeMetrica;
    }

    /**
     * Define o valor da propriedade unidadeMetrica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadeMetrica(String value) {
        this.unidadeMetrica = value;
    }

    /**
     * Obtém o valor da propriedade numeroAndar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumeroAndar() {
        return numeroAndar;
    }

    /**
     * Define o valor da propriedade numeroAndar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAndar(Long value) {
        this.numeroAndar = value;
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
     * Obtém o valor da propriedade chamada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChamada() {
        return chamada;
    }

    /**
     * Define o valor da propriedade chamada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChamada(String value) {
        this.chamada = value;
    }

    /**
     * Obtém o valor da propriedade nomeCondominio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCondominio() {
        return nomeCondominio;
    }

    /**
     * Define o valor da propriedade nomeCondominio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCondominio(String value) {
        this.nomeCondominio = value;
    }

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
    public String getAdministradora() {
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
    public void setAdministradora(String value) {
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
     * Obtém o valor da propriedade armarioDeCozinha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getArmarioDeCozinha() {
        return armarioDeCozinha;
    }

    /**
     * Define o valor da propriedade armarioDeCozinha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmarioDeCozinha(Long value) {
        this.armarioDeCozinha = value;
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
     * Obtém o valor da propriedade conservacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getConservacao() {
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
    public void setConservacao(Long value) {
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
     */
    public boolean isFrenteMar() {
        return frenteMar;
    }

    /**
     * Define o valor da propriedade frenteMar.
     * 
     */
    public void setFrenteMar(boolean value) {
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
     */
    public boolean isGeminada() {
        return geminada;
    }

    /**
     * Define o valor da propriedade geminada.
     * 
     */
    public void setGeminada(boolean value) {
        this.geminada = value;
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
     */
    public boolean isIsolada() {
        return isolada;
    }

    /**
     * Define o valor da propriedade isolada.
     * 
     */
    public void setIsolada(boolean value) {
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getRecuo() {
        return recuo;
    }

    /**
     * Define o valor da propriedade recuo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecuo(Long value) {
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
    public Long getVista() {
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
    public void setVista(Long value) {
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

}
