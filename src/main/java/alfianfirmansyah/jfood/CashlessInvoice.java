package alfianfirmansyah.jfood;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * CashlessInvoice merupakan subclass dari Superclass Invoice.
 *
 * @author (Alfian Firmansyah)
 * @version (13.03.2020)
 */
public class CashlessInvoice extends Invoice
{
    // membuat atribut dalam SubClass CashlessInvoice
    private static final PaymentType PAYMENT_TYPE=PaymentType.Cashless;
    private Promo promo;

    /**
     * Overloading Contructor CashlessInvoice
     * @param  id, foods, customer
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super (id, foods, customer);// initialise instance variables
    }
    
    /**
     * Overloading Contructor CashlessInvoice
     * @param  id, foods, customer, promo
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, Promo promo)
    {
        super (id, foods, customer);
        this.promo=promo;
    }

    /**
     * method override accesor dalam SubClass CashlessInvoice
     * @return PAYMENT_TYPE untuk mengembalikan nilai dalam array
     */
    @Override
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    /**
     * method accesor dalam SubClass CashlessInvoice
     * @return promo untuk mengembalikan nilai dalam atribut
     */
    public Promo getPromo()
    {
        return promo;
    }
    
    /**
     * method mutator dalam SubClass CashlessInvoice
     * @param promo untuk memasukkan nilai promo
     */
    public void setPromo(Promo promo)
    {
        this.promo=promo;
    }
    
    /**
     * method override mutator dalam SubClass CashlessInvoice
     */
    @Override
    public void setTotalPrice()
    {
        super.totalPrice=0;
        for(Food foods : getFoods())
        {
            if (promo != null && foods.getPrice() >= promo.getMinPrice() && promo.getActive())
            {
                super.totalPrice = super.totalPrice + foods.getPrice() - promo.getDiscount();
            }
            else
            {
                super.totalPrice = super.totalPrice + foods.getPrice();
            }
        }
    }

    /**
     * method toString() dalam SubClass CashlessInvoice
     * @return id, foods, date, customer, promo, totalPrice, invoiceStatus, paymentType untuk mengembalikkan atribut kedalam tipe data String
     */
    @Override //Overriding mengatur default attribut dari superclass dalam subclass
    public String toString()
    {
        String string="";
        int foodPrice=0;
        for(int i = 0; i <= super.getFoods().size(); i++){
            foodPrice+=super.getFoods().get(i).getPrice();
        }

        if(promo!=null&& promo.getActive() &&foodPrice>promo.getMinPrice())
        {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
            LocalDateTime now = LocalDateTime.now();
            string=
                    ("================Invoice================" + "\n" +
                            "ID: "+super.getId()+
                            "\nFood: "+super.getFoods()+
                            "\nDate: "+dtf.format(now)+
                            "\nCustomer: "+super.getCustomer().getName()+
                            "\nPromo: "+promo.getCode()+
                            "\nTotal Price: "+super.totalPrice+
                            "\nStatus: "+super.getInvoiceStatus()+
                            "\nPaymentType: "+ getPaymentType() +"\n\n");
        }
        else
        {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
            LocalDateTime now = LocalDateTime.now();
            string=
                    ("================Invoice================" + "\n" +
                            "ID: "+super.getId()+
                            "\nFood: \n"+super.getFoods()+
                            "\nDate: "+dtf.format(now)+
                            "\nCustomer: "+super.getCustomer().getName()+
                            "\nTotal Price: "+super.totalPrice+
                            "\nStatus: "+super.getInvoiceStatus()+
                            "\nPaymentType: "+getPaymentType()+"\n\n");
        }
        System.out.println(string);
        return string;
    }
}
