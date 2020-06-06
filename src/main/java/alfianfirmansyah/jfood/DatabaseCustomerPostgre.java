package alfianfirmansyah.jfood;


import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class DatabaseCustomerPostgre {
    private static final Connection conn = DatabaseConnection.connection();
    private static Statement stmt = null;

    private static int lastId=0;

    public static int getLastId()
    {
        return lastId;
    }

    public static int getLastCustomerId()
    {
        try {
            stmt = conn.createStatement();
            ResultSet customers = stmt.executeQuery("SELECT id FROM customers ORDER BY id DESC LIMIT 1");
            if(customers.next()) {
                return customers.getInt("id");
            }
        } catch (Exception e) { }
        return 0;
    }

    public static Customer getCustomerById(int id) throws CustomerNotFoundException
    {
        try {
            stmt = conn.createStatement();
            ResultSet customers = stmt.executeQuery("SELECT * FROM customers WHERE id='" + id + "'");
            if(customers.next()) {
                int year = Integer.parseInt(customers.getString("joindate").substring(0,3));
                int month = Integer.parseInt(customers.getString("joindate").substring(5,6));
                int dayOfMonth = Integer.parseInt(customers.getString("joindate").substring(8,9));
                Calendar joinDate = new GregorianCalendar(year, month, dayOfMonth);
                return new Customer(id, customers.getString("name"), customers.getString("email"), customers.getString("password"), joinDate);
            } else {
                return null;
            }

        } catch (Exception e) { }
        throw new CustomerNotFoundException(id);
    }

    public static boolean insertCustomer(Customer customer) throws EmailAlreadyExistsException
    {
        try {
            stmt = conn.createStatement();
            String sql = "SELECT id FROM customers WHERE email='"+ customer.getEmail() +"'";
            ResultSet customers = stmt.executeQuery(sql);
            if(!customers.next()) { //cek apakah email sudah ada di table customers, jika belum insert sellers
                sql = "INSERT INTO customers (name,email,password,joindate) VALUES ('" + customer.getName() + "','" + customer.getEmail() + "','" + customer.getPassword() + "',CURRENT_TIMESTAMP);";
                PreparedStatement prest;
                prest = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                prest.executeUpdate();
                ResultSet rs = prest.getGeneratedKeys();
                if(rs.next()) {
                    lastId = rs.getInt("id");
                }
            } else {
                lastId = customers.getInt("id");
                return false;
            }
        } catch (Exception e) {

        }
        return true;
    }

    public static boolean removeCustomer(int id) throws CustomerNotFoundException {
        try {
            stmt = conn.createStatement();
            stmt.executeQuery("DELETE FROM customers WHERE id='" + id + "'");
            return true;
        } catch (Exception e) {


        }
        throw new CustomerNotFoundException(id);

    }

    public static Customer getCustomerLogin(String email, String password)
    {
        try {
            stmt = conn.createStatement();
            ResultSet customers = stmt.executeQuery("SELECT * FROM customers WHERE email = '" + email + "'");
            if(customers.next()) {
                if(customers.getString("password").contentEquals(password)){
                    int year = Integer.parseInt(customers.getString("joindate").substring(0,3));
                    int month = Integer.parseInt(customers.getString("joindate").substring(5,6));
                    int dayOfMonth = Integer.parseInt(customers.getString("joindate").substring(8,9));
                    Calendar joinDate = new GregorianCalendar(year, month, dayOfMonth);
                    return new Customer(customers.getInt("id"), customers.getString("name"), customers.getString("email"), customers.getString("password"), joinDate);
                }
            }
        } catch (Exception e) { }
        return null;
    }

    public static ArrayList<Customer> getCustomer() throws SQLException
    {

        stmt=conn.createStatement();

        String sql = "SELECT * FROM customers;";
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Customer> _customer = new ArrayList<>();
        Customer cust = null;
        while (rs.next())
        {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            String password = rs.getString("password");
            //Date date = rs.getDate("joindate");
            int year = Integer.parseInt(rs.getString("joindate").substring(0,3));
            int month = Integer.parseInt(rs.getString("joindate").substring(5,6));
            int dayOfMonth = Integer.parseInt(rs.getString("joindate").substring(8,9));
            Calendar joinDate = new GregorianCalendar(year, month, dayOfMonth);
            cust = new Customer(id,name,email,password,joinDate);
            _customer.add(cust);
        }
        return _customer;
    }
}