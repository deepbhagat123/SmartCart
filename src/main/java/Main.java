import com.smartcart.model.Product;
public class Main {


    public static void main(String[] args) {
        Product tv = new Product("samsung TV", 10000,500);


        Product machine = new Product("Symphony",20000,400);




        System.out.println(tv.getName() +" | price: " + (int)tv.getPrice());

        System.out.println(machine.getName() + " | Price: " + machine.getPrice());

    }
}
