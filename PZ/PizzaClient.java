public class PizzaClient {
    public void run() {
        Pizza circle1 = new Pizza(6, new Circle(4));
        Pizza rectangle1 = new Pizza(7.5, new Rectangle(3, 5));
        PizzaDeal price1 = new PizzaDeal();
        System.out.println(circle1 + " have better price " + rectangle1 + ": " + price1.betterDeal(circle1, rectangle1));
    }
    public static void main(String[] args) {
        new PizzaClient().run();
    }
}

