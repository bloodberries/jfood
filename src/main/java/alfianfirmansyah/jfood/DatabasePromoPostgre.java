package alfianfirmansyah.jfood;


import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class DatabasePromoPostgre {
    private static final Connection conn = DatabaseConnection.connection();
    private static Statement stmt = null;

    private static int lastId=0;

    public static int getLastId()
    {
        return lastId;
    }

    public static Promo getPromoById(int id) throws PromoNotFoundException
    {
        try {
            stmt = conn.createStatement();
            ResultSet promos = stmt.executeQuery("SELECT * FROM promos WHERE id='" + id + "'");
            if(promos.next()) {

                //int id, String code, int discount, int minPrice, boolean active
                int promoId = promos.getInt("id");
                String code = promos.getString("code");
                int discount = promos.getInt("discount");
                int minPrice = promos.getInt("min_price");
                boolean active = promos.getBoolean("is_active");

                return new Promo(promoId,code,discount,minPrice,active);
            } else {
                return null;
            }

        } catch (Exception e) { }
        throw new PromoNotFoundException(id);

    }

    public static Promo getPromoByCode(String code) throws PromoNotFoundException2
    {
        try {
            stmt = conn.createStatement();
            ResultSet promos = stmt.executeQuery("SELECT * FROM promos WHERE code='" + code + "'");
            if(promos.next()) {

                //int id, String code, int discount, int minPrice, boolean active
                int promoId = promos.getInt("id");
//                String code = promos.getString("code");
                int discount = promos.getInt("discount");
                int minPrice = promos.getInt("min_price");
                boolean active = promos.getBoolean("is_active");

                return new Promo(promoId,code,discount,minPrice,active);
            } else {
                return null;
            }

        } catch (Exception e) { }
        throw new PromoNotFoundException2(code);

    }

    public static ArrayList<Promo> getPromo() throws SQLException
    {

        stmt=conn.createStatement();

        String sql = "SELECT * FROM promos;";
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Promo> _promo = new ArrayList<>();
        Promo promo = null;
        while (rs.next())
        {
            // int id, String name, Seller seller, int price, FoodCategory category
            int id = rs.getInt("id");
//            int promoId = rs.getInt("id");
            String code = rs.getString("code");
            int discount = rs.getInt("discount");
            int minPrice = rs.getInt("min_price");
            boolean active = rs.getBoolean("is_active");

            promo = new Promo(id,code,discount,minPrice,active);
            _promo.add(promo);
        }
        return _promo;
    }
}