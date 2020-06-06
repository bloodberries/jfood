package alfianfirmansyah.jfood;

/**
 * Class Location merupakan blueprint data Cabang Toko.
 *
 * @author (Alfian Firmansyah)
 * @version (27.02.20)
 */
public class Location
{
    // membuat atribut dalam Class Location
    private String province;
    private String description;
    private String city;
    private int id;

    /**
     * Contructor Location
     * @param  city, province, description untuk memasukkan nilai atribut
     */
    public Location(int id, String city, String province, String description)
    {
        this.id = id;
        this.city = city;
        this.province = province;
        this.description = description;
    }


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    /**
     * method accesor dalam Class Location
     * @return province untuk mengembalikan nilai atribut
     */
    public String getProvince() {return province;}
    
    /**
     * method accesor dalam Class Location
     * @return city untuk mengembalikan nilai atribut
     */
    public String getCity() {return city;}
    
    /**
     * method accesor dalam Class Location
     * @return description untuk mengembalikan nilai atribut
     */
    public String getDescription() {return description;}
    
    /**
     * method mutator dalam Class Location
     * @param province untuk memasukkan nilai province
     */
    public void setProvince(String province) {this.province=province;}
    
    /**
     * method mutator dalam Class Location
     * @param city untuk memasukkan nilai city
     */
    public void setCity(String city) {this.city=city;}
    
    /**
     * method mutator dalam Class Location
     * @param description untuk memasukkan nilai description
     */
    public void setDescription(String description) {this.description=description;}

    /**
     * method toString() dalam Class Location
     * @return province, city, description untuk mengembalikkan atribut kedalam tipe data String
     */
    public String toString() //Method requirement value category hanya dapat bernilai String
    {
        String string =
            "Province = "+province+"\n"+
            "City = "+city+"\n"+
            "Description = "+description+"\n";
        return string;
    }
}
