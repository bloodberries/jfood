import com.sun.source.tree.CompilationUnitTree;

import java.util.ArrayList;

/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author Alfian Firmansyah
 * @version 1.0
 */
public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int lastId = 0;
    /**
     * Constructor for objects of class DatabaseCustomer
     */
    public DatabaseCustomer()
    {
        // initialise instance variables

    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    public static boolean addCustomer(Customer customer)throws EmailAlreadyExistsException {
        for (Customer _customer : CUSTOMER_DATABASE) {
            if(_customer.getEmail().equals(customer.getEmail())) {
                throw new EmailAlreadyExistsException(customer);
            }
        }
        CUSTOMER_DATABASE.add(customer);
        lastId = customer.getId();
        return true;
    }

    public static boolean removeCustomer(int id) throws CustomerNotFoundException {
        for(Customer customer : CUSTOMER_DATABASE) {
            if(customer.getId() == id) {
                CUSTOMER_DATABASE.remove(customer);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
    }



    public static ArrayList<Customer> getCustomerDatabase() {
        return CUSTOMER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Customer getCustomerById(int id) throws CustomerNotFoundException  {
        Customer customer = CUSTOMER_DATABASE.get(id);
        if (customer != null) {
            return customer;
        }
        throw new CustomerNotFoundException(id);
    }

}