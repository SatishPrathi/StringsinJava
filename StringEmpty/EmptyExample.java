public class EmptyExample {
    public static void main(String[] args) {
        String emptyString = "";
        String nonEmptyString = "Satish, kumar!";

        boolean isEmpty1 = emptyString.isEmpty();
        boolean isEmpty2 = nonEmptyString.isEmpty();

        System.out.println("Is the first string empty? " + isEmpty1);
        System.out.println("Is the second string empty? " + isEmpty2);
    }
}
