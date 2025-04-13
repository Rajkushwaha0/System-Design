package LLD.SOLID.OpenClosed.Example1.FaultyCode;

class Invoice{

}
public class InvoiceDBO {
    Invoice invoice;
    public InvoiceDBO(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        System.out.println("Saved to DB");
    }
    //till here it tested and live on production

    //but after few weeks we added this function to save to file 
    //which violates O/C principle 
    //because InvoiceDBO is open for extension not for modification
    public void saveToFile(){
        System.out.println("Saved to File");
    }
}

