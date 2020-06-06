package alfianfirmansyah.jfood;


import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class DatabaseFoodCategoryPostgre {
    private static final Connection conn = DatabaseConnection.connection();
    private static Statement stmt = null;

    private static int lastId=0;

    public static int getLastId()
    {
        return lastId;
    }

       public static FoodCategory getFoodCategoryById(int id) throws FoodCategoryNotFoundException
    {
        try {
            stmt = conn.createStatement();
            ResultSet food_categories = stmt.executeQuery("SELECT * FROM food_categories WHERE id='" + id + "'");
            if(food_categories.next()) {

//                int id, String category
                int categoryId = food_categories.getInt("id");
                String category = food_categories.getString("category");

                return new FoodCategory(categoryId, category);
            } else {
                return null;
            }

        } catch (Exception e) { }
        throw new FoodCategoryNotFoundException(id);

    }

    public static ArrayList<FoodCategory> getFoodCategory() throws SQLException
    {

        stmt=conn.createStatement();

        String sql = "SELECT * FROM food_categories;";
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<FoodCategory> _foodCategory = new ArrayList<>();
        FoodCategory foodCategory = null;
        while (rs.next())
        {
            // int id, String name, Seller seller, int price, FoodCategory category
            int id = rs.getInt("id");
            String category = rs.getString("category");

            foodCategory = new FoodCategory(id,category);
            _foodCategory.add(foodCategory);
        }
        return _foodCategory;
    }
}