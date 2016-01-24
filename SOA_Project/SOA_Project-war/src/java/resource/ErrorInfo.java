//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.01.25 at 05:56:27 PM CET
//


package resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ErrorInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/m2m}statusCode" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}additionalInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorInfo", propOrder = {
        "statusCode",
        "additionalInfo"
})
public class ErrorInfo {


    @XmlElement(namespace = "http://uri.etsi.org/m2m")
    protected StatusCode statusCode;
    @XmlElement(namespace = "http://uri.etsi.org/m2m")
    protected String additionalInfo;

    /**
     * ErrorInfo Constructor
     */
    public ErrorInfo(){
        super();
    }

    /**
     * ErrorInfo Constructor
     * @param statusCode - StatusCode of the Error
     * @param additionalInfo - Additional information about the error
     */
    public ErrorInfo(StatusCode statusCode, String additionalInfo) {
        super();
        this.statusCode = statusCode;
        this.additionalInfo = additionalInfo;
    }

    /**
     * Gets the value of the statusCode property.
     *
     * @return
     *     possible object is
     *     {@link StatusCode }
     *
     */
    public StatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     *
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *
     */
    public void setStatusCode(StatusCode value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    public String toString() {
        return "ErrorInfo [statusCode=" + statusCode + ", additionalInfo="
                + additionalInfo + "]";
    }

}
