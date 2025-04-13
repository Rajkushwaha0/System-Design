package LLD.OOPs.AbstractClass.Example1;

public class Mackbook extends Product {
    @Override 
    public double calculateDiscount(){
        return 12.02;
    }

    @Override
    public void termsAndCondition(){
        System.out.println("Some terms");
    }
}
