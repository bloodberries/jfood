package alfianfirmansyah.jfood;

import java.util.ArrayList;

/**
 * Class DatabaseCustomer merupakan blueprint CRUD data Riwayat Pembeli.
 *
 * @author (Alfian Firmansyah)
 * @version (12.03.2020)
 */
public class DatabaseCustomer
{
    // membuat atribut dalam Class DatabaseCustomer
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int lastId=0;

    /**
     * method accesor dalam Class DatabaseCustomer
     * @return CUSTOMER_DATABASE untuk mengembalikkan nilai array
     */
    public static ArrayList<Customer> getCustomerDatabase() {return CUSTOMER_DATABASE;}

    /**
     * method accesor dalam Class DatabaseCustomer
     * @return lastId untuk mengembalikan nilai atribut
     */
    public static int getLastId() {return lastId;}

    /**
     * method accesor dalam Class DatabaseCustomer
     * @param id
     * @return customer untuk mengembalikkan nilai array
     */
    public static Customer getCustomerById(int id) throws CustomerNotFoundException //method accesor dalam Class Seller
    {
        for (Customer customer : CUSTOMER_DATABASE)
        {
            if (customer.getId() == id) {
                return customer;
            }
        }
        throw new CustomerNotFoundException(id);
    }

    /**
     * method boolean mutator dalam Class DatabaseCustomer
     * @param customer
     * @return true untuk menambahkan nilai dalam array
     */
    public static boolean addCustomer(Customer customer) throws EmailAlreadyExistsException
    {
        // put your code here
        for (Customer customer1 : CUSTOMER_DATABASE) {
            if (customer1.getEmail().equals(customer.getEmail())) {
                throw new EmailAlreadyExistsException(customer);
            }
        }
        CUSTOMER_DATABASE.add(customer);
        lastId=customer.getId();
        return true;
    }

    /**
     * method boolean mutator dalam Class DatabaseCustomer
     * @param id
     * @return true untuk menghapus nilai dalam array
     */
    public static boolean removeCustomer(int id) throws CustomerNotFoundException
    {
        // put your code here
        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getId() == id){
                CUSTOMER_DATABASE.remove(customer);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
    }

    /**
     * method accesor dalam Class DatabaseCustomer
     * @param email, password
     * @return customer untuk mengembalikkan nilai array
     */
    public static Customer getCustomerLogin (String email, String password)
    {
        for(Customer customer : CUSTOMER_DATABASE)
        {
            if(customer.getEmail().equals(email) && customer.getPassword().equals(password))
            {
                return customer;
            }
        }
        return null;
    }
}
