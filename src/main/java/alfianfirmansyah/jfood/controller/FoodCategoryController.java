package alfianfirmansyah.jfood.controller;

import alfianfirmansyah.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
/**
 * Class Promo Controller merupakan blueprint Error Handling double data Ongoing Invoice.
 *
 * @author (Alfian Firmansyah)
 * @version (16.04.20)
 */
@RequestMapping("/food_category")
@RestController
public class FoodCategoryController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<FoodCategory> getAllCategories() throws SQLException {
        return DatabaseFoodCategoryPostgre.getFoodCategory();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public FoodCategory getCategoryById(@PathVariable int id) throws FoodCategoryNotFoundException {
        return DatabaseFoodCategoryPostgre.getFoodCategoryById(id);
    }

//    @RequestMapping(value = "", method = RequestMethod.POST)
//    public Promo addPromo(@RequestParam(value="code") String code,
//                            @RequestParam(value="discount") int discount,
//                            @RequestParam(value="minPrice") int minPrice,
//                            @RequestParam(value="status") boolean active) throws PromoCodeAlreadyExistsException
//    {
//        Promo promo = null;
//        try {
//            promo = new Promo(DatabasePromo.getLastId() + 1, code, discount, minPrice, active);
//            DatabasePromo.addPromo(promo);
//        } catch (PromoCodeAlreadyExistsException e) {
//            System.out.println(e.getMessage());
//        }
//        return promo;
//    }
}
