package alfianfirmansyah.jfood.controller;

import alfianfirmansyah.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Class Costumer Controller merupakan blueprint Error Handling double data Ongoing Invoice.
 *
 * @author (Alfian Firmansyah)
 * @version (14.04.20)
 */
@RequestMapping("/customer")
@RestController
public class CustomerController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Customer> getAllCustomer() throws SQLException {
        return DatabaseCustomerPostgre.getCustomer();
    }

//    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
//        return "Hello " + name;
//    }



    @RequestMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        Customer customer = null;
        try {
            customer = DatabaseCustomerPostgre.getCustomerById(id);
        } catch (CustomerNotFoundException e) {
            e.getMessage();
            return null;
        }
        return customer;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Customer registerCustomer(@RequestParam(value="name") String name,
                                @RequestParam(value="email") String email,
                                @RequestParam(value="password") String password)
    {
        Customer customer = new Customer(DatabaseCustomerPostgre.getLastCustomerId()+1, name, email, password);
        try {
//            DatabaseCustomer.addCustomer(customer);
            DatabaseCustomerPostgre.insertCustomer(customer);
        } catch (EmailAlreadyExistsException e) {
            e.getMessage();
            return null;
        }
        return customer;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Customer loginCustomer(@RequestParam(value="email") String email,
                                         @RequestParam(value="password") String password)
    {
        Customer customer = DatabaseCustomerPostgre.getCustomerLogin(email, password);
        return customer;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public boolean removeCustomer(@PathVariable int id)
    {
        try
        {
            return DatabaseCustomerPostgre.removeCustomer(id);
        }
        catch (CustomerNotFoundException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
    }


}
