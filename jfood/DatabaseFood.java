
/**
 * Ini adalah class Databasefood
 * digunakan untuk mengakses database
 *
 * @author Alfian Firmansyah
 * @version 27-02-2020
 */
public class DatabaseFood
{
    // instance variables - replace the example below with your own
    private static String[] listFood;

    /**
     * Setter boolean addfood to DatabaseFood
     * @param food untuk mengambil status food sedang di add atau tidak
     */
    public static boolean addFood(Food food){
        return true;
    }
    
    /**
     * Setter boolean removefood to DatabaseFood
     * @param food untuk mengambil status food sedang di add atau ditidak
     */
    public static boolean removeFood(Food food){
        return false;
    }
    
    /**
     * Getter food from DatabaseFood
     * @return null 
     */
    public static Food getFood(){
        return null;
    }
    
    /**
     * Getter listfood from DatabaseFood
     * @return listfood untuk mereturn array food
     */
    public static String[] getListFood(){
        return listFood;
    }
}
