package alfianfirmansyah.jfood;

/**
 * Class PromoNotFoundException merupakan blueprint Error Handling data Promo.
 *
 * @author (Alfian Firmansyah)
 * @version (12.04.20)
 */
public class PromoNotFoundException2 extends Exception
{
    // membuat atribut dalam Class PromoNotFoundException
    private String promo_error;

    /**
     * method mutator dalam Class PromoNotFoundException
     * @param promo_error untuk memasukkan nilai atribut
     */
    public PromoNotFoundException2 (String promo_error)
    {
        super("Promo Code: ");
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
