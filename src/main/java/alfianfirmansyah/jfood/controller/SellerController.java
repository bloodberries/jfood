package alfianfirmansyah.jfood.controller;

import alfianfirmansyah.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
/**
 * Class Seller Controller merupakan blueprint Error Handling double data Ongoing Invoice.
 *
 * @author (Alfian Firmansyah)
 * @version (16.04.20)
 */
@RequestMapping("/seller")
@RestController

public class SellerController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Seller> getAllSeller() throws SQLException, LocationNotFoundException {
        return DatabaseSellerPostgre.getSeller();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Seller getSellerById(@PathVariable int id) throws SellerNotFoundException {
        return DatabaseSellerPostgre.getSellerById(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Seller addSeller(@RequestParam(value="name") String name,
                            @RequestParam(value="email") String email,
                            @RequestParam(value="phoneNumber") String phoneNumber,
                            @RequestParam(value="city") String city,
                            @RequestParam(value="province") String province,
                            @RequestParam(value="description") String description)
    {

        Seller seller = new Seller(DatabaseSellerPostgre.getLastId() + 1, name, email, phoneNumber, new Location(DatabaseLocationPostgre.getLastId()+1,city,province,description));
        DatabaseSellerPostgre.insertSeller(seller);
        return seller;
    }

}
