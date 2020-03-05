
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author Alfian Firmansyah
 * @version 1.0
 */
public enum PaymentType
{
    CASHLESS("Cashless"),
    CASH("Cash");
    
    private String typePayment;
    
    PaymentType(String typePayment){
        this.typePayment = typePayment;
    }
    
    
    public String toString(){
        return typePayment;
    }
    
    /*
    public String getTypePayment(){
        return typePayment;
    }
    */
}
