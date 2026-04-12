import com.smartcart.model.Electronics;
import com.smartcart.model.Product;
import com.smartcart.model.Grocery;

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

    }
}
