package alfianfirmansyah.jfood;


/**
 * Enumeration class FoodCategory - Terdiri dari 8 kategori menu
 *
 * @author (Alfian Firmansyah)
 * @version (12.03.2020)
 */
public class FoodCategory //Enum Class FoodCategory
{
    // membuat variable Enum Class FoodCategory
//    Beverages("Beverages"),
//    Coffee("Coffee"),
//    Western("Western"),
//    Snacks("Snacks"),
//    Rice("Rice"),
//    Noodles("Noodles"),
//    Bakery("Bakery"),
//    Japanese("Japanese"); //Enum 8 kategori menu
    private int id;

    // membuat atribut dalam Enum Class FoodCategory
    private String category;


    /**
     * Contructor FoodCategory
     * @param category untuk memasukkan nilai atribut
     */
    public FoodCategory(int id, String category){
        this.id = id;
        this.category = category;
    }

    public int getId(){
        return id;
    }

    public String getCategory(){
        return category;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setCategory(String category){
        this.category = category;
    }

    /**
     * method toString() dalam Enum Class FoodCategory
     * @return category untuk mengembalikkan atribut kedalam tipe data String
     */
    public String toString() {return category;}
}
