package alfianfirmansyah.jfood;


import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class DatabaseFoodPostgre {
    private static final Connection conn = DatabaseConnection.connection();
    private static Statement stmt = null;

    private static int lastId=0;

    public static int getLastId()
    {
        return lastId;
    }

    public static int getLastFoodId()
    {
        try {
            stmt = conn.createStatement();
            ResultSet foods = stmt.executeQuery("SELECT id FROM foods ORDER BY id DESC LIMIT 1");
            if(foods.next()) {
                return foods.getInt("id");
            }
        } catch (Exception e) { }
        return 0;
    }

    public static Food getFoodById(int id) throws FoodNotFoundException
    {
        try {
            stmt = conn.createStatement();
            ResultSet foods = stmt.executeQuery("SELECT * FROM foods WHERE id='" + id + "'");
            if(foods.next()) {

//                int id, String name, Seller seller, int price, FoodCategory category
                int foodId = foods.getInt("id");
                int sellerId = foods.getInt("seller_id");
                int categoryId = foods.getInt("category_id");

                return new Food(foodId, foods.getString("name"), DatabaseSellerPostgre.getSellerById(sellerId), foods.getInt("price"), DatabaseFoodCategoryPostgre.getFoodCategoryById(categoryId));
            } else {
                return null;
            }

        } catch (Exception e) { }
        throw new FoodNotFoundException(id);
    }

    public static ArrayList<Food> getFoodBySeller(int id) throws FoodNotFoundException
    {
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM foods WHERE seller_id ='" + id + "'");

            if(rs.next()) {
                ArrayList<Food> _food = new ArrayList<>();
                Food food = null;
                while (rs.next())
                {
                    // int id, String name, Seller seller, int price, FoodCategory category
                    int foodid = rs.getInt("id");
                    String name = rs.getString("name");
//                    int sellerId = rs.getInt("seller_id");
                    int price = rs.getInt("price");
                    int categoryId = rs.getInt("category_id");
                    food = new Food(foodid,name,DatabaseSellerPostgre.getSellerById(id),price,DatabaseFoodCategoryPostgre.getFoodCategoryById(categoryId));
                    _food.add(food);
                }
                return _food;
            } else {
                return null;
            }

        } catch (Exception e) { }
        throw new FoodNotFoundException(id);
    }

    public static boolean insertFood(Food food)
    {
        try {
            stmt = conn.createStatement();
            // int id, String name, Seller seller, int price, FoodCategory category
            String sql = "SELECT id FROM foods WHERE name LIKE '%"+ food.getName() +"%'";
            ResultSet foods = stmt.executeQuery(sql);
            if(!foods.next()) { //cek food sudah ada di table foods, jika belum insert food
                sql = "INSERT INTO foods (category_id,seller_id,name,price) VALUES ('" + food.getCategory().getId() + "','" + food.getSeller().getId() + "','" + food.getPrice() + "','" + food.getName() + "');";
                PreparedStatement prest;
                prest = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                prest.executeUpdate();
                ResultSet rs = prest.getGeneratedKeys();
                if(rs.next()) {
                    lastId = rs.getInt("id");
                }
            } else {
                lastId = foods.getInt("id");
                return false;
            }
        } catch (Exception e) {

        }
        return true;
    }

    public static boolean removeFood(int id) throws FoodNotFoundException{
        try {
            stmt = conn.createStatement();
            stmt.executeQuery("DELETE FROM foods WHERE id ='" + id + "'");
            return true;
        } catch (Exception e) { }
        throw new FoodNotFoundException(id);

    }

    public static ArrayList<Food> getFood() throws SQLException, SellerNotFoundException, FoodCategoryNotFoundException {

        stmt=conn.createStatement();

        String sql = "SELECT * FROM foods;";
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Food> _food = new ArrayList<>();
        Food food = null;
        while (rs.next())
        {
            // int id, String name, Seller seller, int price, FoodCategory category
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int sellerId = rs.getInt("seller_id");
            int price = rs.getInt("price");
            int categoryId = rs.getInt("category_id");
            food = new Food(id,name,DatabaseSellerPostgre.getSellerById(sellerId),price,DatabaseFoodCategoryPostgre.getFoodCategoryById(categoryId));
            _food.add(food);
        }
        return _food;
    }
}