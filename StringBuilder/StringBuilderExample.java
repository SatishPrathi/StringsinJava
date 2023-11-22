public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder("Hello");

        // Appending text
        stringBuilder.append(" World");
        System.out.println("After appending: " + stringBuilder);

        // Inserting text at a specific position
        stringBuilder.insert(5, ", Java");
        System.out.println("After inserting: " + stringBuilder);

        // Deleting characters from a position
        stringBuilder.delete(5, 11);
        System.out.println("After deleting: " + stringBuilder);

        // Reversing the string
        stringBuilder.reverse();
        System.out.println("After reversing: " + stringBuilder);
    }
}
