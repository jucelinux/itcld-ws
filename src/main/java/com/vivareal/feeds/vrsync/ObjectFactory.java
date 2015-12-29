//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.12.28 às 11:40:17 AM BRST 
//


package com.vivareal.feeds.vrsync;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vivareal.feeds.vrsync package. 
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

    private final static QName _Listing_QNAME = new QName("http://www.vivareal.com/schemas/1.0/VRSync", "Listing");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vivareal.feeds.vrsync
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Details }
     * 
     */
    public Details createDetails() {
        return new Details();
    }

    /**
     * Create an instance of {@link ImovelVivaRealRequest }
     * 
     */
    public ImovelVivaRealRequest createImovelVivaRealRequest() {
        return new ImovelVivaRealRequest();
    }

    /**
     * Create an instance of {@link VRSyncFeed }
     * 
     */
    public VRSyncFeed createVRSyncFeed() {
        return new VRSyncFeed();
    }

    /**
     * Create an instance of {@link ImovelVivaRealResponse }
     * 
     */
    public ImovelVivaRealResponse createImovelVivaRealResponse() {
        return new ImovelVivaRealResponse();
    }

    /**
     * Create an instance of {@link VRSyncListing }
     * 
     */
    public VRSyncListing createVRSyncListing() {
        return new VRSyncListing();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link Media }
     * 
     */
    public Media createMedia() {
        return new Media();
    }

    /**
     * Create an instance of {@link Listings }
     * 
     */
    public Listings createListings() {
        return new Listings();
    }

    /**
     * Create an instance of {@link Features }
     * 
     */
    public Features createFeatures() {
        return new Features();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link MediaItem }
     * 
     */
    public MediaItem createMediaItem() {
        return new MediaItem();
    }

    /**
     * Create an instance of {@link Geoarea }
     * 
     */
    public Geoarea createGeoarea() {
        return new Geoarea();
    }

    /**
     * Create an instance of {@link Area }
     * 
     */
    public Area createArea() {
        return new Area();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link PeriodPrice }
     * 
     */
    public PeriodPrice createPeriodPrice() {
        return new PeriodPrice();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link Location.Address }
     * 
     */
    public Location.Address createLocationAddress() {
        return new Location.Address();
    }

    /**
     * Create an instance of {@link Details.Garage }
     * 
     */
    public Details.Garage createDetailsGarage() {
        return new Details.Garage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VRSyncListing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vivareal.com/schemas/1.0/VRSync", name = "Listing")
    public JAXBElement<VRSyncListing> createListing(VRSyncListing value) {
        return new JAXBElement<VRSyncListing>(_Listing_QNAME, VRSyncListing.class, null, value);
    }

}
