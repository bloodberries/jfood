package alfianfirmansyah.jfood;
import java.util.ArrayList;

/**
 * Write a description of class DatabaseSeller here.
 *
 * @author Alfian Firmansyah
 * @version 28-02-2020
 */
public class DatabaseSeller
{
    // instance variables - replace the example below with your own
    private static ArrayList<Seller> SELLER_DATABASE = new ArrayList<>();
    private static int lastId = 0;





    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the sum of x and y
     */

    public static boolean addSeller(Seller seller) {

        SELLER_DATABASE.add(seller);
        lastId=seller.getId();
        return true;
    }

    public static boolean removeSeller(int id)throws SellerNotFoundException {
        for(Seller seller : SELLER_DATABASE) {
            if(seller.getId()==id) {
                SELLER_DATABASE.remove(seller);
                return true;
            }
        }
        throw new SellerNotFoundException(id);
    }

    public static Seller getSeller(){
        return null;
    }

    public static ArrayList<Seller> getSellerDatabase(){
        return SELLER_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Seller getSellerById(int id)throws SellerNotFoundException {
        for(Seller seller : SELLER_DATABASE) {
            if(seller.getId()==id) {
                return seller;
            }
        }
        throw new SellerNotFoundException(id);
    }
}