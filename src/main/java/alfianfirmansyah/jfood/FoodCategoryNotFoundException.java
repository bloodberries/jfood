package alfianfirmansyah.jfood;

/**
 * Class FoodNotFoundException merupakan blueprint Error Handling data Food.
 *
 * @author (Alfian Firmansyah)
 * @version (12.04.20)
 */
public class FoodCategoryNotFoundException extends Exception
{
    // membuat atribut dalam Class FoodNotFoundException
    private int foodCategory_error;

    /**
     * method mutator dalam Class FoodNotFoundException
     * @param foodCategory_input untuk memasukkan nilai atribut
     */
    public FoodCategoryNotFoundException (int foodCategory_input)
    {
        super("Food Category ID: ");
        this.foodCategory_error=foodCategory_input;
    }

    /**
     * method accesor dalam Class FoodNotFoundException
     * @return food_error untuk mengembalikan nilai atribut
     */
    public String getMessage()
    {
        return super.getMessage()+foodCategory_error+"not found";
    }
}
