package alfianfirmansyah.jfood.controller;

import alfianfirmansyah.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/invoice")
@RestController
public class InvoiceController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice()
    {
        return DatabaseInvoice.getInvoiceDatabase();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable int id)
    {
        Invoice invoice=null;
        try{
            invoice = DatabaseInvoice.getInvoiceById(id);
        } catch (InvoiceNotFoundException e)
        {
            e.getMessage();
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByCustomer(@PathVariable int customerId) throws CustomerNotFoundException
    {
        return DatabaseInvoice.getInvoiceByCustomer(customerId);
    }

    @RequestMapping(value = "/invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@PathVariable int id,
                                       @RequestParam(value = "invoiceStatus") InvoiceStatus status)
    {
        boolean invoiceStats = DatabaseInvoice.changeInvoiceStatus(id, status);
        if(invoiceStats)
        {
            try
            {
                return DatabaseInvoice.getInvoiceById(id);
            }
            catch (InvoiceNotFoundException e)
            {
                System.out.println(e.getMessage());
                return null;
            }
        }
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean removeInvoice(@PathVariable int id)
    {
        try
        {
            return DatabaseInvoice.removeInvoice(id);
        }
        catch (InvoiceNotFoundException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @RequestMapping(value = "/createCashInvoice", method = RequestMethod.POST)
    public Invoice addCashInvoice(@RequestParam(value="foodIdList") ArrayList<Integer> foodIdList,
                        @RequestParam(value="customerId") int customerId,
                        @RequestParam(value="deliveryFee", required = false, defaultValue = "0") int deliveryFee)
    {
        ArrayList<Food> foods = new ArrayList<>();
        for (int food : foodIdList) {
            try {
                foods.add(DatabaseFoodPostgre.getFoodById(food));
            } catch (FoodNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Invoice invoice = new CashInvoice(DatabaseInvoice.getLastId()+1, foods, DatabaseCustomerPostgre.getCustomerById(customerId), deliveryFee);
            DatabaseInvoice.addInvoice(invoice);
            invoice.getDate();
            invoice.setTotalPrice();
            return invoice;
        } catch (CustomerNotFoundException | OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/createCashlessInvoice", method = RequestMethod.POST)
    public Invoice addCashlessInvoice(@RequestParam(value="foodIdList") ArrayList<Integer> foodIdList,
                        @RequestParam(value="customerId") int customerId,
                        @RequestParam(value="promoCode", required = false) String promoCode)
    {
        ArrayList<Food> foods = new ArrayList<>();
        for (int food : foodIdList) {
            try {
                foods.add(DatabaseFoodPostgre.getFoodById(food));
            } catch (FoodNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Invoice invoice = new CashlessInvoice(DatabaseInvoice.getLastId()+1, foods, DatabaseCustomerPostgre.getCustomerById(customerId), DatabasePromoPostgre.getPromoByCode(promoCode));
            DatabaseInvoice.addInvoice(invoice);
            invoice.getDate();
            invoice.setTotalPrice();
            return invoice;
        } catch (CustomerNotFoundException | OngoingInvoiceAlreadyExistsException | PromoNotFoundException2 e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
