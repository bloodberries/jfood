package alfianfirmansyah.jfood;
import java.util.*;

/**
 * Write a description of class DatabaseTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseTest
{
    // instance variables - replace the example below with your own
    private static ArrayList<Food> FOOD_DATABASE = new ArrayList<>();
    private static int LAST_FOOD_ID = 0;
    
    public static ArrayList<Food> getFoodDatabase(){
        return FOOD_DATABASE;
    }

    public static int getLastFoodId(){
        return LAST_FOOD_ID;
    }
    
    @Override
    public String toString(){
        return (
        "Food " + getLastFoodId() + "Data: " + getFoodDatabase()
        );
    }
    
}
