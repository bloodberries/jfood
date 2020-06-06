package alfianfirmansyah.jfood.controller;

import alfianfirmansyah.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
/**
 * Class Food Controller merupakan blueprint Error Handling double data Ongoing Invoice.
 *
 * @author (Alfian Firmansyah)
 * @version (16.04.20)
 */

@RequestMapping("/food")
@RestController

public class FoodController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Food> getAllFood() throws SQLException, SellerNotFoundException, FoodCategoryNotFoundException {
        return DatabaseFoodPostgre.getFood();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Food getFoodById(@PathVariable int id) throws FoodNotFoundException
    {
        Food food = DatabaseFoodPostgre.getFoodById(id);

        return food;
    }

    @RequestMapping(value = "/seller/{sellerId}", method = RequestMethod.GET)
    public ArrayList<Food> getFoodBySeller(@PathVariable int sellerId) throws FoodNotFoundException
    {
        ArrayList<Food> food = DatabaseFoodPostgre.getFoodBySeller(sellerId);
        return food;
    }

//    @RequestMapping(value = "/category/{category}", method = RequestMethod.GET)
//    public Food getFoodByCategory(@PathVariable FoodCategory category) throws FoodNotFoundException
//    {
//        ArrayList<Food> food = DatabaseFoodPostgre.get(category);
//        return food;
//    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Food addFoods(@RequestParam(value="name") String name,
                        @RequestParam(value="price") int price,
                        @RequestParam(value="category") FoodCategory category,
                        @RequestParam(value="sellerId") int sellerId) throws SellerNotFoundException {
        Food food = null;
        food = new Food(DatabaseFoodPostgre.getLastId() + 1, name, DatabaseSellerPostgre.getSellerById(sellerId), price, category);
        DatabaseFoodPostgre.insertFood(food);
        return food;
    }


}
