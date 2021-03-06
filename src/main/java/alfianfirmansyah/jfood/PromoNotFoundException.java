package alfianfirmansyah.jfood;

/**
 * Class PromoNotFoundException merupakan blueprint Error Handling data Promo.
 *
 * @author (Alfian Firmansyah)
 * @version (12.04.20)
 */
public class PromoNotFoundException extends Exception
{
    // membuat atribut dalam Class PromoNotFoundException
    private int promo_error;

    /**
     * method mutator dalam Class PromoNotFoundException
     * @param promo_error untuk memasukkan nilai atribut
     */
    public PromoNotFoundException (int promo_error)
    {
        super("Promo ID: ");
        this.promo_error=promo_error;
    }

    /**
     * method accesor dalam Class PromoNotFoundException
     * @return promo_error untuk mengembalikan nilai atribut
     */
    public String getMessage()
    {
        return super.getMessage()+promo_error+"not found";
    }
}
