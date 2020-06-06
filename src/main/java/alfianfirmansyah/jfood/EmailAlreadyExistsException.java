package alfianfirmansyah.jfood;

/**
 * Class EmailAlreadyExistsException merupakan blueprint Error Handling dauble data Promo.
 *
 * @author (Alfian Firmansyah)
 * @version (12.04.20)
 */
public class EmailAlreadyExistsException extends Exception
{
    // membuat atribut dalam Class EmailAlreadyExistsException
    private Customer customer_error;

    /**
     * method mutator dalam Class EmailAlreadyExistsException
     * @param customer_input untuk memasukkan nilai atribut
     */
    public EmailAlreadyExistsException (Customer customer_input)
    {
        super("Customer Email: ");
        this.customer_error=customer_input;
    }

    /**
     * method accesor dalam Class EmailAlreadyExistsException
     * @return customer_error untuk mengembalikan nilai atribut
     */
    public String getMessage()
    {
        return super.getMessage()+customer_error.getEmail()+"already exists";
    }
}
