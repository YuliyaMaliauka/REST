/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datalex.pojos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


  @XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resComponent",
    "resComponentGroup",
    "customer",
    "invoice",
    "event",
    "extraInformation",
    "guest",
    "itinerarySegment",
    "airItineraryStatusInfo",
    "sessionDetails",
    "airFareRules",
    "providerRules",
    "fareFamily",
    "attributeType"
})
@XmlRootElement(name = "Reservation")
public class Reservation  {


    @XmlElement(name = "ResComponent", required = true)
    protected List<Reservation.ResComponent> resComponent;
    @XmlElement(name = "ResComponentGroup", required = true)
    protected List<Reservation.ResComponentGroup> resComponentGroup;
    @XmlElement(name = "Customer", required = true)
    protected Reservation.Customer customer;
    @XmlElement(name = "Invoice", required = true)
    protected Reservation.Invoice invoice;
    @XmlElement(name = "Event", required = true)
    protected List<Reservation.Event> event;
    @XmlElement(name = "ExtraInformation", required = true)
    protected List<Reservation.ExtraInformation> extraInformation;
    @XmlElement(name = "Guest", required = true)
    protected List<Reservation.Guest> guest;
    @XmlElement(name = "ItinerarySegment", required = true)
    protected Reservation.ItinerarySegment itinerarySegment;
    @XmlElement(name = "AirItineraryStatusInfo", required = true)
    protected Reservation.AirItineraryStatusInfo airItineraryStatusInfo;
    @XmlElement(name = "SessionDetails", required = true)
    protected List<Reservation.SessionDetails> sessionDetails;
    @XmlElement(name = "AirFareRules", required = true)
    protected Reservation.AirFareRules airFareRules;
    @XmlElement(name = "ProviderRules", required = true)
    protected Reservation.ProviderRules providerRules;
    @XmlElement(name = "FareFamily", required = true)
    protected Reservation.FareFamily fareFamily;
    @XmlElement(name = "AttributeType", required = true)
    protected List<Reservation.AttributeType> attributeType;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "Hidden")
    protected String hidden;
    @XmlAttribute(name = "HistorySequence")
    protected Integer historySequence;
    @XmlAttribute(name = "InitialBookingDateTime")
    protected String initialBookingDateTime;
    @XmlAttribute(name = "IntDomIndicator")
    protected String intDomIndicator;
    @XmlAttribute(name = "Source")
    protected String source;
    @XmlAttribute(name = "Status")
    protected String status;

    /**
     * Gets the value of the resComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reservation.ResComponent }
     * 
     * 
     */
    public List<Reservation.ResComponent> getResComponent() {
        if (resComponent == null) {
            resComponent = new ArrayList<Reservation.ResComponent>();
        }
        return this.resComponent;
    }

    /**
     * Gets the value of the resComponentGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resComponentGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResComponentGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reservation.ResComponentGroup }
     * 
     * 
     */
    public List<Reservation.ResComponentGroup> getResComponentGroup() {
        if (resComponentGroup == null) {
            resComponentGroup = new ArrayList<Reservation.ResComponentGroup>();
        }
        return this.resComponentGroup;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Reservation.Customer }
     *     
     */
    public Reservation.Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reservation.Customer }
     *     
     */
    public void setCustomer(Reservation.Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link Reservation.Invoice }
     *     
     */
    public Reservation.Invoice getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reservation.Invoice }
     *     
     */
    public void setInvoice(Reservation.Invoice value) {
        this.invoice = value;
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
     * {@link Reservation.Event }
     * 
     * 
     */
    public List<Reservation.Event> getEvent() {
        if (event == null) {
            event = new ArrayList<Reservation.Event>();
        }
        return this.event;
    }

    /**
     * Gets the value of the extraInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reservation.ExtraInformation }
     * 
     * 
     */
    public List<Reservation.ExtraInformation> getExtraInformation() {
        if (extraInformation == null) {
            extraInformation = new ArrayList<Reservation.ExtraInformation>();
        }
        return this.extraInformation;
    }

    /**
     * Gets the value of the guest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reservation.Guest }
     * 
     * 
     */
    public List<Reservation.Guest> getGuest() {
        if (guest == null) {
            guest = new ArrayList<Reservation.Guest>();
        }
        return this.guest;
    }

    /**
     * Gets the value of the itinerarySegment property.
     * 
     * @return
     *     possible object is
     *     {@link Reservation.ItinerarySegment }
     *     
     */
    public Reservation.ItinerarySegment getItinerarySegment() {
        return itinerarySegment;
    }

    /**
     * Sets the value of the itinerarySegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reservation.ItinerarySegment }
     *     
     */
    public void setItinerarySegment(Reservation.ItinerarySegment value) {
        this.itinerarySegment = value;
    }

    /**
     * Gets the value of the airItineraryStatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Reservation.AirItineraryStatusInfo }
     *     
     */
    public Reservation.AirItineraryStatusInfo getAirItineraryStatusInfo() {
        return airItineraryStatusInfo;
    }

    /**
     * Sets the value of the airItineraryStatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reservation.AirItineraryStatusInfo }
     *     
     */
    public void setAirItineraryStatusInfo(Reservation.AirItineraryStatusInfo value) {
        this.airItineraryStatusInfo = value;
    }

    /**
     * Gets the value of the sessionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reservation.SessionDetails }
     * 
     * 
     */
    public List<Reservation.SessionDetails> getSessionDetails() {
        if (sessionDetails == null) {
            sessionDetails = new ArrayList<Reservation.SessionDetails>();
        }
        return this.sessionDetails;
    }

    /**
     * Gets the value of the airFareRules property.
     * 
     * @return
     *     possible object is
     *     {@link Reservation.AirFareRules }
     *     
     */
    public Reservation.AirFareRules getAirFareRules() {
        return airFareRules;
    }

    /**
     * Sets the value of the airFareRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reservation.AirFareRules }
     *     
     */
    public void setAirFareRules(Reservation.AirFareRules value) {
        this.airFareRules = value;
    }

    /**
     * Gets the value of the providerRules property.
     * 
     * @return
     *     possible object is
     *     {@link Reservation.ProviderRules }
     *     
     */
    public Reservation.ProviderRules getProviderRules() {
        return providerRules;
    }

    /**
     * Sets the value of the providerRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reservation.ProviderRules }
     *     
     */
    public void setProviderRules(Reservation.ProviderRules value) {
        this.providerRules = value;
    }

    /**
     * Gets the value of the fareFamily property.
     * 
     * @return
     *     possible object is
     *     {@link Reservation.FareFamily }
     *     
     */
    public Reservation.FareFamily getFareFamily() {
        return fareFamily;
    }

    /**
     * Sets the value of the fareFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reservation.FareFamily }
     *     
     */
    public void setFareFamily(Reservation.FareFamily value) {
        this.fareFamily = value;
    }

    /**
     * Gets the value of the attributeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reservation.AttributeType }
     * 
     * 
     */
    public List<Reservation.AttributeType> getAttributeType() {
        if (attributeType == null) {
            attributeType = new ArrayList<Reservation.AttributeType>();
        }
        return this.attributeType;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHidden(String value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the historySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHistorySequence() {
        return historySequence;
    }

    /**
     * Sets the value of the historySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHistorySequence(Integer value) {
        this.historySequence = value;
    }

    /**
     * Gets the value of the initialBookingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialBookingDateTime() {
        return initialBookingDateTime;
    }

    /**
     * Sets the value of the initialBookingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialBookingDateTime(String value) {
        this.initialBookingDateTime = value;
    }

    /**
     * Gets the value of the intDomIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntDomIndicator() {
        return intDomIndicator;
    }

    /**
     * Sets the value of the intDomIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntDomIndicator(String value) {
        this.intDomIndicator = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    public void setResComponent(ArrayList<Reservation.ResComponent> list) {
        this.resComponent = list;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FareRules">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SubSection">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Paragraph" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ParagraphNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="SubTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ArrivalAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DepartureAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="FareReference" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FilingAirline" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fareRules"
    })
    public static class AirFareRules {

        @XmlElement(name = "FareRules", required = true)
        protected Reservation.AirFareRules.FareRules fareRules;
        @XmlAttribute(name = "ArrivalAirport")
        protected String arrivalAirport;
        @XmlAttribute(name = "DepartureAirport")
        protected String departureAirport;
        @XmlAttribute(name = "DepartureDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar departureDate;
        @XmlAttribute(name = "FareReference")
        protected String fareReference;
        @XmlAttribute(name = "FilingAirline")
        protected String filingAirline;
        @XmlAttribute(name = "ID")
        protected String id;
        @XmlAttribute(name = "Sequence")
        protected Integer sequence;

        /**
         * Gets the value of the fareRules property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.AirFareRules.FareRules }
         *     
         */
        public Reservation.AirFareRules.FareRules getFareRules() {
            return fareRules;
        }

        /**
         * Sets the value of the fareRules property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.AirFareRules.FareRules }
         *     
         */
        public void setFareRules(Reservation.AirFareRules.FareRules value) {
            this.fareRules = value;
        }

        /**
         * Gets the value of the arrivalAirport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArrivalAirport() {
            return arrivalAirport;
        }

        /**
         * Sets the value of the arrivalAirport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArrivalAirport(String value) {
            this.arrivalAirport = value;
        }

        /**
         * Gets the value of the departureAirport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartureAirport() {
            return departureAirport;
        }

        /**
         * Sets the value of the departureAirport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartureAirport(String value) {
            this.departureAirport = value;
        }

        /**
         * Gets the value of the departureDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDepartureDate() {
            return departureDate;
        }

        /**
         * Sets the value of the departureDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDepartureDate(XMLGregorianCalendar value) {
            this.departureDate = value;
        }

        /**
         * Gets the value of the fareReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareReference() {
            return fareReference;
        }

        /**
         * Sets the value of the fareReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareReference(String value) {
            this.fareReference = value;
        }

        /**
         * Gets the value of the filingAirline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFilingAirline() {
            return filingAirline;
        }

        /**
         * Sets the value of the filingAirline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFilingAirline(String value) {
            this.filingAirline = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSequence(Integer value) {
            this.sequence = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SubSection">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Paragraph" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ParagraphNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="SubTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "subSection"
        })
        public static class FareRules {

            @XmlElement(name = "SubSection", required = true)
            protected Reservation.AirFareRules.FareRules.SubSection subSection;

            /**
             * Gets the value of the subSection property.
             * 
             * @return
             *     possible object is
             *     {@link Reservation.AirFareRules.FareRules.SubSection }
             *     
             */
            public Reservation.AirFareRules.FareRules.SubSection getSubSection() {
                return subSection;
            }

            /**
             * Sets the value of the subSection property.
             * 
             * @param value
             *     allowed object is
             *     {@link Reservation.AirFareRules.FareRules.SubSection }
             *     
             */
            public void setSubSection(Reservation.AirFareRules.FareRules.SubSection value) {
                this.subSection = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Paragraph" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ParagraphNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="SubTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "paragraph"
            })
            public static class SubSection {

                @XmlElement(name = "Paragraph", required = true)
                protected List<Reservation.AirFareRules.FareRules.SubSection.Paragraph> paragraph;
                @XmlAttribute(name = "SubTitle")
                protected String subTitle;

                /**
                 * Gets the value of the paragraph property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the paragraph property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getParagraph().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Reservation.AirFareRules.FareRules.SubSection.Paragraph }
                 * 
                 * 
                 */
                public List<Reservation.AirFareRules.FareRules.SubSection.Paragraph> getParagraph() {
                    if (paragraph == null) {
                        paragraph = new ArrayList<Reservation.AirFareRules.FareRules.SubSection.Paragraph>();
                    }
                    return this.paragraph;
                }

                /**
                 * Gets the value of the subTitle property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubTitle() {
                    return subTitle;
                }

                /**
                 * Sets the value of the subTitle property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubTitle(String value) {
                    this.subTitle = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ParagraphNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "text"
                })
                public static class Paragraph {

                    @XmlElement(name = "Text", required = true)
                    protected String text;
                    @XmlAttribute(name = "Name")
                    protected String name;
                    @XmlAttribute(name = "ParagraphNumber")
                    protected Integer paragraphNumber;

                    /**
                     * Gets the value of the text property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getText() {
                        return text;
                    }

                    /**
                     * Sets the value of the text property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setText(String value) {
                        this.text = value;
                    }

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the paragraphNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getParagraphNumber() {
                        return paragraphNumber;
                    }

                    /**
                     * Sets the value of the paragraphNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setParagraphNumber(Integer value) {
                        this.paragraphNumber = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OriginDestinationStatusInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ItinerarySegmentLink">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="ItinerarySegmentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ItinerarySegmentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="SegmentType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CancellationAllowed" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ChangeAllowed" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "originDestinationStatusInfo"
    })
    public static class AirItineraryStatusInfo {

        @XmlElement(name = "OriginDestinationStatusInfo", required = true)
        protected Reservation.AirItineraryStatusInfo.OriginDestinationStatusInfo originDestinationStatusInfo;
        @XmlAttribute(name = "Status")
        protected String status;

        /**
         * Gets the value of the originDestinationStatusInfo property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.AirItineraryStatusInfo.OriginDestinationStatusInfo }
         *     
         */
        public Reservation.AirItineraryStatusInfo.OriginDestinationStatusInfo getOriginDestinationStatusInfo() {
            return originDestinationStatusInfo;
        }

        /**
         * Sets the value of the originDestinationStatusInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.AirItineraryStatusInfo.OriginDestinationStatusInfo }
         *     
         */
        public void setOriginDestinationStatusInfo(Reservation.AirItineraryStatusInfo.OriginDestinationStatusInfo value) {
            this.originDestinationStatusInfo = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ItinerarySegmentLink">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="ItinerarySegmentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ItinerarySegmentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="SegmentType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="CancellationAllowed" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ChangeAllowed" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "itinerarySegmentLink"
        })
        public static class OriginDestinationStatusInfo {

            @XmlElement(name = "ItinerarySegmentLink", required = true)
            protected Reservation.AirItineraryStatusInfo.OriginDestinationStatusInfo.ItinerarySegmentLink itinerarySegmentLink;
            @XmlAttribute(name = "CancellationAllowed")
            protected String cancellationAllowed;
            @XmlAttribute(name = "ChangeAllowed")
            protected String changeAllowed;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "Status")
            protected String status;

            /**
             * Gets the value of the itinerarySegmentLink property.
             * 
             * @return
             *     possible object is
             *     {@link Reservation.AirItineraryStatusInfo.OriginDestinationStatusInfo.ItinerarySegmentLink }
             *     
             */
            public Reservation.AirItineraryStatusInfo.OriginDestinationStatusInfo.ItinerarySegmentLink getItinerarySegmentLink() {
                return itinerarySegmentLink;
            }

            /**
             * Sets the value of the itinerarySegmentLink property.
             * 
             * @param value
             *     allowed object is
             *     {@link Reservation.AirItineraryStatusInfo.OriginDestinationStatusInfo.ItinerarySegmentLink }
             *     
             */
            public void setItinerarySegmentLink(Reservation.AirItineraryStatusInfo.OriginDestinationStatusInfo.ItinerarySegmentLink value) {
                this.itinerarySegmentLink = value;
            }

            /**
             * Gets the value of the cancellationAllowed property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCancellationAllowed() {
                return cancellationAllowed;
            }

            /**
             * Sets the value of the cancellationAllowed property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCancellationAllowed(String value) {
                this.cancellationAllowed = value;
            }

            /**
             * Gets the value of the changeAllowed property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChangeAllowed() {
                return changeAllowed;
            }

            /**
             * Sets the value of the changeAllowed property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChangeAllowed(String value) {
                this.changeAllowed = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="ItinerarySegmentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ItinerarySegmentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="SegmentType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ItinerarySegmentLink {

                @XmlAttribute(name = "DisplayOrder")
                protected Integer displayOrder;
                @XmlAttribute(name = "ItinerarySegmentDocRef")
                protected String itinerarySegmentDocRef;
                @XmlAttribute(name = "ItinerarySegmentSequence")
                protected Integer itinerarySegmentSequence;
                @XmlAttribute(name = "SegmentType")
                protected String segmentType;
                @XmlAttribute(name = "Sequence")
                protected Integer sequence;

                /**
                 * Gets the value of the displayOrder property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getDisplayOrder() {
                    return displayOrder;
                }

                /**
                 * Sets the value of the displayOrder property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setDisplayOrder(Integer value) {
                    this.displayOrder = value;
                }

                /**
                 * Gets the value of the itinerarySegmentDocRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItinerarySegmentDocRef() {
                    return itinerarySegmentDocRef;
                }

                /**
                 * Sets the value of the itinerarySegmentDocRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItinerarySegmentDocRef(String value) {
                    this.itinerarySegmentDocRef = value;
                }

                /**
                 * Gets the value of the itinerarySegmentSequence property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getItinerarySegmentSequence() {
                    return itinerarySegmentSequence;
                }

                /**
                 * Sets the value of the itinerarySegmentSequence property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setItinerarySegmentSequence(Integer value) {
                    this.itinerarySegmentSequence = value;
                }

                /**
                 * Gets the value of the segmentType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSegmentType() {
                    return segmentType;
                }

                /**
                 * Sets the value of the segmentType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSegmentType(String value) {
                    this.segmentType = value;
                }

                /**
                 * Gets the value of the sequence property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getSequence() {
                    return sequence;
                }

                /**
                 * Sets the value of the sequence property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setSequence(Integer value) {
                    this.sequence = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AttributeValue">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="AttributeValueCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="SpecificValue" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="AttributeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AttributeTypeDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attributeValue"
    })
    public static class AttributeType {

        @XmlElement(name = "AttributeValue", required = true)
        protected Reservation.AttributeType.AttributeValue attributeValue;
        @XmlAttribute(name = "AttributeTypeCode")
        protected String attributeTypeCode;
        @XmlAttribute(name = "AttributeTypeDocID")
        protected String attributeTypeDocID;
        @XmlAttribute(name = "Sequence")
        protected Integer sequence;

        /**
         * Gets the value of the attributeValue property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.AttributeType.AttributeValue }
         *     
         */
        public Reservation.AttributeType.AttributeValue getAttributeValue() {
            return attributeValue;
        }

        /**
         * Sets the value of the attributeValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.AttributeType.AttributeValue }
         *     
         */
        public void setAttributeValue(Reservation.AttributeType.AttributeValue value) {
            this.attributeValue = value;
        }

        /**
         * Gets the value of the attributeTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttributeTypeCode() {
            return attributeTypeCode;
        }

        /**
         * Sets the value of the attributeTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttributeTypeCode(String value) {
            this.attributeTypeCode = value;
        }

        /**
         * Gets the value of the attributeTypeDocID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttributeTypeDocID() {
            return attributeTypeDocID;
        }

        /**
         * Sets the value of the attributeTypeDocID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttributeTypeDocID(String value) {
            this.attributeTypeDocID = value;
        }

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSequence(Integer value) {
            this.sequence = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="AttributeValueCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="SpecificValue" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AttributeValue {

            @XmlAttribute(name = "AttributeValueCode")
            protected String attributeValueCode;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "SpecificValue")
            protected Integer specificValue;

            /**
             * Gets the value of the attributeValueCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeValueCode() {
                return attributeValueCode;
            }

            /**
             * Sets the value of the attributeValueCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeValueCode(String value) {
                this.attributeValueCode = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the specificValue property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSpecificValue() {
                return specificValue;
            }

            /**
             * Sets the value of the specificValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSpecificValue(Integer value) {
                this.specificValue = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Email">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EmailType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Phone">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="PhoneType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RemoteRef">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Payment" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ExtraInformation" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RemoteRef">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="AmountPaid" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="AttemptNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="BankGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="BankID" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="CreditCardCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CreditCardNumberMasked" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="FailureReason" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="FailureReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="FormOfPaymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="InstalmentFrequency" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="MilesAmountPaid" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="NumberOfInstalments" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="OrderCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PaymentDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ReceivedDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="CustomerDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "email",
        "phone",
        "remoteRef",
        "payment"
    })
    @XmlRootElement
    public static class Customer {

        @XmlElement(name = "Email", required = true)
        protected Reservation.Customer.Email email;
        @XmlElement(name = "Phone", required = true)
        protected Reservation.Customer.Phone phone;
        @XmlElement(name = "RemoteRef", required = true)
        protected Reservation.Customer.RemoteRef remoteRef;
        @XmlElement(name = "Payment", required = true)
        protected List<Reservation.Customer.Payment> payment;
        @XmlAttribute(name = "CustomerDocID")
        protected String customerDocID;
        @XmlAttribute(name = "FirstName")
        protected String firstName;
        @XmlAttribute(name = "LastName")
        protected String lastName;
        @XmlAttribute(name = "Sequence")
        protected Integer sequence;

        
        public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Customer(String customerDocID, String firstName, String lastName) {
			super();
			this.customerDocID = customerDocID;
			this.firstName = firstName;
			this.lastName = lastName;
		}
				

		@Override
		public String toString() {
			return "Customer [email=" + getEmail() + ", phone=" + getPhone() + ", customerDocID=" + customerDocID + ", firstName="
					+ firstName + ", lastName=" + lastName + "]";
		}

		/**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.Customer.Email }
         *     
         */
        public Reservation.Customer.Email getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.Customer.Email }
         *     
         */
        public void setEmail(Reservation.Customer.Email value) {
            this.email = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.Customer.Phone }
         *     
         */
        public Reservation.Customer.Phone getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.Customer.Phone }
         *     
         */
        public void setPhone(Reservation.Customer.Phone value) {
            this.phone = value;
        }

        /**
         * Gets the value of the remoteRef property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.Customer.RemoteRef }
         *     
         */
        public Reservation.Customer.RemoteRef getRemoteRef() {
            return remoteRef;
        }

        /**
         * Sets the value of the remoteRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.Customer.RemoteRef }
         *     
         */
        public void setRemoteRef(Reservation.Customer.RemoteRef value) {
            this.remoteRef = value;
        }

        /**
         * Gets the value of the payment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Reservation.Customer.Payment }
         * 
         * 
         */
        public List<Reservation.Customer.Payment> getPayment() {
            if (payment == null) {
                payment = new ArrayList<Reservation.Customer.Payment>();
            }
            return this.payment;
        }

        /**
         * Gets the value of the customerDocID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerDocID() {
            return customerDocID;
        }

        /**
         * Sets the value of the customerDocID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerDocID(String value) {
            this.customerDocID = value;
        }

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSequence(Integer value) {
            this.sequence = value;
        }

        public void setPayment(ArrayList<Reservation.Customer.Payment> payments) {
            this.payment = payments;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EmailType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Email {

            @XmlAttribute(name = "Default")
            protected String _default;
            @XmlAttribute(name = "EmailAddress")
            protected String emailAddress;
            @XmlAttribute(name = "EmailType")
            protected String emailType;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "SyncStatus")
            protected String syncStatus;

            /**
             * Gets the value of the default property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefault() {
                return _default;
            }

            @Override
			public String toString() {
				return "Email [emailAddress=" + emailAddress + "]";
			}

			/**
             * Sets the value of the default property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefault(String value) {
                this._default = value;
            }

            /**
             * Gets the value of the emailAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmailAddress() {
                return emailAddress;
            }

            /**
             * Sets the value of the emailAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmailAddress(String value) {
                this.emailAddress = value;
            }

            /**
             * Gets the value of the emailType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmailType() {
                return emailType;
            }

            /**
             * Sets the value of the emailType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmailType(String value) {
                this.emailType = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the syncStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSyncStatus() {
                return syncStatus;
            }

            /**
             * Sets the value of the syncStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSyncStatus(String value) {
                this.syncStatus = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ExtraInformation" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RemoteRef">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="AmountPaid" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="AttemptNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="BankGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="BankID" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="CreditCardCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CreditCardNumberMasked" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="FailureReason" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="FailureReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="FormOfPaymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="InstalmentFrequency" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="MilesAmountPaid" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="NumberOfInstalments" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="OrderCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PaymentDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ReceivedDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "extraInformation",
            "remoteRef"
        })
        public static class Payment {

            @XmlElement(name = "ExtraInformation", required = true)
            protected List<Reservation.Customer.Payment.ExtraInformation> extraInformation;
            @XmlElement(name = "RemoteRef", required = true)
            protected Reservation.Customer.Payment.RemoteRef remoteRef;
            @XmlAttribute(name = "AmountPaid")
            protected String amountPaid;
            @XmlAttribute(name = "AttemptNumber")
            protected Integer attemptNumber;
            @XmlAttribute(name = "BankCode")
            protected String bankCode;
            @XmlAttribute(name = "BankGroupCode")
            protected String bankGroupCode;
            @XmlAttribute(name = "BankID")
            protected Integer bankID;
            @XmlAttribute(name = "CreditCardCompanyCode")
            protected String creditCardCompanyCode;
            @XmlAttribute(name = "CreditCardNumberMasked")
            protected String creditCardNumberMasked;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "FailureReason")
            protected String failureReason;
            @XmlAttribute(name = "FailureReasonDescription")
            protected String failureReasonDescription;
            @XmlAttribute(name = "FormOfPaymentTypeCode")
            protected String formOfPaymentTypeCode;
            @XmlAttribute(name = "InstalmentFrequency")
            protected Integer instalmentFrequency;
            @XmlAttribute(name = "MilesAmountPaid")
            protected Integer milesAmountPaid;
            @XmlAttribute(name = "NumberOfInstalments")
            protected Integer numberOfInstalments;
            @XmlAttribute(name = "OrderCode")
            protected String orderCode;
            @XmlAttribute(name = "PaymentDocID")
            protected String paymentDocID;
            @XmlAttribute(name = "ReceivedDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar receivedDate;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;

            /**
             * Gets the value of the extraInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the extraInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExtraInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Reservation.Customer.Payment.ExtraInformation }
             * 
             * 
             */
            public List<Reservation.Customer.Payment.ExtraInformation> getExtraInformation() {
                if (extraInformation == null) {
                    extraInformation = new ArrayList<Reservation.Customer.Payment.ExtraInformation>();
                }
                return this.extraInformation;
            }

            /**
             * Gets the value of the remoteRef property.
             * 
             * @return
             *     possible object is
             *     {@link Reservation.Customer.Payment.RemoteRef }
             *     
             */
            public Reservation.Customer.Payment.RemoteRef getRemoteRef() {
                return remoteRef;
            }

            /**
             * Sets the value of the remoteRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link Reservation.Customer.Payment.RemoteRef }
             *     
             */
            public void setRemoteRef(Reservation.Customer.Payment.RemoteRef value) {
                this.remoteRef = value;
            }

            /**
             * Gets the value of the amountPaid property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public String getAmountPaid() {
                return amountPaid;
            }

            /**
             * Sets the value of the amountPaid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAmountPaid(String value) {
                this.amountPaid = value;
            }

            /**
             * Gets the value of the attemptNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAttemptNumber() {
                return attemptNumber;
            }

            /**
             * Sets the value of the attemptNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAttemptNumber(Integer value) {
                this.attemptNumber = value;
            }

            /**
             * Gets the value of the bankCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankCode() {
                return bankCode;
            }

            /**
             * Sets the value of the bankCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankCode(String value) {
                this.bankCode = value;
            }

            /**
             * Gets the value of the bankGroupCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankGroupCode() {
                return bankGroupCode;
            }

            /**
             * Sets the value of the bankGroupCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankGroupCode(String value) {
                this.bankGroupCode = value;
            }

            /**
             * Gets the value of the bankID property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getBankID() {
                return bankID;
            }

            /**
             * Sets the value of the bankID property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setBankID(Integer value) {
                this.bankID = value;
            }

            /**
             * Gets the value of the creditCardCompanyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreditCardCompanyCode() {
                return creditCardCompanyCode;
            }

            /**
             * Sets the value of the creditCardCompanyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreditCardCompanyCode(String value) {
                this.creditCardCompanyCode = value;
            }

            /**
             * Gets the value of the creditCardNumberMasked property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreditCardNumberMasked() {
                return creditCardNumberMasked;
            }

            /**
             * Sets the value of the creditCardNumberMasked property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreditCardNumberMasked(String value) {
                this.creditCardNumberMasked = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Gets the value of the failureReason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFailureReason() {
                return failureReason;
            }

            /**
             * Sets the value of the failureReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFailureReason(String value) {
                this.failureReason = value;
            }

            /**
             * Gets the value of the failureReasonDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFailureReasonDescription() {
                return failureReasonDescription;
            }

            /**
             * Sets the value of the failureReasonDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFailureReasonDescription(String value) {
                this.failureReasonDescription = value;
            }

            /**
             * Gets the value of the formOfPaymentTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormOfPaymentTypeCode() {
                return formOfPaymentTypeCode;
            }

            /**
             * Sets the value of the formOfPaymentTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormOfPaymentTypeCode(String value) {
                this.formOfPaymentTypeCode = value;
            }

            /**
             * Gets the value of the instalmentFrequency property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getInstalmentFrequency() {
                return instalmentFrequency;
            }

            /**
             * Sets the value of the instalmentFrequency property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setInstalmentFrequency(Integer value) {
                this.instalmentFrequency = value;
            }

            /**
             * Gets the value of the milesAmountPaid property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMilesAmountPaid() {
                return milesAmountPaid;
            }

            /**
             * Sets the value of the milesAmountPaid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMilesAmountPaid(Integer value) {
                this.milesAmountPaid = value;
            }

            /**
             * Gets the value of the numberOfInstalments property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumberOfInstalments() {
                return numberOfInstalments;
            }

            /**
             * Sets the value of the numberOfInstalments property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumberOfInstalments(Integer value) {
                this.numberOfInstalments = value;
            }

            /**
             * Gets the value of the orderCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderCode() {
                return orderCode;
            }

            /**
             * Sets the value of the orderCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderCode(String value) {
                this.orderCode = value;
            }

            /**
             * Gets the value of the paymentDocID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentDocID() {
                return paymentDocID;
            }

            /**
             * Sets the value of the paymentDocID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentDocID(String value) {
                this.paymentDocID = value;
            }

            /**
             * Gets the value of the receivedDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getReceivedDate() {
                return receivedDate;
            }

            /**
             * Sets the value of the receivedDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setReceivedDate(XMLGregorianCalendar value) {
                this.receivedDate = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ExtraInformation {

                @XmlAttribute(name = "Name")
                protected String name;
                @XmlAttribute(name = "Sequence")
                protected Integer sequence;
                @XmlAttribute(name = "Value")
                protected Integer value;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the sequence property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getSequence() {
                    return sequence;
                }

                /**
                 * Sets the value of the sequence property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setSequence(Integer value) {
                    this.sequence = value;
                }

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setValue(Integer value) {
                    this.value = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RemoteRef {

                @XmlAttribute(name = "Name")
                protected String name;
                @XmlAttribute(name = "Sequence")
                protected Integer sequence;
                @XmlAttribute(name = "Value")
                protected Integer value;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the sequence property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getSequence() {
                    return sequence;
                }

                /**
                 * Sets the value of the sequence property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setSequence(Integer value) {
                    this.sequence = value;
                }

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setValue(Integer value) {
                    this.value = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="PhoneType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Phone {

            @XmlAttribute(name = "Default")
            protected String _default;
            @XmlAttribute(name = "PhoneNumber")
            protected String phoneNumber;
            @XmlAttribute(name = "PhoneType")
            protected String phoneType;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "SyncStatus")
            protected String syncStatus;

            /**
             * Gets the value of the default property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefault() {
                return _default;
            }
            

            @Override
			public String toString() {
				return "Phone [phoneNumber=" + phoneNumber + "]";
			}


			/**
             * Sets the value of the default property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefault(String value) {
                this._default = value;
            }

            /**
             * Gets the value of the phoneNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public String getPhoneNumber() {
                return phoneNumber;
            }

            /**
             * Sets the value of the phoneNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPhoneNumber(String value) {
                this.phoneNumber = value;
            }

            /**
             * Gets the value of the phoneType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhoneType() {
                return phoneType;
            }

            /**
             * Sets the value of the phoneType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhoneType(String value) {
                this.phoneType = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the syncStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSyncStatus() {
                return syncStatus;
            }

            /**
             * Sets the value of the syncStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSyncStatus(String value) {
                this.syncStatus = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RemoteRef {

            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "Value")
            protected Integer value;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setValue(Integer value) {
                this.value = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="EventCompletedDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="EventEnteredDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="EventID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="EventScheduledDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="EventTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LastUpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Username" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Event {

        @XmlAttribute(name = "EventCompletedDateTime")
        protected String eventCompletedDateTime;
        @XmlAttribute(name = "EventEnteredDateTime")
        protected String eventEnteredDateTime;
        @XmlAttribute(name = "EventID")
        protected String eventID;
        @XmlAttribute(name = "EventScheduledDateTime")
        protected String eventScheduledDateTime;
        @XmlAttribute(name = "EventTypeCode")
        protected String eventTypeCode;
        @XmlAttribute(name = "LastUpdateDateTime")
        protected String lastUpdateDateTime;
        @XmlAttribute(name = "Sequence")
        protected Integer sequence;
        @XmlAttribute(name = "Source")
        protected String source;
        @XmlAttribute(name = "Username")
        protected Integer username;

        /**
         * Gets the value of the eventCompletedDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventCompletedDateTime() {
            return eventCompletedDateTime;
        }

        /**
         * Sets the value of the eventCompletedDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventCompletedDateTime(String value) {
            this.eventCompletedDateTime = value;
        }

        /**
         * Gets the value of the eventEnteredDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventEnteredDateTime() {
            return eventEnteredDateTime;
        }

        /**
         * Sets the value of the eventEnteredDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventEnteredDateTime(String value) {
            this.eventEnteredDateTime = value;
        }

        /**
         * Gets the value of the eventID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventID() {
            return eventID;
        }

        /**
         * Sets the value of the eventID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventID(String value) {
            this.eventID = value;
        }

        /**
         * Gets the value of the eventScheduledDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventScheduledDateTime() {
            return eventScheduledDateTime;
        }

        /**
         * Sets the value of the eventScheduledDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventScheduledDateTime(String value) {
            this.eventScheduledDateTime = value;
        }

        /**
         * Gets the value of the eventTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventTypeCode() {
            return eventTypeCode;
        }

        /**
         * Sets the value of the eventTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventTypeCode(String value) {
            this.eventTypeCode = value;
        }

        /**
         * Gets the value of the lastUpdateDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastUpdateDateTime() {
            return lastUpdateDateTime;
        }

        /**
         * Sets the value of the lastUpdateDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastUpdateDateTime(String value) {
            this.lastUpdateDateTime = value;
        }

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSequence(Integer value) {
            this.sequence = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Gets the value of the username property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getUsername() {
            return username;
        }

        /**
         * Sets the value of the username property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setUsername(Integer value) {
            this.username = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ExtendedValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExtraInformation {

        @XmlAttribute(name = "ExtendedValue")
        protected String extendedValue;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "Sequence")
        protected Integer sequence;

        /**
         * Gets the value of the extendedValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedValue() {
            return extendedValue;
        }

        /**
         * Sets the value of the extendedValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedValue(String value) {
            this.extendedValue = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSequence(Integer value) {
            this.sequence = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AncillaryAirComponent" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="AncillaryAirComponentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AncillaryAirComponentDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AncillaryAirComponentDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AncillaryAirComponentName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="FareFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FareFamilyDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FareFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ancillaryAirComponent"
    })
    public static class FareFamily {

        @XmlElement(name = "AncillaryAirComponent", required = true)
        protected List<Reservation.FareFamily.AncillaryAirComponent> ancillaryAirComponent;
        @XmlAttribute(name = "FareFamilyCode")
        protected String fareFamilyCode;
        @XmlAttribute(name = "FareFamilyDocID")
        protected String fareFamilyDocID;
        @XmlAttribute(name = "FareFamilyName")
        protected String fareFamilyName;
        @XmlAttribute(name = "Sequence")
        protected Integer sequence;

        /**
         * Gets the value of the ancillaryAirComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ancillaryAirComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAncillaryAirComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Reservation.FareFamily.AncillaryAirComponent }
         * 
         * 
         */
        public List<Reservation.FareFamily.AncillaryAirComponent> getAncillaryAirComponent() {
            if (ancillaryAirComponent == null) {
                ancillaryAirComponent = new ArrayList<Reservation.FareFamily.AncillaryAirComponent>();
            }
            return this.ancillaryAirComponent;
        }

        /**
         * Gets the value of the fareFamilyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareFamilyCode() {
            return fareFamilyCode;
        }

        /**
         * Sets the value of the fareFamilyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareFamilyCode(String value) {
            this.fareFamilyCode = value;
        }

        /**
         * Gets the value of the fareFamilyDocID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareFamilyDocID() {
            return fareFamilyDocID;
        }

        /**
         * Sets the value of the fareFamilyDocID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareFamilyDocID(String value) {
            this.fareFamilyDocID = value;
        }

        /**
         * Gets the value of the fareFamilyName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareFamilyName() {
            return fareFamilyName;
        }

        /**
         * Sets the value of the fareFamilyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareFamilyName(String value) {
            this.fareFamilyName = value;
        }

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSequence(Integer value) {
            this.sequence = value;
        }

        public void setAncillaryAirComponents(ArrayList<AncillaryAirComponent> ancillaryAirComponents) {
            this.ancillaryAirComponent = ancillaryAirComponents;
        }

        


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="AncillaryAirComponentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AncillaryAirComponentDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AncillaryAirComponentDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AncillaryAirComponentName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AncillaryAirComponent {

            @XmlAttribute(name = "AncillaryAirComponentCode")
            protected String ancillaryAirComponentCode;
            @XmlAttribute(name = "AncillaryAirComponentDescription")
            protected String ancillaryAirComponentDescription;
            @XmlAttribute(name = "AncillaryAirComponentDocID")
            protected String ancillaryAirComponentDocID;
            @XmlAttribute(name = "AncillaryAirComponentName")
            protected String ancillaryAirComponentName;
            @XmlAttribute(name = "Mandatory")
            protected String mandatory;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;

            /**
             * Gets the value of the ancillaryAirComponentCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAncillaryAirComponentCode() {
                return ancillaryAirComponentCode;
            }

            /**
             * Sets the value of the ancillaryAirComponentCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAncillaryAirComponentCode(String value) {
                this.ancillaryAirComponentCode = value;
            }

            /**
             * Gets the value of the ancillaryAirComponentDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAncillaryAirComponentDescription() {
                return ancillaryAirComponentDescription;
            }

            /**
             * Sets the value of the ancillaryAirComponentDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAncillaryAirComponentDescription(String value) {
                this.ancillaryAirComponentDescription = value;
            }

            /**
             * Gets the value of the ancillaryAirComponentDocID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAncillaryAirComponentDocID() {
                return ancillaryAirComponentDocID;
            }

            /**
             * Sets the value of the ancillaryAirComponentDocID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAncillaryAirComponentDocID(String value) {
                this.ancillaryAirComponentDocID = value;
            }

            /**
             * Gets the value of the ancillaryAirComponentName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAncillaryAirComponentName() {
                return ancillaryAirComponentName;
            }

            /**
             * Sets the value of the ancillaryAirComponentName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAncillaryAirComponentName(String value) {
                this.ancillaryAirComponentName = value;
            }

            /**
             * Gets the value of the mandatory property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMandatory() {
                return mandatory;
            }

            /**
             * Sets the value of the mandatory property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMandatory(String value) {
                this.mandatory = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Email">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EmailType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Phone">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="PhoneType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FormOfIdentification">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="FormOfIdentificationDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RemoteRef">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GuestDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GuestTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Smoking" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "email",
        "phone",
        "formOfIdentification",
        "remoteRef"
    })
    public static class Guest {

        @XmlElement(name = "Email", required = true)
        protected Reservation.Guest.Email email;
        @XmlElement(name = "Phone", required = true)
        protected Reservation.Guest.Phone phone;
        @XmlElement(name = "FormOfIdentification", required = true)
        protected Reservation.Guest.FormOfIdentification formOfIdentification;
        @XmlElement(name = "RemoteRef", required = true)
        protected Reservation.Guest.RemoteRef remoteRef;
        @XmlAttribute(name = "DateOfBirth")
        protected String dateOfBirth;
        @XmlAttribute(name = "FirstName")
        protected String firstName;
        @XmlAttribute(name = "GuestDocID")
        protected String guestDocID;
        @XmlAttribute(name = "GuestTypeCode")
        protected String guestTypeCode;
        @XmlAttribute(name = "LastName")
        protected String lastName;
        @XmlAttribute(name = "Sequence")
        protected Integer sequence;
        @XmlAttribute(name = "Smoking")
        protected String smoking;

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.Guest.Email }
         *     
         */
        public Reservation.Guest.Email getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.Guest.Email }
         *     
         */
        public void setEmail(Reservation.Guest.Email value) {
            this.email = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.Guest.Phone }
         *     
         */
        public Reservation.Guest.Phone getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.Guest.Phone }
         *     
         */
        public void setPhone(Reservation.Guest.Phone value) {
            this.phone = value;
        }

        /**
         * Gets the value of the formOfIdentification property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.Guest.FormOfIdentification }
         *     
         */
        public Reservation.Guest.FormOfIdentification getFormOfIdentification() {
            return formOfIdentification;
        }

        /**
         * Sets the value of the formOfIdentification property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.Guest.FormOfIdentification }
         *     
         */
        public void setFormOfIdentification(Reservation.Guest.FormOfIdentification value) {
            this.formOfIdentification = value;
        }

        /**
         * Gets the value of the remoteRef property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.Guest.RemoteRef }
         *     
         */
        public Reservation.Guest.RemoteRef getRemoteRef() {
            return remoteRef;
        }

        /**
         * Sets the value of the remoteRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.Guest.RemoteRef }
         *     
         */
        public void setRemoteRef(Reservation.Guest.RemoteRef value) {
            this.remoteRef = value;
        }

        /**
         * Gets the value of the dateOfBirth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateOfBirth() {
            return dateOfBirth;
        }

        /**
         * Sets the value of the dateOfBirth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateOfBirth(String value) {
            this.dateOfBirth = value;
        }

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the guestDocID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuestDocID() {
            return guestDocID;
        }

        /**
         * Sets the value of the guestDocID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuestDocID(String value) {
            this.guestDocID = value;
        }

        /**
         * Gets the value of the guestTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuestTypeCode() {
            return guestTypeCode;
        }

        /**
         * Sets the value of the guestTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuestTypeCode(String value) {
            this.guestTypeCode = value;
        }

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSequence(Integer value) {
            this.sequence = value;
        }

        /**
         * Gets the value of the smoking property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSmoking() {
            return smoking;
        }

        /**
         * Sets the value of the smoking property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSmoking(String value) {
            this.smoking = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EmailType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Email {

            @XmlAttribute(name = "Default")
            protected String _default;
            @XmlAttribute(name = "EmailAddress")
            protected String emailAddress;
            @XmlAttribute(name = "EmailType")
            protected String emailType;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "SyncStatus")
            protected String syncStatus;

            /**
             * Gets the value of the default property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefault() {
                return _default;
            }

            /**
             * Sets the value of the default property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefault(String value) {
                this._default = value;
            }

            /**
             * Gets the value of the emailAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmailAddress() {
                return emailAddress;
            }

            /**
             * Sets the value of the emailAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmailAddress(String value) {
                this.emailAddress = value;
            }

            /**
             * Gets the value of the emailType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmailType() {
                return emailType;
            }

            /**
             * Sets the value of the emailType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmailType(String value) {
                this.emailType = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the syncStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSyncStatus() {
                return syncStatus;
            }

            /**
             * Sets the value of the syncStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSyncStatus(String value) {
                this.syncStatus = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="FormOfIdentificationDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FormOfIdentification {

            @XmlAttribute(name = "DocNumber")
            protected Integer docNumber;
            @XmlAttribute(name = "FirstName")
            protected String firstName;
            @XmlAttribute(name = "FormOfIdentificationDocID")
            protected String formOfIdentificationDocID;
            @XmlAttribute(name = "LastName")
            protected String lastName;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "Type")
            protected String type;

            /**
             * Gets the value of the docNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDocNumber() {
                return docNumber;
            }

            /**
             * Sets the value of the docNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDocNumber(Integer value) {
                this.docNumber = value;
            }

            /**
             * Gets the value of the firstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstName() {
                return firstName;
            }

            /**
             * Sets the value of the firstName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstName(String value) {
                this.firstName = value;
            }

            /**
             * Gets the value of the formOfIdentificationDocID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormOfIdentificationDocID() {
                return formOfIdentificationDocID;
            }

            /**
             * Sets the value of the formOfIdentificationDocID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormOfIdentificationDocID(String value) {
                this.formOfIdentificationDocID = value;
            }

            /**
             * Gets the value of the lastName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastName() {
                return lastName;
            }

            /**
             * Sets the value of the lastName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastName(String value) {
                this.lastName = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="PhoneType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Phone {

            @XmlAttribute(name = "Default")
            protected String _default;
            @XmlAttribute(name = "PhoneNumber")
            protected Integer phoneNumber;
            @XmlAttribute(name = "PhoneType")
            protected String phoneType;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "SyncStatus")
            protected String syncStatus;

            /**
             * Gets the value of the default property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefault() {
                return _default;
            }

            /**
             * Sets the value of the default property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefault(String value) {
                this._default = value;
            }

            /**
             * Gets the value of the phoneNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPhoneNumber() {
                return phoneNumber;
            }

            /**
             * Sets the value of the phoneNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPhoneNumber(Integer value) {
                this.phoneNumber = value;
            }

            /**
             * Gets the value of the phoneType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhoneType() {
                return phoneType;
            }

            /**
             * Sets the value of the phoneType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhoneType(String value) {
                this.phoneType = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the syncStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSyncStatus() {
                return syncStatus;
            }

            /**
             * Sets the value of the syncStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSyncStatus(String value) {
                this.syncStatus = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RemoteRef {

            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "Value")
            protected Integer value;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setValue(Integer value) {
                this.value = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="BillingAllocation" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AllocatedAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="AllocatedRedemptionAmt">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="AmountInMoney" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="BillingAllocationDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ReservationComponentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ReservationComponentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PaymentSchedule" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BillingAllocationLink" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="BillingAllocationDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="BillingAllocationSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="AmountDue" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="CreditCardMerchantFeeAmount" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="EventDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EventSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="FormOfPayment" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PaymentDueDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="CustomerDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CustomerSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LastPrintedDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "billingAllocation",
        "paymentSchedule"
    })
    public static class Invoice {

        @XmlElement(name = "BillingAllocation", required = true)
        protected List<Reservation.Invoice.BillingAllocation> billingAllocation;
        @XmlElement(name = "PaymentSchedule", required = true)
        protected List<Reservation.Invoice.PaymentSchedule> paymentSchedule;
        @XmlAttribute(name = "CustomerDocRef")
        protected String customerDocRef;
        @XmlAttribute(name = "CustomerSequence")
        protected Integer customerSequence;
        @XmlAttribute(name = "InvoiceNumber")
        protected String invoiceNumber;
        @XmlAttribute(name = "LastPrintedDate")
        protected String lastPrintedDate;
        @XmlAttribute(name = "Sequence")
        protected Integer sequence;

        /**
         * Gets the value of the billingAllocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the billingAllocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBillingAllocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Reservation.Invoice.BillingAllocation }
         * 
         * 
         */
        public List<Reservation.Invoice.BillingAllocation> getBillingAllocation() {
            if (billingAllocation == null) {
                billingAllocation = new ArrayList<Reservation.Invoice.BillingAllocation>();
            }
            return this.billingAllocation;
        }

        /**
         * Gets the value of the paymentSchedule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentSchedule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentSchedule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Reservation.Invoice.PaymentSchedule }
         * 
         * 
         */
        public List<Reservation.Invoice.PaymentSchedule> getPaymentSchedule() {
            if (paymentSchedule == null) {
                paymentSchedule = new ArrayList<Reservation.Invoice.PaymentSchedule>();
            }
            return this.paymentSchedule;
        }

        /**
         * Gets the value of the customerDocRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerDocRef() {
            return customerDocRef;
        }

        /**
         * Sets the value of the customerDocRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerDocRef(String value) {
            this.customerDocRef = value;
        }

        /**
         * Gets the value of the customerSequence property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCustomerSequence() {
            return customerSequence;
        }

        /**
         * Sets the value of the customerSequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCustomerSequence(Integer value) {
            this.customerSequence = value;
        }

        /**
         * Gets the value of the invoiceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvoiceNumber() {
            return invoiceNumber;
        }

        /**
         * Sets the value of the invoiceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvoiceNumber(String value) {
            this.invoiceNumber = value;
        }

        /**
         * Gets the value of the lastPrintedDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastPrintedDate() {
            return lastPrintedDate;
        }

        /**
         * Sets the value of the lastPrintedDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastPrintedDate(String value) {
            this.lastPrintedDate = value;
        }

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSequence(Integer value) {
            this.sequence = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AllocatedAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="AllocatedRedemptionAmt">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="AmountInMoney" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="BillingAllocationDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ReservationComponentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ReservationComponentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "allocatedAmount",
            "allocatedRedemptionAmt"
        })
        public static class BillingAllocation {

            @XmlElement(name = "AllocatedAmount")
            protected int allocatedAmount;
            @XmlElement(name = "AllocatedRedemptionAmt", required = true)
            protected Reservation.Invoice.BillingAllocation.AllocatedRedemptionAmt allocatedRedemptionAmt;
            @XmlAttribute(name = "BillingAllocationDocID")
            protected String billingAllocationDocID;
            @XmlAttribute(name = "ReservationComponentDocRef")
            protected String reservationComponentDocRef;
            @XmlAttribute(name = "ReservationComponentSequence")
            protected Integer reservationComponentSequence;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;

            /**
             * Gets the value of the allocatedAmount property.
             * 
             */
            public int getAllocatedAmount() {
                return allocatedAmount;
            }

            /**
             * Sets the value of the allocatedAmount property.
             * 
             */
            public void setAllocatedAmount(int value) {
                this.allocatedAmount = value;
            }

            /**
             * Gets the value of the allocatedRedemptionAmt property.
             * 
             * @return
             *     possible object is
             *     {@link Reservation.Invoice.BillingAllocation.AllocatedRedemptionAmt }
             *     
             */
            public Reservation.Invoice.BillingAllocation.AllocatedRedemptionAmt getAllocatedRedemptionAmt() {
                return allocatedRedemptionAmt;
            }

            /**
             * Sets the value of the allocatedRedemptionAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link Reservation.Invoice.BillingAllocation.AllocatedRedemptionAmt }
             *     
             */
            public void setAllocatedRedemptionAmt(Reservation.Invoice.BillingAllocation.AllocatedRedemptionAmt value) {
                this.allocatedRedemptionAmt = value;
            }

            /**
             * Gets the value of the billingAllocationDocID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillingAllocationDocID() {
                return billingAllocationDocID;
            }

            /**
             * Sets the value of the billingAllocationDocID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillingAllocationDocID(String value) {
                this.billingAllocationDocID = value;
            }

            /**
             * Gets the value of the reservationComponentDocRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReservationComponentDocRef() {
                return reservationComponentDocRef;
            }

            /**
             * Sets the value of the reservationComponentDocRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReservationComponentDocRef(String value) {
                this.reservationComponentDocRef = value;
            }

            /**
             * Gets the value of the reservationComponentSequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getReservationComponentSequence() {
                return reservationComponentSequence;
            }

            /**
             * Sets the value of the reservationComponentSequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setReservationComponentSequence(Integer value) {
                this.reservationComponentSequence = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="AmountInMoney" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AllocatedRedemptionAmt {

                @XmlAttribute(name = "AmountInMoney")
                protected Integer amountInMoney;

                /**
                 * Gets the value of the amountInMoney property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getAmountInMoney() {
                    return amountInMoney;
                }

                /**
                 * Sets the value of the amountInMoney property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setAmountInMoney(Integer value) {
                    this.amountInMoney = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="BillingAllocationLink" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="BillingAllocationDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="BillingAllocationSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="AmountDue" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="CreditCardMerchantFeeAmount" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="EventDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EventSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="FormOfPayment" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PaymentDueDate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "billingAllocationLink"
        })
        public static class PaymentSchedule {

            @XmlElement(name = "BillingAllocationLink", required = true)
            protected List<Reservation.Invoice.PaymentSchedule.BillingAllocationLink> billingAllocationLink;
            @XmlAttribute(name = "AmountDue")
            protected Integer amountDue;
            @XmlAttribute(name = "CreditCardMerchantFeeAmount")
            protected Integer creditCardMerchantFeeAmount;
            @XmlAttribute(name = "EventDocRef")
            protected String eventDocRef;
            @XmlAttribute(name = "EventSequence")
            protected Integer eventSequence;
            @XmlAttribute(name = "FormOfPayment")
            protected String formOfPayment;
            @XmlAttribute(name = "PaymentDueDate")
            protected String paymentDueDate;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;

            /**
             * Gets the value of the billingAllocationLink property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the billingAllocationLink property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBillingAllocationLink().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Reservation.Invoice.PaymentSchedule.BillingAllocationLink }
             * 
             * 
             */
            public List<Reservation.Invoice.PaymentSchedule.BillingAllocationLink> getBillingAllocationLink() {
                if (billingAllocationLink == null) {
                    billingAllocationLink = new ArrayList<Reservation.Invoice.PaymentSchedule.BillingAllocationLink>();
                }
                return this.billingAllocationLink;
            }

            /**
             * Gets the value of the amountDue property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAmountDue() {
                return amountDue;
            }

            /**
             * Sets the value of the amountDue property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAmountDue(Integer value) {
                this.amountDue = value;
            }

            /**
             * Gets the value of the creditCardMerchantFeeAmount property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCreditCardMerchantFeeAmount() {
                return creditCardMerchantFeeAmount;
            }

            /**
             * Sets the value of the creditCardMerchantFeeAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCreditCardMerchantFeeAmount(Integer value) {
                this.creditCardMerchantFeeAmount = value;
            }

            /**
             * Gets the value of the eventDocRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEventDocRef() {
                return eventDocRef;
            }

            /**
             * Sets the value of the eventDocRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEventDocRef(String value) {
                this.eventDocRef = value;
            }

            /**
             * Gets the value of the eventSequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getEventSequence() {
                return eventSequence;
            }

            /**
             * Sets the value of the eventSequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setEventSequence(Integer value) {
                this.eventSequence = value;
            }

            /**
             * Gets the value of the formOfPayment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormOfPayment() {
                return formOfPayment;
            }

            /**
             * Sets the value of the formOfPayment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormOfPayment(String value) {
                this.formOfPayment = value;
            }

            /**
             * Gets the value of the paymentDueDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentDueDate() {
                return paymentDueDate;
            }

            /**
             * Sets the value of the paymentDueDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentDueDate(String value) {
                this.paymentDueDate = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="BillingAllocationDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="BillingAllocationSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class BillingAllocationLink {

                @XmlAttribute(name = "BillingAllocationDocRef")
                protected String billingAllocationDocRef;
                @XmlAttribute(name = "BillingAllocationSequence")
                protected Integer billingAllocationSequence;

                /**
                 * Gets the value of the billingAllocationDocRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBillingAllocationDocRef() {
                    return billingAllocationDocRef;
                }

                /**
                 * Sets the value of the billingAllocationDocRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBillingAllocationDocRef(String value) {
                    this.billingAllocationDocRef = value;
                }

                /**
                 * Gets the value of the billingAllocationSequence property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getBillingAllocationSequence() {
                    return billingAllocationSequence;
                }

                /**
                 * Sets the value of the billingAllocationSequence property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setBillingAllocationSequence(Integer value) {
                    this.billingAllocationSequence = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AirSegment">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="AirItinLegIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="AirItinSegmentIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EndAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EquipmentCode" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="NumberOfStops" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="SchedArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SchedDepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="StartAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ItinerarySegmentDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airSegment"
    })
    public static class ItinerarySegment {

        @XmlElement(name = "AirSegment", required = true)
        protected Reservation.ItinerarySegment.AirSegment airSegment;
        @XmlAttribute(name = "ItinerarySegmentDocID")
        protected String itinerarySegmentDocID;
        @XmlAttribute(name = "Sequence")
        protected Integer sequence;
        @XmlAttribute(name = "StartDateTime")
        protected String startDateTime;

        /**
         * Gets the value of the airSegment property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.ItinerarySegment.AirSegment }
         *     
         */
        public Reservation.ItinerarySegment.AirSegment getAirSegment() {
            return airSegment;
        }

        /**
         * Sets the value of the airSegment property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.ItinerarySegment.AirSegment }
         *     
         */
        public void setAirSegment(Reservation.ItinerarySegment.AirSegment value) {
            this.airSegment = value;
        }

        /**
         * Gets the value of the itinerarySegmentDocID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItinerarySegmentDocID() {
            return itinerarySegmentDocID;
        }

        /**
         * Sets the value of the itinerarySegmentDocID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItinerarySegmentDocID(String value) {
            this.itinerarySegmentDocID = value;
        }

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSequence(Integer value) {
            this.sequence = value;
        }

        /**
         * Gets the value of the startDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartDateTime() {
            return startDateTime;
        }

        /**
         * Sets the value of the startDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartDateTime(String value) {
            this.startDateTime = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="AirItinLegIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="AirItinSegmentIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EndAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EquipmentCode" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="NumberOfStops" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="SchedArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SchedDepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="StartAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AirSegment {

            @XmlAttribute(name = "AirItinLegIndex")
            protected Integer airItinLegIndex;
            @XmlAttribute(name = "AirItinSegmentIndex")
            protected Integer airItinSegmentIndex;
            @XmlAttribute(name = "CarrierCode")
            protected String carrierCode;
            @XmlAttribute(name = "EndAirportCode")
            protected String endAirportCode;
            @XmlAttribute(name = "EquipmentCode")
            protected Integer equipmentCode;
            @XmlAttribute(name = "FlightNumber")
            protected Integer flightNumber;
            @XmlAttribute(name = "NumberOfStops")
            protected Integer numberOfStops;
            @XmlAttribute(name = "SchedArrivalDateTime")
            protected String schedArrivalDateTime;
            @XmlAttribute(name = "SchedDepartureDateTime")
            protected String schedDepartureDateTime;
            @XmlAttribute(name = "StartAirportCode")
            protected String startAirportCode;

            /**
             * Gets the value of the airItinLegIndex property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAirItinLegIndex() {
                return airItinLegIndex;
            }

            /**
             * Sets the value of the airItinLegIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAirItinLegIndex(Integer value) {
                this.airItinLegIndex = value;
            }

            /**
             * Gets the value of the airItinSegmentIndex property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAirItinSegmentIndex() {
                return airItinSegmentIndex;
            }

            /**
             * Sets the value of the airItinSegmentIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAirItinSegmentIndex(Integer value) {
                this.airItinSegmentIndex = value;
            }

            /**
             * Gets the value of the carrierCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCarrierCode() {
                return carrierCode;
            }

            /**
             * Sets the value of the carrierCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCarrierCode(String value) {
                this.carrierCode = value;
            }

            /**
             * Gets the value of the endAirportCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEndAirportCode() {
                return endAirportCode;
            }

            /**
             * Sets the value of the endAirportCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEndAirportCode(String value) {
                this.endAirportCode = value;
            }

            /**
             * Gets the value of the equipmentCode property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getEquipmentCode() {
                return equipmentCode;
            }

            /**
             * Sets the value of the equipmentCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setEquipmentCode(Integer value) {
                this.equipmentCode = value;
            }

            /**
             * Gets the value of the flightNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getFlightNumber() {
                return flightNumber;
            }

            /**
             * Sets the value of the flightNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setFlightNumber(Integer value) {
                this.flightNumber = value;
            }

            /**
             * Gets the value of the numberOfStops property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumberOfStops() {
                return numberOfStops;
            }

            /**
             * Sets the value of the numberOfStops property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumberOfStops(Integer value) {
                this.numberOfStops = value;
            }

            /**
             * Gets the value of the schedArrivalDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchedArrivalDateTime() {
                return schedArrivalDateTime;
            }

            /**
             * Sets the value of the schedArrivalDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchedArrivalDateTime(String value) {
                this.schedArrivalDateTime = value;
            }

            /**
             * Gets the value of the schedDepartureDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchedDepartureDateTime() {
                return schedDepartureDateTime;
            }

            /**
             * Sets the value of the schedDepartureDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchedDepartureDateTime(String value) {
                this.schedDepartureDateTime = value;
            }

            /**
             * Gets the value of the startAirportCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStartAirportCode() {
                return startAirportCode;
            }

            /**
             * Sets the value of the startAirportCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStartAirportCode(String value) {
                this.startAirportCode = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FareRules">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SubSection">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Paragraph" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ParagraphNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="SubTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ArrivalAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DepartureAirport" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="FilingAirline" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RuleReference" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fareRules"
    })
    public static class ProviderRules {

        @XmlElement(name = "FareRules", required = true)
        protected Reservation.ProviderRules.FareRules fareRules;
        @XmlAttribute(name = "ArrivalAirport")
        protected String arrivalAirport;
        @XmlAttribute(name = "DepartureAirport")
        protected String departureAirport;
        @XmlAttribute(name = "DepartureDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar departureDate;
        @XmlAttribute(name = "FilingAirline")
        protected String filingAirline;
        @XmlAttribute(name = "ID")
        protected String id;
        @XmlAttribute(name = "RuleReference")
        protected String ruleReference;
        @XmlAttribute(name = "Sequence")
        protected Integer sequence;

        /**
         * Gets the value of the fareRules property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.ProviderRules.FareRules }
         *     
         */
        public Reservation.ProviderRules.FareRules getFareRules() {
            return fareRules;
        }

        /**
         * Sets the value of the fareRules property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.ProviderRules.FareRules }
         *     
         */
        public void setFareRules(Reservation.ProviderRules.FareRules value) {
            this.fareRules = value;
        }

        /**
         * Gets the value of the arrivalAirport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArrivalAirport() {
            return arrivalAirport;
        }

        /**
         * Sets the value of the arrivalAirport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArrivalAirport(String value) {
            this.arrivalAirport = value;
        }

        /**
         * Gets the value of the departureAirport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartureAirport() {
            return departureAirport;
        }

        /**
         * Sets the value of the departureAirport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartureAirport(String value) {
            this.departureAirport = value;
        }

        /**
         * Gets the value of the departureDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDepartureDate() {
            return departureDate;
        }

        /**
         * Sets the value of the departureDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDepartureDate(XMLGregorianCalendar value) {
            this.departureDate = value;
        }

        /**
         * Gets the value of the filingAirline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFilingAirline() {
            return filingAirline;
        }

        /**
         * Sets the value of the filingAirline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFilingAirline(String value) {
            this.filingAirline = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the ruleReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuleReference() {
            return ruleReference;
        }

        /**
         * Sets the value of the ruleReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuleReference(String value) {
            this.ruleReference = value;
        }

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSequence(Integer value) {
            this.sequence = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SubSection">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Paragraph" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ParagraphNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="SubTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "subSection"
        })
        public static class FareRules {

            @XmlElement(name = "SubSection", required = true)
            protected Reservation.ProviderRules.FareRules.SubSection subSection;

            /**
             * Gets the value of the subSection property.
             * 
             * @return
             *     possible object is
             *     {@link Reservation.ProviderRules.FareRules.SubSection }
             *     
             */
            public Reservation.ProviderRules.FareRules.SubSection getSubSection() {
                return subSection;
            }

            /**
             * Sets the value of the subSection property.
             * 
             * @param value
             *     allowed object is
             *     {@link Reservation.ProviderRules.FareRules.SubSection }
             *     
             */
            public void setSubSection(Reservation.ProviderRules.FareRules.SubSection value) {
                this.subSection = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Paragraph" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ParagraphNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="SubTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "paragraph"
            })
            public static class SubSection {

                @XmlElement(name = "Paragraph", required = true)
                protected List<Reservation.ProviderRules.FareRules.SubSection.Paragraph> paragraph;
                @XmlAttribute(name = "SubTitle")
                protected String subTitle;

                /**
                 * Gets the value of the paragraph property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the paragraph property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getParagraph().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Reservation.ProviderRules.FareRules.SubSection.Paragraph }
                 * 
                 * 
                 */
                public List<Reservation.ProviderRules.FareRules.SubSection.Paragraph> getParagraph() {
                    if (paragraph == null) {
                        paragraph = new ArrayList<Reservation.ProviderRules.FareRules.SubSection.Paragraph>();
                    }
                    return this.paragraph;
                }

                /**
                 * Gets the value of the subTitle property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubTitle() {
                    return subTitle;
                }

                /**
                 * Sets the value of the subTitle property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubTitle(String value) {
                    this.subTitle = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ParagraphNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "text"
                })
                public static class Paragraph {

                    @XmlElement(name = "Text", required = true)
                    protected String text;
                    @XmlAttribute(name = "Name")
                    protected String name;
                    @XmlAttribute(name = "ParagraphNumber")
                    protected Integer paragraphNumber;

                    /**
                     * Gets the value of the text property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getText() {
                        return text;
                    }

                    /**
                     * Sets the value of the text property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setText(String value) {
                        this.text = value;
                    }

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the paragraphNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getParagraphNumber() {
                        return paragraphNumber;
                    }

                    /**
                     * Sets the value of the paragraphNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setParagraphNumber(Integer value) {
                        this.paragraphNumber = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Event" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="EventCompletedDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EventEnteredDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EventID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EventTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="LastUpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Username" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ExtraInformation" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BookRemoteRef">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RemoteRefType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ItinerarySegmentLink">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="ItinerarySegmentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ItinerarySegmentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="SegmentType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TaxFee" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="ChargeableAmount" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="IsPartOfBaseFare" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="IsVAT" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="ServiceFee" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="TaxCollectTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="TaxFeeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="TaxFeeDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Policy" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CalculatedAmountDue">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="SellingPriceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="AbsoluteDeadlineDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ApplicationLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ApplicationPriority" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="AssessmentBasis" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ConsumerPaysProvider" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="GuaranteeNonChangingFares" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PercentToApply" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PolicyID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PolicyRetributionActionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PolicyTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PolicyTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RelativeDeadlineOffsetUOMCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RelativeDeadlineTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RelativeOffsetQuantity" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="ResidualValueApplication" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Unit">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UnitDetail">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TaxFeeDetail" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="ChargeableAmount" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="TaxFeeDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="TaxFeeSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="UOMCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PolicyLink" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="PolicyDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="PolicySequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="AirFareRulesDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AirFareRulesSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="DirectionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="FareAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="FareEndCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="FareFamilyDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="FareFamilySequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="FareLocationCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="FareStartCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PlatingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PriceByFareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PricingRateCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PricingSource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PricingSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ProviderRulesDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ProviderRulesSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="QuoteDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="SellingPriceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="UOMCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="UnitDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GuestComposition">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="GuestItinerarySegment">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AirInfo">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="ClassOfService" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="InventoryClass" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="OverrideSeatFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="FormOfIdentificationLink">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="FormOfIdentificationDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="FormOfIdentificationSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="AirSupplementaryElement">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SpecialServiceRequest">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="SendToVendor" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="UnitLink">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="UnitDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="UnitSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="GuestItinerarySegmentDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ItinerarySegmentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ItinerarySegmentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RemoteSystemFareQuotePTC">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="ContextCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="AgeAtFirstConsume" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="GuestCompositionID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="GuestDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="GuestSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="GuestTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="HostLastName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="IncrementalGuestNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="OverrideFirstName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="OverrideLastName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="QuotedPassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProviderPayment">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ExtraInformation" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="AmountPaid" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="CreditCardAuthorisationCode" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="CreditCardAuthorisationDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CreditCardCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DatePaid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EventSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="FormOfPaymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ProviderPaymentID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Document">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DocumentValue">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DocumentTaxDetail">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="SellingPriceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="TaxFeeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DocumentResCompUnitLink">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DocumentItinerarySegmentLink">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                               &lt;attribute name="CouponStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="GuestCompositionSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                               &lt;attribute name="GuestItinerarySegmentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="GuestItinerarySegmentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="ResComponentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="ResComponentUnitDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ResComponentUnitSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                     &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="DocumentValueType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="SellingPriceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ProviderPaymentLink">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="ProviderPaymentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ProviderPaymentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="DocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DocType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DocumentMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DocumentStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EventDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="EventSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="IssuedDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ManualIssue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="NameOnDocument" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PrimaryDocNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AirSupplementaryElement" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OtherServiceInformation">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SendToVendor" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="BookingMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ComponentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InternalStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InventorySystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LastUpdatedDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="ResComponentDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="SessionDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SessionSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="SourceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "event",
        "extraInformation",
        "bookRemoteRef",
        "itinerarySegmentLink",
        "taxFee",
        "policy",
        "unit",
        "guestComposition",
        "providerPayment",
        "document",
        "airSupplementaryElement"
    })
    public static class ResComponent {

        @XmlElement(name = "Event", required = true)
        protected List<Reservation.ResComponent.Event> event;
        @XmlElement(name = "ExtraInformation", required = true)
        protected List<Reservation.ResComponent.ExtraInformation> extraInformation;
        @XmlElement(name = "BookRemoteRef", required = true)
        protected Reservation.ResComponent.BookRemoteRef bookRemoteRef;
        @XmlElement(name = "ItinerarySegmentLink", required = true)
        protected Reservation.ResComponent.ItinerarySegmentLink itinerarySegmentLink;
        @XmlElement(name = "TaxFee", required = true)
        protected List<Reservation.ResComponent.TaxFee> taxFee;
        @XmlElement(name = "Policy", required = true)
        protected List<Reservation.ResComponent.Policy> policy;
        @XmlElement(name = "Unit", required = true)
        protected Reservation.ResComponent.Unit unit;
        @XmlElement(name = "GuestComposition", required = true)
        protected Reservation.ResComponent.GuestComposition guestComposition;
        @XmlElement(name = "ProviderPayment", required = true)
        protected Reservation.ResComponent.ProviderPayment providerPayment;
        @XmlElement(name = "Document", required = true)
        protected Reservation.ResComponent.Document document;
        @XmlElement(name = "AirSupplementaryElement", required = true)
        protected List<Reservation.ResComponent.AirSupplementaryElement> airSupplementaryElement;
        @XmlAttribute(name = "BookingMethod")
        protected String bookingMethod;
        @XmlAttribute(name = "ComponentTypeCode")
        protected String componentTypeCode;
        @XmlAttribute(name = "CreateDateTime")
        protected String createDateTime;
        @XmlAttribute(name = "InternalStatus")
        protected String internalStatus;
        @XmlAttribute(name = "InventorySystem")
        protected String inventorySystem;
        @XmlAttribute(name = "LastUpdatedDateTime")
        protected String lastUpdatedDateTime;
        @XmlAttribute(name = "ProductCode")
        protected String productCode;
        @XmlAttribute(name = "Quantity")
        protected Integer quantity;
        @XmlAttribute(name = "ResComponentDocID")
        protected String resComponentDocID;
        @XmlAttribute(name = "Sequence")
        protected String sequence;
        @XmlAttribute(name = "SessionDocRef")
        protected String sessionDocRef;
        @XmlAttribute(name = "SessionSequence")
        protected Integer sessionSequence;
        @XmlAttribute(name = "SourceCode")
        protected String sourceCode;
        @XmlAttribute(name = "Status")
        protected String status;

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
         * {@link Reservation.ResComponent.Event }
         * 
         * 
         */
        public List<Reservation.ResComponent.Event> getEvent() {
            if (event == null) {
                event = new ArrayList<Reservation.ResComponent.Event>();
            }
            return this.event;
        }

        /**
         * Gets the value of the extraInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extraInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtraInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Reservation.ResComponent.ExtraInformation }
         * 
         * 
         */
        public List<Reservation.ResComponent.ExtraInformation> getExtraInformation() {
            if (extraInformation == null) {
                extraInformation = new ArrayList<Reservation.ResComponent.ExtraInformation>();
            }
            return this.extraInformation;
        }

        /**
         * Gets the value of the bookRemoteRef property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.ResComponent.BookRemoteRef }
         *     
         */
        public Reservation.ResComponent.BookRemoteRef getBookRemoteRef() {
            return bookRemoteRef;
        }

        /**
         * Sets the value of the bookRemoteRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.ResComponent.BookRemoteRef }
         *     
         */
        public void setBookRemoteRef(Reservation.ResComponent.BookRemoteRef value) {
            this.bookRemoteRef = value;
        }

        /**
         * Gets the value of the itinerarySegmentLink property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.ResComponent.ItinerarySegmentLink }
         *     
         */
        public Reservation.ResComponent.ItinerarySegmentLink getItinerarySegmentLink() {
            return itinerarySegmentLink;
        }

        /**
         * Sets the value of the itinerarySegmentLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.ResComponent.ItinerarySegmentLink }
         *     
         */
        public void setItinerarySegmentLink(Reservation.ResComponent.ItinerarySegmentLink value) {
            this.itinerarySegmentLink = value;
        }

        /**
         * Gets the value of the taxFee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxFee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Reservation.ResComponent.TaxFee }
         * 
         * 
         */
        public List<Reservation.ResComponent.TaxFee> getTaxFee() {
            if (taxFee == null) {
                taxFee = new ArrayList<Reservation.ResComponent.TaxFee>();
            }
            return this.taxFee;
        }

        /**
         * Gets the value of the policy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the policy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPolicy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Reservation.ResComponent.Policy }
         * 
         * 
         */
        public List<Reservation.ResComponent.Policy> getPolicy() {
            if (policy == null) {
                policy = new ArrayList<Reservation.ResComponent.Policy>();
            }
            return this.policy;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.ResComponent.Unit }
         *     
         */
        public Reservation.ResComponent.Unit getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.ResComponent.Unit }
         *     
         */
        public void setUnit(Reservation.ResComponent.Unit value) {
            this.unit = value;
        }

        /**
         * Gets the value of the guestComposition property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.ResComponent.GuestComposition }
         *     
         */
        public Reservation.ResComponent.GuestComposition getGuestComposition() {
            return guestComposition;
        }

        /**
         * Sets the value of the guestComposition property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.ResComponent.GuestComposition }
         *     
         */
        public void setGuestComposition(Reservation.ResComponent.GuestComposition value) {
            this.guestComposition = value;
        }

        /**
         * Gets the value of the providerPayment property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.ResComponent.ProviderPayment }
         *     
         */
        public Reservation.ResComponent.ProviderPayment getProviderPayment() {
            return providerPayment;
        }

        /**
         * Sets the value of the providerPayment property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.ResComponent.ProviderPayment }
         *     
         */
        public void setProviderPayment(Reservation.ResComponent.ProviderPayment value) {
            this.providerPayment = value;
        }

        /**
         * Gets the value of the document property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.ResComponent.Document }
         *     
         */
        public Reservation.ResComponent.Document getDocument() {
            return document;
        }

        /**
         * Sets the value of the document property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.ResComponent.Document }
         *     
         */
        public void setDocument(Reservation.ResComponent.Document value) {
            this.document = value;
        }

        /**
         * Gets the value of the airSupplementaryElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airSupplementaryElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirSupplementaryElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Reservation.ResComponent.AirSupplementaryElement }
         * 
         * 
         */
        public List<Reservation.ResComponent.AirSupplementaryElement> getAirSupplementaryElement() {
            if (airSupplementaryElement == null) {
                airSupplementaryElement = new ArrayList<Reservation.ResComponent.AirSupplementaryElement>();
            }
            return this.airSupplementaryElement;
        }

        /**
         * Gets the value of the bookingMethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBookingMethod() {
            return bookingMethod;
        }

        /**
         * Sets the value of the bookingMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBookingMethod(String value) {
            this.bookingMethod = value;
        }

        /**
         * Gets the value of the componentTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComponentTypeCode() {
            return componentTypeCode;
        }

        /**
         * Sets the value of the componentTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComponentTypeCode(String value) {
            this.componentTypeCode = value;
        }

        /**
         * Gets the value of the createDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreateDateTime() {
            return createDateTime;
        }

        /**
         * Sets the value of the createDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreateDateTime(String value) {
            this.createDateTime = value;
        }

        /**
         * Gets the value of the internalStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInternalStatus() {
            return internalStatus;
        }

        /**
         * Sets the value of the internalStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInternalStatus(String value) {
            this.internalStatus = value;
        }

        /**
         * Gets the value of the inventorySystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInventorySystem() {
            return inventorySystem;
        }

        /**
         * Sets the value of the inventorySystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInventorySystem(String value) {
            this.inventorySystem = value;
        }

        /**
         * Gets the value of the lastUpdatedDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastUpdatedDateTime() {
            return lastUpdatedDateTime;
        }

        /**
         * Sets the value of the lastUpdatedDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastUpdatedDateTime(String value) {
            this.lastUpdatedDateTime = value;
        }

        /**
         * Gets the value of the productCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductCode() {
            return productCode;
        }

        /**
         * Sets the value of the productCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductCode(String value) {
            this.productCode = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQuantity(Integer value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the resComponentDocID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResComponentDocID() {
            return resComponentDocID;
        }

        /**
         * Sets the value of the resComponentDocID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResComponentDocID(String value) {
            this.resComponentDocID = value;
        }

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public String getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSequence(String value) {
            this.sequence = value;
        }

        /**
         * Gets the value of the sessionDocRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSessionDocRef() {
            return sessionDocRef;
        }

        /**
         * Sets the value of the sessionDocRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSessionDocRef(String value) {
            this.sessionDocRef = value;
        }

        /**
         * Gets the value of the sessionSequence property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSessionSequence() {
            return sessionSequence;
        }

        /**
         * Sets the value of the sessionSequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSessionSequence(Integer value) {
            this.sessionSequence = value;
        }

        /**
         * Gets the value of the sourceCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceCode() {
            return sourceCode;
        }

        /**
         * Sets the value of the sourceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceCode(String value) {
            this.sourceCode = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }
        @Override
        public String toString() {
            return "ReservationComponent" +
                    "\ncomponentTypeCode: " + componentTypeCode + 
                    "\ncreateDateTime:" + createDateTime +
                    "\ninternalStatus:" + internalStatus;
        }

        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="OtherServiceInformation">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="SendToVendor" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "otherServiceInformation"
        })
        public static class AirSupplementaryElement {

            @XmlElement(name = "OtherServiceInformation", required = true)
            protected Reservation.ResComponent.AirSupplementaryElement.OtherServiceInformation otherServiceInformation;
            @XmlAttribute(name = "SendToVendor")
            protected String sendToVendor;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "SyncStatus")
            protected String syncStatus;

            /**
             * Gets the value of the otherServiceInformation property.
             * 
             * @return
             *     possible object is
             *     {@link Reservation.ResComponent.AirSupplementaryElement.OtherServiceInformation }
             *     
             */
            public Reservation.ResComponent.AirSupplementaryElement.OtherServiceInformation getOtherServiceInformation() {
                return otherServiceInformation;
            }

            /**
             * Sets the value of the otherServiceInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link Reservation.ResComponent.AirSupplementaryElement.OtherServiceInformation }
             *     
             */
            public void setOtherServiceInformation(Reservation.ResComponent.AirSupplementaryElement.OtherServiceInformation value) {
                this.otherServiceInformation = value;
            }

            /**
             * Gets the value of the sendToVendor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSendToVendor() {
                return sendToVendor;
            }

            /**
             * Sets the value of the sendToVendor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSendToVendor(String value) {
                this.sendToVendor = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the syncStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSyncStatus() {
                return syncStatus;
            }

            /**
             * Sets the value of the syncStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSyncStatus(String value) {
                this.syncStatus = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class OtherServiceInformation {

                @XmlAttribute(name = "AirlineCode")
                protected String airlineCode;
                @XmlAttribute(name = "Text")
                protected String text;

                /**
                 * Gets the value of the airlineCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAirlineCode() {
                    return airlineCode;
                }

                /**
                 * Sets the value of the airlineCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAirlineCode(String value) {
                    this.airlineCode = value;
                }

                /**
                 * Gets the value of the text property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getText() {
                    return text;
                }

                /**
                 * Sets the value of the text property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setText(String value) {
                    this.text = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RemoteRefType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class BookRemoteRef {

            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "RemoteRefType")
            protected String remoteRefType;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "Value")
            protected String value;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the remoteRefType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemoteRefType() {
                return remoteRefType;
            }

            /**
             * Sets the value of the remoteRefType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemoteRefType(String value) {
                this.remoteRefType = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DocumentValue">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DocumentTaxDetail">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="SellingPriceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="TaxFeeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DocumentResCompUnitLink">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="DocumentItinerarySegmentLink">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                     &lt;attribute name="CouponStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="GuestCompositionSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                     &lt;attribute name="GuestItinerarySegmentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="GuestItinerarySegmentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="ResComponentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="ResComponentUnitDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ResComponentUnitSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="DocumentValueType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="SellingPriceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ProviderPaymentLink">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="ProviderPaymentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ProviderPaymentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="DocID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DocType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DocumentMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DocumentStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EventDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EventSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="IssuedDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ManualIssue" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="NameOnDocument" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PrimaryDocNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "documentValue",
            "providerPaymentLink"
        })
        public static class Document {

            @XmlElement(name = "DocumentValue", required = true)
            protected Reservation.ResComponent.Document.DocumentValue documentValue;
            @XmlElement(name = "ProviderPaymentLink", required = true)
            protected Reservation.ResComponent.Document.ProviderPaymentLink providerPaymentLink;
            @XmlAttribute(name = "DocID")
            protected String docID;
            @XmlAttribute(name = "DocType")
            protected String docType;
            @XmlAttribute(name = "DocumentMethod")
            protected String documentMethod;
            @XmlAttribute(name = "DocumentStatus")
            protected String documentStatus;
            @XmlAttribute(name = "EventDocRef")
            protected String eventDocRef;
            @XmlAttribute(name = "EventSequence")
            protected Integer eventSequence;
            @XmlAttribute(name = "IssuedDateTime")
            protected String issuedDateTime;
            @XmlAttribute(name = "ManualIssue")
            protected String manualIssue;
            @XmlAttribute(name = "NameOnDocument")
            protected String nameOnDocument;
            @XmlAttribute(name = "PrimaryDocNumber")
            protected String primaryDocNumber;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;

            /**
             * Gets the value of the documentValue property.
             * 
             * @return
             *     possible object is
             *     {@link Reservation.ResComponent.Document.DocumentValue }
             *     
             */
            public Reservation.ResComponent.Document.DocumentValue getDocumentValue() {
                return documentValue;
            }

            /**
             * Sets the value of the documentValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link Reservation.ResComponent.Document.DocumentValue }
             *     
             */
            public void setDocumentValue(Reservation.ResComponent.Document.DocumentValue value) {
                this.documentValue = value;
            }

            /**
             * Gets the value of the providerPaymentLink property.
             * 
             * @return
             *     possible object is
             *     {@link Reservation.ResComponent.Document.ProviderPaymentLink }
             *     
             */
            public Reservation.ResComponent.Document.ProviderPaymentLink getProviderPaymentLink() {
                return providerPaymentLink;
            }

            /**
             * Sets the value of the providerPaymentLink property.
             * 
             * @param value
             *     allowed object is
             *     {@link Reservation.ResComponent.Document.ProviderPaymentLink }
             *     
             */
            public void setProviderPaymentLink(Reservation.ResComponent.Document.ProviderPaymentLink value) {
                this.providerPaymentLink = value;
            }

            /**
             * Gets the value of the docID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocID() {
                return docID;
            }

            /**
             * Sets the value of the docID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocID(String value) {
                this.docID = value;
            }

            /**
             * Gets the value of the docType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocType() {
                return docType;
            }

            /**
             * Sets the value of the docType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocType(String value) {
                this.docType = value;
            }

            /**
             * Gets the value of the documentMethod property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentMethod() {
                return documentMethod;
            }

            /**
             * Sets the value of the documentMethod property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocumentMethod(String value) {
                this.documentMethod = value;
            }

            /**
             * Gets the value of the documentStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentStatus() {
                return documentStatus;
            }

            /**
             * Sets the value of the documentStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocumentStatus(String value) {
                this.documentStatus = value;
            }

            /**
             * Gets the value of the eventDocRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEventDocRef() {
                return eventDocRef;
            }

            /**
             * Sets the value of the eventDocRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEventDocRef(String value) {
                this.eventDocRef = value;
            }

            /**
             * Gets the value of the eventSequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getEventSequence() {
                return eventSequence;
            }

            /**
             * Sets the value of the eventSequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setEventSequence(Integer value) {
                this.eventSequence = value;
            }

            /**
             * Gets the value of the issuedDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIssuedDateTime() {
                return issuedDateTime;
            }

            /**
             * Sets the value of the issuedDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssuedDateTime(String value) {
                this.issuedDateTime = value;
            }

            /**
             * Gets the value of the manualIssue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getManualIssue() {
                return manualIssue;
            }

            /**
             * Sets the value of the manualIssue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setManualIssue(String value) {
                this.manualIssue = value;
            }

            /**
             * Gets the value of the nameOnDocument property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNameOnDocument() {
                return nameOnDocument;
            }

            /**
             * Sets the value of the nameOnDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNameOnDocument(String value) {
                this.nameOnDocument = value;
            }

            /**
             * Gets the value of the primaryDocNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrimaryDocNumber() {
                return primaryDocNumber;
            }

            /**
             * Sets the value of the primaryDocNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrimaryDocNumber(String value) {
                this.primaryDocNumber = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="DocumentTaxDetail">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="SellingPriceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="TaxFeeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DocumentResCompUnitLink">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="DocumentItinerarySegmentLink">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                           &lt;attribute name="CouponStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="GuestCompositionSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                           &lt;attribute name="GuestItinerarySegmentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="GuestItinerarySegmentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="ResComponentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="ResComponentUnitDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ResComponentUnitSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="DocumentValueType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="SellingPriceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "documentTaxDetail",
                "documentResCompUnitLink"
            })
            public static class DocumentValue {

                @XmlElement(name = "DocumentTaxDetail", required = true)
                protected Reservation.ResComponent.Document.DocumentValue.DocumentTaxDetail documentTaxDetail;
                @XmlElement(name = "DocumentResCompUnitLink", required = true)
                protected Reservation.ResComponent.Document.DocumentValue.DocumentResCompUnitLink documentResCompUnitLink;
                @XmlAttribute(name = "DocumentValueType")
                protected String documentValueType;
                @XmlAttribute(name = "SellingPrice")
                protected Integer sellingPrice;
                @XmlAttribute(name = "SellingPriceCurrencyCode")
                protected String sellingPriceCurrencyCode;
                @XmlAttribute(name = "Sequence")
                protected Integer sequence;
                @XmlAttribute(name = "TransactionDate")
                protected String transactionDate;

                /**
                 * Gets the value of the documentTaxDetail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Reservation.ResComponent.Document.DocumentValue.DocumentTaxDetail }
                 *     
                 */
                public Reservation.ResComponent.Document.DocumentValue.DocumentTaxDetail getDocumentTaxDetail() {
                    return documentTaxDetail;
                }

                /**
                 * Sets the value of the documentTaxDetail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Reservation.ResComponent.Document.DocumentValue.DocumentTaxDetail }
                 *     
                 */
                public void setDocumentTaxDetail(Reservation.ResComponent.Document.DocumentValue.DocumentTaxDetail value) {
                    this.documentTaxDetail = value;
                }

                /**
                 * Gets the value of the documentResCompUnitLink property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Reservation.ResComponent.Document.DocumentValue.DocumentResCompUnitLink }
                 *     
                 */
                public Reservation.ResComponent.Document.DocumentValue.DocumentResCompUnitLink getDocumentResCompUnitLink() {
                    return documentResCompUnitLink;
                }

                /**
                 * Sets the value of the documentResCompUnitLink property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Reservation.ResComponent.Document.DocumentValue.DocumentResCompUnitLink }
                 *     
                 */
                public void setDocumentResCompUnitLink(Reservation.ResComponent.Document.DocumentValue.DocumentResCompUnitLink value) {
                    this.documentResCompUnitLink = value;
                }

                /**
                 * Gets the value of the documentValueType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDocumentValueType() {
                    return documentValueType;
                }

                /**
                 * Sets the value of the documentValueType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDocumentValueType(String value) {
                    this.documentValueType = value;
                }

                /**
                 * Gets the value of the sellingPrice property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getSellingPrice() {
                    return sellingPrice;
                }

                /**
                 * Sets the value of the sellingPrice property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setSellingPrice(Integer value) {
                    this.sellingPrice = value;
                }

                /**
                 * Gets the value of the sellingPriceCurrencyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSellingPriceCurrencyCode() {
                    return sellingPriceCurrencyCode;
                }

                /**
                 * Sets the value of the sellingPriceCurrencyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSellingPriceCurrencyCode(String value) {
                    this.sellingPriceCurrencyCode = value;
                }

                /**
                 * Gets the value of the sequence property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getSequence() {
                    return sequence;
                }

                /**
                 * Sets the value of the sequence property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setSequence(Integer value) {
                    this.sequence = value;
                }

                /**
                 * Gets the value of the transactionDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransactionDate() {
                    return transactionDate;
                }

                /**
                 * Sets the value of the transactionDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransactionDate(String value) {
                    this.transactionDate = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="DocumentItinerarySegmentLink">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *                 &lt;attribute name="CouponStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="GuestCompositionSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *                 &lt;attribute name="GuestItinerarySegmentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="GuestItinerarySegmentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="ResComponentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="ResComponentUnitDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ResComponentUnitSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "documentItinerarySegmentLink"
                })
                public static class DocumentResCompUnitLink {

                    @XmlElement(name = "DocumentItinerarySegmentLink", required = true)
                    protected Reservation.ResComponent.Document.DocumentValue.DocumentResCompUnitLink.DocumentItinerarySegmentLink documentItinerarySegmentLink;
                    @XmlAttribute(name = "ResComponentSequence")
                    protected Integer resComponentSequence;
                    @XmlAttribute(name = "ResComponentUnitDocRef")
                    protected String resComponentUnitDocRef;
                    @XmlAttribute(name = "ResComponentUnitSequence")
                    protected Integer resComponentUnitSequence;
                    @XmlAttribute(name = "Sequence")
                    protected Integer sequence;

                    /**
                     * Gets the value of the documentItinerarySegmentLink property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Reservation.ResComponent.Document.DocumentValue.DocumentResCompUnitLink.DocumentItinerarySegmentLink }
                     *     
                     */
                    public Reservation.ResComponent.Document.DocumentValue.DocumentResCompUnitLink.DocumentItinerarySegmentLink getDocumentItinerarySegmentLink() {
                        return documentItinerarySegmentLink;
                    }

                    /**
                     * Sets the value of the documentItinerarySegmentLink property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Reservation.ResComponent.Document.DocumentValue.DocumentResCompUnitLink.DocumentItinerarySegmentLink }
                     *     
                     */
                    public void setDocumentItinerarySegmentLink(Reservation.ResComponent.Document.DocumentValue.DocumentResCompUnitLink.DocumentItinerarySegmentLink value) {
                        this.documentItinerarySegmentLink = value;
                    }

                    /**
                     * Gets the value of the resComponentSequence property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getResComponentSequence() {
                        return resComponentSequence;
                    }

                    /**
                     * Sets the value of the resComponentSequence property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setResComponentSequence(Integer value) {
                        this.resComponentSequence = value;
                    }

                    /**
                     * Gets the value of the resComponentUnitDocRef property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getResComponentUnitDocRef() {
                        return resComponentUnitDocRef;
                    }

                    /**
                     * Sets the value of the resComponentUnitDocRef property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setResComponentUnitDocRef(String value) {
                        this.resComponentUnitDocRef = value;
                    }

                    /**
                     * Gets the value of the resComponentUnitSequence property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getResComponentUnitSequence() {
                        return resComponentUnitSequence;
                    }

                    /**
                     * Sets the value of the resComponentUnitSequence property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setResComponentUnitSequence(Integer value) {
                        this.resComponentUnitSequence = value;
                    }

                    /**
                     * Gets the value of the sequence property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getSequence() {
                        return sequence;
                    }

                    /**
                     * Sets the value of the sequence property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setSequence(Integer value) {
                        this.sequence = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *       &lt;attribute name="CouponStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="GuestCompositionSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *       &lt;attribute name="GuestItinerarySegmentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="GuestItinerarySegmentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class DocumentItinerarySegmentLink {

                        @XmlAttribute(name = "CouponNumber")
                        protected Integer couponNumber;
                        @XmlAttribute(name = "CouponStatus")
                        protected String couponStatus;
                        @XmlAttribute(name = "GuestCompositionSequence")
                        protected Integer guestCompositionSequence;
                        @XmlAttribute(name = "GuestItinerarySegmentDocRef")
                        protected String guestItinerarySegmentDocRef;
                        @XmlAttribute(name = "GuestItinerarySegmentSequence")
                        protected Integer guestItinerarySegmentSequence;

                        /**
                         * Gets the value of the couponNumber property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *     
                         */
                        public Integer getCouponNumber() {
                            return couponNumber;
                        }

                        /**
                         * Sets the value of the couponNumber property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *     
                         */
                        public void setCouponNumber(Integer value) {
                            this.couponNumber = value;
                        }

                        /**
                         * Gets the value of the couponStatus property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCouponStatus() {
                            return couponStatus;
                        }

                        /**
                         * Sets the value of the couponStatus property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCouponStatus(String value) {
                            this.couponStatus = value;
                        }

                        /**
                         * Gets the value of the guestCompositionSequence property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *     
                         */
                        public Integer getGuestCompositionSequence() {
                            return guestCompositionSequence;
                        }

                        /**
                         * Sets the value of the guestCompositionSequence property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *     
                         */
                        public void setGuestCompositionSequence(Integer value) {
                            this.guestCompositionSequence = value;
                        }

                        /**
                         * Gets the value of the guestItinerarySegmentDocRef property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getGuestItinerarySegmentDocRef() {
                            return guestItinerarySegmentDocRef;
                        }

                        /**
                         * Sets the value of the guestItinerarySegmentDocRef property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setGuestItinerarySegmentDocRef(String value) {
                            this.guestItinerarySegmentDocRef = value;
                        }

                        /**
                         * Gets the value of the guestItinerarySegmentSequence property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *     
                         */
                        public Integer getGuestItinerarySegmentSequence() {
                            return guestItinerarySegmentSequence;
                        }

                        /**
                         * Sets the value of the guestItinerarySegmentSequence property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *     
                         */
                        public void setGuestItinerarySegmentSequence(Integer value) {
                            this.guestItinerarySegmentSequence = value;
                        }

                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="SellingPriceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="TaxFeeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class DocumentTaxDetail {

                    @XmlAttribute(name = "SellingPrice")
                    protected Integer sellingPrice;
                    @XmlAttribute(name = "SellingPriceCurrencyCode")
                    protected String sellingPriceCurrencyCode;
                    @XmlAttribute(name = "Sequence")
                    protected Integer sequence;
                    @XmlAttribute(name = "TaxFeeCode")
                    protected String taxFeeCode;

                    /**
                     * Gets the value of the sellingPrice property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getSellingPrice() {
                        return sellingPrice;
                    }

                    /**
                     * Sets the value of the sellingPrice property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setSellingPrice(Integer value) {
                        this.sellingPrice = value;
                    }

                    /**
                     * Gets the value of the sellingPriceCurrencyCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSellingPriceCurrencyCode() {
                        return sellingPriceCurrencyCode;
                    }

                    /**
                     * Sets the value of the sellingPriceCurrencyCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSellingPriceCurrencyCode(String value) {
                        this.sellingPriceCurrencyCode = value;
                    }

                    /**
                     * Gets the value of the sequence property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getSequence() {
                        return sequence;
                    }

                    /**
                     * Sets the value of the sequence property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setSequence(Integer value) {
                        this.sequence = value;
                    }

                    /**
                     * Gets the value of the taxFeeCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTaxFeeCode() {
                        return taxFeeCode;
                    }

                    /**
                     * Sets the value of the taxFeeCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTaxFeeCode(String value) {
                        this.taxFeeCode = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="ProviderPaymentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ProviderPaymentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ProviderPaymentLink {

                @XmlAttribute(name = "ProviderPaymentDocRef")
                protected String providerPaymentDocRef;
                @XmlAttribute(name = "ProviderPaymentSequence")
                protected Integer providerPaymentSequence;

                /**
                 * Gets the value of the providerPaymentDocRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProviderPaymentDocRef() {
                    return providerPaymentDocRef;
                }

                /**
                 * Sets the value of the providerPaymentDocRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProviderPaymentDocRef(String value) {
                    this.providerPaymentDocRef = value;
                }

                /**
                 * Gets the value of the providerPaymentSequence property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getProviderPaymentSequence() {
                    return providerPaymentSequence;
                }

                /**
                 * Sets the value of the providerPaymentSequence property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setProviderPaymentSequence(Integer value) {
                    this.providerPaymentSequence = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="EventCompletedDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EventEnteredDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EventID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EventTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="LastUpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Username" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Event {

            @XmlAttribute(name = "EventCompletedDateTime")
            protected String eventCompletedDateTime;
            @XmlAttribute(name = "EventEnteredDateTime")
            protected String eventEnteredDateTime;
            @XmlAttribute(name = "EventID")
            protected String eventID;
            @XmlAttribute(name = "EventTypeCode")
            protected String eventTypeCode;
            @XmlAttribute(name = "LastUpdateDateTime")
            protected String lastUpdateDateTime;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "Source")
            protected String source;
            @XmlAttribute(name = "Username")
            protected Integer username;

            /**
             * Gets the value of the eventCompletedDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEventCompletedDateTime() {
                return eventCompletedDateTime;
            }

            /**
             * Sets the value of the eventCompletedDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEventCompletedDateTime(String value) {
                this.eventCompletedDateTime = value;
            }

            /**
             * Gets the value of the eventEnteredDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEventEnteredDateTime() {
                return eventEnteredDateTime;
            }

            /**
             * Sets the value of the eventEnteredDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEventEnteredDateTime(String value) {
                this.eventEnteredDateTime = value;
            }

            /**
             * Gets the value of the eventID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEventID() {
                return eventID;
            }

            /**
             * Sets the value of the eventID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEventID(String value) {
                this.eventID = value;
            }

            /**
             * Gets the value of the eventTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEventTypeCode() {
                return eventTypeCode;
            }

            /**
             * Sets the value of the eventTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEventTypeCode(String value) {
                this.eventTypeCode = value;
            }

            /**
             * Gets the value of the lastUpdateDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastUpdateDateTime() {
                return lastUpdateDateTime;
            }

            /**
             * Sets the value of the lastUpdateDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastUpdateDateTime(String value) {
                this.lastUpdateDateTime = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the source property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSource() {
                return source;
            }

            /**
             * Sets the value of the source property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSource(String value) {
                this.source = value;
            }

            /**
             * Gets the value of the username property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getUsername() {
                return username;
            }

            /**
             * Sets the value of the username property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setUsername(Integer value) {
                this.username = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ExtraInformation {

            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "Value")
            protected String value;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="GuestItinerarySegment">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AirInfo">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="ClassOfService" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="InventoryClass" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="OverrideSeatFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="FormOfIdentificationLink">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="FormOfIdentificationDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="FormOfIdentificationSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="AirSupplementaryElement">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="SpecialServiceRequest">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="SendToVendor" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="UnitLink">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="UnitDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="UnitSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="GuestItinerarySegmentDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ItinerarySegmentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ItinerarySegmentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RemoteSystemFareQuotePTC">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="ContextCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="AgeAtFirstConsume" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="GuestCompositionID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="GuestDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="GuestSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="GuestTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="HostLastName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="IncrementalGuestNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="OverrideFirstName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="OverrideLastName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="QuotedPassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "guestItinerarySegment",
            "remoteSystemFareQuotePTC"
        })
        public static class GuestComposition {

            @XmlElement(name = "GuestItinerarySegment", required = true)
            protected Reservation.ResComponent.GuestComposition.GuestItinerarySegment guestItinerarySegment;
            @XmlElement(name = "RemoteSystemFareQuotePTC", required = true)
            protected Reservation.ResComponent.GuestComposition.RemoteSystemFareQuotePTC remoteSystemFareQuotePTC;
            @XmlAttribute(name = "AgeAtFirstConsume")
            protected Integer ageAtFirstConsume;
            @XmlAttribute(name = "DateOfBirth")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateOfBirth;
            @XmlAttribute(name = "GuestCompositionID")
            protected String guestCompositionID;
            @XmlAttribute(name = "GuestDocRef")
            protected String guestDocRef;
            @XmlAttribute(name = "GuestSequence")
            protected Integer guestSequence;
            @XmlAttribute(name = "GuestTypeCode")
            protected String guestTypeCode;
            @XmlAttribute(name = "HostLastName")
            protected String hostLastName;
            @XmlAttribute(name = "IncrementalGuestNumber")
            protected Integer incrementalGuestNumber;
            @XmlAttribute(name = "OverrideFirstName")
            protected String overrideFirstName;
            @XmlAttribute(name = "OverrideLastName")
            protected String overrideLastName;
            @XmlAttribute(name = "QuotedPassengerTypeCode")
            protected String quotedPassengerTypeCode;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "SyncStatus")
            protected String syncStatus;

            /**
             * Gets the value of the guestItinerarySegment property.
             * 
             * @return
             *     possible object is
             *     {@link Reservation.ResComponent.GuestComposition.GuestItinerarySegment }
             *     
             */
            public Reservation.ResComponent.GuestComposition.GuestItinerarySegment getGuestItinerarySegment() {
                return guestItinerarySegment;
            }

            /**
             * Sets the value of the guestItinerarySegment property.
             * 
             * @param value
             *     allowed object is
             *     {@link Reservation.ResComponent.GuestComposition.GuestItinerarySegment }
             *     
             */
            public void setGuestItinerarySegment(Reservation.ResComponent.GuestComposition.GuestItinerarySegment value) {
                this.guestItinerarySegment = value;
            }

            /**
             * Gets the value of the remoteSystemFareQuotePTC property.
             * 
             * @return
             *     possible object is
             *     {@link Reservation.ResComponent.GuestComposition.RemoteSystemFareQuotePTC }
             *     
             */
            public Reservation.ResComponent.GuestComposition.RemoteSystemFareQuotePTC getRemoteSystemFareQuotePTC() {
                return remoteSystemFareQuotePTC;
            }

            /**
             * Sets the value of the remoteSystemFareQuotePTC property.
             * 
             * @param value
             *     allowed object is
             *     {@link Reservation.ResComponent.GuestComposition.RemoteSystemFareQuotePTC }
             *     
             */
            public void setRemoteSystemFareQuotePTC(Reservation.ResComponent.GuestComposition.RemoteSystemFareQuotePTC value) {
                this.remoteSystemFareQuotePTC = value;
            }

            /**
             * Gets the value of the ageAtFirstConsume property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAgeAtFirstConsume() {
                return ageAtFirstConsume;
            }

            /**
             * Sets the value of the ageAtFirstConsume property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAgeAtFirstConsume(Integer value) {
                this.ageAtFirstConsume = value;
            }

            /**
             * Gets the value of the dateOfBirth property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateOfBirth() {
                return dateOfBirth;
            }

            /**
             * Sets the value of the dateOfBirth property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateOfBirth(XMLGregorianCalendar value) {
                this.dateOfBirth = value;
            }

            /**
             * Gets the value of the guestCompositionID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGuestCompositionID() {
                return guestCompositionID;
            }

            /**
             * Sets the value of the guestCompositionID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGuestCompositionID(String value) {
                this.guestCompositionID = value;
            }

            /**
             * Gets the value of the guestDocRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGuestDocRef() {
                return guestDocRef;
            }

            /**
             * Sets the value of the guestDocRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGuestDocRef(String value) {
                this.guestDocRef = value;
            }

            /**
             * Gets the value of the guestSequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getGuestSequence() {
                return guestSequence;
            }

            /**
             * Sets the value of the guestSequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setGuestSequence(Integer value) {
                this.guestSequence = value;
            }

            /**
             * Gets the value of the guestTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGuestTypeCode() {
                return guestTypeCode;
            }

            /**
             * Sets the value of the guestTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGuestTypeCode(String value) {
                this.guestTypeCode = value;
            }

            /**
             * Gets the value of the hostLastName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHostLastName() {
                return hostLastName;
            }

            /**
             * Sets the value of the hostLastName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHostLastName(String value) {
                this.hostLastName = value;
            }

            /**
             * Gets the value of the incrementalGuestNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getIncrementalGuestNumber() {
                return incrementalGuestNumber;
            }

            /**
             * Sets the value of the incrementalGuestNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setIncrementalGuestNumber(Integer value) {
                this.incrementalGuestNumber = value;
            }

            /**
             * Gets the value of the overrideFirstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOverrideFirstName() {
                return overrideFirstName;
            }

            /**
             * Sets the value of the overrideFirstName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOverrideFirstName(String value) {
                this.overrideFirstName = value;
            }

            /**
             * Gets the value of the overrideLastName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOverrideLastName() {
                return overrideLastName;
            }

            /**
             * Sets the value of the overrideLastName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOverrideLastName(String value) {
                this.overrideLastName = value;
            }

            /**
             * Gets the value of the quotedPassengerTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuotedPassengerTypeCode() {
                return quotedPassengerTypeCode;
            }

            /**
             * Sets the value of the quotedPassengerTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuotedPassengerTypeCode(String value) {
                this.quotedPassengerTypeCode = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the syncStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSyncStatus() {
                return syncStatus;
            }

            /**
             * Sets the value of the syncStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSyncStatus(String value) {
                this.syncStatus = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="AirInfo">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="ClassOfService" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="InventoryClass" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="OverrideSeatFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="FormOfIdentificationLink">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="FormOfIdentificationDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="FormOfIdentificationSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="AirSupplementaryElement">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="SpecialServiceRequest">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="SendToVendor" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="UnitLink">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="UnitDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="UnitSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="GuestItinerarySegmentDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ItinerarySegmentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ItinerarySegmentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "airInfo",
                "formOfIdentificationLink",
                "airSupplementaryElement",
                "unitLink"
            })
            public static class GuestItinerarySegment {

                @XmlElement(name = "AirInfo", required = true)
                protected Reservation.ResComponent.GuestComposition.GuestItinerarySegment.AirInfo airInfo;
                @XmlElement(name = "FormOfIdentificationLink", required = true)
                protected Reservation.ResComponent.GuestComposition.GuestItinerarySegment.FormOfIdentificationLink formOfIdentificationLink;
                @XmlElement(name = "AirSupplementaryElement", required = true)
                protected Reservation.ResComponent.GuestComposition.GuestItinerarySegment.AirSupplementaryElement airSupplementaryElement;
                @XmlElement(name = "UnitLink", required = true)
                protected Reservation.ResComponent.GuestComposition.GuestItinerarySegment.UnitLink unitLink;
                @XmlAttribute(name = "GuestItinerarySegmentDocID")
                protected String guestItinerarySegmentDocID;
                @XmlAttribute(name = "ItinerarySegmentDocRef")
                protected String itinerarySegmentDocRef;
                @XmlAttribute(name = "ItinerarySegmentSequence")
                protected Integer itinerarySegmentSequence;
                @XmlAttribute(name = "Sequence")
                protected Integer sequence;
                @XmlAttribute(name = "Status")
                protected String status;

                /**
                 * Gets the value of the airInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Reservation.ResComponent.GuestComposition.GuestItinerarySegment.AirInfo }
                 *     
                 */
                public Reservation.ResComponent.GuestComposition.GuestItinerarySegment.AirInfo getAirInfo() {
                    return airInfo;
                }

                /**
                 * Sets the value of the airInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Reservation.ResComponent.GuestComposition.GuestItinerarySegment.AirInfo }
                 *     
                 */
                public void setAirInfo(Reservation.ResComponent.GuestComposition.GuestItinerarySegment.AirInfo value) {
                    this.airInfo = value;
                }

                /**
                 * Gets the value of the formOfIdentificationLink property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Reservation.ResComponent.GuestComposition.GuestItinerarySegment.FormOfIdentificationLink }
                 *     
                 */
                public Reservation.ResComponent.GuestComposition.GuestItinerarySegment.FormOfIdentificationLink getFormOfIdentificationLink() {
                    return formOfIdentificationLink;
                }

                /**
                 * Sets the value of the formOfIdentificationLink property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Reservation.ResComponent.GuestComposition.GuestItinerarySegment.FormOfIdentificationLink }
                 *     
                 */
                public void setFormOfIdentificationLink(Reservation.ResComponent.GuestComposition.GuestItinerarySegment.FormOfIdentificationLink value) {
                    this.formOfIdentificationLink = value;
                }

                /**
                 * Gets the value of the airSupplementaryElement property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Reservation.ResComponent.GuestComposition.GuestItinerarySegment.AirSupplementaryElement }
                 *     
                 */
                public Reservation.ResComponent.GuestComposition.GuestItinerarySegment.AirSupplementaryElement getAirSupplementaryElement() {
                    return airSupplementaryElement;
                }

                /**
                 * Sets the value of the airSupplementaryElement property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Reservation.ResComponent.GuestComposition.GuestItinerarySegment.AirSupplementaryElement }
                 *     
                 */
                public void setAirSupplementaryElement(Reservation.ResComponent.GuestComposition.GuestItinerarySegment.AirSupplementaryElement value) {
                    this.airSupplementaryElement = value;
                }

                /**
                 * Gets the value of the unitLink property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Reservation.ResComponent.GuestComposition.GuestItinerarySegment.UnitLink }
                 *     
                 */
                public Reservation.ResComponent.GuestComposition.GuestItinerarySegment.UnitLink getUnitLink() {
                    return unitLink;
                }

                /**
                 * Sets the value of the unitLink property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Reservation.ResComponent.GuestComposition.GuestItinerarySegment.UnitLink }
                 *     
                 */
                public void setUnitLink(Reservation.ResComponent.GuestComposition.GuestItinerarySegment.UnitLink value) {
                    this.unitLink = value;
                }

                /**
                 * Gets the value of the guestItinerarySegmentDocID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGuestItinerarySegmentDocID() {
                    return guestItinerarySegmentDocID;
                }

                /**
                 * Sets the value of the guestItinerarySegmentDocID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGuestItinerarySegmentDocID(String value) {
                    this.guestItinerarySegmentDocID = value;
                }

                /**
                 * Gets the value of the itinerarySegmentDocRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItinerarySegmentDocRef() {
                    return itinerarySegmentDocRef;
                }

                /**
                 * Sets the value of the itinerarySegmentDocRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItinerarySegmentDocRef(String value) {
                    this.itinerarySegmentDocRef = value;
                }

                /**
                 * Gets the value of the itinerarySegmentSequence property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getItinerarySegmentSequence() {
                    return itinerarySegmentSequence;
                }

                /**
                 * Sets the value of the itinerarySegmentSequence property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setItinerarySegmentSequence(Integer value) {
                    this.itinerarySegmentSequence = value;
                }

                /**
                 * Gets the value of the sequence property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getSequence() {
                    return sequence;
                }

                /**
                 * Sets the value of the sequence property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setSequence(Integer value) {
                    this.sequence = value;
                }

                /**
                 * Gets the value of the status property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatus() {
                    return status;
                }

                /**
                 * Sets the value of the status property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatus(String value) {
                    this.status = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="ClassOfService" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="InventoryClass" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="OverrideSeatFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class AirInfo {

                    @XmlAttribute(name = "ClassOfService")
                    protected String classOfService;
                    @XmlAttribute(name = "InventoryClass")
                    protected String inventoryClass;
                    @XmlAttribute(name = "OverrideSeatFlag")
                    protected String overrideSeatFlag;

                    /**
                     * Gets the value of the classOfService property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getClassOfService() {
                        return classOfService;
                    }

                    /**
                     * Sets the value of the classOfService property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setClassOfService(String value) {
                        this.classOfService = value;
                    }

                    /**
                     * Gets the value of the inventoryClass property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInventoryClass() {
                        return inventoryClass;
                    }

                    /**
                     * Sets the value of the inventoryClass property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInventoryClass(String value) {
                        this.inventoryClass = value;
                    }

                    /**
                     * Gets the value of the overrideSeatFlag property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOverrideSeatFlag() {
                        return overrideSeatFlag;
                    }

                    /**
                     * Sets the value of the overrideSeatFlag property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOverrideSeatFlag(String value) {
                        this.overrideSeatFlag = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="SpecialServiceRequest">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="SendToVendor" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "specialServiceRequest"
                })
                public static class AirSupplementaryElement {

                    @XmlElement(name = "SpecialServiceRequest", required = true)
                    protected Reservation.ResComponent.GuestComposition.GuestItinerarySegment.AirSupplementaryElement.SpecialServiceRequest specialServiceRequest;
                    @XmlAttribute(name = "SendToVendor")
                    protected String sendToVendor;
                    @XmlAttribute(name = "Sequence")
                    protected Integer sequence;
                    @XmlAttribute(name = "SyncStatus")
                    protected String syncStatus;

                    /**
                     * Gets the value of the specialServiceRequest property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Reservation.ResComponent.GuestComposition.GuestItinerarySegment.AirSupplementaryElement.SpecialServiceRequest }
                     *     
                     */
                    public Reservation.ResComponent.GuestComposition.GuestItinerarySegment.AirSupplementaryElement.SpecialServiceRequest getSpecialServiceRequest() {
                        return specialServiceRequest;
                    }

                    /**
                     * Sets the value of the specialServiceRequest property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Reservation.ResComponent.GuestComposition.GuestItinerarySegment.AirSupplementaryElement.SpecialServiceRequest }
                     *     
                     */
                    public void setSpecialServiceRequest(Reservation.ResComponent.GuestComposition.GuestItinerarySegment.AirSupplementaryElement.SpecialServiceRequest value) {
                        this.specialServiceRequest = value;
                    }

                    /**
                     * Gets the value of the sendToVendor property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSendToVendor() {
                        return sendToVendor;
                    }

                    /**
                     * Sets the value of the sendToVendor property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSendToVendor(String value) {
                        this.sendToVendor = value;
                    }

                    /**
                     * Gets the value of the sequence property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getSequence() {
                        return sequence;
                    }

                    /**
                     * Sets the value of the sequence property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setSequence(Integer value) {
                        this.sequence = value;
                    }

                    /**
                     * Gets the value of the syncStatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSyncStatus() {
                        return syncStatus;
                    }

                    /**
                     * Sets the value of the syncStatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSyncStatus(String value) {
                        this.syncStatus = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class SpecialServiceRequest {

                        @XmlAttribute(name = "AirlineCode")
                        protected String airlineCode;
                        @XmlAttribute(name = "Code")
                        protected String code;
                        @XmlAttribute(name = "Status")
                        protected String status;
                        @XmlAttribute(name = "Text")
                        protected String text;

                        /**
                         * Gets the value of the airlineCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAirlineCode() {
                            return airlineCode;
                        }

                        /**
                         * Sets the value of the airlineCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAirlineCode(String value) {
                            this.airlineCode = value;
                        }

                        /**
                         * Gets the value of the code property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCode() {
                            return code;
                        }

                        /**
                         * Sets the value of the code property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCode(String value) {
                            this.code = value;
                        }

                        /**
                         * Gets the value of the status property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getStatus() {
                            return status;
                        }

                        /**
                         * Sets the value of the status property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setStatus(String value) {
                            this.status = value;
                        }

                        /**
                         * Gets the value of the text property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getText() {
                            return text;
                        }

                        /**
                         * Sets the value of the text property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setText(String value) {
                            this.text = value;
                        }

                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="FormOfIdentificationDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="FormOfIdentificationSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FormOfIdentificationLink {

                    @XmlAttribute(name = "FormOfIdentificationDocRef")
                    protected String formOfIdentificationDocRef;
                    @XmlAttribute(name = "FormOfIdentificationSequence")
                    protected Integer formOfIdentificationSequence;
                    @XmlAttribute(name = "Sequence")
                    protected Integer sequence;
                    @XmlAttribute(name = "SyncStatus")
                    protected String syncStatus;

                    /**
                     * Gets the value of the formOfIdentificationDocRef property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFormOfIdentificationDocRef() {
                        return formOfIdentificationDocRef;
                    }

                    /**
                     * Sets the value of the formOfIdentificationDocRef property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFormOfIdentificationDocRef(String value) {
                        this.formOfIdentificationDocRef = value;
                    }

                    /**
                     * Gets the value of the formOfIdentificationSequence property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getFormOfIdentificationSequence() {
                        return formOfIdentificationSequence;
                    }

                    /**
                     * Sets the value of the formOfIdentificationSequence property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setFormOfIdentificationSequence(Integer value) {
                        this.formOfIdentificationSequence = value;
                    }

                    /**
                     * Gets the value of the sequence property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getSequence() {
                        return sequence;
                    }

                    /**
                     * Sets the value of the sequence property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setSequence(Integer value) {
                        this.sequence = value;
                    }

                    /**
                     * Gets the value of the syncStatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSyncStatus() {
                        return syncStatus;
                    }

                    /**
                     * Sets the value of the syncStatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSyncStatus(String value) {
                        this.syncStatus = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="UnitDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="UnitSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class UnitLink {

                    @XmlAttribute(name = "UnitDocRef")
                    protected String unitDocRef;
                    @XmlAttribute(name = "UnitSequence")
                    protected Integer unitSequence;

                    /**
                     * Gets the value of the unitDocRef property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUnitDocRef() {
                        return unitDocRef;
                    }

                    /**
                     * Sets the value of the unitDocRef property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUnitDocRef(String value) {
                        this.unitDocRef = value;
                    }

                    /**
                     * Gets the value of the unitSequence property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getUnitSequence() {
                        return unitSequence;
                    }

                    /**
                     * Sets the value of the unitSequence property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setUnitSequence(Integer value) {
                        this.unitSequence = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="ContextCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RemoteSystemFareQuotePTC {

                @XmlAttribute(name = "ContextCode")
                protected String contextCode;
                @XmlAttribute(name = "PassengerTypeCode")
                protected String passengerTypeCode;
                @XmlAttribute(name = "Sequence")
                protected Integer sequence;

                /**
                 * Gets the value of the contextCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContextCode() {
                    return contextCode;
                }

                /**
                 * Sets the value of the contextCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContextCode(String value) {
                    this.contextCode = value;
                }

                /**
                 * Gets the value of the passengerTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPassengerTypeCode() {
                    return passengerTypeCode;
                }

                /**
                 * Sets the value of the passengerTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPassengerTypeCode(String value) {
                    this.passengerTypeCode = value;
                }

                /**
                 * Gets the value of the sequence property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getSequence() {
                    return sequence;
                }

                /**
                 * Sets the value of the sequence property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setSequence(Integer value) {
                    this.sequence = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="ItinerarySegmentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ItinerarySegmentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="SegmentType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ItinerarySegmentLink {

            @XmlAttribute(name = "DisplayOrder")
            protected Integer displayOrder;
            @XmlAttribute(name = "ItinerarySegmentDocRef")
            protected String itinerarySegmentDocRef;
            @XmlAttribute(name = "ItinerarySegmentSequence")
            protected Integer itinerarySegmentSequence;
            @XmlAttribute(name = "SegmentType")
            protected String segmentType;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;

            /**
             * Gets the value of the displayOrder property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDisplayOrder() {
                return displayOrder;
            }

            /**
             * Sets the value of the displayOrder property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDisplayOrder(Integer value) {
                this.displayOrder = value;
            }

            /**
             * Gets the value of the itinerarySegmentDocRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItinerarySegmentDocRef() {
                return itinerarySegmentDocRef;
            }

            /**
             * Sets the value of the itinerarySegmentDocRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItinerarySegmentDocRef(String value) {
                this.itinerarySegmentDocRef = value;
            }

            /**
             * Gets the value of the itinerarySegmentSequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getItinerarySegmentSequence() {
                return itinerarySegmentSequence;
            }

            /**
             * Sets the value of the itinerarySegmentSequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setItinerarySegmentSequence(Integer value) {
                this.itinerarySegmentSequence = value;
            }

            /**
             * Gets the value of the segmentType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSegmentType() {
                return segmentType;
            }

            /**
             * Sets the value of the segmentType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSegmentType(String value) {
                this.segmentType = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CalculatedAmountDue">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="SellingPriceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="AbsoluteDeadlineDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ApplicationLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ApplicationPriority" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="AssessmentBasis" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ConsumerPaysProvider" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="GuaranteeNonChangingFares" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PercentToApply" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PolicyID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PolicyRetributionActionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PolicyTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PolicyTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RelativeDeadlineOffsetUOMCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RelativeDeadlineTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RelativeOffsetQuantity" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="ResidualValueApplication" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "calculatedAmountDue"
        })
        public static class Policy {

            @XmlElement(name = "CalculatedAmountDue", required = true)
            protected Reservation.ResComponent.Policy.CalculatedAmountDue calculatedAmountDue;
            @XmlAttribute(name = "AbsoluteDeadlineDateTime")
            protected String absoluteDeadlineDateTime;
            @XmlAttribute(name = "ApplicationLevel")
            protected String applicationLevel;
            @XmlAttribute(name = "ApplicationPriority")
            protected Integer applicationPriority;
            @XmlAttribute(name = "AssessmentBasis")
            protected String assessmentBasis;
            @XmlAttribute(name = "ConsumerPaysProvider")
            protected String consumerPaysProvider;
            @XmlAttribute(name = "GuaranteeNonChangingFares")
            protected String guaranteeNonChangingFares;
            @XmlAttribute(name = "LanguageCode")
            protected String languageCode;
            @XmlAttribute(name = "PercentToApply")
            protected Integer percentToApply;
            @XmlAttribute(name = "PolicyCode")
            protected String policyCode;
            @XmlAttribute(name = "PolicyID")
            protected String policyID;
            @XmlAttribute(name = "PolicyRetributionActionTypeCode")
            protected String policyRetributionActionTypeCode;
            @XmlAttribute(name = "PolicyTypeCode")
            protected String policyTypeCode;
            @XmlAttribute(name = "PolicyTypeDescription")
            protected String policyTypeDescription;
            @XmlAttribute(name = "RelativeDeadlineOffsetUOMCode")
            protected String relativeDeadlineOffsetUOMCode;
            @XmlAttribute(name = "RelativeDeadlineTimeOfDay")
            protected String relativeDeadlineTimeOfDay;
            @XmlAttribute(name = "RelativeOffsetQuantity")
            protected Integer relativeOffsetQuantity;
            @XmlAttribute(name = "ResidualValueApplication")
            protected String residualValueApplication;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;

            /**
             * Gets the value of the calculatedAmountDue property.
             * 
             * @return
             *     possible object is
             *     {@link Reservation.ResComponent.Policy.CalculatedAmountDue }
             *     
             */
            public Reservation.ResComponent.Policy.CalculatedAmountDue getCalculatedAmountDue() {
                return calculatedAmountDue;
            }

            /**
             * Sets the value of the calculatedAmountDue property.
             * 
             * @param value
             *     allowed object is
             *     {@link Reservation.ResComponent.Policy.CalculatedAmountDue }
             *     
             */
            public void setCalculatedAmountDue(Reservation.ResComponent.Policy.CalculatedAmountDue value) {
                this.calculatedAmountDue = value;
            }

            /**
             * Gets the value of the absoluteDeadlineDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAbsoluteDeadlineDateTime() {
                return absoluteDeadlineDateTime;
            }

            /**
             * Sets the value of the absoluteDeadlineDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAbsoluteDeadlineDateTime(String value) {
                this.absoluteDeadlineDateTime = value;
            }

            /**
             * Gets the value of the applicationLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicationLevel() {
                return applicationLevel;
            }

            /**
             * Sets the value of the applicationLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicationLevel(String value) {
                this.applicationLevel = value;
            }

            /**
             * Gets the value of the applicationPriority property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getApplicationPriority() {
                return applicationPriority;
            }

            /**
             * Sets the value of the applicationPriority property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setApplicationPriority(Integer value) {
                this.applicationPriority = value;
            }

            /**
             * Gets the value of the assessmentBasis property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssessmentBasis() {
                return assessmentBasis;
            }

            /**
             * Sets the value of the assessmentBasis property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssessmentBasis(String value) {
                this.assessmentBasis = value;
            }

            /**
             * Gets the value of the consumerPaysProvider property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConsumerPaysProvider() {
                return consumerPaysProvider;
            }

            /**
             * Sets the value of the consumerPaysProvider property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConsumerPaysProvider(String value) {
                this.consumerPaysProvider = value;
            }

            /**
             * Gets the value of the guaranteeNonChangingFares property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGuaranteeNonChangingFares() {
                return guaranteeNonChangingFares;
            }

            /**
             * Sets the value of the guaranteeNonChangingFares property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGuaranteeNonChangingFares(String value) {
                this.guaranteeNonChangingFares = value;
            }

            /**
             * Gets the value of the languageCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLanguageCode() {
                return languageCode;
            }

            /**
             * Sets the value of the languageCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLanguageCode(String value) {
                this.languageCode = value;
            }

            /**
             * Gets the value of the percentToApply property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPercentToApply() {
                return percentToApply;
            }

            /**
             * Sets the value of the percentToApply property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPercentToApply(Integer value) {
                this.percentToApply = value;
            }

            /**
             * Gets the value of the policyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPolicyCode() {
                return policyCode;
            }

            /**
             * Sets the value of the policyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPolicyCode(String value) {
                this.policyCode = value;
            }

            /**
             * Gets the value of the policyID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPolicyID() {
                return policyID;
            }

            /**
             * Sets the value of the policyID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPolicyID(String value) {
                this.policyID = value;
            }

            /**
             * Gets the value of the policyRetributionActionTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPolicyRetributionActionTypeCode() {
                return policyRetributionActionTypeCode;
            }

            /**
             * Sets the value of the policyRetributionActionTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPolicyRetributionActionTypeCode(String value) {
                this.policyRetributionActionTypeCode = value;
            }

            /**
             * Gets the value of the policyTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPolicyTypeCode() {
                return policyTypeCode;
            }

            /**
             * Sets the value of the policyTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPolicyTypeCode(String value) {
                this.policyTypeCode = value;
            }

            /**
             * Gets the value of the policyTypeDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPolicyTypeDescription() {
                return policyTypeDescription;
            }

            /**
             * Sets the value of the policyTypeDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPolicyTypeDescription(String value) {
                this.policyTypeDescription = value;
            }

            /**
             * Gets the value of the relativeDeadlineOffsetUOMCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelativeDeadlineOffsetUOMCode() {
                return relativeDeadlineOffsetUOMCode;
            }

            /**
             * Sets the value of the relativeDeadlineOffsetUOMCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelativeDeadlineOffsetUOMCode(String value) {
                this.relativeDeadlineOffsetUOMCode = value;
            }

            /**
             * Gets the value of the relativeDeadlineTimeOfDay property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelativeDeadlineTimeOfDay() {
                return relativeDeadlineTimeOfDay;
            }

            /**
             * Sets the value of the relativeDeadlineTimeOfDay property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelativeDeadlineTimeOfDay(String value) {
                this.relativeDeadlineTimeOfDay = value;
            }

            /**
             * Gets the value of the relativeOffsetQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRelativeOffsetQuantity() {
                return relativeOffsetQuantity;
            }

            /**
             * Sets the value of the relativeOffsetQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRelativeOffsetQuantity(Integer value) {
                this.relativeOffsetQuantity = value;
            }

            /**
             * Gets the value of the residualValueApplication property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResidualValueApplication() {
                return residualValueApplication;
            }

            /**
             * Sets the value of the residualValueApplication property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResidualValueApplication(String value) {
                this.residualValueApplication = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="SellingPriceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CalculatedAmountDue {

                @XmlAttribute(name = "SellingPrice")
                protected Integer sellingPrice;
                @XmlAttribute(name = "SellingPriceCurrencyCode")
                protected String sellingPriceCurrencyCode;

                /**
                 * Gets the value of the sellingPrice property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getSellingPrice() {
                    return sellingPrice;
                }

                /**
                 * Sets the value of the sellingPrice property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setSellingPrice(Integer value) {
                    this.sellingPrice = value;
                }

                /**
                 * Gets the value of the sellingPriceCurrencyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSellingPriceCurrencyCode() {
                    return sellingPriceCurrencyCode;
                }

                /**
                 * Sets the value of the sellingPriceCurrencyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSellingPriceCurrencyCode(String value) {
                    this.sellingPriceCurrencyCode = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ExtraInformation" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="AmountPaid" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="CreditCardAuthorisationCode" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="CreditCardAuthorisationDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CreditCardCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DatePaid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EventSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="FormOfPaymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ProviderPaymentID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "extraInformation"
        })
        public static class ProviderPayment {

            @XmlElement(name = "ExtraInformation", required = true)
            protected List<Reservation.ResComponent.ProviderPayment.ExtraInformation> extraInformation;
            @XmlAttribute(name = "AmountPaid")
            protected Integer amountPaid;
            @XmlAttribute(name = "CreditCardAuthorisationCode")
            protected Integer creditCardAuthorisationCode;
            @XmlAttribute(name = "CreditCardAuthorisationDateTime")
            protected String creditCardAuthorisationDateTime;
            @XmlAttribute(name = "CreditCardCompanyCode")
            protected String creditCardCompanyCode;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DatePaid")
            protected String datePaid;
            @XmlAttribute(name = "EventSequence")
            protected Integer eventSequence;
            @XmlAttribute(name = "FormOfPaymentTypeCode")
            protected String formOfPaymentTypeCode;
            @XmlAttribute(name = "ProviderPaymentID")
            protected String providerPaymentID;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "TransactionID")
            protected String transactionID;

            /**
             * Gets the value of the extraInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the extraInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExtraInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Reservation.ResComponent.ProviderPayment.ExtraInformation }
             * 
             * 
             */
            public List<Reservation.ResComponent.ProviderPayment.ExtraInformation> getExtraInformation() {
                if (extraInformation == null) {
                    extraInformation = new ArrayList<Reservation.ResComponent.ProviderPayment.ExtraInformation>();
                }
                return this.extraInformation;
            }

            /**
             * Gets the value of the amountPaid property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAmountPaid() {
                return amountPaid;
            }

            /**
             * Sets the value of the amountPaid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAmountPaid(Integer value) {
                this.amountPaid = value;
            }

            /**
             * Gets the value of the creditCardAuthorisationCode property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCreditCardAuthorisationCode() {
                return creditCardAuthorisationCode;
            }

            /**
             * Sets the value of the creditCardAuthorisationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCreditCardAuthorisationCode(Integer value) {
                this.creditCardAuthorisationCode = value;
            }

            /**
             * Gets the value of the creditCardAuthorisationDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreditCardAuthorisationDateTime() {
                return creditCardAuthorisationDateTime;
            }

            /**
             * Sets the value of the creditCardAuthorisationDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreditCardAuthorisationDateTime(String value) {
                this.creditCardAuthorisationDateTime = value;
            }

            /**
             * Gets the value of the creditCardCompanyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreditCardCompanyCode() {
                return creditCardCompanyCode;
            }

            /**
             * Sets the value of the creditCardCompanyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreditCardCompanyCode(String value) {
                this.creditCardCompanyCode = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Gets the value of the datePaid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatePaid() {
                return datePaid;
            }

            /**
             * Sets the value of the datePaid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatePaid(String value) {
                this.datePaid = value;
            }

            /**
             * Gets the value of the eventSequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getEventSequence() {
                return eventSequence;
            }

            /**
             * Sets the value of the eventSequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setEventSequence(Integer value) {
                this.eventSequence = value;
            }

            /**
             * Gets the value of the formOfPaymentTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormOfPaymentTypeCode() {
                return formOfPaymentTypeCode;
            }

            /**
             * Sets the value of the formOfPaymentTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormOfPaymentTypeCode(String value) {
                this.formOfPaymentTypeCode = value;
            }

            /**
             * Gets the value of the providerPaymentID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProviderPaymentID() {
                return providerPaymentID;
            }

            /**
             * Sets the value of the providerPaymentID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProviderPaymentID(String value) {
                this.providerPaymentID = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the transactionID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransactionID() {
                return transactionID;
            }

            /**
             * Sets the value of the transactionID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTransactionID(String value) {
                this.transactionID = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ExtraInformation {

                @XmlAttribute(name = "Name")
                protected String name;
                @XmlAttribute(name = "Sequence")
                protected Integer sequence;
                @XmlAttribute(name = "Value")
                protected Integer value;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the sequence property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getSequence() {
                    return sequence;
                }

                /**
                 * Sets the value of the sequence property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setSequence(Integer value) {
                    this.sequence = value;
                }

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setValue(Integer value) {
                    this.value = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="ChargeableAmount" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="IsPartOfBaseFare" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="IsVAT" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="ServiceFee" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TaxCollectTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TaxFeeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TaxFeeDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TaxFee {

            @XmlAttribute(name = "Amount")
            protected Integer amount;
            @XmlAttribute(name = "ChargeableAmount")
            protected Integer chargeableAmount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "Description")
            protected String description;
            @XmlAttribute(name = "IsPartOfBaseFare")
            protected String isPartOfBaseFare;
            @XmlAttribute(name = "IsVAT")
            protected String isVAT;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "ServiceFee")
            protected String serviceFee;
            @XmlAttribute(name = "TaxCollectTypeCode")
            protected String taxCollectTypeCode;
            @XmlAttribute(name = "TaxFeeCode")
            protected String taxFeeCode;
            @XmlAttribute(name = "TaxFeeDocID")
            protected String taxFeeDocID;

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAmount(Integer value) {
                this.amount = value;
            }

            /**
             * Gets the value of the chargeableAmount property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getChargeableAmount() {
                return chargeableAmount;
            }

            /**
             * Sets the value of the chargeableAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setChargeableAmount(Integer value) {
                this.chargeableAmount = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the isPartOfBaseFare property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsPartOfBaseFare() {
                return isPartOfBaseFare;
            }

            /**
             * Sets the value of the isPartOfBaseFare property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsPartOfBaseFare(String value) {
                this.isPartOfBaseFare = value;
            }

            /**
             * Gets the value of the isVAT property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsVAT() {
                return isVAT;
            }

            /**
             * Sets the value of the isVAT property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsVAT(String value) {
                this.isVAT = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the serviceFee property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceFee() {
                return serviceFee;
            }

            /**
             * Sets the value of the serviceFee property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceFee(String value) {
                this.serviceFee = value;
            }

            /**
             * Gets the value of the taxCollectTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxCollectTypeCode() {
                return taxCollectTypeCode;
            }

            /**
             * Sets the value of the taxCollectTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxCollectTypeCode(String value) {
                this.taxCollectTypeCode = value;
            }

            /**
             * Gets the value of the taxFeeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxFeeCode() {
                return taxFeeCode;
            }

            /**
             * Sets the value of the taxFeeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxFeeCode(String value) {
                this.taxFeeCode = value;
            }

            /**
             * Gets the value of the taxFeeDocID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxFeeDocID() {
                return taxFeeDocID;
            }

            /**
             * Sets the value of the taxFeeDocID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxFeeDocID(String value) {
                this.taxFeeDocID = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="UnitDetail">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TaxFeeDetail" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="ChargeableAmount" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="TaxFeeDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="TaxFeeSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="UOMCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PolicyLink" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="PolicyDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="PolicySequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="AirFareRulesDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AirFareRulesSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="DirectionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="FareAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="FareEndCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="FareFamilyDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="FareFamilySequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="FareLocationCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="FareStartCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PlatingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PriceByFareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PricingRateCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PricingSource" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PricingSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ProviderRulesDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ProviderRulesSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="QuoteDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="SellingPriceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="UOMCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="UnitDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "unitDetail",
            "policyLink"
        })
        public static class Unit {

            @XmlElement(name = "UnitDetail", required = true)
            protected Reservation.ResComponent.Unit.UnitDetail unitDetail;
            @XmlElement(name = "PolicyLink", required = true)
            protected List<Reservation.ResComponent.Unit.PolicyLink> policyLink;
            @XmlAttribute(name = "AirFareRulesDocRef")
            protected String airFareRulesDocRef;
            @XmlAttribute(name = "AirFareRulesSequence")
            protected Integer airFareRulesSequence;
            @XmlAttribute(name = "DirectionIndicator")
            protected String directionIndicator;
            @XmlAttribute(name = "EndDateTime")
            protected String endDateTime;
            @XmlAttribute(name = "FareAirlineCode")
            protected String fareAirlineCode;
            @XmlAttribute(name = "FareEndCityCode")
            protected String fareEndCityCode;
            @XmlAttribute(name = "FareFamilyDocRef")
            protected String fareFamilyDocRef;
            @XmlAttribute(name = "FareFamilySequence")
            protected Integer fareFamilySequence;
            @XmlAttribute(name = "FareLocationCategoryCode")
            protected String fareLocationCategoryCode;
            @XmlAttribute(name = "FareStartCityCode")
            protected String fareStartCityCode;
            @XmlAttribute(name = "PlatingCarrier")
            protected String platingCarrier;
            @XmlAttribute(name = "PriceByFareBasisCode")
            protected String priceByFareBasisCode;
            @XmlAttribute(name = "PricingRateCode")
            protected String pricingRateCode;
            @XmlAttribute(name = "PricingSource")
            protected String pricingSource;
            @XmlAttribute(name = "PricingSystem")
            protected String pricingSystem;
            @XmlAttribute(name = "ProviderRulesDocRef")
            protected String providerRulesDocRef;
            @XmlAttribute(name = "ProviderRulesSequence")
            protected Integer providerRulesSequence;
            @XmlAttribute(name = "QuoteDateTime")
            protected String quoteDateTime;
            @XmlAttribute(name = "SellingPrice")
            protected Integer sellingPrice;
            @XmlAttribute(name = "SellingPriceCurrencyCode")
            protected String sellingPriceCurrencyCode;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "StartDateTime")
            protected String startDateTime;
            @XmlAttribute(name = "UOMCode")
            protected String uomCode;
            @XmlAttribute(name = "UnitDocID")
            protected String unitDocID;

            /**
             * Gets the value of the unitDetail property.
             * 
             * @return
             *     possible object is
             *     {@link Reservation.ResComponent.Unit.UnitDetail }
             *     
             */
            public Reservation.ResComponent.Unit.UnitDetail getUnitDetail() {
                return unitDetail;
            }

            /**
             * Sets the value of the unitDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link Reservation.ResComponent.Unit.UnitDetail }
             *     
             */
            public void setUnitDetail(Reservation.ResComponent.Unit.UnitDetail value) {
                this.unitDetail = value;
            }

            /**
             * Gets the value of the policyLink property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the policyLink property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPolicyLink().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Reservation.ResComponent.Unit.PolicyLink }
             * 
             * 
             */
            public List<Reservation.ResComponent.Unit.PolicyLink> getPolicyLink() {
                if (policyLink == null) {
                    policyLink = new ArrayList<Reservation.ResComponent.Unit.PolicyLink>();
                }
                return this.policyLink;
            }

            /**
             * Gets the value of the airFareRulesDocRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAirFareRulesDocRef() {
                return airFareRulesDocRef;
            }

            /**
             * Sets the value of the airFareRulesDocRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAirFareRulesDocRef(String value) {
                this.airFareRulesDocRef = value;
            }

            /**
             * Gets the value of the airFareRulesSequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAirFareRulesSequence() {
                return airFareRulesSequence;
            }

            /**
             * Sets the value of the airFareRulesSequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAirFareRulesSequence(Integer value) {
                this.airFareRulesSequence = value;
            }

            /**
             * Gets the value of the directionIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDirectionIndicator() {
                return directionIndicator;
            }

            /**
             * Sets the value of the directionIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDirectionIndicator(String value) {
                this.directionIndicator = value;
            }

            /**
             * Gets the value of the endDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEndDateTime() {
                return endDateTime;
            }

            /**
             * Sets the value of the endDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEndDateTime(String value) {
                this.endDateTime = value;
            }

            /**
             * Gets the value of the fareAirlineCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareAirlineCode() {
                return fareAirlineCode;
            }

            /**
             * Sets the value of the fareAirlineCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareAirlineCode(String value) {
                this.fareAirlineCode = value;
            }

            /**
             * Gets the value of the fareEndCityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareEndCityCode() {
                return fareEndCityCode;
            }

            /**
             * Sets the value of the fareEndCityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareEndCityCode(String value) {
                this.fareEndCityCode = value;
            }

            /**
             * Gets the value of the fareFamilyDocRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareFamilyDocRef() {
                return fareFamilyDocRef;
            }

            /**
             * Sets the value of the fareFamilyDocRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareFamilyDocRef(String value) {
                this.fareFamilyDocRef = value;
            }

            /**
             * Gets the value of the fareFamilySequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getFareFamilySequence() {
                return fareFamilySequence;
            }

            /**
             * Sets the value of the fareFamilySequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setFareFamilySequence(Integer value) {
                this.fareFamilySequence = value;
            }

            /**
             * Gets the value of the fareLocationCategoryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareLocationCategoryCode() {
                return fareLocationCategoryCode;
            }

            /**
             * Sets the value of the fareLocationCategoryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareLocationCategoryCode(String value) {
                this.fareLocationCategoryCode = value;
            }

            /**
             * Gets the value of the fareStartCityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareStartCityCode() {
                return fareStartCityCode;
            }

            /**
             * Sets the value of the fareStartCityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareStartCityCode(String value) {
                this.fareStartCityCode = value;
            }

            /**
             * Gets the value of the platingCarrier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlatingCarrier() {
                return platingCarrier;
            }

            /**
             * Sets the value of the platingCarrier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlatingCarrier(String value) {
                this.platingCarrier = value;
            }

            /**
             * Gets the value of the priceByFareBasisCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriceByFareBasisCode() {
                return priceByFareBasisCode;
            }

            /**
             * Sets the value of the priceByFareBasisCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriceByFareBasisCode(String value) {
                this.priceByFareBasisCode = value;
            }

            /**
             * Gets the value of the pricingRateCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPricingRateCode() {
                return pricingRateCode;
            }

            /**
             * Sets the value of the pricingRateCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPricingRateCode(String value) {
                this.pricingRateCode = value;
            }

            /**
             * Gets the value of the pricingSource property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPricingSource() {
                return pricingSource;
            }

            /**
             * Sets the value of the pricingSource property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPricingSource(String value) {
                this.pricingSource = value;
            }

            /**
             * Gets the value of the pricingSystem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPricingSystem() {
                return pricingSystem;
            }

            /**
             * Sets the value of the pricingSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPricingSystem(String value) {
                this.pricingSystem = value;
            }

            /**
             * Gets the value of the providerRulesDocRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProviderRulesDocRef() {
                return providerRulesDocRef;
            }

            /**
             * Sets the value of the providerRulesDocRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProviderRulesDocRef(String value) {
                this.providerRulesDocRef = value;
            }

            /**
             * Gets the value of the providerRulesSequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getProviderRulesSequence() {
                return providerRulesSequence;
            }

            /**
             * Sets the value of the providerRulesSequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setProviderRulesSequence(Integer value) {
                this.providerRulesSequence = value;
            }

            /**
             * Gets the value of the quoteDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuoteDateTime() {
                return quoteDateTime;
            }

            /**
             * Sets the value of the quoteDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuoteDateTime(String value) {
                this.quoteDateTime = value;
            }

            /**
             * Gets the value of the sellingPrice property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSellingPrice() {
                return sellingPrice;
            }

            /**
             * Sets the value of the sellingPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSellingPrice(Integer value) {
                this.sellingPrice = value;
            }

            /**
             * Gets the value of the sellingPriceCurrencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSellingPriceCurrencyCode() {
                return sellingPriceCurrencyCode;
            }

            /**
             * Sets the value of the sellingPriceCurrencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSellingPriceCurrencyCode(String value) {
                this.sellingPriceCurrencyCode = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the startDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStartDateTime() {
                return startDateTime;
            }

            /**
             * Sets the value of the startDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStartDateTime(String value) {
                this.startDateTime = value;
            }

            /**
             * Gets the value of the uomCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUOMCode() {
                return uomCode;
            }

            /**
             * Sets the value of the uomCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUOMCode(String value) {
                this.uomCode = value;
            }

            /**
             * Gets the value of the unitDocID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitDocID() {
                return unitDocID;
            }

            /**
             * Sets the value of the unitDocID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitDocID(String value) {
                this.unitDocID = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="PolicyDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="PolicySequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PolicyLink {

                @XmlAttribute(name = "PolicyDocRef")
                protected String policyDocRef;
                @XmlAttribute(name = "PolicySequence")
                protected Integer policySequence;

                /**
                 * Gets the value of the policyDocRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPolicyDocRef() {
                    return policyDocRef;
                }

                /**
                 * Sets the value of the policyDocRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPolicyDocRef(String value) {
                    this.policyDocRef = value;
                }

                /**
                 * Gets the value of the policySequence property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getPolicySequence() {
                    return policySequence;
                }

                /**
                 * Sets the value of the policySequence property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setPolicySequence(Integer value) {
                    this.policySequence = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="TaxFeeDetail" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="ChargeableAmount" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="TaxFeeDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="TaxFeeSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="UOMCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "taxFeeDetail"
            })
            public static class UnitDetail {

                @XmlElement(name = "TaxFeeDetail", required = true)
                protected List<Reservation.ResComponent.Unit.UnitDetail.TaxFeeDetail> taxFeeDetail;
                @XmlAttribute(name = "EndDateTime")
                protected String endDateTime;
                @XmlAttribute(name = "Sequence")
                protected Integer sequence;
                @XmlAttribute(name = "StartDateTime")
                protected String startDateTime;
                @XmlAttribute(name = "UOMCode")
                protected String uomCode;

                /**
                 * Gets the value of the taxFeeDetail property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the taxFeeDetail property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTaxFeeDetail().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Reservation.ResComponent.Unit.UnitDetail.TaxFeeDetail }
                 * 
                 * 
                 */
                public List<Reservation.ResComponent.Unit.UnitDetail.TaxFeeDetail> getTaxFeeDetail() {
                    if (taxFeeDetail == null) {
                        taxFeeDetail = new ArrayList<Reservation.ResComponent.Unit.UnitDetail.TaxFeeDetail>();
                    }
                    return this.taxFeeDetail;
                }

                /**
                 * Gets the value of the endDateTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEndDateTime() {
                    return endDateTime;
                }

                /**
                 * Sets the value of the endDateTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEndDateTime(String value) {
                    this.endDateTime = value;
                }

                /**
                 * Gets the value of the sequence property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getSequence() {
                    return sequence;
                }

                /**
                 * Sets the value of the sequence property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setSequence(Integer value) {
                    this.sequence = value;
                }

                /**
                 * Gets the value of the startDateTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStartDateTime() {
                    return startDateTime;
                }

                /**
                 * Sets the value of the startDateTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStartDateTime(String value) {
                    this.startDateTime = value;
                }

                /**
                 * Gets the value of the uomCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUOMCode() {
                    return uomCode;
                }

                /**
                 * Sets the value of the uomCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUOMCode(String value) {
                    this.uomCode = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="ChargeableAmount" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *       &lt;attribute name="TaxFeeDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="TaxFeeSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class TaxFeeDetail {

                    @XmlAttribute(name = "Amount")
                    protected Integer amount;
                    @XmlAttribute(name = "ChargeableAmount")
                    protected Integer chargeableAmount;
                    @XmlAttribute(name = "TaxFeeDocRef")
                    protected String taxFeeDocRef;
                    @XmlAttribute(name = "TaxFeeSequence")
                    protected Integer taxFeeSequence;

                    /**
                     * Gets the value of the amount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getAmount() {
                        return amount;
                    }

                    /**
                     * Sets the value of the amount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setAmount(Integer value) {
                        this.amount = value;
                    }

                    /**
                     * Gets the value of the chargeableAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getChargeableAmount() {
                        return chargeableAmount;
                    }

                    /**
                     * Sets the value of the chargeableAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setChargeableAmount(Integer value) {
                        this.chargeableAmount = value;
                    }

                    /**
                     * Gets the value of the taxFeeDocRef property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTaxFeeDocRef() {
                        return taxFeeDocRef;
                    }

                    /**
                     * Sets the value of the taxFeeDocRef property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTaxFeeDocRef(String value) {
                        this.taxFeeDocRef = value;
                    }

                    /**
                     * Gets the value of the taxFeeSequence property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getTaxFeeSequence() {
                        return taxFeeSequence;
                    }

                    /**
                     * Sets the value of the taxFeeSequence property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setTaxFeeSequence(Integer value) {
                        this.taxFeeSequence = value;
                    }

                }

            }

        }
        
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ExtraInformation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GroupMember" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ResComponentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ResComponentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Remark" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="GeneralRemark">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SendToVendor" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="ShowOnConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ShowOnInvoice" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AirSupplementaryElement">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OtherServiceInformation">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SendToVendor" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="ShowOnConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ShowOnInvoice" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="InternalGroupTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ResComponentGroupDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "extraInformation",
        "groupMember",
        "remark",
        "airSupplementaryElement"
    })
    public static class ResComponentGroup {

        @XmlElement(name = "ExtraInformation", required = true)
        protected Reservation.ResComponentGroup.ExtraInformation extraInformation;
        @XmlElement(name = "GroupMember", required = true)
        protected List<Reservation.ResComponentGroup.GroupMember> groupMember;
        @XmlElement(name = "Remark", required = true)
        protected List<Reservation.ResComponentGroup.Remark> remark;
        @XmlElement(name = "AirSupplementaryElement", required = true)
        protected Reservation.ResComponentGroup.AirSupplementaryElement airSupplementaryElement;
        @XmlAttribute(name = "InternalGroupTypeCode")
        protected String internalGroupTypeCode;
        @XmlAttribute(name = "ResComponentGroupDocID")
        protected String resComponentGroupDocID;
        @XmlAttribute(name = "Sequence")
        protected Integer sequence;

        /**
         * Gets the value of the extraInformation property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.ResComponentGroup.ExtraInformation }
         *     
         */
        public Reservation.ResComponentGroup.ExtraInformation getExtraInformation() {
            return extraInformation;
        }

        /**
         * Sets the value of the extraInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.ResComponentGroup.ExtraInformation }
         *     
         */
        public void setExtraInformation(Reservation.ResComponentGroup.ExtraInformation value) {
            this.extraInformation = value;
        }

        /**
         * Gets the value of the groupMember property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the groupMember property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroupMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Reservation.ResComponentGroup.GroupMember }
         * 
         * 
         */
        public List<Reservation.ResComponentGroup.GroupMember> getGroupMember() {
            if (groupMember == null) {
                groupMember = new ArrayList<Reservation.ResComponentGroup.GroupMember>();
            }
            return this.groupMember;
        }

        /**
         * Gets the value of the remark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Reservation.ResComponentGroup.Remark }
         * 
         * 
         */
        public List<Reservation.ResComponentGroup.Remark> getRemark() {
            if (remark == null) {
                remark = new ArrayList<Reservation.ResComponentGroup.Remark>();
            }
            return this.remark;
        }

        /**
         * Gets the value of the airSupplementaryElement property.
         * 
         * @return
         *     possible object is
         *     {@link Reservation.ResComponentGroup.AirSupplementaryElement }
         *     
         */
        public Reservation.ResComponentGroup.AirSupplementaryElement getAirSupplementaryElement() {
            return airSupplementaryElement;
        }

        /**
         * Sets the value of the airSupplementaryElement property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reservation.ResComponentGroup.AirSupplementaryElement }
         *     
         */
        public void setAirSupplementaryElement(Reservation.ResComponentGroup.AirSupplementaryElement value) {
            this.airSupplementaryElement = value;
        }

        /**
         * Gets the value of the internalGroupTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInternalGroupTypeCode() {
            return internalGroupTypeCode;
        }

        /**
         * Sets the value of the internalGroupTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInternalGroupTypeCode(String value) {
            this.internalGroupTypeCode = value;
        }

        /**
         * Gets the value of the resComponentGroupDocID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResComponentGroupDocID() {
            return resComponentGroupDocID;
        }

        /**
         * Sets the value of the resComponentGroupDocID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResComponentGroupDocID(String value) {
            this.resComponentGroupDocID = value;
        }

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSequence(Integer value) {
            this.sequence = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="OtherServiceInformation">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="SendToVendor" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="ShowOnConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ShowOnInvoice" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "otherServiceInformation"
        })
        public static class AirSupplementaryElement {

            @XmlElement(name = "OtherServiceInformation", required = true)
            protected Reservation.ResComponentGroup.AirSupplementaryElement.OtherServiceInformation otherServiceInformation;
            @XmlAttribute(name = "SendToVendor")
            protected String sendToVendor;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "ShowOnConfirmation")
            protected String showOnConfirmation;
            @XmlAttribute(name = "ShowOnInvoice")
            protected String showOnInvoice;
            @XmlAttribute(name = "SyncStatus")
            protected String syncStatus;

            /**
             * Gets the value of the otherServiceInformation property.
             * 
             * @return
             *     possible object is
             *     {@link Reservation.ResComponentGroup.AirSupplementaryElement.OtherServiceInformation }
             *     
             */
            public Reservation.ResComponentGroup.AirSupplementaryElement.OtherServiceInformation getOtherServiceInformation() {
                return otherServiceInformation;
            }

            /**
             * Sets the value of the otherServiceInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link Reservation.ResComponentGroup.AirSupplementaryElement.OtherServiceInformation }
             *     
             */
            public void setOtherServiceInformation(Reservation.ResComponentGroup.AirSupplementaryElement.OtherServiceInformation value) {
                this.otherServiceInformation = value;
            }

            /**
             * Gets the value of the sendToVendor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSendToVendor() {
                return sendToVendor;
            }

            /**
             * Sets the value of the sendToVendor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSendToVendor(String value) {
                this.sendToVendor = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the showOnConfirmation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShowOnConfirmation() {
                return showOnConfirmation;
            }

            /**
             * Sets the value of the showOnConfirmation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShowOnConfirmation(String value) {
                this.showOnConfirmation = value;
            }

            /**
             * Gets the value of the showOnInvoice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShowOnInvoice() {
                return showOnInvoice;
            }

            /**
             * Sets the value of the showOnInvoice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShowOnInvoice(String value) {
                this.showOnInvoice = value;
            }

            /**
             * Gets the value of the syncStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSyncStatus() {
                return syncStatus;
            }

            /**
             * Sets the value of the syncStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSyncStatus(String value) {
                this.syncStatus = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class OtherServiceInformation {

                @XmlAttribute(name = "AirlineCode")
                protected String airlineCode;
                @XmlAttribute(name = "Text")
                protected String text;

                /**
                 * Gets the value of the airlineCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAirlineCode() {
                    return airlineCode;
                }

                /**
                 * Sets the value of the airlineCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAirlineCode(String value) {
                    this.airlineCode = value;
                }

                /**
                 * Gets the value of the text property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getText() {
                    return text;
                }

                /**
                 * Sets the value of the text property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setText(String value) {
                    this.text = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ExtraInformation {

            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "Value")
            protected String value;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ResComponentDocRef" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ResComponentSequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class GroupMember {

            @XmlAttribute(name = "ResComponentDocRef")
            protected String resComponentDocRef;
            @XmlAttribute(name = "ResComponentSequence")
            protected Integer resComponentSequence;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;

            /**
             * Gets the value of the resComponentDocRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResComponentDocRef() {
                return resComponentDocRef;
            }

            /**
             * Sets the value of the resComponentDocRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResComponentDocRef(String value) {
                this.resComponentDocRef = value;
            }

            /**
             * Gets the value of the resComponentSequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getResComponentSequence() {
                return resComponentSequence;
            }

            /**
             * Sets the value of the resComponentSequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setResComponentSequence(Integer value) {
                this.resComponentSequence = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="GeneralRemark">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="SendToVendor" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="ShowOnConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ShowOnInvoice" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "generalRemark"
        })
        public static class Remark {

            @XmlElement(name = "GeneralRemark", required = true)
            protected Reservation.ResComponentGroup.Remark.GeneralRemark generalRemark;
            @XmlAttribute(name = "SendToVendor")
            protected String sendToVendor;
            @XmlAttribute(name = "Sequence")
            protected Integer sequence;
            @XmlAttribute(name = "ShowOnConfirmation")
            protected String showOnConfirmation;
            @XmlAttribute(name = "ShowOnInvoice")
            protected String showOnInvoice;
            @XmlAttribute(name = "SyncStatus")
            protected String syncStatus;

            /**
             * Gets the value of the generalRemark property.
             * 
             * @return
             *     possible object is
             *     {@link Reservation.ResComponentGroup.Remark.GeneralRemark }
             *     
             */
            public Reservation.ResComponentGroup.Remark.GeneralRemark getGeneralRemark() {
                return generalRemark;
            }

            /**
             * Sets the value of the generalRemark property.
             * 
             * @param value
             *     allowed object is
             *     {@link Reservation.ResComponentGroup.Remark.GeneralRemark }
             *     
             */
            public void setGeneralRemark(Reservation.ResComponentGroup.Remark.GeneralRemark value) {
                this.generalRemark = value;
            }

            /**
             * Gets the value of the sendToVendor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSendToVendor() {
                return sendToVendor;
            }

            /**
             * Sets the value of the sendToVendor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSendToVendor(String value) {
                this.sendToVendor = value;
            }

            /**
             * Gets the value of the sequence property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * Sets the value of the sequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequence(Integer value) {
                this.sequence = value;
            }

            /**
             * Gets the value of the showOnConfirmation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShowOnConfirmation() {
                return showOnConfirmation;
            }

            /**
             * Sets the value of the showOnConfirmation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShowOnConfirmation(String value) {
                this.showOnConfirmation = value;
            }

            /**
             * Gets the value of the showOnInvoice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShowOnInvoice() {
                return showOnInvoice;
            }

            /**
             * Sets the value of the showOnInvoice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShowOnInvoice(String value) {
                this.showOnInvoice = value;
            }

            /**
             * Gets the value of the syncStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSyncStatus() {
                return syncStatus;
            }

            /**
             * Sets the value of the syncStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSyncStatus(String value) {
                this.syncStatus = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class GeneralRemark {

                @XmlAttribute(name = "Text")
                protected String text;

                /**
                 * Gets the value of the text property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getText() {
                    return text;
                }

                /**
                 * Sets the value of the text property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setText(String value) {
                    this.text = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="SessionDocID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SessionKey" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SourceIP" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SessionDetails {

        @XmlAttribute(name = "Language")
        protected String language;
        @XmlAttribute(name = "Sequence")
        protected Integer sequence;
        @XmlAttribute(name = "SessionDocID")
        protected String sessionDocID;
        @XmlAttribute(name = "SessionKey")
        protected String sessionKey;
        @XmlAttribute(name = "SourceIP")
        protected String sourceIP;

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSequence(Integer value) {
            this.sequence = value;
        }

        /**
         * Gets the value of the sessionDocID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSessionDocID() {
            return sessionDocID;
        }

        /**
         * Sets the value of the sessionDocID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSessionDocID(String value) {
            this.sessionDocID = value;
        }

        /**
         * Gets the value of the sessionKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSessionKey() {
            return sessionKey;
        }

        /**
         * Sets the value of the sessionKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSessionKey(String value) {
            this.sessionKey = value;
        }

        /**
         * Gets the value of the sourceIP property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceIP() {
            return sourceIP;
        }

        /**
         * Sets the value of the sourceIP property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceIP(String value) {
            this.sourceIP = value;
        }

    }
    public String toString() {
    	return "code: " + code
    			+"\nDescription: " + description
    			+ "\n";
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    
}

