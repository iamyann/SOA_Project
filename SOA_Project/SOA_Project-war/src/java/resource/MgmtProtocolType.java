//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.24 at 03:13:28 AM CEST
//


package resource;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java Class for MgmtProtocolType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MgmtProtocolType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OMA DM"/>
 *     &lt;enumeration value="BBF TR 069"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "MgmtProtocolType")
@XmlEnum
public enum MgmtProtocolType {

    @XmlEnumValue("OMA DM")
    OMA_DM("OMA DM"),
    @XmlEnumValue("BBF TR 069")
    BBF_TR_069("BBF TR 069");
    private final String value;

    MgmtProtocolType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MgmtProtocolType fromValue(String v) {
        for (MgmtProtocolType c: MgmtProtocolType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}