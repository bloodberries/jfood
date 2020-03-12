
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
        if(promo != null && promo.getActive() == true && (getFood().getPrice()) >= promo.getMinPrice() ){
            
            this.totalPrice = (getFood().getPrice()) - promo.getDiscount();
        }else{
            this.totalPrice = (getFood().getPrice());
        }
    }
    
    public void printData(){
        //id, food, date, customer, invoiceStatus
          
        System.out.println("================INVOICE================");
        System.out.println("ID: " + super.getId());
        System.out.println("Food: " + super.getFood().getName());
        System.out.println("Date: " + super.getDate());
        System.out.println("Customer: " + getCustomer().getName());
        if(promo != null && promo.getActive() == true && getFood().getPrice_temp() >= promo.getMinPrice() ){
        System.out.println("Promo: " + promo.getCode());
        System.out.println("Total Price: " + this.totalPrice + " Selamat Anda hemat " + promo.getDiscount());
        }else if(promo != null && promo.getActive() == true && getFood().getPrice_temp() < promo.getMinPrice() ){
        System.out.println("Total Price: " + this.totalPrice + "(promo tidak dapat digunakan)");
        }else{
        System.out.println("Total Price: " + this.totalPrice + "(Terdapat promo code, silahkan gunakan)");
        }
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Payment Type: " + getPaymentType());
        
       
       /*
       if(promo != null && promo.getActive() == true && getTotalPrice() >= promo.getMinPrice() ){
        System.out.println("================INVOICE================");
        System.out.println("ID: " + super.getId());
        System.out.println("Food: " + super.getFood().getName());
        System.out.println("Date: " + super.getDate());
        System.out.println("Customer: " + getCustomer().getName());
        System.out.println("Promo: " );
        System.out.println("Total Price: " + this.totalPrice);
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Payment Type: " + getPaymentType());
        }else{
        System.out.println("================INVOICE================");
        System.out.println("ID: " + super.getId());
        System.out.println("Food: " + super.getFood().getName());
        System.out.println("Date: " + super.getDate());
        System.out.println("Customer: " + getCustomer().getName());
        System.out.println("Total Price: " + this.totalPrice);
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Payment Type: " + getPaymentType());
        }
        */
        }
    
    
    
    
}
