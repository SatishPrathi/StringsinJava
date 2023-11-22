public class Substring {
    public static void main(String[] args) {
        // Original string
        String originalString = "Hello, World!";

        // Using substring(int beginIndex)
        String substring1 = originalString.substring(7);
        System.out.println("Substring (from index 7 to end): " + substring1);

        // Using substring(int beginIndex, int endIndex)
        String substring2 = originalString.substring(7, 12);
        System.out.println("Substring (from index 7 to 11): " + substring2);
        
        // Example with variables
        int start = 0;
        int end = 5;
        String substring3 = originalString.substring(start, end);
        System.out.println("Substring (from index " + start + " to " + (end - 1) + "): " + substring3);
    }
}
