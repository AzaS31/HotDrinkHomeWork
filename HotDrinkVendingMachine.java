import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<HotDrink> products = new ArrayList<>();
    
    @Override
    public void addProduct(HotDrink product){
        products.add(product);
    }

    @Override
    public void initProducts(List<HotDrink>listProducts){
        products = listProducts;      
    }

    @Override
    public Product getProduct(String name, int volume, int temperature){
        for (HotDrink product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemperature() == temperature)
                return product;        
        }
        return null;
    }
}
