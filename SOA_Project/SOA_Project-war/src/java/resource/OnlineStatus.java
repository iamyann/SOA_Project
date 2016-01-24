//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.07.08 at 01:02:29 PM CEST
//


package resource;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java Class for OnlineStatus.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OnlineStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ONLINE"/>
 *     &lt;enumeration value="OFFLINE"/>
 *     &lt;enumeration value="NOT_REACHABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "OnlineStatus")
@XmlEnum
public enum OnlineStatus {

    ONLINE,
    OFFLINE,
    NOT_REACHABLE;

    public String value() {
        return name();
    }

    public static OnlineStatus fromValue(String v) {
        return valueOf(v);
    }

}
