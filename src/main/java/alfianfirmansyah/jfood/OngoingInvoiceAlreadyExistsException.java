package alfianfirmansyah.jfood;

/**
 * Class OngoingInvoiceAlreadyExistsException merupakan blueprint Error Handling double data Ongoing Invoice.
 *
 * @author (Alfian Firmansyah)
 * @version (13.04.20)
 */
public class OngoingInvoiceAlreadyExistsException extends Exception
{
    // membuat atribut dalam Class OngoingInvoiceAlreadyExistsException
    private Invoice invoice_error;

    /**
     * method mutator dalam Class OngoingInvoiceAlreadyExistsException
     * @param invoice_input untuk memasukkan nilai atribut
     */
    public OngoingInvoiceAlreadyExistsException (Invoice invoice_input)
    {
        super("Ongoing Invoice: ");
        this.invoice_error=invoice_input;
    }

    /**
     * method accesor dalam Class OngoingInvoiceAlreadyExistsException
     * @return invoice_error untuk mengembalikan nilai atribut
     */
    public String getMessage()
    {
        return super.getMessage()+ invoice_error.getInvoiceStatus()+"Ongoing Invoice";
    }
}
