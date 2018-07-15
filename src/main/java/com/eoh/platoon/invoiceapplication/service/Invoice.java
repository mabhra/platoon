package com.eoh.platoon.invoiceapplication.service;

import javax.persistence.GeneratedValue;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Loyiso on 2018/07/15.
 */
public class Invoice {

    @GeneratedValue()
    private Long id;
    private String client;
    private Long vatRate;
    private Date invoiceDate;


    public Invoice(String client, Long vatRate, Date invoiceDate) {
       // this.id = id;
        this.client = client;
        this.vatRate = vatRate;
        this.invoiceDate = invoiceDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Long getVatRate() {
        return vatRate;
    }

    public void setVatRate(Long vatRate) {
        this.vatRate = vatRate;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }


    public BigDecimal getSubTotal(){

        return new BigDecimal(0);
    }

    public BigDecimal getVat(){

        return new BigDecimal(0);
    }

    public BigDecimal getTotal(){

        return new BigDecimal(0);
    }

}
