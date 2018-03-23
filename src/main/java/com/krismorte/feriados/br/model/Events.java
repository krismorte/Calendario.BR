

package com.krismorte.feriados.br.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType
 *   &lt;complexContent
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"
 *       &lt;sequence
 *         &lt;element name="location"
 *           &lt;complexType
 *             &lt;complexContent
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"
 *                 &lt;sequence
 *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/
 *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/
 *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/
 *                 &lt;/sequence
 *               &lt;/restriction
 *             &lt;/complexContent
 *           &lt;/complexType
 *         &lt;/element
 *         &lt;element name="event" maxOccurs="unbounded" minOccurs="0"
 *           &lt;complexType
 *             &lt;complexContent
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"
 *                 &lt;sequence
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/
 *                   &lt;element name="type_code" type="{http://www.w3.org/2001/XMLSchema}byte"/
 *                   &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string"/
 *                 &lt;/sequence
 *               &lt;/restriction
 *             &lt;/complexContent
 *           &lt;/complexType
 *         &lt;/element
 *       &lt;/sequence
 *     &lt;/restriction
 *   &lt;/complexContent
 * &lt;/complexType
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "location",
    "event"
})
@XmlRootElement(name = "events")
public class Events {

    @XmlElement(required = true)
    protected Location location;
    protected List<Event> event;

    /**
     * Obt�m o valor da propriedade location.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Define o valor da propriedade location.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     * @return 
     */
    public List<Event> getEvent() {
        if (event == null) {
            event = new ArrayList<>();
        }
        return this.event;
    }

}
