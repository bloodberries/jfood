package alfianfirmansyah.jfood;
/**
 * Ini adalah class Location
 *
 * @author Alfian Firmansyah
 * @version 27-2-2020
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String description;
    private String city;

    /**
     * Constructor for objects of class Location
     * @param city untuk inisiasi city dari input obyek baru
     * @param province untuk inisiasi province dari input obyek baru
     * @param description untuk inisiasi description dari input obyek baru
     */
    public Location(String city, String province, String description)
    {
        // initialise instance variables
        this.city = city;
        this.province = province;
        this.description = description;
        
    }
    
    /**
    * Getter province Location
    * @return province
    */
    public String getProvince(){
        return province;
    }
    
    /**
    * Getter city Location
    * @return province
    */
    public String getCity(){
        return city;
    }

    /**
    * Getter Description Location
    * @return description
    */
    public String getDescription(){
        return description;
    }
    
    /**
    * Setter Province Location
    * @param province untuk set ke instance variable province
    */
    public void setProvince(String province){
        this.province = province;
    }
   
    /**
    * Setter City Location
    * @param city untuk set ke instance variable city
    */
    public void setCity(String city){
        this.city = city;
    }
    
    /**
    * Setter Province Location
    * @param description untuk set ke instance variable description
    */
    public void setDescription(String description){
        this.description = description;
    }
    

    /**
    * Print data lokasi
    */
    public void printData(){
        System.out.println(getProvince());
        // getProvince();
    }
    
}
