package com.eoh.platoon.invoiceapplication.service;

import javax.persistence.GeneratedValue;
import java.math.BigDecimal;

/**
 * Created by Loyiso on 2018/07/15.
 */
public class LineItem {

    @GeneratedValue
    private Long id;
    private Long quantity;
    private String description;
    private BigDecimal unitPrice;


    public LineItem(Long id, Long quantity, String description, BigDecimal unitPrice) {
        this.id = id;
        this.quantity = quantity;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getLineItemTotal(){
        return new BigDecimal(0);
    }
}
