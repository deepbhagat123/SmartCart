import com.smartcart.model.Electronics;
import com.smartcart.model.Product;
import com.smartcart.model.Grocery;
public class Main {


    public static void main(String[] args) {
        Product tv = new Electronics("samsung TV", 10000,500,12);


        Product machine = new Electronics("Symphony",20000,400,24);


        Grocery milk = new Grocery("Amul Milk", 60, 200, "2025-12-01");
        System.out.println(milk);

        System.out.println(tv);

        System.out.println(machine);

    }
}
