package alfianfirmansyah.jfood;


/**
 * Class Promo merupakan blueprint mekanisme data Potongan Harga
 *
 * @author (Alfian Firmansyah)
 * @version (13.03.20)
 */
public class Promo
{
    // membuat atribut dalam Class Promo
    private int id;
    private String code;
    private int discount;
    private int minPrice;
    private boolean active;
    
    /**
     * Constructor for objects of class Promo
     * @param id, code, discount, minPrice, active untuk memasukkan nilai atribut
     */
    public Promo(int id, String code, int discount, int minPrice, boolean active)  //constructor dalam Class Invoice
    {
        this.id=id;
        this.code=code;
        this.discount=discount;
        this.minPrice=minPrice;
        this.active=active;
    }
    
    /**
     * method accesor dalam Class Promo
     * @return id untuk mengembalikan nilai atribut
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * method accesor dalam Class Promo
     * @return code untuk mengembalikan nilai atribut
     */
    public String getCode()
    {
        return code;
    }
    
    /**
     * method accesor dalam Class Promo
     * @return discount untuk mengembalikan nilai atribut
     */
    public int getDiscount()
    {
        return discount;
    }
    
    /**
     * method accesor dalam Class Promo
     * @return minPrice untuk mengembalikan nilai atribut
     */
    public int getMinPrice()
    {
        return minPrice;
    }
    
    /**
     * method boolean accesor dalam Class Promo
     * @return active untuk mengembalikan nilai atribut
     */
    public boolean getActive()
    {
        return active;
    }
    
    /**
     * method mutator dalam Class Promo
     * @param id untuk memasukkan nilai id
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /**
     * method mutator dalam Class Promo
     * @param code untuk memasukkan nilai code
     */
    public void Code(String code)
    {
        this.code=code;
    }
    
    /**
     * method mutator dalam Class Promo
     * @param discount untuk memasukkan nilai discount
     */
    public void setDiscount(int discount)
    {
        this.discount=discount;
    }
    
    /**
     * method mutator dalam Class Promo
     * @param minPrice untuk memasukkan nilai minPrice
     */
    public void setMinPrice(int minPrice)
    {
        this.minPrice=minPrice;
    }
    
    /**
     * method mutator dalam Class Promo
     * @param active untuk memasukkan nilai active
     */
    public void setActive(boolean active)
    {
        this.active=active;
    }

    /**
     * method toString() dalam Class Promo
     * @return id, code, discount, minPrice, active untuk mengembalikkan atribut kedalam tipe data String
     */
    public String toString() //Method requirement value category hanya dapat bernilai String
    {
        String string =
            "ID = "+id+"\n"+
            "Code = "+code+"\n"+
            "Discount = "+discount+"\n"+
            "Minprice = "+minPrice+"\n"+
            "Active Status = "+active+"\n";
        return string;
    }
}
