public class ImmutableStringExample {
    public static void main(String[] args) {
        // Creating a string literal
        String str1 = "Hello";

        // Concatenating strings creates a new string
        String str2 = str1 + " World";

        // The original string remains unchanged
        System.out.println("Original String: " + str1); 

        // The new string is a separate object
        System.out.println("Concatenated String: " + str2); 

        // Reassigning a new value to str1 creates a new string
        str1 = str1 + " Java";

        // Again, the original string remains unchanged
        System.out.println("Updated Original String: " + str1);
    }
}
