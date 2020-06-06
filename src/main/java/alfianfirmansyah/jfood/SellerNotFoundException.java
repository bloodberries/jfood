package alfianfirmansyah.jfood;

/**
 * Class SellerNotFoundException merupakan blueprint Error Handling data Seller.
 *
 * @author (Alfian Firmansyah)
 * @version (12.04.20)
 */
public class SellerNotFoundException extends Exception
{
    // membuat atribut dalam Class SellerNotFoundException
    private int seller_error;

    /**
     * method mutator dalam Class SellerNotFoundException
     * @param seller_error untuk memasukkan nilai atribut
     */
    public SellerNotFoundException (int seller_error)
    {
        super("Seller ID: ");
        this.seller_error=seller_error;
    }

    /**
     * method accesor dalam Class SellerNotFoundException
     * @return seller_error untuk mengembalikan nilai atribut
     */
    public String getMessage()
    {
        return super.getMessage()+seller_error+"not found";
    }
}
