public class PriceCalculator implements Runnable {

    private Invoice invoice;

    @Override
    public void run() {
        System.out.println("calculating invoice id: "  + invoice.getId());
        invoice.setTotalPrice();
        System.out.println("finish calculating invoice id: " + invoice.getId());
    }
}
