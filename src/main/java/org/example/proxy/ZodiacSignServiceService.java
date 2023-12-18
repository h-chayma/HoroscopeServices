
package org.example.proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ZodiacSignServiceService", targetNamespace = "http://service.example.org/", wsdlLocation = "http://localhost:8086/ZodiacSignService?wsdl")
public class ZodiacSignServiceService
    extends Service
{

    private final static URL ZODIACSIGNSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException ZODIACSIGNSERVICESERVICE_EXCEPTION;
    private final static QName ZODIACSIGNSERVICESERVICE_QNAME = new QName("http://service.example.org/", "ZodiacSignServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8086/ZodiacSignService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ZODIACSIGNSERVICESERVICE_WSDL_LOCATION = url;
        ZODIACSIGNSERVICESERVICE_EXCEPTION = e;
    }

    public ZodiacSignServiceService() {
        super(__getWsdlLocation(), ZODIACSIGNSERVICESERVICE_QNAME);
    }

    public ZodiacSignServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ZODIACSIGNSERVICESERVICE_QNAME, features);
    }

    public ZodiacSignServiceService(URL wsdlLocation) {
        super(wsdlLocation, ZODIACSIGNSERVICESERVICE_QNAME);
    }

    public ZodiacSignServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ZODIACSIGNSERVICESERVICE_QNAME, features);
    }

    public ZodiacSignServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ZodiacSignServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ZodiacSignService
     */
    @WebEndpoint(name = "ZodiacSignServicePort")
    public ZodiacSignService getZodiacSignServicePort() {
        return super.getPort(new QName("http://service.example.org/", "ZodiacSignServicePort"), ZodiacSignService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZodiacSignService
     */
    @WebEndpoint(name = "ZodiacSignServicePort")
    public ZodiacSignService getZodiacSignServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.example.org/", "ZodiacSignServicePort"), ZodiacSignService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ZODIACSIGNSERVICESERVICE_EXCEPTION!= null) {
            throw ZODIACSIGNSERVICESERVICE_EXCEPTION;
        }
        return ZODIACSIGNSERVICESERVICE_WSDL_LOCATION;
    }

}
