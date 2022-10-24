public class References {
    public static void main(String[] args) {
        Person1 person1 = null;
        Person1 person2 = person1;

        person1 = new Person1();
        person1.firstName = "Jan";

        System.out.println(person1.firstName);
        System.out.println(person2.firstName);
    }
}