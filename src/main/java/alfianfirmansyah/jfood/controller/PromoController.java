package alfianfirmansyah.jfood.controller;

import alfianfirmansyah.jfood.*;
import org.springframework.web.bind.annotation.*;
import javax.xml.crypto.Data;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * Class Promo Controller merupakan blueprint Error Handling double data Ongoing Invoice.
 *
 * @author (Alfian Firmansyah)
 * @version (16.04.20)
 */
@RequestMapping("/promo")
@RestController
public class PromoController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Promo> getAllPromo() throws SQLException {
        return DatabasePromoPostgre.getPromo();
    }

    @RequestMapping(value = "/{code}", method = RequestMethod.GET)
    public Promo getPromoByCode(@PathVariable String code) throws PromoNotFoundException2 {
        return DatabasePromoPostgre.getPromoByCode(code);
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
