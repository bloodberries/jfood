package alfianfirmansyah.jfood;

import java.util.ArrayList;

/**
 * Class DatabasePromo merupakan blueprint CRUD data aneka Promo.
 *
 * @author (Alfian Firmansyah)
 * @version (13.03.2020)
 */
public class DatabasePromo
{
    // membuat atribut dalam Class DatabasePromo
    public static ArrayList<Promo> PROMO_DATABASE = new ArrayList<Promo>();
    private static int lastId=0;

    /**
     * method accesor dalam Class DatabasePromo
     * @return PROMO_DATABASE untuk mengembalikkan nilai array
     */
    public static ArrayList<Promo> getPromoDatabase() {return PROMO_DATABASE;}

    /**
     * method accesor dalam Class DatabasePromo
     * @return lastId untuk mengembalikan nilai atribut
     */
    public static int getLastId() {return lastId;}

    /**
     * method accesor dalam Class DatabasePromo
     * @param id
     * @return promo untuk mengembalikkan nilai array
     */
    public static Promo getPromoById(int id) throws PromoNotFoundException  //method accesor dalam Class Seller
    {
        for (Promo promo : PROMO_DATABASE) {
            if (promo.getId() == id) {
                return promo;
            }
        }
        throw new PromoNotFoundException(id);
    }

    /**
     * method accesor dalam Class DatabasePromo
     * @param code
     * @return promo untuk mengembalikkan nilai array
     */
    public static Promo getPromoByCode(String code)
    {
        for(Promo promo:PROMO_DATABASE)
        {
            if(promo.getCode().equals(code))
            {
                return promo;
            }
        }
        return null;
    }

    /**
     * method boolean mutator dalam Class DatabasePromo
     * @param promo
     * @return true untuk menambahkan nilai dalam array
     */
    public static boolean addPromo(Promo promo) throws PromoCodeAlreadyExistsException
    {
        // put your code here
        for (Promo element : PROMO_DATABASE)
        {
            if(element.getCode().equals(promo.getCode()))
            {
                throw new PromoCodeAlreadyExistsException (promo);
            }
        }
        PROMO_DATABASE.add(promo);
        lastId=promo.getId();
        return true;
    }

    /**
     * method boolean mutator dalam Class DatabasePromo
     * @param id
     * @return true untuk mengaktifkan nilai dalam array
     */
    public static boolean activatePromo(int id)
    {
        for(Promo promo:PROMO_DATABASE)
        {
            if(promo.getId()==id)
            {
            promo.setActive(true);
            return true;
            }
        }
        return false;
    }

    /**
     * method boolean mutator dalam Class DatabasePromo
     * @param id
     * @return true untuk menonaktifkan nilai dalam array
     */
    public static boolean deactivatePromo(int id)
    {
        for (Promo promo : PROMO_DATABASE) {
            if (promo.getActive()) {
                promo.setActive(false);
                return true;
            }
        }
        return false;
    }

    /**
     * method boolean mutator dalam Class DatabasePromo
     * @param id
     * @return true untuk menghapus nilai dalam array
     */
    public static boolean removePromo(int id) throws PromoNotFoundException
    {
        for(Promo promo : PROMO_DATABASE) {
            if(promo.getId() == id) {
                PROMO_DATABASE.remove(promo);
                return true;
            }
        }
        throw new PromoNotFoundException(id);
    }
}
