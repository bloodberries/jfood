
/**
 * Ini adalah class seller
 *
 * @author Alfian Firmansyah
 * @version 27-01-2020
 */
public class Seller
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor for objects of class Seller
     * @param id untuk inisiasi id dari input obyek baru
     * @param name untuk inisiasi name dari input obyek baru
     * @param email untuk inisiasi email dari input obyek baru
     * @param phoneNumber untuk inisiasi phoneNumber dari input obyek baru
     * @param locaion untuk inisiasi location dari input obyek baru
     */
    public Seller(int id, String name, String email, String phoneNumber, Location location)
    {
        // initialise instance variables
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    /**
     * Getter id for Seller
     * @return id
     */
    public int getId(){
        return id;
    }
    
    /**
     * Getter name for Seller
     * @return name
     */
    public String getName(){
        return name;
    }
    
    /**
     * Getter email for Seller
     * @return email
     */
    public String getEmail(){
        return email;
    }
    
    /**
     * Getter phone number for Seller
     * @return phoneNumber
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    /**
     * Getter location for Seller; Object member dari class location
     * @return location
     */
    public Location getLocation(){
        return location;
    }
    
    /**
     * Setter id for Seller
     * @param id untuk set ke instance variable id
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * Setter name for Seller
     * @param name untuk set ke instance variable name
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Setter email for Seller
     * @param email untuk set ke instance variable email
     */
    public void setEmail(String email){
        this.email = email;
    }
    
    /**
     * Setter phone number for Seller
     * @param phoneNumber untuk set ke instance variable phoneNumber
     */
    public void setPhoneNUmber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Setter location for Seller, based on object model from class Location
     * @param location untuk set ke instance variable location
     */
    public void setLocation(Location location){
        this.location = location;
    }
    
    /**
     * print data seller
     */
    public void printData(){
        //getName();
        System.out.println(getName());
    }
}
