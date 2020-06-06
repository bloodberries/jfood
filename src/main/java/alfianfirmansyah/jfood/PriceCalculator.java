package alfianfirmansyah.jfood;

import java.util.ArrayList;

/**
 * Class PriceCalculator merupakan blueprint threading data Invoice.
 *
 * @author (Alfian Firmansyah)
 * @version (12.04.20)
 */
public class PriceCalculator implements Runnable
{
    private Invoice invoice;

    public PriceCalculator(Invoice invoice){
        this.invoice=invoice;
    }

    @Override
    public void run()
    {
        System.out.println("calculating invoice id:"+invoice.getId());
        invoice.setTotalPrice();
        System.out.println("finish calculating invoice id:"+invoice.getId());
    }


}
