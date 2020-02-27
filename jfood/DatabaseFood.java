
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
    private String[] listFood;

    
    /**
     * Constructor for objects of class DatbaseFood
     */
    public DatabaseFood()
    {
        // initialise instance variables
        
    }

    /**
     * Setter boolean addfood to DatabaseFood
     * @param food untuk mengambil status food sedang di add atau tidak
     */
    public boolean addFood(Food food){
        return true;
    }
    
    /**
     * Setter boolean removefood to DatabaseFood
     * @param food untuk mengambil status food sedang di add atau ditidak
     */
    public boolean removeFood(Food food){
        return false;
    }
    
    /**
     * Getter food from DatabaseFood
     * @return null 
     */
    public Food getFood(){
        return null;
    }
    
    /**
     * Getter listfood from DatabaseFood
     * @return listfood untuk mereturn array food
     */
    public String[] getListFood(){
        return listFood;
    }
}
