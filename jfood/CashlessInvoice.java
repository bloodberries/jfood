
/**
 * Write a description of class CashlessInvoice here.
 *
 * @author Alfian Firmansyah
 * @version 1.0
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private PaymentType PAYMENT_TYPE = PaymentType.CASHLESS;
    private Promo promo;
    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        // initialise instance variables
        super(id, food, date, customer, invoiceStatus);
        
    }
    
    
    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        
        super(id, food, date, customer, invoiceStatus);
        this.promo = promo;
    }
    
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }

    public Promo getPromo(){
        return promo;
    }
    
    public void setTotalPrice(){
        if(promo != null && promo.getActive() == true && getFood().getPrice() >= promo.getMinPrice() ){
            
            super.totalPrice = getFood().getPrice() - promo.getDiscount();
        }else{
            super.totalPrice = getFood().getPrice();
        }
    }
    
    public void printData(){
        {//id, food, date, customer, invoiceStatus
        System.out.println("================INVOICE================");
        System.out.println("ID: " + super.getId());
        System.out.println("Food: " + super.getFood().getName());
        System.out.println("Date: " + super.getDate());
        System.out.println("Customer: " + super.getCustomer().getName());
        System.out.println("Total Price: " + super.getTotalPrice());
        System.out.println("Status: " + super.getInvoiceStatus().toString());
        
    }
    }
    
    
    
}
