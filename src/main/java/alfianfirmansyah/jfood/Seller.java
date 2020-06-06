package alfianfirmansyah.jfood;

/**
 * Class Seller merupakan blueprint data Riwayat Penjual.
 *
 * @author (Alfian Firmansyah)
 * @version (20.02.20)
 */
public class Seller
{
    // membuat atribut dalam Class Seller
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Contructor Seller
     * @param  id, name, email, phoneNumber, location untuk memasukkan nilai atribut
     */
    public Seller(int id, String name, String email, String phoneNumber, Location location) //constructor dalam Class Seller
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
    }
    
    /**
     * method accesor dalam Class Seller
     * @return id untuk mengembalikan nilai atribut
     */
    public int getId() {return id;}
    
    /**
     * method accesor dalam Class Seller
     * @return name untuk mengembalikan nilai atribut
     */
    public String getName() {return name;}
    
    /**
     * method accesor dalam Class Seller
     * @return email untuk mengembalikan nilai atribut
     */
    public String getEmail() {return email;}
    
    /**
     * method accesor dalam Class Seller
     * @return phoneNumber untuk mengembalikan nilai atribut
     */
    public String getPhoneNumber() {return phoneNumber;}
    
    /**
     * method accesor dalam Class Seller
     * @return location untuk mengembalikan nilai atribut
     */
    public Location getLocation() {return location;}
    
    /**
     * method mutator dalam Class Seller
     * @param id untuk memasukkan nilai id
     */
    public void setId(int id) {this.id=id;}
    
    /**
     * method mutator dalam Class Seller
     * @param name untuk memasukkan nilai name
     */
    public void setName(String name) {this.name=name;}
    
    /**
     * method mutator dalam Class Seller
     * @param email untuk memasukkan nilai email
     */
    public void setEmail(String email) {this.email=email;}
    
    /**
     * method mutator dalam Class Seller
     * @param phoneNumber untuk memasukkan nilai phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber=phoneNumber;}
    
    /**
     * method mutator dalam Class Seller
     * @param location untuk memasukkan nilai location
     */
    public void setLocation(Location location) {this.location=location;}
    
    /**
     * method toString() dalam Class Seller
     * @return id, name, phoneNumber, location untuk mengembalikkan atribut kedalam tipe data String
     */
    public String toString() //Method requirement value category hanya dapat bernilai String
    {
        String string =
            "ID = "+id+"\n"+
            "Nama = "+name+"\n"+
            "PhoneNumber = "+phoneNumber+"\n"+
            "Location = "+location+"\n";
            return string;
    }
}
    

