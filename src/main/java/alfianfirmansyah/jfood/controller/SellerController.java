package alfianfirmansyah.jfood.controller;

import alfianfirmansyah.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class SellerController {

    @RequestMapping(value = "/seller", method= RequestMethod.GET)
    public ArrayList<Seller> getAllSeller()
    {
        ArrayList<Seller> seller;
        try {
            seller = DatabaseSeller.getSellerDatabase();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return seller;
    }

    @RequestMapping(value = "/seller/{id}", method= RequestMethod.GET)
    public Seller getSellerById(@PathVariable int id)
    {
        Seller seller;
        try {
            seller = DatabaseSeller.getSellerById(id);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return seller;
    }

    @RequestMapping(value = "/seller", method= RequestMethod.POST)
    public Seller addSeller(@RequestParam(value="name") String name,
                            @RequestParam(value="email") String email,
                            @RequestParam(value="phoneNumber") String phoneNumber,
                            @RequestParam(value="province") String province,
                            @RequestParam(value="description") String description,
                            @RequestParam(value="city") String city)
    {
        Location location = new Location(city,province,description);
        Seller seller = new Seller(DatabaseSeller.getLastId()+1, name,email,phoneNumber,location);
        try {
            DatabaseSeller.addSeller(seller);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return seller;
    }

}
