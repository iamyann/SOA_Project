//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.01.25 at 05:56:27 PM CET
//


package resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;



/**
 * <p>
 * Java class for AccessRights complex type.
 *
 * <p>
 * AccessRights resource is a collection of {@link AccessRight} and {@link AccessRightAnnc} resources
 * that do not have a containing relation with a specific remote entity.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AccessRights">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/m2m}accessRightID" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}creationTime" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}lastModifiedTime" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}accessRightCollection" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}accessRightAnncCollection" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}subscriptionsReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class AccessRights extends Resource {

    @XmlSchemaType(name = "dateTime")
    protected String creationTime;
    @XmlSchemaType(name = "dateTime")
    protected String lastModifiedTime;
    protected NamedReferenceCollection accessRightCollection;
    protected NamedReferenceCollection accessRightAnncCollection;
    @XmlSchemaType(name = "anyURI")
    protected String subscriptionsReference;

    /**
     * Gets the value of the creationTime property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreationTime(String value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the lastModifiedTime property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the value of the lastModifiedTime property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastModifiedTime(String value) {
        this.lastModifiedTime = value;
    }

    /**
     * Gets the value of the accessRightCollection property.
     *
     * @return
     *     possible object is
     *     {@link NamedReferenceCollection }
     *
     */
    public NamedReferenceCollection getAccessRightCollection() {
        if(accessRightCollection == null){
            accessRightCollection = new NamedReferenceCollection();
        }
        return accessRightCollection;

    }

    /**
     * Sets the value of the accessRightCollection property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedReferenceCollection }
     *
     */
    public void setAccessRightCollection(NamedReferenceCollection value) {
        this.accessRightCollection = value;
    }

    /**
     * Gets the value of the accessRightCollection property.
     *
     * @return
     *     possible object is
     *     {@link NamedReferenceCollection }
     *
     */
    public NamedReferenceCollection getAccessRightAnncCollection() {
        if(accessRightAnncCollection == null){
            accessRightAnncCollection = new NamedReferenceCollection();
        }
        return accessRightAnncCollection;
    }

    /**
     * Sets the value of the accessRightAnncCollection property.
     *
     * @param value
     *     allowed object is
     *     {@link NamedReferenceCollection }
     *
     */
    public void setAccessRightAnncCollection(NamedReferenceCollection value) {
        this.accessRightAnncCollection = value;
    }

    /**
     * Gets the value of the subscriptionsReference property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubscriptionsReference() {
        return subscriptionsReference;
    }

    /**
     * Sets the value of the subscriptionsReference property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubscriptionsReference(String value) {
        this.subscriptionsReference = value;
    }

    public String toString() {
        return "AccessRights [accessRightID=" + accessRightID
                + ", creationTime=" + creationTime + ", lastModifiedTime="
                + lastModifiedTime + ", accessRightCollection="
                + accessRightCollection + ", accessRightAnncCollection="
                + accessRightAnncCollection + ", subscriptionsReference="
                + subscriptionsReference + ", uri=" + uri + "]";
    }

}
