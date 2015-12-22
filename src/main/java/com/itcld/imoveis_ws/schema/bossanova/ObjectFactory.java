//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.22 às 02:16:01 PM BRST 
//


package com.itcld.imoveis_ws.schema.bossanova;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3._2001.xmlschema.Adapter2;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.itcld.imoveis_ws.schema.bossanova package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ImovelCloset_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Closet");
    private final static QName _ImovelWcEmpregados_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "WcEmpregados");
    private final static QName _ImovelNumeroTorres_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "NumeroTorres");
    private final static QName _ImovelRedeAltaTensao_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "RedeAltaTensao");
    private final static QName _ImovelHorta_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Horta");
    private final static QName _ImovelBar_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Bar");
    private final static QName _ImovelHomeTheater_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "HomeTheater");
    private final static QName _ImovelCasaBoneca_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "CasaBoneca");
    private final static QName _ImovelSistemaIncendio_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "SistemaIncendio");
    private final static QName _ImovelDataAtualizacao_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "DataAtualizacao");
    private final static QName _ImovelAreaUtilMinimo_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "AreaUtilMinimo");
    private final static QName _ImovelFotos_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Fotos");
    private final static QName _ImovelFogaoEletrico_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "FogaoEletrico");
    private final static QName _ImovelPiscinaAquecida_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PiscinaAquecida");
    private final static QName _ImovelPrecoMedioM2Venda_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PrecoMedioM2Venda");
    private final static QName _ImovelGeminada_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Geminada");
    private final static QName _ImovelEstado_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Estado");
    private final static QName _ImovelPrecoVenda_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PrecoVenda");
    private final static QName _ImovelMiniArvorismo_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "MiniArvorismo");
    private final static QName _ImovelBicicletario_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Bicicletario");
    private final static QName _ImovelQtdDormitoriosMinimo_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QtdDormitoriosMinimo");
    private final static QName _ImovelNomeCondominio_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "NomeCondominio");
    private final static QName _ImovelPistaSkate_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PistaSkate");
    private final static QName _ImovelSilos_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Silos");
    private final static QName _ImovelQtdVagasMinimo_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QtdVagasMinimo");
    private final static QName _ImovelVaranda_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Varanda");
    private final static QName _ImovelFreezer_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Freezer");
    private final static QName _ImovelFrenteMar_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "FrenteMar");
    private final static QName _ImovelQuantidadeElevadores_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QuantidadeElevadores");
    private final static QName _ImovelDeposito_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Deposito");
    private final static QName _ImovelLuzEletrica_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "LuzEletrica");
    private final static QName _ImovelVarandaIntegradaCozinha_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "VarandaIntegradaCozinha");
    private final static QName _ImovelEstradaAsfaltada_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "EstradaAsfaltada");
    private final static QName _ImovelSalaoJogos_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "SalaoJogos");
    private final static QName _ImovelVarandaFechadaVidro_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "VarandaFechadaVidro");
    private final static QName _ImovelCeleiro_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Celeiro");
    private final static QName _ImovelArmarioDeCozinha_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "ArmarioDeCozinha");
    private final static QName _ImovelBanheiraComChuveiro_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "BanheiraComChuveiro");
    private final static QName _ImovelSalaJantar_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "SalaJantar");
    private final static QName _ImovelTipoOferta_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "TipoOferta");
    private final static QName _ImovelChildrenCare_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "ChildrenCare");
    private final static QName _ImovelRecuo_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Recuo");
    private final static QName _ImovelTelhado_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Telhado");
    private final static QName _ImovelVestiario_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Vestiario");
    private final static QName _ImovelQtdSuites_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QtdSuites");
    private final static QName _ImovelDucha_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Ducha");
    private final static QName _ImovelAreaTotalMinimo_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "AreaTotalMinimo");
    private final static QName _ImovelPisoFrio_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PisoFrio");
    private final static QName _ImovelNumero_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Numero");
    private final static QName _ImovelGasEncanado_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "GasEncanado");
    private final static QName _ImovelCentralLimpezaGovernanca_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "CentralLimpezaGovernanca");
    private final static QName _ImovelArCondicionadoSplit_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "ArCondicionadoSplit");
    private final static QName _ImovelBrinquedoteca_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Brinquedoteca");
    private final static QName _ImovelTopografia_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Topografia");
    private final static QName _ImovelCodigoImovel_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "CodigoImovel");
    private final static QName _ImovelEmQualAndar_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "EmQualAndar");
    private final static QName _ImovelLongitude_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "longitude");
    private final static QName _ImovelCasaFundo_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "CasaFundo");
    private final static QName _ImovelEscritorioVirtual_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "EscritorioVirtual");
    private final static QName _ImovelCoffeeShop_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "CoffeeShop");
    private final static QName _ImovelQuadraSquash_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QuadraSquash");
    private final static QName _ImovelArCondicionadoCentral_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "ArCondicionadoCentral");
    private final static QName _ImovelQtdVagasCobertas_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QtdVagasCobertas");
    private final static QName _ImovelPortaria24H_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Portaria24h");
    private final static QName _ImovelSalaAlmoco_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "SalaAlmoco");
    private final static QName _ImovelGuarita_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Guarita");
    private final static QName _ImovelQtdSalas_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QtdSalas");
    private final static QName _ImovelArmarioEmbutido_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "ArmarioEmbutido");
    private final static QName _ImovelSalaIntima_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "SalaIntima");
    private final static QName _ImovelFitness_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Fitness");
    private final static QName _ImovelJardim_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Jardim");
    private final static QName _ImovelSalaCinema_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "SalaCinema");
    private final static QName _ImovelQuadraTenis_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QuadraTenis");
    private final static QName _ImovelReservatorioAgua_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "ReservatorioAgua");
    private final static QName _ImovelFogao_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Fogao");
    private final static QName _ImovelCasaCaseiro_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "CasaCaseiro");
    private final static QName _ImovelEnergiaEletrica_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "EnergiaEletrica");
    private final static QName _ImovelBanheira_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Banheira");
    private final static QName _ImovelDespensa_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Despensa");
    private final static QName _ImovelMicroondas_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Microondas");
    private final static QName _ImovelMezanino_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Mezanino");
    private final static QName _ImovelPostoBancario_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PostoBancario");
    private final static QName _ImovelPiscinaClimatizada_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PiscinaClimatizada");
    private final static QName _ImovelCampoFutebol_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "CampoFutebol");
    private final static QName _ImovelCasaSede_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "CasaSede");
    private final static QName _ImovelEdicula_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Edicula");
    private final static QName _ImovelGarageBand_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "GarageBand");
    private final static QName _ImovelCaseiro_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Caseiro");
    private final static QName _ImovelCopa_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Copa");
    private final static QName _ImovelTipoImovel_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "TipoImovel");
    private final static QName _ImovelTerrasAraveis_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "TerrasAraveis");
    private final static QName _ImovelAreaUtilMaximo_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "AreaUtilMaximo");
    private final static QName _ImovelArCondicionado_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "ArCondicionado");
    private final static QName _ImovelSalaoFestas_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "SalaoFestas");
    private final static QName _ImovelMarina_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Marina");
    private final static QName _ImovelBiblioteca_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Biblioteca");
    private final static QName _ImovelPrecoLocacao_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PrecoLocacao");
    private final static QName _ImovelBoaPastagem_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "BoaPastagem");
    private final static QName _ImovelCozinhaAmericana_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "CozinhaAmericana");
    private final static QName _ImovelCentralTelefonica_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "CentralTelefonica");
    private final static QName _ImovelQtdBanheiros_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QtdBanheiros");
    private final static QName _ImovelCentroEstetica_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "CentroEstetica");
    private final static QName _ImovelAreaDeServico_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "AreaDeServico");
    private final static QName _ImovelPistaCooper_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PistaCooper");
    private final static QName _ImovelPrecoMedioM2Locacao_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PrecoMedioM2Locacao");
    private final static QName _ImovelConservacao_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Conservacao");
    private final static QName _ImovelSubTipoImovel_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "SubTipoImovel");
    private final static QName _ImovelCurral_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Curral");
    private final static QName _ImovelLavoura_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Lavoura");
    private final static QName _ImovelSauna_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Sauna");
    private final static QName _ImovelPisoElevado_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PisoElevado");
    private final static QName _ImovelNomeProprietario_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "NomeProprietario");
    private final static QName _ImovelPeDireitoAlto_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PeDireitoAlto");
    private final static QName _ImovelSalaTV_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "SalaTV");
    private final static QName _ImovelCidade_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Cidade");
    private final static QName _ImovelEscritorio_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Escritorio");
    private final static QName _ImovelOfficeSpace_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "OfficeSpace");
    private final static QName _ImovelTituloImovel_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "TituloImovel");
    private final static QName _ImovelInternetCompartilhada_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "InternetCompartilhada");
    private final static QName _ImovelPrecoIptu_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PrecoIptu");
    private final static QName _ImovelLago_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Lago");
    private final static QName _ImovelAquecimentoCentral_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "AquecimentoCentral");
    private final static QName _ImovelSalaReunioes_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "SalaReunioes");
    private final static QName _ImovelQtdDormitoriosMaximo_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QtdDormitoriosMaximo");
    private final static QName _ImovelPasto_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Pasto");
    private final static QName _ImovelEndereco_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Endereco");
    private final static QName _ImovelPlayground_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Playground");
    private final static QName _ImovelPoco_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Poco");
    private final static QName _ImovelQuintal_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Quintal");
    private final static QName _ImovelRestaurante_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Restaurante");
    private final static QName _ImovelQuadraEsportes_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QuadraEsportes");
    private final static QName _ImovelPersonalTraining_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PersonalTraining");
    private final static QName _ImovelAcessoDeficiente_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "AcessoDeficiente");
    private final static QName _ImovelUnidadeMetrica_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "UnidadeMetrica");
    private final static QName _ImovelRio_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Rio");
    private final static QName _ImovelBairroComercial_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "BairroComercial");
    private final static QName _ImovelComplementoEndereco_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "ComplementoEndereco");
    private final static QName _ImovelPaiol_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Paiol");
    private final static QName _ImovelEspacoZen_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "EspacoZen");
    private final static QName _ImovelAreaUtil_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "AreaUtil");
    private final static QName _ImovelConstrucao_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Construcao");
    private final static QName _ImovelAnoConstrucao_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "AnoConstrucao");
    private final static QName _ImovelEspacoGourmet_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "EspacoGourmet");
    private final static QName _ImovelChamada_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Chamada");
    private final static QName _ImovelRedario_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Redario");
    private final static QName _ImovelCarpeteMadeira_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "CarpeteMadeira");
    private final static QName _ImovelLanHouse_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "LanHouse");
    private final static QName _ImovelEdificioInteligente_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "EdificioInteligente");
    private final static QName _ImovelObservacao_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Observacao");
    private final static QName _ImovelQuadraPoliesportiva_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QuadraPoliesportiva");
    private final static QName _ImovelQuartoEmpregada_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QuartoEmpregada");
    private final static QName _ImovelPiscinaCoberta_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PiscinaCoberta");
    private final static QName _ImovelPais_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Pais");
    private final static QName _ImovelGerador_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Gerador");
    private final static QName _ImovelDependenciaEmpregados_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "DependenciaEmpregados");
    private final static QName _ImovelCozinhaGourmet_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "CozinhaGourmet");
    private final static QName _ImovelPosicaoDestaque_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PosicaoDestaque");
    private final static QName _ImovelRedeTelefonica_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "RedeTelefonica");
    private final static QName _ImovelDepositoSubsolo_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "DepositoSubsolo");
    private final static QName _ImovelIsolada_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Isolada");
    private final static QName _ImovelMassagista_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Massagista");
    private final static QName _ImovelEstruturaRede_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "EstruturaRede");
    private final static QName _ImovelCampoGolfe_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "CampoGolfe");
    private final static QName _ImovelInternetWireless_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "InternetWireless");
    private final static QName _ImovelPiscina_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Piscina");
    private final static QName _ImovelLavaLouca_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "LavaLouca");
    private final static QName _ImovelQtdAndar_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QtdAndar");
    private final static QName _ImovelPianoBar_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PianoBar");
    private final static QName _ImovelPortariaControlada_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PortariaControlada");
    private final static QName _ImovelVista_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Vista");
    private final static QName _ImovelVagaDeVisitante_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "VagaDeVisitante");
    private final static QName _ImovelQtdUnidadesAndar_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QtdUnidadesAndar");
    private final static QName _ImovelLareira_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Lareira");
    private final static QName _ImovelFornoPizza_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "FornoPizza");
    private final static QName _ImovelMobiliado_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Mobiliado");
    private final static QName _ImovelCozinhaIndependente_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "CozinhaIndependente");
    private final static QName _ImovelTelefoneDDR_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "TelefoneDDR");
    private final static QName _ImovelPesqueiro_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Pesqueiro");
    private final static QName _ImovelCondominio_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Condominio");
    private final static QName _ImovelCarpete_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Carpete");
    private final static QName _ImovelAreaTotalMaximo_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "AreaTotalMaximo");
    private final static QName _ImovelAguaEncanada_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "AguaEncanada");
    private final static QName _ImovelNumeroAndar_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "NumeroAndar");
    private final static QName _ImovelQtdDormitorios_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QtdDormitorios");
    private final static QName _ImovelHidromassagem_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Hidromassagem");
    private final static QName _ImovelPrecoVendaMaximo_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PrecoVendaMaximo");
    private final static QName _ImovelArCondicionadoEmbutido_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "ArCondicionadoEmbutido");
    private final static QName _ImovelQtdVagas_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QtdVagas");
    private final static QName _ImovelLavabo_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Lavabo");
    private final static QName _ImovelVarandaGourmet_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "VarandaGourmet");
    private final static QName _ImovelAutomacaoPredial_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "AutomacaoPredial");
    private final static QName _ImovelAdministradora_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Administradora");
    private final static QName _ImovelPatio_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Patio");
    private final static QName _ImovelAreaTotal_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "AreaTotal");
    private final static QName _ImovelPrecoVendaMinimo_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PrecoVendaMinimo");
    private final static QName _ImovelPisoMadeira_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PisoMadeira");
    private final static QName _ImovelAcesso_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Acesso");
    private final static QName _ImovelLatitude_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "latitude");
    private final static QName _ImovelQtdVagasMaximo_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QtdVagasMaximo");
    private final static QName _ImovelPomar_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Pomar");
    private final static QName _ImovelDataCadastro_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "DataCadastro");
    private final static QName _ImovelSalaoConvencoes_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "SalaoConvencoes");
    private final static QName _ImovelQtdElevador_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "QtdElevador");
    private final static QName _ImovelVigilancia24H_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Vigilancia24h");
    private final static QName _ImovelPublicarValorSite_0020_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PublicarValorSite ");
    private final static QName _ImovelFase_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Fase");
    private final static QName _ImovelRuasAsfaltadas_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "RuasAsfaltadas");
    private final static QName _ImovelSistemaAlarme_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "SistemaAlarme");
    private final static QName _ImovelAreaVerde_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "AreaVerde");
    private final static QName _ImovelChurrasqueira_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Churrasqueira");
    private final static QName _ImovelStatus_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Status");
    private final static QName _ImovelVarandaChurrasqueira_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "VarandaChurrasqueira");
    private final static QName _ImovelPiscinaInfantil_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PiscinaInfantil");
    private final static QName _ImovelEntradaCaminhoes_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "EntradaCaminhoes");
    private final static QName _ImovelPisoLaminado_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PisoLaminado");
    private final static QName _ImovelPermiteAnimais_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PermiteAnimais");
    private final static QName _ImovelTVaCabo_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "TVaCabo");
    private final static QName _ImovelCEP_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "CEP");
    private final static QName _ImovelSolarium_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Solarium");
    private final static QName _ImovelBairro_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Bairro");
    private final static QName _ImovelHeliponto_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Heliponto");
    private final static QName _ImovelEmailProprietario_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "EmailProprietario");
    private final static QName _ImovelAndarInteiro_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "AndarInteiro");
    private final static QName _ImovelCachoeira_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Cachoeira");
    private final static QName _ImovelAquecedor_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Aquecedor");
    private final static QName _ImovelTourVirtual_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "TourVirtual");
    private final static QName _ImovelSalaGinastica_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "SalaGinastica");
    private final static QName _ImovelMeioAndar_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "MeioAndar");
    private final static QName _ImovelPetPlay_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PetPlay");
    private final static QName _ImovelAndaresPredio_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "AndaresPredio");
    private final static QName _ImovelPocoArtesiano_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PocoArtesiano");
    private final static QName _ImovelSistemaEsgoto_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "SistemaEsgoto");
    private final static QName _ImovelPrecoCondominio_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PrecoCondominio");
    private final static QName _ImovelPosicaoSuperDestaque_0020_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "PosicaoSuperDestaque ");
    private final static QName _ImovelGeladeira_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Geladeira");
    private final static QName _ImovelServicosEscritorio_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "ServicosEscritorio");
    private final static QName _ImovelLavanderia_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Lavanderia");
    private final static QName _ImovelVestiarioEmpregado_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "VestiarioEmpregado");
    private final static QName _ImovelAcademiaFitness_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "AcademiaFitness");
    private final static QName _ImovelGalpao_QNAME = new QName("http://itcld.com/imoveis-ws/schema/bossanova", "Galpao");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.itcld.imoveis_ws.schema.bossanova
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Carga }
     * 
     */
    public Carga createCarga() {
        return new Carga();
    }

    /**
     * Create an instance of {@link ImovelBossaNovaResponse }
     * 
     */
    public ImovelBossaNovaResponse createImovelBossaNovaResponse() {
        return new ImovelBossaNovaResponse();
    }

    /**
     * Create an instance of {@link ImovelBossaNovaRequest }
     * 
     */
    public ImovelBossaNovaRequest createImovelBossaNovaRequest() {
        return new ImovelBossaNovaRequest();
    }

    /**
     * Create an instance of {@link Fotos }
     * 
     */
    public Fotos createFotos() {
        return new Fotos();
    }

    /**
     * Create an instance of {@link Imovel }
     * 
     */
    public Imovel createImovel() {
        return new Imovel();
    }

    /**
     * Create an instance of {@link Foto }
     * 
     */
    public Foto createFoto() {
        return new Foto();
    }

    /**
     * Create an instance of {@link Condominio }
     * 
     */
    public Condominio createCondominio() {
        return new Condominio();
    }

    /**
     * Create an instance of {@link Carga.Imoveis }
     * 
     */
    public Carga.Imoveis createCargaImoveis() {
        return new Carga.Imoveis();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Closet", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCloset(Long value) {
        return new JAXBElement<Long>(_ImovelCloset_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "WcEmpregados", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelWcEmpregados(Long value) {
        return new JAXBElement<Long>(_ImovelWcEmpregados_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "NumeroTorres", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelNumeroTorres(Long value) {
        return new JAXBElement<Long>(_ImovelNumeroTorres_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "RedeAltaTensao", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelRedeAltaTensao(Long value) {
        return new JAXBElement<Long>(_ImovelRedeAltaTensao_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Horta", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelHorta(Long value) {
        return new JAXBElement<Long>(_ImovelHorta_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Bar", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelBar(Long value) {
        return new JAXBElement<Long>(_ImovelBar_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "HomeTheater", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelHomeTheater(Long value) {
        return new JAXBElement<Long>(_ImovelHomeTheater_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "CasaBoneca", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCasaBoneca(Long value) {
        return new JAXBElement<Long>(_ImovelCasaBoneca_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "SistemaIncendio", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelSistemaIncendio(Long value) {
        return new JAXBElement<Long>(_ImovelSistemaIncendio_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "DataAtualizacao", scope = Imovel.class)
    public JAXBElement<String> createImovelDataAtualizacao(String value) {
        return new JAXBElement<String>(_ImovelDataAtualizacao_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "AreaUtilMinimo", scope = Imovel.class)
    public JAXBElement<String> createImovelAreaUtilMinimo(String value) {
        return new JAXBElement<String>(_ImovelAreaUtilMinimo_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fotos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Fotos", scope = Imovel.class)
    public JAXBElement<Fotos> createImovelFotos(Fotos value) {
        return new JAXBElement<Fotos>(_ImovelFotos_QNAME, Fotos.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "FogaoEletrico", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelFogaoEletrico(Long value) {
        return new JAXBElement<Long>(_ImovelFogaoEletrico_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PiscinaAquecida", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPiscinaAquecida(Long value) {
        return new JAXBElement<Long>(_ImovelPiscinaAquecida_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PrecoMedioM2Venda", scope = Imovel.class)
    public JAXBElement<String> createImovelPrecoMedioM2Venda(String value) {
        return new JAXBElement<String>(_ImovelPrecoMedioM2Venda_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Geminada", scope = Imovel.class)
    public JAXBElement<Boolean> createImovelGeminada(Boolean value) {
        return new JAXBElement<Boolean>(_ImovelGeminada_QNAME, Boolean.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Estado", scope = Imovel.class)
    public JAXBElement<String> createImovelEstado(String value) {
        return new JAXBElement<String>(_ImovelEstado_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PrecoVenda", scope = Imovel.class)
    public JAXBElement<String> createImovelPrecoVenda(String value) {
        return new JAXBElement<String>(_ImovelPrecoVenda_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "MiniArvorismo", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelMiniArvorismo(Long value) {
        return new JAXBElement<Long>(_ImovelMiniArvorismo_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Bicicletario", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelBicicletario(Long value) {
        return new JAXBElement<Long>(_ImovelBicicletario_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QtdDormitoriosMinimo", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQtdDormitoriosMinimo(Long value) {
        return new JAXBElement<Long>(_ImovelQtdDormitoriosMinimo_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "NomeCondominio", scope = Imovel.class)
    public JAXBElement<String> createImovelNomeCondominio(String value) {
        return new JAXBElement<String>(_ImovelNomeCondominio_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PistaSkate", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPistaSkate(Long value) {
        return new JAXBElement<Long>(_ImovelPistaSkate_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Silos", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelSilos(Long value) {
        return new JAXBElement<Long>(_ImovelSilos_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QtdVagasMinimo", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQtdVagasMinimo(Long value) {
        return new JAXBElement<Long>(_ImovelQtdVagasMinimo_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Varanda", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelVaranda(Long value) {
        return new JAXBElement<Long>(_ImovelVaranda_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Freezer", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelFreezer(Long value) {
        return new JAXBElement<Long>(_ImovelFreezer_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "FrenteMar", scope = Imovel.class)
    public JAXBElement<Boolean> createImovelFrenteMar(Boolean value) {
        return new JAXBElement<Boolean>(_ImovelFrenteMar_QNAME, Boolean.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QuantidadeElevadores", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQuantidadeElevadores(Long value) {
        return new JAXBElement<Long>(_ImovelQuantidadeElevadores_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Deposito", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelDeposito(Long value) {
        return new JAXBElement<Long>(_ImovelDeposito_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "LuzEletrica", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelLuzEletrica(Long value) {
        return new JAXBElement<Long>(_ImovelLuzEletrica_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "VarandaIntegradaCozinha", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelVarandaIntegradaCozinha(Long value) {
        return new JAXBElement<Long>(_ImovelVarandaIntegradaCozinha_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "EstradaAsfaltada", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelEstradaAsfaltada(Long value) {
        return new JAXBElement<Long>(_ImovelEstradaAsfaltada_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "SalaoJogos", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelSalaoJogos(Long value) {
        return new JAXBElement<Long>(_ImovelSalaoJogos_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "VarandaFechadaVidro", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelVarandaFechadaVidro(Long value) {
        return new JAXBElement<Long>(_ImovelVarandaFechadaVidro_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Celeiro", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCeleiro(Long value) {
        return new JAXBElement<Long>(_ImovelCeleiro_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "ArmarioDeCozinha", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelArmarioDeCozinha(Long value) {
        return new JAXBElement<Long>(_ImovelArmarioDeCozinha_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "BanheiraComChuveiro", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelBanheiraComChuveiro(Long value) {
        return new JAXBElement<Long>(_ImovelBanheiraComChuveiro_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "SalaJantar", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelSalaJantar(Long value) {
        return new JAXBElement<Long>(_ImovelSalaJantar_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "TipoOferta", scope = Imovel.class)
    public JAXBElement<String> createImovelTipoOferta(String value) {
        return new JAXBElement<String>(_ImovelTipoOferta_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "ChildrenCare", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelChildrenCare(Long value) {
        return new JAXBElement<Long>(_ImovelChildrenCare_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Recuo", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelRecuo(Long value) {
        return new JAXBElement<Long>(_ImovelRecuo_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Telhado", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelTelhado(Long value) {
        return new JAXBElement<Long>(_ImovelTelhado_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Vestiario", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelVestiario(Long value) {
        return new JAXBElement<Long>(_ImovelVestiario_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QtdSuites", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQtdSuites(Long value) {
        return new JAXBElement<Long>(_ImovelQtdSuites_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Ducha", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelDucha(Long value) {
        return new JAXBElement<Long>(_ImovelDucha_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "AreaTotalMinimo", scope = Imovel.class)
    public JAXBElement<String> createImovelAreaTotalMinimo(String value) {
        return new JAXBElement<String>(_ImovelAreaTotalMinimo_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PisoFrio", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPisoFrio(Long value) {
        return new JAXBElement<Long>(_ImovelPisoFrio_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Numero", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelNumero(Long value) {
        return new JAXBElement<Long>(_ImovelNumero_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "GasEncanado", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelGasEncanado(Long value) {
        return new JAXBElement<Long>(_ImovelGasEncanado_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "CentralLimpezaGovernanca", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCentralLimpezaGovernanca(Long value) {
        return new JAXBElement<Long>(_ImovelCentralLimpezaGovernanca_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "ArCondicionadoSplit", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelArCondicionadoSplit(Long value) {
        return new JAXBElement<Long>(_ImovelArCondicionadoSplit_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Brinquedoteca", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelBrinquedoteca(Long value) {
        return new JAXBElement<Long>(_ImovelBrinquedoteca_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Topografia", scope = Imovel.class)
    public JAXBElement<String> createImovelTopografia(String value) {
        return new JAXBElement<String>(_ImovelTopografia_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "CodigoImovel", scope = Imovel.class)
    public JAXBElement<String> createImovelCodigoImovel(String value) {
        return new JAXBElement<String>(_ImovelCodigoImovel_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "EmQualAndar", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelEmQualAndar(Long value) {
        return new JAXBElement<Long>(_ImovelEmQualAndar_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "longitude", scope = Imovel.class)
    public JAXBElement<String> createImovelLongitude(String value) {
        return new JAXBElement<String>(_ImovelLongitude_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "CasaFundo", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCasaFundo(Long value) {
        return new JAXBElement<Long>(_ImovelCasaFundo_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "EscritorioVirtual", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelEscritorioVirtual(Long value) {
        return new JAXBElement<Long>(_ImovelEscritorioVirtual_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "CoffeeShop", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCoffeeShop(Long value) {
        return new JAXBElement<Long>(_ImovelCoffeeShop_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QuadraSquash", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQuadraSquash(Long value) {
        return new JAXBElement<Long>(_ImovelQuadraSquash_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "ArCondicionadoCentral", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelArCondicionadoCentral(Long value) {
        return new JAXBElement<Long>(_ImovelArCondicionadoCentral_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QtdVagasCobertas", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQtdVagasCobertas(Long value) {
        return new JAXBElement<Long>(_ImovelQtdVagasCobertas_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Portaria24h", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPortaria24H(Long value) {
        return new JAXBElement<Long>(_ImovelPortaria24H_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "SalaAlmoco", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelSalaAlmoco(Long value) {
        return new JAXBElement<Long>(_ImovelSalaAlmoco_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Guarita", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelGuarita(Long value) {
        return new JAXBElement<Long>(_ImovelGuarita_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QtdSalas", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQtdSalas(Long value) {
        return new JAXBElement<Long>(_ImovelQtdSalas_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "ArmarioEmbutido", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelArmarioEmbutido(Long value) {
        return new JAXBElement<Long>(_ImovelArmarioEmbutido_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "SalaIntima", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelSalaIntima(Long value) {
        return new JAXBElement<Long>(_ImovelSalaIntima_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Fitness", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelFitness(Long value) {
        return new JAXBElement<Long>(_ImovelFitness_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Jardim", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelJardim(Long value) {
        return new JAXBElement<Long>(_ImovelJardim_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "SalaCinema", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelSalaCinema(Long value) {
        return new JAXBElement<Long>(_ImovelSalaCinema_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QuadraTenis", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQuadraTenis(Long value) {
        return new JAXBElement<Long>(_ImovelQuadraTenis_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "ReservatorioAgua", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelReservatorioAgua(Long value) {
        return new JAXBElement<Long>(_ImovelReservatorioAgua_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Fogao", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelFogao(Long value) {
        return new JAXBElement<Long>(_ImovelFogao_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "CasaCaseiro", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCasaCaseiro(Long value) {
        return new JAXBElement<Long>(_ImovelCasaCaseiro_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "EnergiaEletrica", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelEnergiaEletrica(Long value) {
        return new JAXBElement<Long>(_ImovelEnergiaEletrica_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Banheira", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelBanheira(Long value) {
        return new JAXBElement<Long>(_ImovelBanheira_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Despensa", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelDespensa(Long value) {
        return new JAXBElement<Long>(_ImovelDespensa_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Microondas", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelMicroondas(Long value) {
        return new JAXBElement<Long>(_ImovelMicroondas_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Mezanino", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelMezanino(Long value) {
        return new JAXBElement<Long>(_ImovelMezanino_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PostoBancario", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPostoBancario(Long value) {
        return new JAXBElement<Long>(_ImovelPostoBancario_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PiscinaClimatizada", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPiscinaClimatizada(Long value) {
        return new JAXBElement<Long>(_ImovelPiscinaClimatizada_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "CampoFutebol", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCampoFutebol(Long value) {
        return new JAXBElement<Long>(_ImovelCampoFutebol_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "CasaSede", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCasaSede(Long value) {
        return new JAXBElement<Long>(_ImovelCasaSede_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Edicula", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelEdicula(Long value) {
        return new JAXBElement<Long>(_ImovelEdicula_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "GarageBand", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelGarageBand(Long value) {
        return new JAXBElement<Long>(_ImovelGarageBand_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Caseiro", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCaseiro(Long value) {
        return new JAXBElement<Long>(_ImovelCaseiro_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Copa", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCopa(Long value) {
        return new JAXBElement<Long>(_ImovelCopa_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "TipoImovel", scope = Imovel.class)
    public JAXBElement<String> createImovelTipoImovel(String value) {
        return new JAXBElement<String>(_ImovelTipoImovel_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "TerrasAraveis", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelTerrasAraveis(Long value) {
        return new JAXBElement<Long>(_ImovelTerrasAraveis_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "AreaUtilMaximo", scope = Imovel.class)
    public JAXBElement<String> createImovelAreaUtilMaximo(String value) {
        return new JAXBElement<String>(_ImovelAreaUtilMaximo_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "ArCondicionado", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelArCondicionado(Long value) {
        return new JAXBElement<Long>(_ImovelArCondicionado_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "SalaoFestas", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelSalaoFestas(Long value) {
        return new JAXBElement<Long>(_ImovelSalaoFestas_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Marina", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelMarina(Long value) {
        return new JAXBElement<Long>(_ImovelMarina_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Biblioteca", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelBiblioteca(Long value) {
        return new JAXBElement<Long>(_ImovelBiblioteca_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PrecoLocacao", scope = Imovel.class)
    public JAXBElement<String> createImovelPrecoLocacao(String value) {
        return new JAXBElement<String>(_ImovelPrecoLocacao_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "BoaPastagem", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelBoaPastagem(Long value) {
        return new JAXBElement<Long>(_ImovelBoaPastagem_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "CozinhaAmericana", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCozinhaAmericana(Long value) {
        return new JAXBElement<Long>(_ImovelCozinhaAmericana_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "CentralTelefonica", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCentralTelefonica(Long value) {
        return new JAXBElement<Long>(_ImovelCentralTelefonica_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QtdBanheiros", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQtdBanheiros(Long value) {
        return new JAXBElement<Long>(_ImovelQtdBanheiros_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "CentroEstetica", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCentroEstetica(Long value) {
        return new JAXBElement<Long>(_ImovelCentroEstetica_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "AreaDeServico", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelAreaDeServico(Long value) {
        return new JAXBElement<Long>(_ImovelAreaDeServico_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PistaCooper", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPistaCooper(Long value) {
        return new JAXBElement<Long>(_ImovelPistaCooper_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PrecoMedioM2Locacao", scope = Imovel.class)
    public JAXBElement<String> createImovelPrecoMedioM2Locacao(String value) {
        return new JAXBElement<String>(_ImovelPrecoMedioM2Locacao_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Conservacao", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelConservacao(Long value) {
        return new JAXBElement<Long>(_ImovelConservacao_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "SubTipoImovel", scope = Imovel.class)
    public JAXBElement<String> createImovelSubTipoImovel(String value) {
        return new JAXBElement<String>(_ImovelSubTipoImovel_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Curral", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCurral(Long value) {
        return new JAXBElement<Long>(_ImovelCurral_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Lavoura", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelLavoura(Long value) {
        return new JAXBElement<Long>(_ImovelLavoura_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Sauna", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelSauna(Long value) {
        return new JAXBElement<Long>(_ImovelSauna_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PisoElevado", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPisoElevado(Long value) {
        return new JAXBElement<Long>(_ImovelPisoElevado_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "NomeProprietario", scope = Imovel.class)
    public JAXBElement<String> createImovelNomeProprietario(String value) {
        return new JAXBElement<String>(_ImovelNomeProprietario_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PeDireitoAlto", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPeDireitoAlto(Long value) {
        return new JAXBElement<Long>(_ImovelPeDireitoAlto_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "SalaTV", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelSalaTV(Long value) {
        return new JAXBElement<Long>(_ImovelSalaTV_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Cidade", scope = Imovel.class)
    public JAXBElement<String> createImovelCidade(String value) {
        return new JAXBElement<String>(_ImovelCidade_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Escritorio", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelEscritorio(Long value) {
        return new JAXBElement<Long>(_ImovelEscritorio_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "OfficeSpace", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelOfficeSpace(Long value) {
        return new JAXBElement<Long>(_ImovelOfficeSpace_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "TituloImovel", scope = Imovel.class)
    public JAXBElement<String> createImovelTituloImovel(String value) {
        return new JAXBElement<String>(_ImovelTituloImovel_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "InternetCompartilhada", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelInternetCompartilhada(Long value) {
        return new JAXBElement<Long>(_ImovelInternetCompartilhada_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PrecoIptu", scope = Imovel.class)
    public JAXBElement<String> createImovelPrecoIptu(String value) {
        return new JAXBElement<String>(_ImovelPrecoIptu_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Lago", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelLago(Long value) {
        return new JAXBElement<Long>(_ImovelLago_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "AquecimentoCentral", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelAquecimentoCentral(Long value) {
        return new JAXBElement<Long>(_ImovelAquecimentoCentral_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "SalaReunioes", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelSalaReunioes(Long value) {
        return new JAXBElement<Long>(_ImovelSalaReunioes_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QtdDormitoriosMaximo", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQtdDormitoriosMaximo(Long value) {
        return new JAXBElement<Long>(_ImovelQtdDormitoriosMaximo_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Pasto", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPasto(Long value) {
        return new JAXBElement<Long>(_ImovelPasto_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Endereco", scope = Imovel.class)
    public JAXBElement<String> createImovelEndereco(String value) {
        return new JAXBElement<String>(_ImovelEndereco_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Playground", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPlayground(Long value) {
        return new JAXBElement<Long>(_ImovelPlayground_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Poco", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPoco(Long value) {
        return new JAXBElement<Long>(_ImovelPoco_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Quintal", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQuintal(Long value) {
        return new JAXBElement<Long>(_ImovelQuintal_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Restaurante", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelRestaurante(Long value) {
        return new JAXBElement<Long>(_ImovelRestaurante_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QuadraEsportes", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQuadraEsportes(Long value) {
        return new JAXBElement<Long>(_ImovelQuadraEsportes_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PersonalTraining", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPersonalTraining(Long value) {
        return new JAXBElement<Long>(_ImovelPersonalTraining_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "AcessoDeficiente", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelAcessoDeficiente(Long value) {
        return new JAXBElement<Long>(_ImovelAcessoDeficiente_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "UnidadeMetrica", scope = Imovel.class)
    public JAXBElement<String> createImovelUnidadeMetrica(String value) {
        return new JAXBElement<String>(_ImovelUnidadeMetrica_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Rio", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelRio(Long value) {
        return new JAXBElement<Long>(_ImovelRio_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "BairroComercial", scope = Imovel.class)
    public JAXBElement<String> createImovelBairroComercial(String value) {
        return new JAXBElement<String>(_ImovelBairroComercial_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "ComplementoEndereco", scope = Imovel.class)
    public JAXBElement<String> createImovelComplementoEndereco(String value) {
        return new JAXBElement<String>(_ImovelComplementoEndereco_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Paiol", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPaiol(Long value) {
        return new JAXBElement<Long>(_ImovelPaiol_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "EspacoZen", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelEspacoZen(Long value) {
        return new JAXBElement<Long>(_ImovelEspacoZen_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "AreaUtil", scope = Imovel.class)
    public JAXBElement<String> createImovelAreaUtil(String value) {
        return new JAXBElement<String>(_ImovelAreaUtil_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Construcao", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelConstrucao(Long value) {
        return new JAXBElement<Long>(_ImovelConstrucao_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "AnoConstrucao", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelAnoConstrucao(Long value) {
        return new JAXBElement<Long>(_ImovelAnoConstrucao_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "EspacoGourmet", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelEspacoGourmet(Long value) {
        return new JAXBElement<Long>(_ImovelEspacoGourmet_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Chamada", scope = Imovel.class)
    public JAXBElement<String> createImovelChamada(String value) {
        return new JAXBElement<String>(_ImovelChamada_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Redario", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelRedario(Long value) {
        return new JAXBElement<Long>(_ImovelRedario_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "CarpeteMadeira", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCarpeteMadeira(Long value) {
        return new JAXBElement<Long>(_ImovelCarpeteMadeira_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "LanHouse", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelLanHouse(Long value) {
        return new JAXBElement<Long>(_ImovelLanHouse_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "EdificioInteligente", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelEdificioInteligente(Long value) {
        return new JAXBElement<Long>(_ImovelEdificioInteligente_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Observacao", scope = Imovel.class)
    public JAXBElement<String> createImovelObservacao(String value) {
        return new JAXBElement<String>(_ImovelObservacao_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QuadraPoliesportiva", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQuadraPoliesportiva(Long value) {
        return new JAXBElement<Long>(_ImovelQuadraPoliesportiva_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QuartoEmpregada", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQuartoEmpregada(Long value) {
        return new JAXBElement<Long>(_ImovelQuartoEmpregada_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PiscinaCoberta", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPiscinaCoberta(Long value) {
        return new JAXBElement<Long>(_ImovelPiscinaCoberta_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Pais", scope = Imovel.class)
    public JAXBElement<String> createImovelPais(String value) {
        return new JAXBElement<String>(_ImovelPais_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Gerador", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelGerador(Long value) {
        return new JAXBElement<Long>(_ImovelGerador_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "DependenciaEmpregados", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelDependenciaEmpregados(Long value) {
        return new JAXBElement<Long>(_ImovelDependenciaEmpregados_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "CozinhaGourmet", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCozinhaGourmet(Long value) {
        return new JAXBElement<Long>(_ImovelCozinhaGourmet_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PosicaoDestaque", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPosicaoDestaque(Long value) {
        return new JAXBElement<Long>(_ImovelPosicaoDestaque_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "RedeTelefonica", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelRedeTelefonica(Long value) {
        return new JAXBElement<Long>(_ImovelRedeTelefonica_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "DepositoSubsolo", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelDepositoSubsolo(Long value) {
        return new JAXBElement<Long>(_ImovelDepositoSubsolo_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Isolada", scope = Imovel.class)
    public JAXBElement<Boolean> createImovelIsolada(Boolean value) {
        return new JAXBElement<Boolean>(_ImovelIsolada_QNAME, Boolean.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Massagista", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelMassagista(Long value) {
        return new JAXBElement<Long>(_ImovelMassagista_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "EstruturaRede", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelEstruturaRede(Long value) {
        return new JAXBElement<Long>(_ImovelEstruturaRede_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "CampoGolfe", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCampoGolfe(Long value) {
        return new JAXBElement<Long>(_ImovelCampoGolfe_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "InternetWireless", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelInternetWireless(Long value) {
        return new JAXBElement<Long>(_ImovelInternetWireless_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Piscina", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPiscina(Long value) {
        return new JAXBElement<Long>(_ImovelPiscina_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "LavaLouca", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelLavaLouca(Long value) {
        return new JAXBElement<Long>(_ImovelLavaLouca_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QtdAndar", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQtdAndar(Long value) {
        return new JAXBElement<Long>(_ImovelQtdAndar_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PianoBar", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPianoBar(Long value) {
        return new JAXBElement<Long>(_ImovelPianoBar_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PortariaControlada", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPortariaControlada(Long value) {
        return new JAXBElement<Long>(_ImovelPortariaControlada_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Vista", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelVista(Long value) {
        return new JAXBElement<Long>(_ImovelVista_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "VagaDeVisitante", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelVagaDeVisitante(Long value) {
        return new JAXBElement<Long>(_ImovelVagaDeVisitante_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QtdUnidadesAndar", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQtdUnidadesAndar(Long value) {
        return new JAXBElement<Long>(_ImovelQtdUnidadesAndar_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Lareira", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelLareira(Long value) {
        return new JAXBElement<Long>(_ImovelLareira_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "FornoPizza", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelFornoPizza(Long value) {
        return new JAXBElement<Long>(_ImovelFornoPizza_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Mobiliado", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelMobiliado(Long value) {
        return new JAXBElement<Long>(_ImovelMobiliado_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "CozinhaIndependente", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCozinhaIndependente(Long value) {
        return new JAXBElement<Long>(_ImovelCozinhaIndependente_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "TelefoneDDR", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelTelefoneDDR(Long value) {
        return new JAXBElement<Long>(_ImovelTelefoneDDR_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Pesqueiro", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPesqueiro(Long value) {
        return new JAXBElement<Long>(_ImovelPesqueiro_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Condominio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Condominio", scope = Imovel.class)
    public JAXBElement<Condominio> createImovelCondominio(Condominio value) {
        return new JAXBElement<Condominio>(_ImovelCondominio_QNAME, Condominio.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Carpete", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCarpete(Long value) {
        return new JAXBElement<Long>(_ImovelCarpete_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "AreaTotalMaximo", scope = Imovel.class)
    public JAXBElement<String> createImovelAreaTotalMaximo(String value) {
        return new JAXBElement<String>(_ImovelAreaTotalMaximo_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "AguaEncanada", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelAguaEncanada(Long value) {
        return new JAXBElement<Long>(_ImovelAguaEncanada_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "NumeroAndar", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelNumeroAndar(Long value) {
        return new JAXBElement<Long>(_ImovelNumeroAndar_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QtdDormitorios", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQtdDormitorios(Long value) {
        return new JAXBElement<Long>(_ImovelQtdDormitorios_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Hidromassagem", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelHidromassagem(Long value) {
        return new JAXBElement<Long>(_ImovelHidromassagem_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PrecoVendaMaximo", scope = Imovel.class)
    public JAXBElement<String> createImovelPrecoVendaMaximo(String value) {
        return new JAXBElement<String>(_ImovelPrecoVendaMaximo_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "ArCondicionadoEmbutido", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelArCondicionadoEmbutido(Long value) {
        return new JAXBElement<Long>(_ImovelArCondicionadoEmbutido_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QtdVagas", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQtdVagas(Long value) {
        return new JAXBElement<Long>(_ImovelQtdVagas_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Lavabo", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelLavabo(Long value) {
        return new JAXBElement<Long>(_ImovelLavabo_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "VarandaGourmet", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelVarandaGourmet(Long value) {
        return new JAXBElement<Long>(_ImovelVarandaGourmet_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "AutomacaoPredial", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelAutomacaoPredial(Long value) {
        return new JAXBElement<Long>(_ImovelAutomacaoPredial_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Administradora", scope = Imovel.class)
    public JAXBElement<String> createImovelAdministradora(String value) {
        return new JAXBElement<String>(_ImovelAdministradora_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Patio", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPatio(Long value) {
        return new JAXBElement<Long>(_ImovelPatio_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "AreaTotal", scope = Imovel.class)
    public JAXBElement<String> createImovelAreaTotal(String value) {
        return new JAXBElement<String>(_ImovelAreaTotal_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PrecoVendaMinimo", scope = Imovel.class)
    public JAXBElement<String> createImovelPrecoVendaMinimo(String value) {
        return new JAXBElement<String>(_ImovelPrecoVendaMinimo_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PisoMadeira", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPisoMadeira(Long value) {
        return new JAXBElement<Long>(_ImovelPisoMadeira_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Acesso", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelAcesso(Long value) {
        return new JAXBElement<Long>(_ImovelAcesso_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "latitude", scope = Imovel.class)
    public JAXBElement<String> createImovelLatitude(String value) {
        return new JAXBElement<String>(_ImovelLatitude_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QtdVagasMaximo", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQtdVagasMaximo(Long value) {
        return new JAXBElement<Long>(_ImovelQtdVagasMaximo_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Pomar", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPomar(Long value) {
        return new JAXBElement<Long>(_ImovelPomar_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "DataCadastro", scope = Imovel.class)
    public JAXBElement<String> createImovelDataCadastro(String value) {
        return new JAXBElement<String>(_ImovelDataCadastro_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "SalaoConvencoes", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelSalaoConvencoes(Long value) {
        return new JAXBElement<Long>(_ImovelSalaoConvencoes_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "QtdElevador", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelQtdElevador(Long value) {
        return new JAXBElement<Long>(_ImovelQtdElevador_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Vigilancia24h", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelVigilancia24H(Long value) {
        return new JAXBElement<Long>(_ImovelVigilancia24H_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PublicarValorSite ", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPublicarValorSite_0020(Long value) {
        return new JAXBElement<Long>(_ImovelPublicarValorSite_0020_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Fase", scope = Imovel.class)
    public JAXBElement<String> createImovelFase(String value) {
        return new JAXBElement<String>(_ImovelFase_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "RuasAsfaltadas", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelRuasAsfaltadas(Long value) {
        return new JAXBElement<Long>(_ImovelRuasAsfaltadas_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "SistemaAlarme", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelSistemaAlarme(Long value) {
        return new JAXBElement<Long>(_ImovelSistemaAlarme_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "AreaVerde", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelAreaVerde(Long value) {
        return new JAXBElement<Long>(_ImovelAreaVerde_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Churrasqueira", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelChurrasqueira(Long value) {
        return new JAXBElement<Long>(_ImovelChurrasqueira_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Status", scope = Imovel.class)
    public JAXBElement<String> createImovelStatus(String value) {
        return new JAXBElement<String>(_ImovelStatus_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "VarandaChurrasqueira", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelVarandaChurrasqueira(Long value) {
        return new JAXBElement<Long>(_ImovelVarandaChurrasqueira_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PiscinaInfantil", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPiscinaInfantil(Long value) {
        return new JAXBElement<Long>(_ImovelPiscinaInfantil_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "EntradaCaminhoes", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelEntradaCaminhoes(Long value) {
        return new JAXBElement<Long>(_ImovelEntradaCaminhoes_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PisoLaminado", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPisoLaminado(Long value) {
        return new JAXBElement<Long>(_ImovelPisoLaminado_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PermiteAnimais", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPermiteAnimais(Long value) {
        return new JAXBElement<Long>(_ImovelPermiteAnimais_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "TVaCabo", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelTVaCabo(Long value) {
        return new JAXBElement<Long>(_ImovelTVaCabo_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "CEP", scope = Imovel.class)
    public JAXBElement<String> createImovelCEP(String value) {
        return new JAXBElement<String>(_ImovelCEP_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Solarium", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelSolarium(Long value) {
        return new JAXBElement<Long>(_ImovelSolarium_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Bairro", scope = Imovel.class)
    public JAXBElement<String> createImovelBairro(String value) {
        return new JAXBElement<String>(_ImovelBairro_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Heliponto", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelHeliponto(Long value) {
        return new JAXBElement<Long>(_ImovelHeliponto_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "EmailProprietario", scope = Imovel.class)
    public JAXBElement<String> createImovelEmailProprietario(String value) {
        return new JAXBElement<String>(_ImovelEmailProprietario_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "AndarInteiro", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelAndarInteiro(Long value) {
        return new JAXBElement<Long>(_ImovelAndarInteiro_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Cachoeira", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelCachoeira(Long value) {
        return new JAXBElement<Long>(_ImovelCachoeira_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Aquecedor", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelAquecedor(Long value) {
        return new JAXBElement<Long>(_ImovelAquecedor_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "TourVirtual", scope = Imovel.class)
    public JAXBElement<String> createImovelTourVirtual(String value) {
        return new JAXBElement<String>(_ImovelTourVirtual_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "SalaGinastica", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelSalaGinastica(Long value) {
        return new JAXBElement<Long>(_ImovelSalaGinastica_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "MeioAndar", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelMeioAndar(Long value) {
        return new JAXBElement<Long>(_ImovelMeioAndar_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PetPlay", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPetPlay(Long value) {
        return new JAXBElement<Long>(_ImovelPetPlay_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "AndaresPredio", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelAndaresPredio(Long value) {
        return new JAXBElement<Long>(_ImovelAndaresPredio_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PocoArtesiano", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPocoArtesiano(Long value) {
        return new JAXBElement<Long>(_ImovelPocoArtesiano_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "SistemaEsgoto", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelSistemaEsgoto(Long value) {
        return new JAXBElement<Long>(_ImovelSistemaEsgoto_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PrecoCondominio", scope = Imovel.class)
    public JAXBElement<String> createImovelPrecoCondominio(String value) {
        return new JAXBElement<String>(_ImovelPrecoCondominio_QNAME, String.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "PosicaoSuperDestaque ", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelPosicaoSuperDestaque_0020(Long value) {
        return new JAXBElement<Long>(_ImovelPosicaoSuperDestaque_0020_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Geladeira", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelGeladeira(Long value) {
        return new JAXBElement<Long>(_ImovelGeladeira_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "ServicosEscritorio", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelServicosEscritorio(Long value) {
        return new JAXBElement<Long>(_ImovelServicosEscritorio_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Lavanderia", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelLavanderia(Long value) {
        return new JAXBElement<Long>(_ImovelLavanderia_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "VestiarioEmpregado", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelVestiarioEmpregado(Long value) {
        return new JAXBElement<Long>(_ImovelVestiarioEmpregado_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "AcademiaFitness", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelAcademiaFitness(Long value) {
        return new JAXBElement<Long>(_ImovelAcademiaFitness_QNAME, Long.class, Imovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itcld.com/imoveis-ws/schema/bossanova", name = "Galpao", scope = Imovel.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createImovelGalpao(Long value) {
        return new JAXBElement<Long>(_ImovelGalpao_QNAME, Long.class, Imovel.class, value);
    }

}
