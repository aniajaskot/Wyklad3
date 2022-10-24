public class Shop1 {
    public static void main(String[] args) {
        Product1 product1 = new Product1();
        product1.product = "Mleko";
        product1.producer = "Mlekowita";
        product1.price = 3.2;
        product1.availability= true;

        Product1 product2 = new Product1();

        System.out.println(product1.product);
        System.out.println(product1.producer);
        System.out.println(product1.price);
        System.out.println(product1.availability);
    }
}
