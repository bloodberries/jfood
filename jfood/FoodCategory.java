
/**
 * Enumeration class ItemCategory - write a description of the enum class here
 *
 * @author Alfian Firmansyah
 * @version (version number or date here)
 */
public enum FoodCategory
{
    BEVERAGES("Beverages"), 
    COFFEE("Coffee"), 
    WESTERN("Western"), 
    SNACKS("Snacks"), 
    RICE("Rice"), 
    NOODLES("Noodles"), 
    BAKERY("Backery"),
    JAPANESE("Japanese");
    
    private String categoryFood;
    
    FoodCategory(String categoryFood){
        this.categoryFood = categoryFood;
    }
    
    public String toString(){
        return categoryFood;
    }
    
    /*
    public String getCategoryFood(){
        return categoryFood;
    }
    */
}
