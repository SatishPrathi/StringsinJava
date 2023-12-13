class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class CallByReferenceExample {

    public static void main(String[] args) {
        Person person = new Person("John");

        System.out.println("Original name: " + person.name);

        modifyName(person);

        System.out.println("Name after method call: " + person.name);
    }

    static void modifyName(Person p) {
        p.name = "Jane";
    }
}
