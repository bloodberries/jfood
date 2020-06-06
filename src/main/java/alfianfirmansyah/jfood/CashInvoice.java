package alfianfirmansyah.jfood;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.lang.reflect.Array;


/**
 * CashInvoice merupakan subclass dari Superclass Invoice.
 *
 * @author (Alfian Firmansyah)
 * @version (13.03.2020)
 */
public class CashInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE=PaymentType.Cash;
    private int deliveryFee=0;

    /**
     * Overloading Contructor CashInvoice
     * @param  id, foods, customer
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super (id, foods, customer);// initialise instance variable
    }

    /**
     * Overloading Contructor CashInvoice
     * @param  id, foods, customer, deliveryFee
     */
    public CashInvoice(int id, ArrayList<Food> foods,  Customer customer, int deliveryFee)
    {
        super (id, foods, customer);
        this.deliveryFee=deliveryFee;
    }

    /**
     * method override accesor dalam SubClass CashInvoice
     * @return PAYMENT_TYPE untuk mengembalikan nilai dalam array
     */
    @Override
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }

    /**
     * method accesor dalam SubClass CashInvoice
     * @return deliveryFee untuk mengembalikan nilai dalam atribut
     */
    public int getDeliveryFee()
    {
        return deliveryFee;
    }

    /**
     * method mutator dalam SubClass CashInvoice
     * @param deliveryFee untuk memasukkan nilai atribut
     */
    public void setDeliveryFee(int deliveryFee)
    {
        this.deliveryFee=deliveryFee;
    }

    /**
     * method override mutator dalam SubClass CasInvoice
     */
    @Override
    public void setTotalPrice()
    {
        super.totalPrice=0;
        for(Food foods:getFoods())
        {
            super.totalPrice = totalPrice + foods.getPrice();
        }
        super.totalPrice = super.totalPrice+deliveryFee;
    }

    /**
     * method toString() dalam SubClass CashInvoice
     * @return id, foodName, date, customerName, deliveryFee, totalPrice, invoiceStatus, paymentType untuk mengembalikkan atribut kedalam tipe data String
     */
    @Override
    public String toString()
    {
        StringBuilder foodName = new StringBuilder();
        for (Food food: getFoods())
        {
            foodName.append(food.getName()).append(", ");
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        LocalDateTime now = LocalDateTime.now();
        if(deliveryFee>0)
        {
            return
                    "================Invoice================" +
                            "\nID           : "+super.getId()+
                            "\nFood         : "+foodName+
                            "\nDate         : "+LocalDateTime.now()+
                            "\nCustomer     : "+super.getCustomer().getName()+
                            "\nDelivery Fee : "+deliveryFee+
                            "\nTotal Price  : "+super.totalPrice+
                            "\nStatus       : "+super.getInvoiceStatus()+
                            "\nPaymentType  : "+getPaymentType()+"\n\n";
        }
        else
        {
            return
                    "================Invoice================" +
                            "\nID           : "+super.getId()+
                            "\nFoods        : "+foodName+
                            "\nDate         : "+LocalDateTime.now()+
                            "\nCustomer     : "+super.getCustomer().getName()+
                            "\nDelivery Fee : 0"+
                            "\nTotal Price  : "+super.totalPrice+
                            "\nStatus       : "+super.getInvoiceStatus()+
                            "\nPaymentType  : "+getPaymentType()+"\n\n";
        }
    }
}
     
    
    
