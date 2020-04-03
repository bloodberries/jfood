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

        if (FOOD_DATABASE.add(food)) {
            FOOD_DATABASE.indexOf(food);
            return true;
        }
        return false;
    }


    /** <h1> This method used for removing food from the database </h1>

     * @return boolean
     */
    public static boolean removeFood(int id) {
        Food food = FOOD_DATABASE.get(id);
        if (food != null) {
            FOOD_DATABASE.remove(food);
            return true;
        }
        return false;
    }


    /**
     * <h1>This method will return the food object</h1>
     * @return Food object
     */
    public static Food getFoodById(int idx){
        Food food = FOOD_DATABASE.get(idx);

        if (food != null) {
            return food;
        }
        return null;
    }

    public static ArrayList<Food> getFoodBySeller(int idseller) {
        ArrayList<Food> ret = new ArrayList<>();
        for (Food food: FOOD_DATABASE) {
            if (food.getSeller().getId() == idseller) {
                ret.add(food);
            }
        }
        return ret;
    }

    public static ArrayList<Food> getFoodByCategory(FoodCategory category) {
        ArrayList<Food> ret = new ArrayList<>();
        for (Food food: FOOD_DATABASE) {
            if (food.getCategory() == category) {
                ret.add(food);
            }
        }
        return ret;
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