public class PromoNotFoundException extends Exception{
    private static int promo_error;

    public PromoNotFoundException(int promo_input){
        super("Promo ID: ");
        this.promo_error = promo_input;
    }


    public String getMessage(){
        return super.getMessage() + promo_error + " not found";
    }
}
