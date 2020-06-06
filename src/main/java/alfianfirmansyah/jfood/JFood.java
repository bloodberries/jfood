package alfianfirmansyah.jfood;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
import java.util.Calendar;

@SpringBootApplication
public class JFood //membuat Class JFood
{

    public static void main(String[] args) throws FoodNotFoundException //throws FoodNotFoundException, CustomerNotFoundException, InvoiceNotFoundException, OngoingInvoiceAlreadyExistsException
    {
//        Location location1 = new Location("Depok","Jawa Barat","alfian's Kitchen");
//        Location location2 = new Location("Tangerang","Jawa Barat","Penjual's Kitchen");
//        Location location3 = new Location("Bogor","Jawa Barat","Tristan's Kitchen");
        /**Seller seller1 = new Seller(1, "alfian firmansyah","alfian@gmail","08551729163",location1);
        Food food1 = new Food(1, "Kopi Susu", seller1, 5000, FoodCategory.Coffee);
        Food food2 = new Food(2, "Mie Goreng", seller1, 8000, FoodCategory.Noodles);
        Food food3 = new Food(3, "Sushi", seller1, 15000, FoodCategory.Japanese);
        

        Promo promo1 = new Promo(1, "JKTOVO", 1000, 3000, true);
        CashInvoice cashInvoice1 = new CashInvoice(1, food1, customer1, InvoiceStatus.Finished, 0);
        CashInvoice cashInvoice2 = new CashInvoice(2, food2, customer1, InvoiceStatus.Finished, 5000);
         */


        //CashlessInvoice cashlessInvoice1 = new CashlessInvoice(2, DatabaseFood.getFoodById(1), DatabaseCustomer.getCustomerById(1), DatabasePromo.getPromoById(1));
//        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Alfian Firmansyah", "alfianvansykes@gmailcom", "08551729163", location1));
//        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Penjual", "penjual@gmail", "08551729164", location2));
        //DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Adhyastha Tristan", "tristan@gmail", "08551729165", location3));
        //Calendar tanggal = Calendar.getInstance();

//        try {
//            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Indira", "indirainsiyah17@gmail.com", "1111"));
//            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Alfian", "alfianvansykes@gmail.com", "Capcapcap123"));
//            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Mantap", "jiwa@gmail.com", "2111Cc"));
//        } catch (EmailAlreadyExistsException i){
//            System.err.println(i.getMessage());
//        }

        /**for (Customer customer : DatabaseCustomer.getCustomerDatabase()) {
            System.out.println(customer + "\n");
            System.out.println();
        }*/

//        try {
//            DatabaseFood.addFoods(new Food(DatabaseFood.getLastId() + 1, "Nusantara Coffee", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 5000, FoodCategory.Coffee));
//            DatabaseFood.addFoods(new Food(DatabaseFood.getLastId() + 1, "Magurame Udon", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 8000, FoodCategory.Noodles));
//            DatabaseFood.addFoods(new Food(DatabaseFood.getLastId() + 1, "Thailand Ice Coffee", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 15000, FoodCategory.Coffee));
//            DatabaseFood.addFoods(new Food(DatabaseFood.getLastId() + 1, "Very Nice Coffee Milk", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 10000, FoodCategory.Coffee));
//        }
//        catch (SellerNotFoundException f){
//            System.err.println(f.getMessage());
//        }


        /**
        for (Food food : DatabaseFood.getFoodByCategory(FoodCategory.Coffee)) {
            System.out.println(food + "\n");
            System.out.println();
        }
         */

//        try {
//            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "REMAHPEYEK", 10000, 3000, true));
//            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "DISKONKUY", 8000, 3000, true));
//        }catch (PromoCodeAlreadyExistsException p){
//            System.err.println(p.getMessage());
//        }

        SpringApplication.run(JFood.class, args);
        /**
        try {
            DatabaseCustomer.removeCustomer(4);
        } catch (CustomerNotFoundException e){
            System.err.println(e.getMessage());
        }

        try {
            DatabaseFood.removeFood(5);
        } catch (FoodNotFoundException e){
            System.err.println(e.getMessage());
        }

        try {
            DatabaseSeller.removeSeller(5);
        } catch (SellerNotFoundException e){
            System.err.println(e.getMessage());
        }

        try {
            DatabasePromo.removePromo(3);
        } catch (PromoNotFoundException e){
            System.err.println(e.getMessage());
        }

        System.out.println("=====YANG MASUK KE DATABASE PROMO=====");

        for(Promo promo : DatabasePromo.getPromoDatabase()){
            System.out.println(promo.toString());
        }

        

        ArrayList<Food> LIST_FOOD = new ArrayList<>();
        LIST_FOOD.add(DatabaseFood.getFoodById(1));
        LIST_FOOD.add(DatabaseFood.getFoodById(2));
        LIST_FOOD.add(DatabaseFood.getFoodById(3));

        try {
            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, LIST_FOOD, DatabaseCustomer.getCustomerById(1), InvoiceStatus.Ongoing, DatabasePromo.getPromoByCode("JKTOVO")));
        }
        catch (OngoingInvoiceAlreadyExistsException | CustomerNotFoundException e)
        {System.out.println(e.getMessage());}
        try {
            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, LIST_FOOD, DatabaseCustomer.getCustomerById(2), InvoiceStatus.Ongoing,DatabasePromo.getPromoByCode("JKTOVO")));
        }
        catch (OngoingInvoiceAlreadyExistsException | CustomerNotFoundException e)
        {System.out.println(e.getMessage());}
        try{
            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, LIST_FOOD, DatabaseCustomer.getCustomerById(3), InvoiceStatus.Ongoing, DatabasePromo.getPromoByCode("JKTOVO")));
        }
        catch (OngoingInvoiceAlreadyExistsException | CustomerNotFoundException e)
        {System.out.println(e.getMessage());}


        System.out.println("\nList Invoice: ");
        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            if (invoice.totalPrice == 0)
            {
                invoice.start();
            }
        }

        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            Thread priceCalculate = new Thread(new PriceCalculator(invoice));
            priceCalculate.start();
        }

        /**
        for(Promo promo : DatabasePromo.getPromoDatabase()) {
            System.out.println(promo);
            System.out.println();
        }

        ArrayList<Food> foods1 = new ArrayList<Food>();
        foods1.add(DatabaseFood.getFoodById(1));
        foods1.add(DatabaseFood.getFoodById(1));
        foods1.add(DatabaseFood.getFoodById(1));
        ArrayList<Food> foods2 = DatabaseFood.getFoodDatabase();

        DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId()+1, foods1, DatabaseCustomer.getCustomerById(1),5000));
        DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).setTotalPrice();

        DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, foods2, DatabaseCustomer.getCustomerById(1)));
        DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).setTotalPrice();

        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase()) {
            System.out.println(invoice);
            System.out.println();
        }

        DatabaseInvoice.changeInvoiceStatus(DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).getId(),InvoiceStatus.Finished);

        DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, foods2, DatabaseCustomer.getCustomerById(2), DatabasePromo.getPromoByCode("JKTOVO")));
        DatabasePromo.activatePromo(1);

        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            invoice.setTotalPrice();
            System.out.println(invoice);
            System.out.println();
        }

        //CashlessInvoice cashlessInvoice1 = new CashlessInvoice(2, DatabaseFood.getFoodDatabase(), DatabaseCustomer.getCustomerById(1), DatabasePromo.getPromoById(1));
        //CashInvoice cashInvoice1 = new CashInvoice(1, DatabaseFood.getFoodDatabase(), DatabaseCustomer.getCustomerById(1), InvoiceStatus.Finished, 0);
       // CashInvoice cashInvoice2 = new CashInvoice(2, DatabaseFood.getFoodDatabase(), DatabaseCustomer.getCustomerById(1), InvoiceStatus.Ongoing, 5000);

        //membuat instance dari Class
        //cashlessInvoice1.toString();
        //cashInvoice1.toString();
        //cashInvoice2.toString();

        //customer3.toString();
        */
        /**
        System.out.println("=====POST TEST MODUL 7=====");
        try {
            DatabaseInvoice.removeInvoice(50);
        } catch (InvoiceNotFoundException i){
            System.err.println(i.getMessage());
        }
        */
        /**
        try {
            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, LIST_FOOD, DatabaseCustomer.getCustomerById(1), InvoiceStatus.Ongoing, DatabasePromo.getPromoByCode("JKTOVO")));
            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, LIST_FOOD, DatabaseCustomer.getCustomerById(2), InvoiceStatus.Ongoing, DatabasePromo.getPromoByCode("JKTOVO")));
            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, LIST_FOOD, DatabaseCustomer.getCustomerById(3), InvoiceStatus.Ongoing, DatabasePromo.getPromoByCode("JKTOVO")));
        } catch (OngoingInvoiceAlreadyExistsException | CustomerNotFoundException e){
            System.err.println(e.getMessage());
        }
         */


    }



}
