import java.util.ArrayList;
public class DatabaseInvoice {

    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public int getLastId(){
        return lastId;
    }

    public Invoice getInvoiceById(int id){
        for(Invoice invoice : INVOICE_DATABASE) {
            if(invoice.getId()==id) {
                return invoice;
            }
        }
        return null;

    }

    public ArrayList<Invoice> getInvoiceByCustomer(int customerId) throws CustomerNotFoundException {
        ArrayList<Invoice> invoiceList = new ArrayList<>();
        Customer customer = DatabaseCustomer.getCustomerById(customerId);
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getCustomer().equals(customer)){
                invoiceList.add(invoice);
            }
        }
        return invoiceList;
    }

    public static boolean addInvoice(Invoice invoice){
        int customerId = invoice.getCustomer().getId();
        for (Invoice _invoice : INVOICE_DATABASE) {
            if (_invoice.getCustomer().getId() == customerId && _invoice.getInvoiceStatus() == InvoiceStatus.ONGOING){
                return false;
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        for(Invoice invoice : INVOICE_DATABASE) {
            if(invoice.getId() == id && invoice.getInvoiceStatus().equals(InvoiceStatus.ONGOING)) {
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoice(int id) {
        for(Invoice invoice : INVOICE_DATABASE) {
            if(invoice.getId()==id) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        return false;
    }


}
