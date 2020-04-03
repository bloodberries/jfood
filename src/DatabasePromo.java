import javax.swing.*;
import java.util.ArrayList;

/**
 * Write a description of class DatabasePromo here.
 *
 * @author Alfian Firmansyah
 * @version 1.0
 */
public class DatabasePromo{
    // instance variables - replace the example below with your own

   private ArrayList<Promo> PROMO_DATABASE;
   private int lastId = 0;


    public static ArrayList<Promo> getPromoDatabase() {
        return PROMO_DATABASE;
    }
    public int getLastId(){
        return lastId;
    }
    public Promo getPromoById(int id){
        for(Promo i : PROMO_DATABASE)
        {
            if(i.getId() == id)
                return i;
        }

        return null;
    }
    public Promo getPromoByCode(String code){
        for(Promo i : PROMO_DATABASE)
        {
            if(i.getCode() == code)
                return i;
        }

        return null;
    }

    public static boolean addPromo(Promo promo){
        PROMO_DATABASE.add(promo);
        lastId = promo.getId();

        return true;
    }

    public boolean activePromo(int id){
        for(Promo i : PROMO_DATABASE)
        {
            if(i.getId() == id)
                i.setActive(true);
            return true;
        }

        return false;
    }

    public boolean deactivePromo(int id){
        for(Promo i : PROMO_DATABASE)
        {
            if(i.getId() == id)
                i.setActive(false);
            return true;
        }

        return false;
    }

    public boolean removePromo(int id){
        for(Promo i : PROMO_DATABASE)
        {
            if(i.getId() == id)
            {
                PROMO_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }



}
