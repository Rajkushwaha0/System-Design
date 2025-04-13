package LLD.SOLID.OpenClosed.Example1.BetterCode;

class Invoice{

}

public interface InvoiceDBO {

     public void save(Invoice invoice);
}

class saveToDB implements InvoiceDBO{
    @Override
    public void save(Invoice invoice){
        System.out.println("Bill Saved");
    }
}

//now its scalable to not one but to many function 

class saveToFile implements InvoiceDBO{
    @Override
    public void save(Invoice invoice){
        System.out.println("Bill Saved");
    }
}

class saveToCloud implements InvoiceDBO{
    @Override
    public void save(Invoice invoice){
        System.out.println("Bill Saved");
    }
}


