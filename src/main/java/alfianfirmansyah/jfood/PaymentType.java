package alfianfirmansyah.jfood;

/**
 * Enumeration class PaymentType - Terdiri dari 2 jenis pembayaran
 *
 * @author (Alfian Firmansyah)
 * @version (12.03.2020)
 */
public enum PaymentType
{
    // membuat variable Enum Class PaymentType
    Cashless("Cashless"),
    Cash("Cash");
    
    // membuat atribut dalam Enum Class PaymentType
    private String category;
    
    /**
     * Contructor PaymentType
     * @param category untuk memasukkan nilai atribut
     */
    PaymentType(String category){
       this.category=category;
    }

    /**
     * method toString() dalam Enum Class PaymentType
     * @return category untuk mengembalikkan atribut kedalam tipe data String
     */
    public String toString(){
        return category;
    }
}
