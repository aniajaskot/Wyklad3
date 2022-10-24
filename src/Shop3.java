public class Shop3 {
    public static void main(String[] args) {

        Address3 address3 = new Address3("Warszawa", "Warszawska", "123");
        Producer3 producer3 = new Producer3("Mlekowita", address3);

//        Producer3 producer4 = new Producer3("Mlekowita", new Address3("Warszawa", "Warszawska", "123"));

        Product3 product1 = new Product3("Mleko", producer3, 3.2, true);

        System.out.println(product1.name);
        System.out.println(product1.producer.name);
        System.out.println(product1.producer.address3.city);


    }
}
