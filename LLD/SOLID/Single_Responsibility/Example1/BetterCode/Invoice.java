package LLD.SOLID.Single_Responsibility.Example1.BetterCode;

public class Invoice {
    Marker marker;
    int quantity;

    public Invoice(Marker marker,int quantity){
        this.marker = marker;
        this.quantity =quantity;
    }

    public int calculateInvoice(){
        int bill = marker.price & this.quantity;
        return bill;
    }
}
