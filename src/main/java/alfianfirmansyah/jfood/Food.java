package alfianfirmansyah.jfood;

/**
 * Class Food merupakan blueprint data Menu.
 *
 * @author (Alfian Firmansyah)
 * @version (20.02.20)
 */
public class Food
{
    // membuat atribut dalam Class Food
    private int id;
    private String name;
    private int price;
    private FoodCategory category;
    private Seller seller;

    /**
     * Contructor Food
     * @param  id, name, seller, price, category untuk memasukkan nilai atribut
     * @param category
     */
    public Food(int id, String name, Seller seller, int price, FoodCategory category) //constructor dalam Class Food
    {
        this.id=id;
        this.name=name;
        this.seller=seller;
        this.price=price;
        this.category=category;
    }

    /**
     * method accesor dalam Class Food
     * @return id untuk mengembalikan nilai atribut
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * method accesor dalam Class Food
     * @return name untuk mengembalikan nilai atribut
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * method accesor dalam Class Food
     * @return seller untuk mengembalikan nilai atribut
     */
    public Seller getSeller()
    {
        return seller;
    }
    
    /**
     * method accesor dalam Class Food
     * @return price untuk mengembalikan nilai atribut
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * method accesor dalam Class Food
     * @return category untuk mengembalikan nilai atribut
     */
    public FoodCategory getCategory()
    {
        return category;
    }
    
    
    /**
     * method mutator dalam Class Food
     * @param id untuk memasukkan nilai id
     */
    public void setId (int id)
    {
        this.id=id;
    }
    
    /**
     * method mutator dalam Class Food
     * @param name untuk memasukkan nilai name
     */
    public void setName (String name)
    {
        this.name=name;
    }
    
    /**
     * method mutator dalam Class Food
     * @param seller untuk memasukkan nilai seller
     */public void setSeller (Seller seller)
    {
        this.seller=seller;
    }
    
    /**
     * method mutator dalam Class Food
     * @param price untuk memasukkan nilai price
     */
    public void setPrice (int price)
    {
        this.price=price;
    }
    
    /**
     * method mutator dalam Class Food
     * @param category untuk memasukkan nilai category
     */
    public void setCategory (FoodCategory category)
    {
        this.category=category;
    }

    /**
     * method toString() dalam Class Food
     * @return id, name, seller, city, price, category untuk mengembalikkan atribut kedalam tipe data String
     */
    public String toString() //Method requirement value category hanya dapat bernilai String
    {
        String string =
            "\nFood:\n"+
            "ID = "+id+"\n"+
            "Nama = "+name+"\n"+
            "Seller = "+seller.getName()+"\n"+
            "City = "+seller.getLocation().getCity()+"\n"+
            "Price = "+price+"\n"+
            "Category = "+category+"\n";
        return string;
    }
}