package alfianfirmansyah.jfood;
import java.util.*;
import java.util.regex.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
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
    private Calendar joinDate;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");

    /**
     * Constructor for objects of class Customer
     * @param id untuk inisiasi id dari input obyek baru
     * @param name inisiasi name dari input obyek baru
     * @param email inisiasi email dari input obyek baru
     * @param password inisiasi password dari input obyek baru
     * @param joinDate inisiasi join date dari input obyek baru
     */
    public Customer(int id, String name, String email, String password, Calendar joinDate)
    {
        // initialise instance variables
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }
    
    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth){
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar(year,month - 1, dayOfMonth);
    }
    
    public Customer(int id, String name, String email, String password){
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        Calendar c = Calendar.getInstance(); 
        this.joinDate = c;
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
    public Calendar getJoinDate(){
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
        String emailRegex = "^[\\w&*~-]+(?:\\.[\\w&*~-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pat = Pattern.compile(emailRegex);
        Matcher matcher = pat.matcher(email);
        if (matcher.matches())
        {
            this.email = email;
        }
        else 
        {
            this.email = "";
        }
    }
    
    /**
    * Setter id Customer
    * @param password untuk set ke instance variable password
    */
    public void setPassword(String password){
        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{6,}$";
        Pattern pas = Pattern.compile(passwordRegex);
        Matcher matcher = pas.matcher(password);
        if (matcher.matches())
        {
            this.password = password;
        }
        else 
        {
            this.password = "";
        }
    }
    
    /**
    * Setter joinDate Customer
    * @param joinDate untuk set ke instance variable join date
    */
    public void setJoinDate(Calendar joinDate){
        this.joinDate = joinDate;
    }
    
    public void setJoinDate(int year, int month, int dayOfMonth){
        this.joinDate = new GregorianCalendar(year, month - 1, dayOfMonth);
    }
    
    /**
    * print data customer name
    */
   
    
    public String toString(){
        
       SimpleDateFormat dateNow = this.dateFormat;
        // getName();
        if (joinDate != null){
            return "================Customer================\n" + 
       "Id : " + getId() + "\n" +
       "Nama : " + getName() + "\n" +
       "Email : " + getEmail() + "\n" +
       "Password : " + getPassword() + "\n" +
       "JoinDate: " + dateNow.format(joinDate.getTime());
        }else{
            return "================Customer================\n" + 
       "Id : " + getId() + "\n" +
       "Nama : " + getName() + "\n" +
       "Email : " + getEmail() + "\n" +
       "Password : " + getPassword() + "\n";
        }
       
       
    }
}
