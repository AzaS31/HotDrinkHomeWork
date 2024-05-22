import java.util.List;

interface VendingMachine {

    public void addProduct(HotDrink product);
    
    public void initProducts(List<HotDrink>listProducts);
    
    public Product getProduct(String name, int volume, int temperature);
    
}
