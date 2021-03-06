package alfianfirmansyah.jfood;

/**
 * Class FoodNotFoundException merupakan blueprint Error Handling data Food.
 *
 * @author (Alfian Firmansyah)
 * @version (12.04.20)
 */
public class FoodNotFoundException extends Exception
{
    // membuat atribut dalam Class FoodNotFoundException
    private int food_error;

    /**
     * method mutator dalam Class FoodNotFoundException
     * @param food_input untuk memasukkan nilai atribut
     */
    public FoodNotFoundException (int food_input)
    {
        super("Food ID: ");
        this.food_error=food_input;
    }

    /**
     * method accesor dalam Class FoodNotFoundException
     * @return food_error untuk mengembalikan nilai atribut
     */
    public String getMessage()
    {
        return super.getMessage()+food_error+"not found";
    }
}
