//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.01.25 at 05:56:27 PM CET
//

package resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;

/**
 * <p>
 * Java class for Application complex type.
 *
 *<p>
 * Application resource stores information about the Application. Application
 * resource is created as a result of successful registration of an Application
 * with the local SCL. Applications shall only register to their local SCL.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Application">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/m2m}expirationTime" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}accessRightID" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}searchStrings" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}creationTime" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}lastModifiedTime" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}announceTo" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}aPoC" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}aPoCPaths" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}locRequestor" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}containersReference" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}groupsReference" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}accessRightsReference" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}subscriptionsReference" minOccurs="0"/>
 *         &lt;element ref="{http://uri.etsi.org/m2m}notificationChannelsReference" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="appId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Application extends Resource {

    @XmlSchemaType(name = "dateTime")
    protected String expirationTime;
    @XmlSchemaType(name = "dateTime")
    protected String creationTime;
    @XmlSchemaType(name = "dateTime")
    protected String lastModifiedTime;
    protected AnnounceTo announceTo;
    @XmlSchemaType(name = "anyURI")
    protected String aPoC;
    protected APoCPaths aPoCPaths;
    @XmlSchemaType(name = "anySimpleType")
    protected Object locRequestor;
    @XmlSchemaType(name = "anyURI")
    protected String containersReference;
    @XmlSchemaType(name = "anyURI")
    protected String groupsReference;
    @XmlSchemaType(name = "anyURI")
    protected String accessRightsReference;
    @XmlSchemaType(name = "anyURI")
    protected String subscriptionsReference;
    @XmlSchemaType(name = "anyURI")
    protected String notificationChannelsReference;
    @XmlAttribute(name = "appId")
    @XmlSchemaType(name = "anyURI")
    protected String appId;

    /**
     * Application Constructor
     */
    public Application() {
        super();
    }

    /**
     * Application Constructor
     * @param appId - The id of the application
     */
    public Application(String appId) {
        super();
        this.appId = appId;
    }

    /**
     * Application Constructor
     * @param appId - The id of the application
     * @param aPoCPath - The aPoCPath of the application
     */
    public Application(String appId, String aPoCPath) {
        super();
        this.appId = appId;
        this.aPoCPaths = new APoCPaths();
        this.aPoCPaths.getAPoCPath().add(new APoCPath(aPoCPath));

    }

    /**
     * Gets the value of the expirationTime property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setExpirationTime(String value) {
        this.expirationTime = value;
    }

    /**
     * Gets the value of the creationTime property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setCreationTime(String value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the lastModifiedTime property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the value of the lastModifiedTime property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setLastModifiedTime(String value) {
        this.lastModifiedTime = value;
    }

    /**
     * Gets the value of the announceTo property.
     *
     * @return possible object is {@link AnnounceTo }
     *
     */
    public AnnounceTo getAnnounceTo() {
        return announceTo;
    }

    /**
     * Sets the value of the announceTo property.
     *
     * @param value
     *            allowed object is {@link AnnounceTo }
     *
     */
    public void setAnnounceTo(AnnounceTo value) {
        this.announceTo = value;
    }

    /**
     * Gets the value of the aPoC property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAPoC() {
        return aPoC;
    }

    /**
     * Sets the value of the aPoC property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setAPoC(String value) {
        this.aPoC = value;
    }

    /**
     * Gets the value of the aPoCPaths property.
     *
     * @return possible object is {@link APoCPaths }
     *
     */
    public APoCPaths getAPoCPaths() {
        return aPoCPaths;
    }

    /**
     * Sets the value of the aPoCPaths property.
     *
     * @param value
     *            allowed object is {@link APoCPaths }
     *
     */
    public void setAPoCPaths(APoCPaths value) {
        this.aPoCPaths = value;
    }

    /**
     * Gets the value of the locRequestor property.
     *
     * @return possible object is {@link Object }
     *
     */
    public Object getLocRequestor() {
        return locRequestor;
    }

    /**
     * Sets the value of the locRequestor property.
     *
     * @param value
     *            allowed object is {@link Object }
     *
     */
    public void setLocRequestor(Object value) {
        this.locRequestor = value;
    }

    /**
     * Gets the value of the containersReference property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getContainersReference() {
        return containersReference;
    }

    /**
     * Sets the value of the containersReference property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setContainersReference(String value) {
        this.containersReference = value;
    }

    /**
     * Gets the value of the groupsReference property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getGroupsReference() {
        return groupsReference;
    }

    /**
     * Sets the value of the groupsReference property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setGroupsReference(String value) {
        this.groupsReference = value;
    }

    /**
     * Gets the value of the accessRightsReference property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAccessRightsReference() {
        return accessRightsReference;
    }

    /**
     * Sets the value of the accessRightsReference property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setAccessRightsReference(String value) {
        this.accessRightsReference = value;
    }

    /**
     * Gets the value of the subscriptionsReference property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSubscriptionsReference() {
        return subscriptionsReference;
    }

    /**
     * Sets the value of the subscriptionsReference property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setSubscriptionsReference(String value) {
        this.subscriptionsReference = value;
    }

    /**
     * Gets the value of the notificationChannelsReference property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNotificationChannelsReference() {
        return notificationChannelsReference;
    }

    /**
     * Sets the value of the notificationChannelsReference property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setNotificationChannelsReference(String value) {
        this.notificationChannelsReference = value;
    }

    /**
     * Gets the value of the appId property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    public String toString() {
        return "Application [expirationTime=" + expirationTime
                + ", accessRightID=" + accessRightID + ", searchStrings="
                + searchStrings + ", creationTime=" + creationTime
                + ", lastModifiedTime=" + lastModifiedTime + ", announceTo="
                + announceTo + ", aPoC=" + aPoC + ", aPoCPaths=" + aPoCPaths
                + ", locRequestor=" + locRequestor + ", containersReference="
                + containersReference + ", groupsReference=" + groupsReference
                + ", accessRightsReference=" + accessRightsReference
                + ", subscriptionsReference=" + subscriptionsReference
                + ", notificationChannelsReference="
                + notificationChannelsReference + ", appId=" + appId + ", uri=";
    }
}
