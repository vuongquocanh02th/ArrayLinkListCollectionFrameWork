import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private List<Product> products;
    public ProductManager() {
        this.products = new ArrayList<Product>();
        //this.products = new LinkedList<>();

    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void updateProduct(int id, String newName, double newPrice) {
        for (Product product : products) {
            if(product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                System.out.println("Updated! "+product);
                return;
            }
        }
        System.out.println("Product with id "+id+" not found");
    }
    public void deleteProduct(int id) {
        products.removeIf(product -> product.getId() == id);
        System.out.println("Product with id "+id+" has been deleted");
    }
    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
    public void searchProductByName(String name) {
        for (Product product : products) {
            if(product.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(product);
            }
        }
    }
    public void sortProductsByPriceAscending(){
        products.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println("Products sorted by price ascending: ");
        displayProducts();
    }
    public void sortProductsByPriceDescending(){
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        System.out.println("Products sorted by price descending: ");
        displayProducts();
    }
}
