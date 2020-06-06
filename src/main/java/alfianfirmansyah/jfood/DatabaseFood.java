package alfianfirmansyah.jfood;

import java.util.ArrayList;
import java.lang.reflect.Array;

/**
 * Class DatabaseFood merupakan blueprint CRUD data Menu Food.
 *
 * @author (Alfian Firmansyah)
 * @version (27.02.20)
 */
public class DatabaseFood
{
    // membuat atribut dalam Class DatabaseFood
    public static ArrayList<Food> FOOD_DATABASE = new ArrayList<>();
    private static int lastId=0;

    /**
     * method accesor dalam Class DatabaseFood
     * @return FOOD_DATABASE untuk mengembalikan nilai array
     */
    public static ArrayList<Food> getFoodDatabase() {return FOOD_DATABASE;}

    /**
     * method accesor dalam Class DatabaseFood
     * @return lastId untuk mengembalikan nilai atribut
     */
    public static int getLastId() {return lastId;}

    /**
     * method accesor dalam Class DatabaseFood
     * @param id
     * @return food untuk mengembalikan nilai array
     */
    public static Food getFoodById(int id) throws FoodNotFoundException //method accesor dalam Class Seller
    {
        for (Food food : FOOD_DATABASE) {
            if (food.getId() == id) {
                return food;
            }
        }
        throw new FoodNotFoundException(id);
    }

    /**
     * method accesor dalam Class DatabaseFood
     * @param sellerId
     * @return list untuk mengembalikan nilai array
     */
    public static ArrayList<Food> getFoodBySeller(int sellerId)  //method accesor dalam Class Seller
    {
        ArrayList<Food> list = new ArrayList<Food>();

        for (Food food:FOOD_DATABASE)
        {
            if(food.getSeller().getId()==sellerId)
            {
                list.add(food);
            }
        }
        return list;
    }

    /**
     * method accesor dalam Class DatabaseFood
     * @param category
     * @return list untuk mengembalikan nilai array
     */
    public static ArrayList<Food> getFoodByCategory(FoodCategory category)
    {
        ArrayList<Food> list = new ArrayList<Food>();
        for (Food food:FOOD_DATABASE)
        {
            if(food.getCategory().equals(category))
            {
                list.add(food);
            }
        }
        return list;
    }

    /**
     * method boolean mutator dalam Class DatabaseFood
     * @param food
     * @return true untuk menambahkan nilai dalam array
     */
    public static boolean addFoods(Food food)
    {
        FOOD_DATABASE.add(food);
        lastId=food.getId();
        return true;
    }

    /**
     * method boolean mutator dalam Class DatabaseFood
     * @param id
     * @return true untuk menghapus nilai dalam array
     */
    public static boolean removeFood(int id) throws FoodNotFoundException
    {
        for(Food food : FOOD_DATABASE) {
            if(food.getId() == id) {
                FOOD_DATABASE.remove(food);
                return true;
            }
        }
        throw new FoodNotFoundException(id);
    }
}
