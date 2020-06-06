package alfianfirmansyah.jfood;

/**
 * Class FoodNotFoundException merupakan blueprint Error Handling data Food.
 *
 * @author (Alfian Firmansyah)
 * @version (12.04.20)
 */
public class LocationNotFoundException extends Exception
{
    // membuat atribut dalam Class FoodNotFoundException
    private int location_error;

    /**
     * method mutator dalam Class FoodNotFoundException
     * @param location_input untuk memasukkan nilai atribut
     */
    public LocationNotFoundException (int location_input)
    {
        super("Location ID: ");
        this.location_error=location_input;
    }

    /**
     * method accesor dalam Class FoodNotFoundException
     * @return food_error untuk mengembalikan nilai atribut
     */
    public String getMessage()
    {
        return super.getMessage()+location_error+"not found";
    }
}
