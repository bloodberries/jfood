import java.util.*;
import java.util.regex.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
/**
 * Write a description of class CashlessInvoice here.
 *
 * @author Alfian Firmansyah
 * @version 1.0
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.CASHLESS;
    private Promo promo;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashlessInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
    {
        // initialise instance variables
        super(id, food, customer, invoiceStatus);
        
    }
    
    
    public CashlessInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        
        super(id, food, customer, invoiceStatus);
        this.promo = promo;
    }
    
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }

    public Promo getPromo(){
        return promo;
    }
    
    public void setTotalPrice(){
        if(promo != null && promo.getActive() == true && (getFood().getPrice()) >= promo.getMinPrice() ){
            
            this.totalPrice = (getFood().getPrice()) - promo.getDiscount();
        }else{
            this.totalPrice = (getFood().getPrice());
        }
    }
    
    public String toString(){
        SimpleDateFormat dateNow = this.dateFormat;
       if(promo != null && promo.getActive() == true && getFood().getPrice_temp() >= promo.getMinPrice() ){         
       return "================INVOICE================" + "\n"+
        "ID: " + super.getId()+ "\n"+
        "Food: " + super.getFood().getName()+ "\n"+
        "Date: " + dateNow.format(super.getDate().getTime())+"\n"+
        "Customer: " + getCustomer().getName()+ "\n"+
        "Promo: " + promo.getCode()+ "\n"+
        "Total Price: " + this.totalPrice + " Selamat Anda hemat " + promo.getDiscount() + "\n"+
        "Status: " + getInvoiceStatus() + "\n"+
        "Payment Type: " + getPaymentType()+ "\n";
        }else if(promo != null && promo.getActive() == true && getFood().getPrice_temp() < promo.getMinPrice() ){
        return "================INVOICE================"+ "\n"+
        "ID: " + super.getId()+ "\n"+
        "Food: " + super.getFood().getName()+ "\n"+
        "Date: " + dateNow.format(super.getDate().getTime()) + "\n"+
        "Customer: " + getCustomer().getName()+ "\n"+
        "Total Price: " + this.totalPrice + "(promo tidak dapat digunakan)"+ "\n"+
        "Status: " + getInvoiceStatus()+ "\n"+
        "Payment Type: " + getPaymentType()+ "\n";
        }else{
        return "================INVOICE================"+ "\n"+
        "ID: " + super.getId()+ "\n"+
        "Food: " + super.getFood().getName()+ "\n"+
        "Date: " + dateNow.format(super.getDate().getTime())+ "\n"+
        "Customer: " + getCustomer().getName()+ "\n"+
        "Total Price: " + this.totalPrice + "(Terdapat promo code, silahkan gunakan)"+ "\n"+
        "Status: " + getInvoiceStatus()+ "\n"+
        "Payment Type: " + getPaymentType()+ "\n";
        }
        

        }
    
    
    
    
}
