
/**
 * Write a description of class JFood here.
 *
 * @author Alfian Firmansyah
 * @version 1.0
 */
public class JFood
{
    int x = 5;
    
    public static void main(String[] args){
        Location location1 = new Location("Jawa  Barat", "Makanan dari bandung", "Bandung");
        Seller seller1 = new Seller(1, "Alfii", "sefalfian@gmail.com", "08123812313", location1);
        Food food1 = new Food(2,"Sambel Bawang", seller1, 100000, "Sambal");
        Customer customer1 = new Customer(1, "Fajri", "fajri2@gmail.com", "makanmulu12", "12-07-2019");
        Invoice invoice1 = new Invoice(1, 2, "12-12-2020", customer1, 200000);
        
        
        location1.printData();
        seller1.printData();
        customer1.printData();
    }
}
