package alfianfirmansyah.jfood.controller;
import alfianfirmansyah.jfood.*;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PromoController {

    @RequestMapping(value = "/promo", method= RequestMethod.GET)
    public ArrayList<Promo> getAllPromo()
    {
        ArrayList<Promo> promo;
        try {
            promo = DatabasePromo.getPromoDatabase();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return promo;
    }

    @RequestMapping(value = "/promo/{code}", method= RequestMethod.GET)
    public Promo getPromoByCode(@PathVariable String code)
    {
       Promo promo;
        try {
            promo = DatabasePromo.getPromoByCode(code);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return promo;
    }

    @RequestMapping(value = "/promo", method= RequestMethod.POST)
    public Promo addPromo(@RequestParam(value="code") String code,
                            @RequestParam(value="discount") int discount,
                            @RequestParam(value="minPrice") int minPrice,
                            @RequestParam(value="active") boolean active)
    {
        Promo promo = new Promo(DatabasePromo.getLastId()+1, code,discount,minPrice,active);
        try {
            DatabasePromo.addPromo(promo);
        } catch (PromoCodeAlreadyExistsException e) {
            e.getMessage();
            return null;
        }
        return promo;
    }

}
