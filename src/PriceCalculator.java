public class PriceCalculator implements Runnable {

    private Invoice invoice;


    private Thread t;
    private String threadName;

    PriceCalculator( String name, Invoice invoice) {
        threadName = name;
        this.invoice = invoice;
        System.out.println("Creating " +  threadName + " Invoice ID: " + invoice.getId() );
    }
    @Override
    public void run() {
        System.out.println("calculating invoice id: "  + invoice.getId());
        invoice.setTotalPrice();
        System.out.println("finish calculating invoice id: " + invoice.getId());
    }
}
