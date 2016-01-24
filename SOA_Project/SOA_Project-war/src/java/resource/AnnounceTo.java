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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnnounceTo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AnnounceTo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/m2m}activated" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}sclList"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}global" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnounceTo", propOrder = {
        "activated",
        "sclList",
        "global"
})
public class AnnounceTo {

    protected Boolean activated;
    @XmlElement(required = true)
    protected AnyURIList sclList;
    protected Boolean global;

    /**
     * Gets the value of the activated property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isActivated() {
        return activated;
    }

    /**
     * Sets the value of the activated property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setActivated(Boolean value) {
        this.activated = value;
    }

    /**
     * Gets the value of the sclList property.
     *
     * @return
     *     possible object is
     *     {@link AnyURIList }
     *
     */
    public AnyURIList getSclList() {
        if(sclList == null){
            sclList = new AnyURIList();
        }
        return sclList;
    }

    /**
     * Sets the value of the sclList property.
     *
     * @param value
     *     allowed object is
     *     {@link AnyURIList }
     *
     */
    public void setSclList(AnyURIList value) {
        this.sclList = value;
    }

    /**
     * Gets the value of the global property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isGlobal() {
        return global;
    }

    /**
     * Sets the value of the global property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setGlobal(Boolean value) {
        this.global = value;
    }

    public String toString() {
        return "AnnounceTo [activated=" + activated + ", sclList=" + sclList
                + ", global=" + global + "]";
    }

}