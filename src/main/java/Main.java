import com.smartcart.exception.ProductNotFoundException;
import com.smartcart.model.Electronics;
import com.smartcart.model.Product;
import com.smartcart.model.Grocery;
import com.smartcart.service.ProductService;

import java.util.ArrayList;
public class Main {


    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Electronics("Samsung", 7000, 500,24));
        products.add(new Electronics("Symphony TV",5000,400,36));
        products.add(new Grocery("soviner",8000,400,"12-04-26"));

        for(Product p : products){
            System.out.println(p);
        }

        System.out.println("Total Products " + products.size());

        products.remove(0);
        System.out.println("After removal " + products.size());

        Product first = products.get(0);
        System.out.println("first product | : " + first);

        try {
            Product p = products.get(10);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Product Not found at the index ");
        }


        ProductService service = new ProductService();

        service.addProduct(new Electronics("Samsung TV",10000,500,12));
        service.addProduct(new Grocery("Amul Milk", 60,200, "2025-12-01"));

        try{
            Product p = service.getProductByIndex(0);
            System.out.println(p);
        } catch(ProductNotFoundException e){
            System.out.println(e.getMessage());
        }

        // try getting invalid product

        try{
            Product p = service.getProductByIndex(10);
            System.out.println(p);
        } catch(ProductNotFoundException e){
            System.out.println(e.getMessage());
        }

        service.printAllProducts();
        service.printElectronics();
        service.printSortedByPrice();

    }
}
