public class Main {
    public static void main(String[] args) {
        HotDrink product1 = new HotDrink("Atole", 500, 55);
        HotDrink product2 = new HotDrink("Espresso", 250, 70);
        HotDrink product3 = new HotDrink("GreenTea", 350, 60);
        VendingMachine HotDrinkVendingMachine = new HotDrinkVendingMachine();
        HotDrinkVendingMachine.addProduct(product1);;
        HotDrinkVendingMachine.addProduct(product2);
        HotDrinkVendingMachine.addProduct(product3);
        System.out.println(HotDrinkVendingMachine.getProduct("Atole", 500, 55));
        System.out.println(HotDrinkVendingMachine.getProduct("Espresso", 250, 70));
        System.out.println(HotDrinkVendingMachine.getProduct("GreenTea", 350, 60));
    }
}
