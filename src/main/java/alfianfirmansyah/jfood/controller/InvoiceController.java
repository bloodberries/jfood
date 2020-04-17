package alfianfirmansyah.jfood.controller;

import alfianfirmansyah.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class InvoiceController {

    @RequestMapping(value = "/invoice", method= RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice()
    {
        ArrayList<Invoice> invoice;
        try {
            invoice = DatabaseInvoice.getInvoiceDatabase();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "/invoice/{id}", method= RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable int id)
    {
        Invoice invoice;
        try {
            invoice = DatabaseInvoice.getInvoiceById(id);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "/invoice/customer/{customerId}", method= RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByCustomerId(@PathVariable int customerId)
    {
        ArrayList<Invoice> invoice;
        try {
            invoice = DatabaseInvoice.getInvoiceByCustomer(customerId);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "/invoice/invoiceStatus/{id}", method= RequestMethod.PUT)
    public boolean changeInvoiceStatus(@RequestParam(value="id") int id,
                                       @RequestParam(value="status") InvoiceStatus status
                                       )
    {
        boolean invoice;
        try {
           invoice = DatabaseInvoice.changeInvoiceStatus(id,status);
        } catch (Exception e) {
            e.getMessage();
            return false;
        }

        return invoice;

    }

    @RequestMapping(value = "/invoice/{id}", method= RequestMethod.DELETE)
    public boolean removeInvoice(@RequestParam(value="id") int id)
    {
        boolean invoice;
        try {
            invoice = DatabaseInvoice.removeInvoice(id);
        } catch (Exception e) {
            e.getMessage();
            return false;
        }

        return invoice;

    }

    @RequestMapping(value = "/invoice/createCashInvoice", method= RequestMethod.POST)
    public Invoice addCashInvoice(@RequestParam(value="foodList") ArrayList<Food> foodList,
                                  @RequestParam(value="customerId") int customerId,
                                  @RequestParam(value="deliveryFee") int deliveryFee) throws CustomerNotFoundException {


        CashInvoice ci = new CashInvoice(DatabaseInvoice.getLastId()+1,foodList,DatabaseCustomer.getCustomerById(customerId),deliveryFee);
        ci.setTotalPrice();
        try {
            DatabaseInvoice.addInvoice(ci);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return ci;
    }

    @RequestMapping(value = "/invoice/createCashlessInvoice", method= RequestMethod.POST)
    public Invoice addCashlessInvoice(@RequestParam(value="foodList") ArrayList<Food> foodList,
                                  @RequestParam(value="customerId") int customerId,
                                  @RequestParam(value="promoCode") String promoCode) throws CustomerNotFoundException {


        CashlessInvoice ci = new CashlessInvoice(DatabaseInvoice.getLastId()+1,foodList,DatabaseCustomer.getCustomerById(customerId),DatabasePromo.getPromoByCode(promoCode));
        ci.setTotalPrice();
        try {
            DatabaseInvoice.addInvoice(ci);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return ci;
    }





}
