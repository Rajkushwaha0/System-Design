package LLD.OOPs.AbstractClass.Example1;

public class Main {
    public static void main(String[] args) {
        // Product product = new Product(); // throws error;

        Product macbookM1 = new Macbook();
        macbookM1.termsAndCondition();
        
        Product lenovoSlim = new Lenovo();
        lenovoSlim.termsAndCondition();
    }

}
