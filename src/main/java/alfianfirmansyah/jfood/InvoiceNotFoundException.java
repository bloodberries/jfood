package alfianfirmansyah.jfood;

/**
 * Class InvoiceNotFoundException merupakan blueprint Error Handling data Invoice.
 *
 * @author (Alfian Firmansyah)
 * @version (13.04.20)
 */
public class InvoiceNotFoundException extends Exception
{
    // membuat atribut dalam Class InvoiceNotFoundException
    private static int invoice_error;

    /**
     * method mutator dalam Class InvoiceNotFoundException
     * @param invoice_error untuk memasukkan nilai atribut
     */
    public InvoiceNotFoundException (int invoice_error)
    {
        super("Invoice ID: ");
        this.invoice_error=invoice_error;
    }

    /**
     * method accesor dalam Class InvoiceNotFoundException
     * @return invoice_error untuk mengembalikan nilai atribut
     */
    public String getMessage()
    {
        return super.getMessage()+invoice_error+"not found";
    }
}
