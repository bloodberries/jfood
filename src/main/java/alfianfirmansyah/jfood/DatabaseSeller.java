package alfianfirmansyah.jfood;

import java.util.ArrayList;

/**
 * Class DatabaseSeller merupakan blueprint CRUD data Riwayat Penjual.
 *
 * @author (Alfian Firmansyah)
 * @version (28.02.20)
 */
public class DatabaseSeller
{
    // membuat atribut dalam Class DatabaseSeller
    public static ArrayList<Seller> SELLER_DATABASE = new ArrayList<>();
    private static int lastId=0;

    /**
     * method accesor dalam Class DatabaseSeller
     * @return SELLER_DATABASE untuk mengembalikkan nilai array
     */
    public static ArrayList<Seller> getSellerDatabase() {return SELLER_DATABASE;}

    /**
     * method accesor dalam Class DatabaseSeller
     * @return lastId untuk mengembalikan nilai atribut
     */
    public static int getLastId() {return lastId;}

    /**
     * method accesor dalam Class DatabaseSeller
     * @param id
     * @return seller untuk mengembalikkan nilai array
     */
    public static Seller getSellerById(int id) throws SellerNotFoundException
    {
        // put your code here
        for (Seller seller : SELLER_DATABASE) {
            if (seller.getId() == id) {
                return seller;
            }
        }
        throw new SellerNotFoundException(id);
    }

    /**
     * method boolean mutator dalam Class DatabaseSeller
     * @param seller
     * @return true untuk menambahkan nilai dalam array
     */
        public static boolean addSeller(Seller seller)
        {
            // put your code here
            SELLER_DATABASE.add(seller);
            lastId=seller.getId();
            return true;
        }

    /**
     * method boolean mutator dalam Class DatabaseSeller
     * @param id
     * @return true untuk menghapus nilai dalam array
     */
    public static boolean removeSeller(int id) throws SellerNotFoundException
    {
        // put your code here
        for(Seller sell : SELLER_DATABASE){
            if(sell.getId()==id){
                SELLER_DATABASE.remove(sell);
                return true;
            }
        }
        throw new SellerNotFoundException(id);
    }
}
