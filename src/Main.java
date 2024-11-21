import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        //Add product
        manager.addProduct(new Product(1, "Prod A", 100.0));
        manager.addProduct(new Product(2, "Prod B", 50.0));
        manager.addProduct(new Product(3, "Prod C", 300.0));
        manager.addProduct(new Product(4, "Prod D", 90.0));
        System.out.println("Product List: ");
        manager.displayProducts();
        //Edit Prod
        manager.updateProduct(2,"Prod B new", 80.0);
        //Del Prod
        manager.deleteProduct(1);
        //Search Prod
        System.out.println("Search result for Prod C: ");
        manager.searchProductByName("Prod C");
        //Sort Prod
        manager.sortProductsByPriceAscending();
        manager.sortProductsByPriceDescending();
    }
}