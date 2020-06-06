package alfianfirmansyah.jfood;


import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class DatabaseLocationPostgre {
    private static final Connection conn = DatabaseConnection.connection();
    private static Statement stmt = null;

    private static int lastId=0;

    public static int getLastId()
    {
        return lastId;
    }

    public static Location getLocationById(int id) throws LocationNotFoundException
    {
        try {
            stmt = conn.createStatement();
            ResultSet locations = stmt.executeQuery("SELECT * FROM locations WHERE id='" + id + "'");
            if(locations.next()) {

                //int id, String city, String province, String description
                int locationId = locations.getInt("id");
                String city = locations.getString("city");
                String province = locations.getString("province");
                String description = locations.getString("description");

                return new Location(locationId,city,province,description);
            } else {
                return null;
            }

        } catch (Exception e) { }
        throw new LocationNotFoundException(id);

    }

    public static ArrayList<Location> getLocation() throws SQLException
    {

        stmt=conn.createStatement();

        String sql = "SELECT * FROM locations;";
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Location> _location = new ArrayList<>();
        Location location = null;
        while (rs.next())
        {
            // int id, String name, Seller seller, int price, FoodCategory category
            int id = rs.getInt("id");
            String city = rs.getString("city");
            String province = rs.getString("province");
            String description = rs.getString("description");

            location = new Location(id,city,province,description);
            _location.add(location);
        }
        return _location;
    }
}