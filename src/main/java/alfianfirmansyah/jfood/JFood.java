package alfianfirmansyah.jfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JFood {

    public static void main(String[] args) {

        Location location1 = new Location("Jakarta Selatan", "DKI Jakarta","Tepatnya di depan gedung Sabha Widya");
        Location location2 = new Location("Jakarta Timur", "DKI Jakarta","Di Taman Mini Indonesia Indah");
        Location location3 = new Location("Depok","Jawa Barat","Di depan Kukusan dekat Universitas Indonesia Fakultas Teknik");

        Seller seller1 = new Seller(DatabaseSeller.getLastId()+1,"Alfian Firmansyah","alfianvansykes@gmail.com","083870975096",location1);
        Seller seller2 = new Seller(DatabaseSeller.getLastId()+1,"Alfan Prasekal","alfanprskl@gmail.com","0838123131",location2);
        Seller seller3 = new Seller(DatabaseSeller.getLastId()+1,"Tarubangnamanya","tarunamana@gmail.com","08381231231",location3);

        DatabaseSeller.addSeller(seller1);
        DatabaseSeller.addSeller(seller2);
        DatabaseSeller.addSeller(seller3);

        Food food1 = new Food(DatabaseFood.getLastId()+1, "Mujigae Noodles",seller1,38000,FoodCategory.NOODLES);
        Food food2 = new Food(DatabaseFood.getLastId()+1, "Mujigae Bibimbab Bulgogi",seller1,58000,FoodCategory.RICE);
        Food food3 = new Food(DatabaseFood.getLastId()+1, "Mujigae Paket Hemat1",seller1,25000,FoodCategory.BEVERAGES);
        Food food4 = new Food(DatabaseFood.getLastId()+1, "Mujigae GIM",seller1,48000,FoodCategory.RICE);

        DatabaseFood.addFood(food1);
        DatabaseFood.addFood(food2);
        DatabaseFood.addFood(food3);
        DatabaseFood.addFood(food4);


        SpringApplication.run(JFood.class, args);
    }

}