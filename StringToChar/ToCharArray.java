public class ToCharArray {
    public static void main(String[] args) {
        String myString = "satish, kumar!";

        char[] charArray = myString.toCharArray();

        System.out.print("Characters in the array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
