package alfianfirmansyah.jfood;


/**
 * Enumeration class InvoiceStatus - Terdiri dari 3 jenis status
 *
 * @author (Alfian Firmansyah)
 * @version (12.03.2020)
 */
public enum InvoiceStatus
{
    Ongoing("Ongoing"),
    Finished("Finished"),
    Cancelled("Cancelled");//Enum 3 jenis status
    
    // membuat atribut dalam Enum Class InvoiceStatus
    private String status;
    
    /**
     * Contructor InvoiceStatus
     * @param  status untuk memasukkan nilai atribut
     */
    InvoiceStatus(String status)
    {
       this.status=status;
    }

    /**
     * method toString() dalam Enum Class InvoiceStatus
     * @return status untuk mengembalikkan atribut kedalam tipe data String
     */
    public String toString(){
        return status;
    }
}
