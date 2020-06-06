package alfianfirmansyah.jfood;


import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class DatabaseSellerPostgre {
    private static final Connection conn = DatabaseConnection.connection();
    private static Statement stmt = null;

    private static int lastId=0;

    public static int getLastId()
    {
        return lastId;
    }

    public static int getLastSellerId()
    {
        try {
            stmt = conn.createStatement();
            ResultSet sellers = stmt.executeQuery("SELECT id FROM sellers ORDER BY id DESC LIMIT 1");
            if(sellers.next()) {
                return sellers.getInt("id");
            }
        } catch (Exception e) { }
        return 0;
    }

    public static Seller getSellerById(int id) throws SellerNotFoundException
    {
        try {
            stmt = conn.createStatement();
            ResultSet sellers = stmt.executeQuery("SELECT * FROM sellers WHERE id='" + id + "'");
            if(sellers.next()) {

            //    int id, String name, String email, String phoneNumber, Location location
                int sellerId = sellers.getInt("id");
                String name = sellers.getString("name");
                String email = sellers.getString("email");
               String phoneNumber =  sellers.getString("phone_number");
               int locationId = sellers.getInt("location_id");

                return new Seller(sellerId, name, email, phoneNumber, DatabaseLocationPostgre.getLocationById(locationId));
            } else {
                return null;
            }

        } catch (Exception e) { }
        throw new SellerNotFoundException(id);
    }

    public static boolean insertSeller(Seller seller)
    {
        try {
            stmt = conn.createStatement();
            //    int id, String name, String email, String phoneNumber, Location location
            String sql = "SELECT id FROM sellers WHERE name LIKE '%"+ seller.getName() +"%'";
            ResultSet sellers = stmt.executeQuery(sql);
            if(!sellers.next()) { //cek food sudah ada di table sellers, jika belum insert food
                sql = "INSERT INTO sellers (location_id,name,email,phone_number) VALUES ('" + seller.getLocation().getId() + "','" + seller.getName() + "','" + seller.getEmail() + "','" + seller.getPhoneNumber() +"');";
                PreparedStatement prest;
                prest = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                prest.executeUpdate();
                ResultSet rs = prest.getGeneratedKeys();
                if(rs.next()) {
                    lastId = rs.getInt("id");
                }
            } else {
                lastId = sellers.getInt("id");
                return false;
            }
        } catch (Exception e) {

        }
        return true;
    }

    public static boolean removeSeller(int id) throws SellerNotFoundException{
        try {
            stmt = conn.createStatement();
            stmt.executeQuery("DELETE FROM sellers WHERE id ='" + id + "'");
            return true;
        } catch (Exception e) { }
        throw new SellerNotFoundException(id);

    }

    public static ArrayList<Seller> getSeller() throws SQLException, LocationNotFoundException {

        stmt=conn.createStatement();

        String sql = "SELECT * FROM sellers;";
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Seller> _seller = new ArrayList<>();
        Seller seller = null;
        while (rs.next())
        {
            // int id, String name, Seller seller, int price, FoodCategory category
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int locationId = rs.getInt("location_id");
            String phoneNumber = rs.getString("phone_number");
            String email = rs.getString("email");
            seller = new Seller(id,name,email,phoneNumber,DatabaseLocationPostgre.getLocationById(locationId));
            _seller.add(seller);
        }
        return _seller;
    }
}