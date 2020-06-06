package alfianfirmansyah.jfood;

/**
 * Class CustomerNotFoundException merupakan blueprint Error Handling data Customer.
 *
 * @author (Alfian Firmansyah)
 * @version (12.04.20)
 */
public class CustomerNotFoundException extends Exception
{
    // membuat atribut dalam Class CustomerNotFoundException
    private int customer_error;

    /**
     * method mutator dalam Class CustomerNotFoundException
     * @param customer_input untuk memasukkan nilai atribut
     */
    public CustomerNotFoundException (int customer_input)
    {
        super("Customer ID: ");
        this.customer_error=customer_input;
    }

    /**
     * method accesor dalam Class CustomerNotFoundException
     * @return customer_error untuk mengembalikan nilai atribut
     */
    public String getMessage()
    {
        return super.getMessage()+customer_error+"not found";
    }
}
