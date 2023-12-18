
package org.example.proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.proxy package. 
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

    private final static QName _GetZodiacSignResponse_QNAME = new QName("http://service.example.org/", "getZodiacSignResponse");
    private final static QName _GetZodiacSign_QNAME = new QName("http://service.example.org/", "getZodiacSign");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetZodiacSignResponse }
     * 
     */
    public GetZodiacSignResponse createGetZodiacSignResponse() {
        return new GetZodiacSignResponse();
    }

    /**
     * Create an instance of {@link GetZodiacSign }
     * 
     */
    public GetZodiacSign createGetZodiacSign() {
        return new GetZodiacSign();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetZodiacSignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.org/", name = "getZodiacSignResponse")
    public JAXBElement<GetZodiacSignResponse> createGetZodiacSignResponse(GetZodiacSignResponse value) {
        return new JAXBElement<GetZodiacSignResponse>(_GetZodiacSignResponse_QNAME, GetZodiacSignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetZodiacSign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.org/", name = "getZodiacSign")
    public JAXBElement<GetZodiacSign> createGetZodiacSign(GetZodiacSign value) {
        return new JAXBElement<GetZodiacSign>(_GetZodiacSign_QNAME, GetZodiacSign.class, null, value);
    }

}
