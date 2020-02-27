
/**
 * Ini adalah program Jfood pada modul 2
 * Dimana kita melakukan setter dan getter,
 * Pembuatan Object, dengan mengakses lewat argumen class main
 * 
 * @author Alfian Firmansyah
 * @version 27-2-2020
 */
public class JFood
{
    
    public static void main(String[] args){
        
        /**
         * Pembuatan object location
         */
        Location location1 = new Location("Jawa  Barat", "Makanan dari bandung", "Bandung");
        /**
         * Pembuatan object seller
         */
        Seller seller1 = new Seller(1, "Alfii", "sefalfian@gmail.com", "08123812313", location1);
        Food food1 = new Food(2,"Sambel Bawang", seller1, 100000, "Sambal");
        /**
         * Pembuatan object customer
         */
        Customer customer1 = new Customer(1, "Fajri", "fajri2@gmail.com", "makanmulu12", "12-07-2019");
        /**
         * Pembuatan object invoice
         */
        Invoice invoice1 = new Invoice(1, 2, "12-12-2020", customer1, 200000);
        
        
        // melakukan access method printData ke class tertentu
        /**
         * Mengakses method printData() dalam class location
         */
        location1.printData();
        /**
         * Mengakses method printData() dalam class seller
         */
        seller1.printData();
        /**
         * Mengakses method printData() dalam class customer
         */
        customer1.printData();
    }
}
