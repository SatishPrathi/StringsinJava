public class IndexOfExample {
    public static void main(String[] args) {
        String mainString = "Hello, World!";

        int indexHello = mainString.indexOf("Hello");
        int indexJava = mainString.indexOf("Java");

        System.out.println("Index of 'Hello': " + indexHello);
        System.out.println("Index of 'Java': " + indexJava);
    }
}
