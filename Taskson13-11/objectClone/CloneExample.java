class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneExample {
    public static void main(String[] args) {
        try {
            Person person1 = new Person("John", 25);

            Person person2 = (Person) person1.clone();

            System.out.println("Original: " + person1.getName() + ", " + person1.getAge());
            System.out.println("Cloned: " + person2.getName() + ", " + person2.getAge());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
