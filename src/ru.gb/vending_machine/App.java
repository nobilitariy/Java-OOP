public class App {
    public static void main(String[] args) throws Exception {
        VendingMachine vendingMachine = new VendingMachine();
        Product product1 = new Product("Lays", 80);
        Bottle product2 = new Bottle("Tea", 100, 0.5);
        Bottle product3 = new Bottle("Cola", 40, 2);
        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);

        System.out.println(vendingMachine);

    }
}
