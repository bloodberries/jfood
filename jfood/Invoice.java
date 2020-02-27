
/**
 * Ini adalah class Invoice
 *
 * @author Alfian Firmansyah
 * @version 27-02-2020
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private int idFood;
    private String date;
    private int totalPrice;
    private Customer customer;

    /**
     * Constructor for objects of class Invoice
     * @param id untuk inisiasi id dari input obyek baru
     * @param idFood untuk inisiasi idFood dari input obyek baru
     * @param date untuk inisiasi date dari input obyek baru
     * @param customer untuk inisiasi customer dari input obyek baru
     * @param totalPrice untuk inisiasi total price dari input obyek baru
     */
    public Invoice(int id, int idFood, String date, Customer customer, int totalPrice)
    {
        // initialise instance variables
        this.id = id;
        this.idFood = idFood;
        this.date = date;
        this.customer = customer;
        this.totalPrice = totalPrice;
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
    public int getIdFood(){
        return idFood;
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
    public void setIdFoods(int idFood){
        this.idFood = idFood;
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
    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }
    
    /**
    * Setter customer Invoice; Member object from class Customer
    * @param customer untuk set ke instance variable customer
    */
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    /**
    * Print data invoice
    */
    public void printData(){
    
    }
}
