
/**
 * Write a description of class Location here.
 *
 * @author Alfian Firmansyah
 * @version 1.0
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String description;
    private String city;

    /**
     * Constructor for objects of class Location
     */
    public Location(String city, String province, String description)
    {
        // initialise instance variables
        this.city = city;
        this.province = province;
        this.description = description;
        
    }
    
    public String getProvince(){
        return province;
    }
    
    public String getCity(){
        return city;
    }

    public String getDescription(){
        return description;
    }
    
    public void setProvince(String province){
        this.province = province;
    }
   
    public void setCity(String city){
        this.city = city;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void printData(){
        System.out.println(province);
        // getProvince();
    }
    
}
