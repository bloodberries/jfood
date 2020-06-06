package alfianfirmansyah.jfood;

import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.xml.crypto.Data;

/**
 * Class DatabaseInvoice merupakan blueprint CRUD data Invoice.
 *
 * @author (Alfian Firmansyah)
 * @version (09.04.20)
 */
public class DatabaseInvoice
{
    // membuat atribut dalam Class DatabaseInvoice
    public static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int lastId=0;

    /**
     * method accesor dalam Class DatabaseInvoice
     * @return INVOICE_DATABASE untuk mengembalikkan nilai array
     */
    public static ArrayList<Invoice> getInvoiceDatabase() {return INVOICE_DATABASE;}

    /**
     * method accesor dalam Class DatabaseInvoice
     * @return lastId untuk mengembalikan nilai atribut
     */
    public static int getLastId() {return lastId;}

    /**
     * method accesor dalam Class DatabaseInvoice
     * @param id
     * @return invoice untuk mengembalikkan nilai array
     */
    public static Invoice getInvoiceById(int id)  throws InvoiceNotFoundException //method accesor dalam Class Seller
    {
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                return invoice;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

    /**
     * method accesor dalam Class DatabaseInvoice
     * @param customerId
     * @return list untuk mengembalikkan nilai array
     */
    public static ArrayList<Invoice> getInvoiceByCustomer(int customerId) throws CustomerNotFoundException //method accesor dalam Class Seller
    {
        ArrayList<Invoice> list = new ArrayList<Invoice>();
        for (Invoice invoice:INVOICE_DATABASE)
        {
            if(invoice.getCustomer().getId() == customerId)
            {
                list.add(invoice);
                return list;
            }
        }
        return null;
    }

    /**
     * method boolean mutator dalam Class DatabaseInvoice
     * @param invoice
     * @return true untuk menambahkan nilai dalam array
     */
    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException
    {
        // put your code here
        int customerId = invoice.getCustomer().getId();
        for (Invoice invoice1 : INVOICE_DATABASE)
        {
            if (invoice1.getCustomer().getId() == customerId && invoice1.getInvoiceStatus() == InvoiceStatus.Ongoing)
            {
                throw new OngoingInvoiceAlreadyExistsException (invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId=invoice.getId();
        return true;
    }

    /**
     * method boolean mutator dalam Class DatabaseInvoice
     * @param id, invoiceStatus
     * @return true untuk mengubah nilai dalam array
     */
    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus)
    {
        // put your code here
        for(Invoice invoice : INVOICE_DATABASE) {
            if(invoice.getId() == id && invoice.getInvoiceStatus().equals(InvoiceStatus.Ongoing)) {
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    /**
     * method boolean mutator dalam Class DatabaseInvoice
     * @param id
     * @return true untuk menghapus nilai dalam array
     */
    public static boolean removeInvoice(int id) throws InvoiceNotFoundException
    {
        // put your code here
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getId()==id)
            {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }
}
