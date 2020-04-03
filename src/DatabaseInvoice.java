import java.util.ArrayList;
public class DatabaseInvoice {

    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public int getLastId(){
        return lastId;
    }

    public Invoice getInvoiceById(int id){
            Invoice invoice = INVOICE_DATABASE.get(id);

            if (invoice != null) {
                return invoice;
            }
            return null;

    }

    public ArrayList<Invoice> getInvoiceByCustomer(int customerId){
        Invoice invoice = INVOICE_DATABASE.get(customerId);
        ArrayList<Invoice> getInvoice = new ArrayList<>();
        if (invoice != null) {
            getInvoice.add(invoice);
            return getInvoice;
        }
        return null;
    }

    public boolean addInvoice(Invoice invoice){
        if(invoice.getInvoiceStatus() != InvoiceStatus.ONGOING){
        INVOICE_DATABASE.add(invoice);
        lastId = INVOICE_DATABASE.indexOf(invoice);
        return true;
        }
        return false;
    }

    public boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
//        Invoice invoice = INVOICE_DATABASE.get(id);
//        InvoiceStatus statusInvoice = INVOICE_DATABASE.get();


        for(Invoice i : INVOICE_DATABASE) {
            if ((i.getInvoiceStatus() == InvoiceStatus.ONGOING &&  i.getId() == id)) {
                i.setInvoiceStatus(invoiceStatus);
                return true;

            }
        }
        return false;

    }

    public static boolean removeInvoice(int id) {
        Invoice invoice = INVOICE_DATABASE.get(id);
        if (invoice != null) {
            INVOICE_DATABASE.remove(invoice);
            return true;
        }
        return false;
    }


}
