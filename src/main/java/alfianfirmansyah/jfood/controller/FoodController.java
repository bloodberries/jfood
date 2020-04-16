package alfianfirmansyah.jfood.controller;
import alfianfirmansyah.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class FoodController {

    @RequestMapping(value = "/food", method= RequestMethod.GET)
    public ArrayList<Food> getAllFood()
    {
        ArrayList<Food> foods;
        try {
            foods = DatabaseFood.getFoodDatabase();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return foods;
    }

    @RequestMapping(value = "/food/{id}", method= RequestMethod.GET)
    public Food getFoodById(@PathVariable int id)
    {
        Food food;
        try {
            food = DatabaseFood.getFoodById(id);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return food;
    }

    @RequestMapping(value = "/food/seller/{sellerId}", method= RequestMethod.GET)
    public ArrayList<Food> getFoodBySeller(@PathVariable int sellerId)
    {
        ArrayList<Food> foods;
        try {
            foods = DatabaseFood.getFoodBySeller(sellerId);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return foods;
    }

    @RequestMapping(value = "/food/category/{category}", method= RequestMethod.GET)
    public ArrayList<Food> getFoodByCategory(@PathVariable FoodCategory category)
    {
        ArrayList<Food> foods;
        try {
            foods = DatabaseFood.getFoodByCategory(category);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return foods;
    }

    @RequestMapping(value = "/food", method= RequestMethod.POST)
    public Food addFood(@RequestParam(value="name") String name,
                        @RequestParam(value="price") int price,
                        @RequestParam(value="category") FoodCategory category,
                        @RequestParam(value="sellerId") int sellerId) throws SellerNotFoundException {
        Food foods = new Food(DatabaseFood.getLastId()+1,name, DatabaseSeller.getSellerById(sellerId), price, category);

        try {
            DatabaseFood.addFood(foods);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return foods;
    }


}
