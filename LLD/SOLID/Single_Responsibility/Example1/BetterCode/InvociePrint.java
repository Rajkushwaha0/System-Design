package LLD.SOLID.Single_Responsibility.Example1.BetterCode;

public class InvociePrint {
    Invoice invoice;
    public InvociePrint(Invoice invoice){
        this.invoice = invoice;
    }

    public void printInvoice(){
        System.out.println("Bill Printed!!");
    }

    //now we can add many function with print mechanism
}
