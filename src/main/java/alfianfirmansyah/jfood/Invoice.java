package alfianfirmansyah.jfood;
import java.util.*;
import java.util.Calendar;

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
    private ArrayList<Food> foods;
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
    public Invoice(int id, ArrayList<Food> foods, Customer customer)
    {
        // initialise instance variables
        this.id = id;
        this.foods = foods;
        Calendar now = Calendar.getInstance(); 
        this.date = now;
        this.customer = customer;
        this.invoiceStatus = InvoiceStatus.ONGOING;

    }

    /**
    * Getter id Invoice
    * @return id
     * @param id
    */
    public int getId(){
        return this.id;
    }
    
    /**
    * Getter idFood Invoice
    * @return idFood
    */
    public ArrayList<Food> getFoods(){
        return foods;
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
    public void setFoods(ArrayList<Food> foods){
        this.foods = foods;
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
   public abstract String toString();


}
