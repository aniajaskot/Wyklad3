public class Shop2 {
    public static void main(String[] args) {
        Product2 product2 = new Product2();
        product2.name = "czekolada";
        product2.price = 2.8;

        Product2 product1 = new Product2();
        product1.name = "Mleko";
        product1.price = 3.2;
        product1.producer = new Producer2();
        product1.producer.name = "Mlekowita";
        product1.producer.address = new Address2();
        product1.producer.address.city = "Wysokie Mazowieckie";
    }
//    public static void main(String[] args) {
//        Product2 product2 = new Product2();
//        product2.name = "Mleko";
//        product2.producer = new Producer2();
//        product2.producer.name = "Mlekowita";
//        product2.producer.address = new Address2();
//        product2.producer.address.city= "Wroclaw";
//        product2.price = 3.2;
//        product2.availability= true;
//    }
}
