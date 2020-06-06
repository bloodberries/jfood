//package alfianfirmansyah.jfood;
//
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//
//
//
//public class DatabaseInvoicePostgre {
//    private static final Connection conn = DatabaseConnection.connection();
//    private static Statement stmt = null;
//
//    private static int lastId=0;
//
//    public static int getLastId()
//    {
//        return lastId;
//    }
//
//    public static int getLastInvoiceId()
//    {
//        try {
//            stmt = conn.createStatement();
//            ResultSet invoices = stmt.executeQuery("SELECT id FROM invoices ORDER BY id DESC LIMIT 1");
//            if(invoices.next()) {
//                return invoices.getInt("id");
//            }
//        } catch (Exception e) { }
//        return 0;
//    }
//
//    public void test(){
//        StringBuilder buffer = new StringBuilder();
//        boolean processedFirst = false;
//        String firstParam = null, secondParam = null;
//
//        try{
//            for(String record: arrayList1){
//                if(processedFirst)
//                    buffer.append(",");
//                buffer.append(record);
//                processedFirst = true;
//            }
//            firstParam = buffer.toString();
//        }finally{
//            buffer = null;
//        }
//        processedFirst = false;
//        buffer = new StringBuilder();
//        try{
//            for(String record: arrayList2){
//                if(processedFirst)
//                    buffer.append(",");
//                buffer.append(record);
//                processedFirst = true;
//            }
//            secondParam = buffer.toString();
//        }finally{
//            buffer = null;
//        }
//        secondParam = buffer.toString();
//
//        String sql = "INSERT INTO soundsdata.splog (arraylist1, arraylist2) VALUES(?,?)";
//        try{
//            psmt = (PreparedStatement) con.prepareStatement(sql);
//            pstmt.setString(1,firstParam);
//            pstmt.setString(2,secondParam);
//            pstmt.executeUpdate();
//        }finally {
//            pstmt.close();
//        }
//    }
//
//    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException
//    {
//        try {
//            stmt = conn.createStatement();
//            ResultSet invoices = stmt.executeQuery("SELECT * FROM invoices WHERE id='" + id + "'");
//            if(invoices.next()) {
//
////                int id, ArrayList<Food> foods,  Customer customer
//                for (Invoice invoice : INVOICE_DATABASE) {
//                    if (invoice.getId() == id) {
//                        return invoice;
//                    }
//                }
//            } else {
//                return null;
//            }
//
//        } catch (Exception e) { }
//        throw new CustomerNotFoundException(id);
//    }
//
//
//    public static boolean removeCustomer(int id) throws CustomerNotFoundException {
//        try {
//            stmt = conn.createStatement();
//            stmt.executeQuery("DELETE FROM invoices WHERE id='" + id + "'");
//            return true;
//        } catch (Exception e) {
//
//
//        }
//        throw new CustomerNotFoundException(id);
//
//    }
//
//    public static Customer getCustomerLogin(String email, String password)
//    {
//        try {
//            stmt = conn.createStatement();
//            ResultSet invoices = stmt.executeQuery("SELECT * FROM invoices WHERE email = '" + email + "'");
//            if(invoices.next()) {
//                if(invoices.getString("password").contentEquals(password)){
//                    int year = Integer.parseInt(invoices.getString("joindate").substring(0,3));
//                    int month = Integer.parseInt(invoices.getString("joindate").substring(5,6));
//                    int dayOfMonth = Integer.parseInt(invoices.getString("joindate").substring(8,9));
//                    Calendar joinDate = new GregorianCalendar(year, month, dayOfMonth);
//                    return new Customer(invoices.getInt("id"), invoices.getString("name"), invoices.getString("email"), invoices.getString("password"), joinDate);
//                }
//            }
//        } catch (Exception e) { }
//        return null;
//    }
//
//    public static ArrayList<Invoice> getInvoice() throws SQLException
//    {
//
//        stmt=conn.createStatement();
//
//        String sql = "SELECT * FROM invoices;";
//        ResultSet rs = stmt.executeQuery(sql);
//        ArrayList<Invoice> _invoice = new ArrayList<>();
//        Invoice inv = null;
//        while (rs.next())
//        {
//            //                int id, ArrayList<Food> foods,  Customer customer
//            int id = rs.getInt("id");
//            ArrayList<Food> foods = rs.getArray("foods");
//            String email = rs.getString("email");
//            String password = rs.getString("password");
//            //Date date = rs.getDate("joindate");
//            int year = Integer.parseInt(rs.getString("joindate").substring(0,3));
//            int month = Integer.parseInt(rs.getString("joindate").substring(5,6));
//            int dayOfMonth = Integer.parseInt(rs.getString("joindate").substring(8,9));
//            Calendar joinDate = new GregorianCalendar(year, month, dayOfMonth);
//            cust = new Customer(id,name,email,password,joinDate);
//            _customer.add(cust);
//        }
//        return _customer;
//    }
//}