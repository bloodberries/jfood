package alfianfirmansyah.jfood;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

/**
 * Class Customer merupakan blueprint data Riwayat Pembeli.
 *
 * @author (Alfian Firmansyah)
 * @version (20.02.20)
 */
public class Customer
{
    // membuat atribut dalam Class Customer
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;
    private SimpleDateFormat tgl = new SimpleDateFormat("dd MMMM yyyy");
    
    /**
     * Constructor Customer
     * @param  id, name, email, password, joinDate untuk memasukkan nilai atribut
     */
    public Customer(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id=id;
        this.name=name;
        setEmail(email);
        setPassword(password);
        this.joinDate=joinDate;
    }

    /**
     * Constructor Customer
     * @param  id, name, email, password, joinDate untuk memasukkan nilai atribut
     */
    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id=id;
        this.name=name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar (dayOfMonth, month-1, year);
    }

    /**
     * Constructor Customer
     * @param  id, name, email, password untuk memasukkan nilai atribut
     */
    public Customer(int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = Calendar.getInstance();
    }
    
    /**
     * method accesor Id dalam Class Customer
     * @return id untuk mengembalikan nilai atribut
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * method accesor Name dalam Class Customer
     * @return name untuk mengembalikan nilai atribut
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * method accesor Email dalam Class Customer
     * @return email untuk mengembalikan nilai atribut
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * method accesor Password dalam Class Customer
     * @return password untuk mengembalikan nilai atribut
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * method accesor JoinDate dalam Class Customer
     * @return joinDate untuk mengembalikan nilai atribut
     */
    public Calendar getJoinDate()
    {
        return joinDate;
    }
    
    /**
     * method mutator Id dalam Class Customer
     * @param id untuk memasukkan nilai id
     */
    public void setId(int id)
    { 
        this.id = id;
    }
    
    /**
     * method mutator Name dalam Class Customer
     * @param name untuk memasukkan nilai name
     */
    public void setName(String name)
    {
       this.name = name;
    }
    
    /**
     * method mutator Email dalam Class Customer
     * @param email untuk memasukkan nilai email
     */
    public void setEmail(String email)
    {
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
     * method mutator Password dalam Class Customer
     * @param password untuk memasukkan nilai password
     */
    public void setPassword(String password)
    {
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
     * method mutator JoinDate dalam Class Customer
     * @param joinDate untuk memasukkan nilai joinDate
     */
    public void setJoinDate(Calendar joinDate)
    {
       this.joinDate = joinDate;
    }
    
    public void setJoinDate(int dayOfMonth, int month, int year)
    {
       this.joinDate = new GregorianCalendar (dayOfMonth, month-1, year);
    }
    
    /**
     * method toString() dalam Class Customer
     * @return id, name, email, password, joinDate untuk mengembalikkan atribut kedalam tipe data String
     */
    public String toString()
    {
        SimpleDateFormat formatDate = new SimpleDateFormat ("dd MMMM yyyy");
        if (joinDate == null){
            return String.format("==========CUSTOMER==========" + "\n" +
                    "Id=" + getId() + "\n" +
                    "Nama=" + getName() + "\n" +
                    "Email=" + getEmail() + "\n" +
                    "Password=" + password + "\n" +
                    "Join Date=" + null + "\n");
        } else {
            return String.format("==========CUSTOMER==========" + "\n" +
                    "Id=" + getId() + "\n" +
                    "Nama=" + getName() + "\n" +
                    "Email=" + getEmail() + "\n" +
                    "Password=" + password + "\n" +
                    "Join Date=" + formatDate.format(joinDate.getTime()) + "\n");

        }
    }

}
