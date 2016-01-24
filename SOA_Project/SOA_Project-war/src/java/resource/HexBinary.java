//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.01.25 at 04:25:45 PM CET
//

package resource;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java Class for hexBinary complex type.
 *
 * <p>
 * Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette
 * classe.
 *
 * <pre>
 * &lt;complexType name="hexBinary">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>hexBinary">
 *       &lt;attribute ref="{http://www.w3.org/2005/05/xmlmime}contentType"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hexBinary", namespace = "http://www.w3.org/2005/05/xmlmime", propOrder = { "value" })
public class HexBinary {

    @XmlValue
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] value;
    @XmlAttribute(name = "contentType", namespace = "http://www.w3.org/2005/05/xmlmime")
    protected String contentType;

    /**
     * Gets the value of the property value.
     *
     * @return possible object is {@link String }
     *
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the property value.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setValue(byte[] val) {
        if (val == null) {
            this.value = new byte[0];
        } else {
            this.value = Arrays.copyOf(val, val.length);
        }
    }

    /**
     * Gets the value of the property contentType.
     *
     * @return possible object is {@link String }
     *
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the property contentType.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

}
