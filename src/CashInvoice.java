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

    @Override
    public void setTotalPrice() {
        super.totalPrice=0;
        for(Food foodList : getFoods())
        {
            super.totalPrice=super.totalPrice+foodList.getPrice();
        }
        super.totalPrice=super.totalPrice+deliveryFee;
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
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        String foods = "";
        for(Food foodList : getFoods())
        {
            foods = foods + foodList.getName() + ", ";
        }
        foods = foods.substring(0, foods.length() - 2);

        return "============INVOICE CASH============"+
                "\nID :" + super.getId()+
                "\nFoods :"  + foods+
                "\nDate :" + sdf.format(super.getDate().getTime())+
                "\nCustomer :" + super.getCustomer().getName()+
                "\nDelivery Fee :" + getDeliveryFee()+
                "\nTotal price :" + totalPrice+
                "\nStatus :" + super.getInvoiceStatus()+
                "\nPayment Type :" + getPaymentType();
    }

}
