package com.eoh.platoon.invoiceapplication.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class InvoiceController {


    @RequestMapping("/invoices")
    public Invoice viewAllInvoices() {
        return new Invoice("loyiso",14L,new Date());
    }

}
