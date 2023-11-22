public class CompareToExample {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";

        int result1 = str1.compareTo(str2);
        int result2 = str1.compareTo(str3);

        System.out.println("Comparison result between 'apple' and 'banana': " + result1);
        System.out.println("Comparison result between 'apple' and 'apple': " + result2);
    }
}
