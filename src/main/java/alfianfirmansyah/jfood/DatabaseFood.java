package alfianfirmansyah.jfood;
import java.util.ArrayList;

import java.util.*;
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
    private static ArrayList<Food> FOOD_DATABASE = new ArrayList<>();
    private static int lastId = 0;


    /**
     * <h1> This method used for adding food to the database</h1>
     * @param food
     * @return boolean
     */
    public static boolean addFood(Food food) {
        FOOD_DATABASE.add(food);
        lastId=food.getId();
        return true;
    }


    /** <h1> This method used for removing food from the database </h1>

     * @return boolean
     */
    public static boolean removeFood(int id)throws FoodNotFoundException {
        for(Food food : FOOD_DATABASE) {
            if(food.getId() == id) {
                FOOD_DATABASE.remove(food);
                return true;
            }
        }
        throw new FoodNotFoundException(id);
    }


    /**
     * <h1>This method will return the food object</h1>
     * @return Food object
     */
    public static Food getFoodById(int id) throws FoodNotFoundException
    {
        for(Food food : FOOD_DATABASE) {
            if(food.getId() == id) {
                return food;
            }
        }
        throw new FoodNotFoundException(id);
    }

    public static ArrayList<Food> getFoodBySeller(int idSeller) throws SellerNotFoundException {
        ArrayList<Food> foodList = new ArrayList<Food>();
        Seller seller = DatabaseSeller.getSellerById(idSeller);
        for(Food food : FOOD_DATABASE) {
            if(food.getSeller().equals(seller)) {
                foodList.add(food);
            }
        }
        return foodList;
    }

    public static ArrayList<Food> getFoodByCategory(FoodCategory category) {
        ArrayList<Food> foodList = new ArrayList<Food>();
        for(Food food : FOOD_DATABASE) {
            if(food.getCategory().equals(category)) {
                foodList.add(food);
            }
        }
        return foodList;
    }
    /**
     * <h1>This method will return a list of food as an array of string</h1>
     * @return String[]
     */
    public static ArrayList<Food> getFoodDatabase(){
        return FOOD_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }
}