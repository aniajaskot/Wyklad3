public class PersonTest1 {
    public static void main(String[] args) {
        Person1 person = new Person1();
        System.out.println(person.firstName);
        System.out.println(person.age);

        person.firstName = "Jan";
        person.lastName = "Kowalski";
        person.age = 25;
        person.city = "Wrocław";

        System.out.println(person.firstName);
        System.out.println(person.age);


    }
}
