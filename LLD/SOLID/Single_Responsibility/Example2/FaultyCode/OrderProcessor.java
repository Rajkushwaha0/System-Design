package LLD.SOLID.Single_Responsibility.Example2.FaultyCode;

class Order{
    // .. some properties
}

class User {
    // .. some properties
}

public class OrderProcessor {
    public void processOrder(Order order) {
        // Code to process the order
    }

    public void calculateTotalSum(Order order) {
        // Code to calculate total sum
    }

    public void sendEmailNotification(User user) {
        // Code to send email notifications
    }
}
