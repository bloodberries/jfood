import java.util.*;
import java.text.SimpleDateFormat;
/**
 * Write a description of class CashlessInvoice here.
 *
 * @author Alfian Firmansyah
 * @version 1.0
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.CASHLESS;
    private Promo promo;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        // initialise instance variables
        super(id, foods, customer);
        
    }
    
    
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, Promo promo)
    {
        
        super(id, foods, customer);
        this.promo = promo;
    }
    
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }

    public Promo getPromo(){
        return promo;
    }
    
//    public void setTotalPrice(){
//        if(promo != null && promo.getActive() == true && (getFoods().getPrice()) >= promo.getMinPrice() ){
//
//            this.totalPrice = (getFoods().getPrice()) - promo.getDiscount();
//        }else{
//            this.totalPrice = (getFoods().getPrice());
//        }
//    }
public void setTotalPrice() {
    ArrayList<Food> listFood = super.getFoods();


    int total = 0;
    for (Food food: listFood) {
        total += food.getPrice();
    }

    if (promo != null && promo.getActive() && total > promo.getMinPrice()) {
        super.totalPrice = total - promo.getDiscount();
    } else {
        super.totalPrice = total;
    }
}
    /*
    public String toString(){
        SimpleDateFormat dateNow = this.dateFormat;
       if(promo != null && promo.getActive() == true && getFoods().getPrice_temp() >= promo.getMinPrice() ){
       return "================INVOICE================" + "\n"+
        "ID: " + super.getId()+ "\n"+
        "Food: " + super.getFoods().getName()+ "\n"+
        "Date: " + dateNow.format(super.getDate().getTime())+"\n"+
        "Customer: " + getCustomer().getName()+ "\n"+
        "Promo: " + promo.getCode()+ "\n"+
        "Total Price: " + this.totalPrice + " Selamat Anda hemat " + promo.getDiscount() + "\n"+
        "Status: " + getInvoiceStatus() + "\n"+
        "Payment Type: " + getPaymentType()+ "\n";
        }else if(promo != null && promo.getActive() == true && getFoods().getPrice_temp() < promo.getMinPrice() ){
        return "================INVOICE================"+ "\n"+
        "ID: " + super.getId()+ "\n"+
        "Food: " + super.getFoods().getName()+ "\n"+
        "Date: " + dateNow.format(super.getDate().getTime()) + "\n"+
        "Customer: " + getCustomer().getName()+ "\n"+
        "Total Price: " + this.totalPrice + "(promo tidak dapat digunakan)"+ "\n"+
        "Status: " + getInvoiceStatus()+ "\n"+
        "Payment Type: " + getPaymentType()+ "\n";
        }else{
        return "================INVOICE================"+ "\n"+
        "ID: " + super.getId()+ "\n"+
        "Food: " + super.getFoods().getName()+ "\n"+
        "Date: " + dateNow.format(super.getDate().getTime())+ "\n"+
        "Customer: " + getCustomer().getName()+ "\n"+
        "Total Price: " + this.totalPrice + "(Terdapat promo code, silahkan gunakan)"+ "\n"+
        "Status: " + getInvoiceStatus()+ "\n"+
        "Payment Type: " + getPaymentType()+ "\n";
        }


        }
*/
    public String toString(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String strFoodList = "";
        ArrayList<Food> list = super.getFoods();
        for (Food food: list) {
            strFoodList += food.getName() + "\n";
        }

        String ret = "\nId: " + super.getId(id) + "\n" +
                "Food Name: \n" + strFoodList+ "\n" +
                "Date: " + formatter.format(super.getDate().getTime()) + "\n" +
                "Total Price: " + super.totalPrice + "\n" +
                "Customer Name: " + super.getCustomer().getName() + "\n" +
                "Invoice Status: " + super.getInvoiceStatus().toString() + "\n" +
                "Payment Type: " + PAYMENT_TYPE.toString();

        int total = 0;
        if ((promo != null && promo.getActive() && total > promo.getMinPrice())) {
            ret += "\nPromo code: " + promo.getCode() + "\n";
            return ret;
        } else {
            return ret;
        }
    }
    
    
    
    
}
