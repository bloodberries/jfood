
/**
 * Ini adalah class food
 *
 * @author Alfian Firmansyah
 * @version 27-02-2020
 */
public class Food
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private Seller seller;
    private int price;
    private FoodCategory category;
    

    /**
     * Constructor for objects of class Food
     * @param id untuk inisiasi id dari input obyek baru
     * @param name untuk inisiasi name dari input obyek baru
     * @param seller untuk inisiasi seller dari input obyek baru
     * @param price untuk inisiasi price dari input obyek baru
     * @param category untuk inisiasi category dari input obyek baru
     */
    public Food(int id, String name, Seller seller, int price, FoodCategory category)
    {
        // initialise instance variables
        this.id = id;
        this.name = name;
        this.seller = seller;
        this.price = price;
        this.category = category;
   
    }


    /** 
     * Getter attribut id dalam class food
     * @return id
     */
    public int getId()
    {
        return id;
    }
    
    /** 
     * Getter attribut name dalam class food
     * @return name
     */
    public String getName(){
        return name;
    }
    
    /** 
     * Getter attribut seller dalam class food yang merupakan object member dari class Seller
     * @return seller
     */
    public Seller getSeller(){
        return seller;
    }
    
    
    /** 
     * Getter attribut price dalam class food
     * @return price
     */
    public int getPrice(){
        return price;
    }
    
    /** 
     * Getter attribut category dalam class food
     * @return category
     */
    public FoodCategory getCategory(){
        return category;
    }
    
    /** 
     * Getter attribut id dalam class food
     * @param name untuk set ke instance variable name
     */
    public void setName(String name){
        this.name = name;
    }
    
    /** 
     * Setter attribut seller dalam class food yang merupakan object member dari kelas Seller
     * @param seller untuk set ke instance variable seller
     */
    public void setSeller(Seller seller){
        this.seller = seller;
    }
    
    /** 
     * Seller attribut price dalam class food
     * @param price untuk set ke instance variable price
     */
    public void setPrice(int price){
        this.price = price;
    }
    
    /** 
     * Getter attribut category dalam class food
     * @param category untuk set ke instance variable category
     */
    public void setCategory(FoodCategory category){
        this.category = category;
    }
    
    /** 
     * Printdata food
     */
    public void printData(){
       System.out.println("================FOOD================");
       System.out.println("ID: " + getId());
       System.out.println("Name: " + getName());
       System.out.println("Seller: " + seller.getName());
       System.out.println("City: " + seller.getLocation().getCity());
       System.out.println("Price: " + getPrice());
       System.out.println("Category: " + getCategory());
       
    }
}
