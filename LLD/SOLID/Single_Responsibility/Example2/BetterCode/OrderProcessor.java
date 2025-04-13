package LLD.SOLID.Single_Responsibility.Example2.BetterCode;

public class OrderProcessor {
    private final OrderCalculator calculator;
    private final NotificationService notifier;

    // Dependency Injection (better testability)
    public OrderProcessor(OrderCalculator calculator, NotificationService notifier) {
        this.calculator = calculator;
        this.notifier = notifier;
    }

    public void processOrder(Order order, User user) {
        // Process order logic
        double total = calculator.calculateTotalSum(order);
        notifier.sendEmailNotification(user,order);
        System.out.println(total);
    }
}
