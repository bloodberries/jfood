package alfianfirmansyah.jfood;

/**
 * Class PromoCodeAlreadyExistsException merupakan blueprint Error Handling dauble data Promo.
 *
 * @author (Alfian Firmansyah)
 * @version (12.04.20)
 */
public class PromoCodeAlreadyExistsException extends Exception
{
    // membuat atribut dalam Class PromoCodeAlreadyExistsException
    private Promo promo_error;

    /**
     * method mutator dalam Class PromoCodeAlreadyExistsException
     * @param promo_input untuk memasukkan nilai atribut
     */
    public PromoCodeAlreadyExistsException (Promo promo_input)
    {
        super("Promo Code: ");
        this.promo_error=promo_input;
    }

    /**
     * method accesor dalam Class PromoCodeAlreadyExistsException
     * @return promo_error untuk mengembalikan nilai atribut
     */
    public String getMessage()
    {
        return super.getMessage()+promo_error.getCode()+"already exists";
    }
}
