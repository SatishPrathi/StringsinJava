public class StringConcatenation{
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World";
        String resultUsingPlus = str1 + str2;

        System.out.println("Concatenation using + Operator: " + resultUsingPlus);

        String str3 = "Java";
        String resultUsingConcat = str1.concat(" " + str3);

        System.out.println("Concatenation using concat() Method: " + resultUsingConcat);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" World");
        stringBuilder.append(" Java");

        String resultUsingStringBuilder = stringBuilder.toString();

        System.out.println("Concatenation using StringBuilder: " + resultUsingStringBuilder);
    }
}
