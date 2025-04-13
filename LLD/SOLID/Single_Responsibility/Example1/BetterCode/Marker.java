package LLD.SOLID.Single_Responsibility.Example1.BetterCode;

public class Marker {
    String color;
    String name;
    int year;
    int price;

    public Marker(String color,String name,int year,int price){
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }
}
