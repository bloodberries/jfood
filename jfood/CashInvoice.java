
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
    public CashInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, date, customer, invoiceStatus);
       
    }
    
    public CashInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, int deliveryFee){
        super(id, food, date, customer, invoiceStatus);
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
    
    public void printData(){
        System.out.println("================INVOICE================");
        System.out.println("ID: " + super.getId());
        System.out.println("Food: " + super.getFood().getName());
        System.out.println("Date: " + super.getDate());
        System.out.println("Customer: " + getCustomer().getName());
        System.out.println("Delivery Fee: " + getDeliveryFee());
        System.out.println("Total price: " + super.totalPrice);
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Payment Type: " + getPaymentType());
        
    }
    
    
}
