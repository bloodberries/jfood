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
@RequestMapping("/location")
@RestController

public class LocationController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Location> getAllLocation() throws SQLException, LocationNotFoundException {
        return DatabaseLocationPostgre.getLocation();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Location getLocationById(@PathVariable int id) throws LocationNotFoundException {
        return DatabaseLocationPostgre.getLocationById(id);
    }

//    @RequestMapping(value = "", method = RequestMethod.POST)
//    public Location addLocation(@RequestParam(value="city") String city,
//                            @RequestParam(value="province") String province,
//                            @RequestParam(value="description") String description)
//    {
//
//        Location location = new Location(DatabaseLocationPostgre.getLastId() + 1, city, province, description);
//        DatabaseLocationPostgre.insertLocation(location);
//        return location;
//    }

}
