public class PersonTest2 {
    public static void main(String[] args) {
        Person2 person1 = new Person2();
        person1.firstName = "Jan";
        person1.address = new Address2();
        person1.address.city = "Wrocław";

        System.out.println(person1.firstName);
        System.out.println(person1.address.city);
    }
}
