
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
    
    /**
     * Constructor for objects of class CashInvoice
     */
    public CashInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, customer, invoiceStatus);
       
    }
    
    public CashInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus, int deliveryFee){
        super(id, food, customer, invoiceStatus);
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
    
    public void setTotalPrice(){
        if(deliveryFee != 0){
            super.totalPrice = super.getFood().getPrice() + getDeliveryFee();
        }else{
            super.totalPrice = super.getFood().getPrice();
        }
    }
    
    public String toString(){
        return "================INVOICE================"+ "\n"+
        "ID: " + super.getId()+ "\n"+
        "Food: " + super.getFood().getName()+ "\n"+
        //"Date: " + super.getDate()+ "\n"+
        "Customer: " + getCustomer().getName()+ "\n"+
        "Delivery Fee: " + getDeliveryFee()+ "\n"+
        "Total price: " + super.totalPrice+ "\n"+
        "Status: " + getInvoiceStatus()+ "\n"+
        "Payment Type: " + getPaymentType()+ "\n";
        
    }
    
    
}
