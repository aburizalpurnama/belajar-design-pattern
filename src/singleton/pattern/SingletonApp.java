package singleton.pattern;

public class SingletonApp {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.save("kd001");

        OrderDetilService orderDetilService = new OrderDetilService();
        orderDetilService.save("od001", "sepatu");
        orderDetilService.save("od002", "baju");
        orderDetilService.save("od003", "celana");
        orderDetilService.save("od004", "kaos kaki");
    }
}
