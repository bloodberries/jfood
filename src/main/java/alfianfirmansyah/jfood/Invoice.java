package alfianfirmansyah.jfood;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Abstract Class Invoice merupakan blueprint data Resume Transaksi toko jfood.
 *
 * @author (Alfian Firmansyah)
 * @version (20.02.2020)
 */
public abstract class Invoice
{
    // membuat atribut dalam Class Invoice
    private int id;
    private ArrayList<Food> foods;
    private Calendar date;
    protected int totalPrice;       //dipanggil oleh setTotalPrice
    private Customer customer;
    private InvoiceStatus invoiceStatus;
    private SimpleDateFormat tgl = new SimpleDateFormat("dd MMMM yyyy");

    /**
     * Constructor for objects of class Invoice
     * @param id, food, date, customer, invoiceStatus untuk memasukkan nilai atribut
     */
    public Invoice(int id, ArrayList<Food> foods,  Customer customer)
    {
        this.id = id;
        this.foods = foods;
        this.customer = customer;
        this.invoiceStatus=InvoiceStatus.Ongoing;
    }

    /**
     * method accesor dalam Class Invoice
     * @return id untuk mengembalikan nilai atribut
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * method accesor dalam Class Invoice
     * @return food untuk mengembalikan nilai atribut
     */
    public ArrayList<Food> getFoods()
    {
        return foods;
    }
    
    /**
     * method accesor dalam Class Invoice
     * @return date untuk mengembalikan nilai atribut
     */
    public LocalDateTime getDate()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        LocalDateTime now = LocalDateTime.now();
        return now;
    }
    
    /**
     * method accesor dalam Class Invoice
     * @return totalPrice untuk mengembalikan nilai atribut
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    /**
     * method accesor dalam Class Invoice
     * @return customer untuk mengembalikan nilai atribut
     */
    public Customer getCustomer()
    {
        return customer;
    }

    /**
     * method abstract accessor dalam Class Invoice
     * method untuk diimplementasikan pada Class turunan CashInvoice dan CashlessInvoice
     */
    public abstract PaymentType getPaymentType();
    
    /**
     * method accesor dalam Class Invoice
     * @return invoiceStatus untuk mengembalikan nilai atribut
     */
    public InvoiceStatus getInvoiceStatus()
    {
        return invoiceStatus;
    }
    
    /**
     * method mutator dalam Class Invoice
     * @param id untuk memasukkan nilai id
     */
    public void setId (int id)
    {
        this.id = id;
    }
    
    /**
     * method mutator dalam Class Invoice
     * @param foods untuk memasukkan nilai food
     */
    public void setFoods (ArrayList<Food> foods)
    {
        this.foods = foods;
    }
    
    /**
     * method mutator dalam Class Invoice
     * @param date untuk memasukkan nilai date
     */
    public Calendar setDate (Calendar date)
    {
        return date;
    }

    /**
     * method mutator dalam Class Invoice
     * @param year, month, dayOfMonth untuk memasukkan nilai atribut
     */
    public void setDate(int year, int month, int dayOfMonth)
    {
       this.date = new GregorianCalendar (year, month, dayOfMonth);
    }
    
    /**
     * method abstract mutator dalam Class Invoice
     * method untuk diimplementasikan pada Class turunan CashInvoice dan CashlessInvoice
     */
    public abstract void setTotalPrice ();
    
    /**
     * method mutator dalam Class Invoice
     * @param customer untuk memasukkan nilai customer
     */
    public void setCustomer (Customer customer)
    {
        this.customer = customer;
    }

    /**
     * method abstract toString() dalam Class Invoice
     * method untuk diimplementasikan pada Class turunan CashInvoice dan CashlessInvoice
     */
    public abstract String toString();

    /**
     * method mutator dalam Class Invoice
     * @param invoiceStatus untuk memasukkan nilai invoiceStatus
     */
    public void setInvoiceStatus (InvoiceStatus invoiceStatus)
    {
        this.invoiceStatus = invoiceStatus;
    }
}