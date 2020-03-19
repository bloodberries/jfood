
/**
 * Write a description of class Promo here.
 *
 * @author Alfian FIrmansyah
 * @version 1.0
 */
public class Promo
{
    // instance variables - replace the example below with your own
    private int id;
    private String code;
    private int discount;
    private int minPrice;
    private boolean active;

    /**
     * Constructor for objects of class Promo
     */
    public Promo(int id, String code, int discount, int minPrice, boolean active)
    {
        this.id = id;
        this.code = code;
        this.discount = discount;
        this.minPrice = minPrice;
        this.active = active;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId(){
        return id;
    }
    
    public String getCode(){
        return code;
    }
    
    public int getDiscount(){
        return discount;
    }
    
    public int getMinPrice(){
        return minPrice;
    }
    
    public boolean getActive(){
        return active;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    
    public void setDiscount(int discount){
        this.discount = discount;
    }
    
    public void setMinPrice(int minPrice){
        this.minPrice = minPrice;
    }
    
    public void setActive(boolean active){
        this.active = active;
    }
    
    public String toString(){
        return "================Promo================\n" +
        "Id : " + getId() + "\n" +
        "Code : " + getCode() + "\n" +
        "Discount : " + getDiscount() + "\n" + 
        "MinPrice : " + getMinPrice() + "\n" + 
        "Active Status : " + getActive() + "\n";
    }
    
}
