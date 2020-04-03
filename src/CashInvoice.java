import java.util.*;
import java.text.SimpleDateFormat;
/**
 * Write a description of class CashInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.CASH;
    private int deliveryFee = 0;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
    
    /**
     * Constructor for objects of class CashInvoice
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super(id, foods, customer);
       
    }
    
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer, int deliveryFee){
        super(id, foods, customer);
        this.deliveryFee = deliveryFee;
        
    }

    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
    
    public int getDeliveryFee(){
        return deliveryFee;
    }
    
    public void setDeliveryFee(){
        this.deliveryFee = deliveryFee;
    }
    
//    public void setTotalPrice(){
//        if(deliveryFee != 0){
//            super.totalPrice = super.getFoods().getPrice() + getDeliveryFee();
//        }else{
//            super.totalPrice = super.getFoods().getPrice();
//        }
//    }

    public void setTotalPrice() {
        ArrayList<Food> listFood = super.getFoods();


        int total = 0;
        for (Food food: listFood) {
            total += food.getPrice();
        }


        if (deliveryFee > 0) {
            super.totalPrice = total + deliveryFee;
        } else {
            super.totalPrice = total;
        }
    }

    /*
    public String toString(){
        SimpleDateFormat dateNow = this.dateFormat;
        return "================INVOICE================"+ "\n"+
        "ID: " + super.getId()+ "\n"+
        "Foods: " + super.getFoods().getName()+ "\n"+
        "Date: " + dateNow.format(super.getDate().getTime())+ "\n"+
        "Customer: " + getCustomer().getName()+ "\n"+
        "Delivery Fee: " + getDeliveryFee()+ "\n"+
        "Total price: " + super.totalPrice+ "\n"+
        "Status: " + getInvoiceStatus()+ "\n"+
        "Payment Type: " + getPaymentType()+ "\n";
        
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

        return ret;
    }



}
