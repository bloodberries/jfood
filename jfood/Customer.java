
/**
 * Ini adalah class customer
 *
 * @author Alfian Firmansyah
 * @version 27-2-2020
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;
    

    /**
     * Constructor for objects of class Customer
     * @param id untuk inisiasi id dari input obyek baru
     * @param name inisiasi name dari input obyek baru
     * @param email inisiasi email dari input obyek baru
     * @param password inisiasi password dari input obyek baru
     * @param joinDate inisiasi join date dari input obyek baru
     */
    public Customer(int id, String name, String email, String password, String joinDate)
    {
        // initialise instance variables
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }

    /**
    * Getter id Customer
    * @return id
    */
    public int getId(){
        return id;
    }
    
    /**
    * Getter name Customer
    * @return name
    */
    public String getName(){
        return name;
    }
    
    /**
    * Getter email Customer
    */
    public String getEmail(){
        return email;
    }
    
    /**
    * Getter id Customer
    * @return password
    */
    public String getPassword(){
        return password;
    }
    
    /**
    * Getter joinDate Customer
    * @return joinDate
    */
    public String getJoinDate(){
        return joinDate;
    }
    
    /**
    * Setter id Customer
    * @param id untuk set ke instance variable id
    */
    public void setId(int id){
        this.id = id;
    }
    
    /**
    * Setter email Customer
    * @param email untuk set ke instance variable email
    */
    public void setEmail(String email){
        this.email = email;
    }
    
    /**
    * Setter id Customer
    * @param password untuk set ke instance variable password
    */
    public void setPassword(String password){
        this.password = password;
    }
    
    /**
    * Setter joinDate Customer
    * @param joinDate untuk set ke instance variable join date
    */
    public void setJoinDate(String joinDate){
        this.joinDate = joinDate;
    }
    
    /**
    * print data customer name
    */
    public void printData(){
        // getName();
        System.out.println(getName());
    }
}
