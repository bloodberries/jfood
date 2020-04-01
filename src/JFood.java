import java.util.*;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;
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
        /**
         * Pembuatan object food
         */
        Food food1 = new Food(1,"Sambel Bawang", seller1, 100000, FoodCategory.BEVERAGES);
        /**
         * Pembuatan object customer
         */
        
        /*
        Customer customer1 = new Customer(1, "Fajri", "fajri2@gmail.com", "makanmulu12", "12-07-2019");
        */
        /**
         * Pembuatan object invoice
         */
         //Invoice invoice1 = new Invoice(1, food1.getId(), "12-12-2020", customer1, food1.getPrice(), InvoiceStatus.FINISHED);
        
        /*
        
        seller1.printData();
        seller1.setName("Rama");
        seller1.printData();
        
        
        food1.printData();
        */
        System.out.println(seller1.getName());
        
        //Ini untuk fetch enum satuan     FoodCategory  
        System.out.println(FoodCategory.BEVERAGES.toString());
        System.out.println(FoodCategory.COFFEE.toString());
        System.out.println(FoodCategory.WESTERN.toString());
        System.out.println(FoodCategory.SNACKS.toString());
        System.out.println(FoodCategory.RICE.toString());
        System.out.println(FoodCategory.NOODLES.toString());
        System.out.println(FoodCategory.BAKERY.toString());
        System.out.println(FoodCategory.JAPANESE.toString());
        
       // System.out.println(FoodCategory.BANDUNG.toString());
       
       // untuk fetch PaymentType
        System.out.println(PaymentType.CASHLESS.toString());
        System.out.println(PaymentType.CASH.toString());
        
        /*
        // untuk iterate enum constantnya supaya bisa di tampilin
        for(FoodCategory foodcat1 : FoodCategory.values())
        {
    System.out.println(foodcat1.name() + " = "+ foodcat1.toString());
}
       */
      
      //food1.printData();
      
      // invoice1.printData();
      
     // Customer customer2 = new Customer(2, "Alfian", "alfianvansykes@gmail.com", "makanmulu12", "12-07-2019");
      Promo promo2 = new Promo(2, "MAKANDULU", 20000, 30000, true );
      Food food2 = new Food(2,"Sambel Bawang", seller1, 100000, FoodCategory.BEVERAGES);
      Food food3 = new Food(3,"Sambel Bawang", seller1, 40000, FoodCategory.BEVERAGES);
      Food food4 = new Food(4,"Sambel Bawang", seller1, 25000, FoodCategory.BEVERAGES);
      
      
      // Skenario cashless 1 tidak menggunakan promo
      // Skenario cashless 2 menggunakan promo, 40000 - 20000 = 20000
      // Skenario cashless 3 menggunakan promo namun tidak bisa karena hargaTotalprice hanya 25000 (tidak memenuhi syarat)
       
  //    CashlessInvoice ci1 = new CashlessInvoice(1, food2, "03-03-2020", customer2 , InvoiceStatus.ONGOING);
    //  CashlessInvoice ci2 = new CashlessInvoice(2, food3, "03-03-2020", customer2, InvoiceStatus.ONGOING, promo2);
   //   CashlessInvoice ci3 = new CashlessInvoice(3, food4, "03-03-2020", customer2, InvoiceStatus.ONGOING, promo2);
      
       /*
      
      ci1.setTotalPrice();
      ci2.setTotalPrice();
      ci3.setTotalPrice();
      
      ci1.printData(); 
      ci2.printData();
      ci3.printData();
      
      
      // post test
      CashInvoice c1 = new CashInvoice(10, food2, "13-03-2020", customer2, InvoiceStatus.FINISHED);
      CashInvoice c2 = new CashInvoice(11, food2, "13-03-2020", customer2, InvoiceStatus.FINISHED, 15000);
      
      c1.setTotalPrice();
      c2.setTotalPrice();
      
      System.out.println("\nPOSTTEST modul 4-------------------------------------\n\n");
      
      c1.printData();
      c2.printData();
      
      */
     
     
     // CASE STUDY MODUL 5
     int year = 2020;
    int month = 1; // January
    int date = 1;
    
    // membuat obect calendar, karena parameter membutuhkan datatype Calendar
    Calendar calndr = Calendar.getInstance(); 
    //  System.out.println(sdf.format(now));
    
    // Skenario pertama: menggunakan parameter joinDate, dan passwordnya tidak sesuai dengan keriteria 
    Customer cus1 = new Customer(1, "Ramadhan", "rama@gmail.com", "3chr", calndr); 
    
    // Skenario kedua: menggunakan password yang keriterianya benar, dan menggunakan GregorianCalendar dalam year, month, dan date
    Customer cus2 = new Customer(2, "Ramadhan", "rama@gmail.com", "c1apcaPcap", year, month, date);
    
    // Skenario ketiga: Saya menggunakan passord yang benar, tanpa parameter calendar atau date apapun
    Customer cus3 = new Customer(3, "Ramadhan", "rama@gmail.com", "capc1CCapcap"); 
    
   // System.out.println(cus1.toString());
   // System.out.println(cus2.toString());
   // System.out.println(cus3.toString());
     
    
    // MODUL 5 POST TEST
    
    
    CashInvoice cash1 = new CashInvoice(10, food2, cus1, InvoiceStatus.FINISHED);
    CashInvoice cash2 = new CashInvoice(11, food3, cus2, InvoiceStatus.FINISHED, 15000);
     
    
    CashlessInvoice cashless1 = new CashlessInvoice(10, food2, cus1, InvoiceStatus.FINISHED);
    CashlessInvoice cashless2 = new CashlessInvoice(11, food3, cus2, InvoiceStatus.FINISHED, promo2);
    
    cash1.setTotalPrice();
    cash2.setTotalPrice();
    cashless1.setTotalPrice();
    cashless2.setTotalPrice();
    
    
    System.out.println(cash1.toString());
    System.out.println(cash2.toString());
    System.out.println(cashless1.toString());
    System.out.println(cashless2.toString());
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
      
      
    }
}
