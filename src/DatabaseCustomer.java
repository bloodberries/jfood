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
    public static boolean addCustomer(Customer customer) {
        boolean sameEmailBuff = false;
        for (Customer buff: CUSTOMER_DATABASE) {
            if (customer.getEmail() == buff.getEmail()) {
                sameEmailBuff = true;
            }
        }

        if (!sameEmailBuff) {
            CUSTOMER_DATABASE.add(customer);
            lastId = CUSTOMER_DATABASE.indexOf(customer);
        }
        return false;
    }

    public static boolean removeCustomer(int id) {
        Customer customer = CUSTOMER_DATABASE.get(id);
        if (customer != null) {
            CUSTOMER_DATABASE.remove(customer);
            return true;
        }
        return false;
    }



    public static ArrayList<Customer> getCustomerDatabase() {
        return CUSTOMER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Customer getCustomerById(int id) {
        Customer customer = CUSTOMER_DATABASE.get(id);
        if (customer != null) {
            return customer;
        }
        return null;
    }

}