package alfianfirmansyah.jfood;
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author Alfian Firmansyah
 * @version 1.0
 */
public enum InvoiceStatus
{
    ONGOING("Ongoing"),
    FINISHED("Finished"),
    CANCELLED("Cancelled");
    
    private String statusInvoice;
    
    InvoiceStatus(String statusInvoice){
        this.statusInvoice = statusInvoice;
    }
    
    
    public String toString(){
        return statusInvoice;
    }
}
