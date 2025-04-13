package LLD.SOLID.Single_Responsibility.Example1.BetterCode;

public class InvoiceDBO {
    Invoice invoice;
    public InvoiceDBO(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDBInvoice(){
        System.out.println("Bill Saved!!");
    }

    //now we can add many function to save to file save to cloud any where
}
