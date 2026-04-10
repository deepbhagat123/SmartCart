import com.smartcart.model.Electronics;
import com.smartcart.model.Product;
public class Main {


    public static void main(String[] args) {
        Product tv = new Electronics("samsung TV", 10000,500,12);


        Product machine = new Electronics("Symphony",20000,400,24);




        System.out.println(tv);

        System.out.println(machine);

    }
}
