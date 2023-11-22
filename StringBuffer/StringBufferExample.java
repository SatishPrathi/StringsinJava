public class StringBufferExample {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Appending text
        stringBuffer.append(" World");
        System.out.println("After appending: " + stringBuffer);

        // Inserting text at a specific position
        stringBuffer.insert(5, ", Java");
        System.out.println("After inserting: " + stringBuffer);

        // Deleting characters from a position
        stringBuffer.delete(5, 11);
        System.out.println("After deleting: " + stringBuffer);

        // Reversing the string
        stringBuffer.reverse();
        System.out.println("After reversing: " + stringBuffer);
    }
}

