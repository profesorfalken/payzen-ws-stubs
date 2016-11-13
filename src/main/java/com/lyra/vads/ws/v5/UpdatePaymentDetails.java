
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePaymentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePaymentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryRequest" type="{http://v5.ws.vads.lyra.com/}queryRequest" minOccurs="0"/>
 *         &lt;element name="shoppingCartRequest" type="{http://v5.ws.vads.lyra.com/}shoppingCartRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePaymentDetails", propOrder = {
    "queryRequest",
    "shoppingCartRequest"
})
public class UpdatePaymentDetails {

    protected QueryRequest queryRequest;
    protected ShoppingCartRequest shoppingCartRequest;

    /**
     * Gets the value of the queryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link QueryRequest }
     *     
     */
    public QueryRequest getQueryRequest() {
        return queryRequest;
    }

    /**
     * Sets the value of the queryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryRequest }
     *     
     */
    public void setQueryRequest(QueryRequest value) {
        this.queryRequest = value;
    }

    /**
     * Gets the value of the shoppingCartRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartRequest }
     *     
     */
    public ShoppingCartRequest getShoppingCartRequest() {
        return shoppingCartRequest;
    }

    /**
     * Sets the value of the shoppingCartRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartRequest }
     *     
     */
    public void setShoppingCartRequest(ShoppingCartRequest value) {
        this.shoppingCartRequest = value;
    }

}
