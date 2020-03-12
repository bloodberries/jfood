
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
    private String date;
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
    public Invoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        // initialise instance variables
        this.id = id;
        this.food = food;
        this.date = date;
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
    public String getDate(){
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
    public void setDate(String date){
        this.date = date;
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
    public abstract void printData();
    /*
    {
        System.out.println("================INVOICE================");
        System.out.println("ID: " + getId());
        System.out.println("Food ID: " + getIdFood());
        System.out.println("Date: " + getDate());
        System.out.println("Customer: " + customer.getName());
        System.out.println("Total Price: " + getTotalPrice());
        System.out.println("Status: " + status.FINISHED);
        
    }
    */
}
