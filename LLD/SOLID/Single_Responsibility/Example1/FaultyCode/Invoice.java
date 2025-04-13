package LLD.SOLID.Single_Responsibility.Example1.FaultyCode;

public class Invoice {
    Marker marker;
    int quantity;

    public Invoice(Marker marker,int quantity){
        this.marker = marker;
        this.quantity =quantity;
    }

    //reason:1 to change
    //calculate bill using gst , or different tax regime (NEW or OLD)
    public  int calculateBillAmount(){
        int bill = marker.price * this.quantity;
        return bill;
    }

    //reason:2 to change
    //print bill via two medium either print via machine or send on email
    public void printBill(){
        //print bill via machine
    }

    //reason:3 to change
    //
    public void saveToDB(){
        //save entry to DB
    }
}
