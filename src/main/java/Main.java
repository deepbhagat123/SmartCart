import com.smartcart.model.Product;
public class Main {


    public static void main(String[] args) {
        Product tv = new Product();
        tv.setName("Samsung TV");
        tv.setPrice(10000);
        tv.setStockQuantity(500);

        Product machine = new Product();
        machine.setName("symphony");
        machine.setPrice(20000);
        machine.setStockQuantity(700);




        System.out.println(tv.getName() +" | price: " + (int)tv.getPrice());

        System.out.println(machine.getName() + " | Price: " + machine.getPrice());

    }
}
