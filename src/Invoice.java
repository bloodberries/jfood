import java.util.*;
import java.util.regex.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
/**
 * Ini adalah class Invoice
 *
 * @author Alfian Firmansyah
 * @version 27-02-2020
 */
public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private Food food;
    private Calendar date;
    protected int totalPrice;
    private Customer customer;
    private InvoiceStatus invoiceStatus;
   // private PaymentType paymentType;
    

    /**
     * Constructor for objects of class Invoice
     * @param id untuk inisiasi id dari input obyek baru
     * @param idFood untuk inisiasi idFood dari input obyek baru
     * @param date untuk inisiasi date dari input obyek baru
     * @param customer untuk inisiasi customer dari input obyek baru
     * @param totalPrice untuk inisiasi total price dari input obyek baru
     */
    public Invoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
    {
        // initialise instance variables
        this.id = id;
        this.food = food;
        Calendar now = Calendar.getInstance(); 
        this.date = now;
        this.customer = customer;
        this.invoiceStatus = invoiceStatus;
    }

    /**
    * Getter id Invoice
    * @return id
    */
    public int getId(){
        return id;
    }
    
    /**
    * Getter idFood Invoice
    * @return idFood
    */
    public Food getFood(){
        return food;
    }
    
    /**
    * Getter date Invoice
    * @return date
    */
    public Calendar getDate(){
        return date;
    }
    
    /**
    * Getter totalPrice Invoice
    * @return totalPrice
    */
    public int getTotalPrice(){
        return totalPrice;
    }
    
    /**
    * Getter Customer Invoice
    * @return customer
    */
    public Customer getCustomer(){
        return customer;
    }
    
    public abstract PaymentType getPaymentType();
    
    public InvoiceStatus getInvoiceStatus(){
        return invoiceStatus;
    }
    
    /**
    * Setter id Invoice
    * @param id untuk set ke instance variable id
    */
    public void setId(int id){
        this.id = id;
    }
    
    /**
    * Setter idFood Invoice
    * @param idFood untuk set ke instance variable idFood
    */
    public void setFood(Food food){
        this.food = food;
    }
    
    /**
    * Setter date Invoice
    * @param date untuk set ke instance variable date
    */
    public Calendar setDate(Calendar date){
        return date;//this.date = date;
    }
    
    public Calendar setDate(int year, int month, int dayOfMonth){
        //this.date = date;
        return date;
    }
    
    /**
    * Setter total price for Invoice
    * @param totalPrice untuk set ke instance variable totalPrice
    */
    public abstract void setTotalPrice();
    
    /**
    * Setter customer Invoice; Member object from class Customer
    * @param customer untuk set ke instance variable customer
    */
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
   
    public void setInvoiceStatus(InvoiceStatus invoiceStatus){
        this.invoiceStatus = invoiceStatus;
    }
    
    /**
    * Print data invoice
    */
   public String toString(){
        return null;
    } 
}
