package com.krismorte.feriados.br.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de anonymous complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conte�do esperado contido dentro
 * desta classe.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "date",
    "name",
    "description",
    "type",
    "typeCode",
    "link"
})
public class Event {

    @XmlElement(required = true)
    protected String date;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(name = "type_code")
    protected byte typeCode;
    @XmlElement(required = true)
    protected String link;

    /**
     * Obt�m o valor da propriedade date.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDate() {
        return date;
    }

    /**
     * Define o valor da propriedade date.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Obt�m o valor da propriedade name.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obt�m o valor da propriedade description.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade type.
     *
     * @return possible object is {@link String }
     *
     */
    public String getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtém o valor da propriedade typeCode.
     *
     * @return possible object is {@link byte }
     */
    public byte getTypeCode() {
        return typeCode;
    }

    /**
     * Define o valor da propriedade typeCode.
     *
     * @param  value allowed object is {@link byte }
     */
    public void setTypeCode(byte value) {
        this.typeCode = value;
    }

    /**
     * Obtém o valor da propriedade link.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLink() {
        return link;
    }

    /**
     * Define o valor da propriedade link.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLink(String value) {
        this.link = value;
    }

}
