package alfianfirmansyah.jfood;
public class CustomerNotFoundException extends Exception{
    private static int customer_error;

    public CustomerNotFoundException(int customer_input){
        super("Customer ID: ");
        this.customer_error = customer_input;
    }


    public String getMessage(){
        return super.getMessage() + customer_error + " not found";
    }
}