public class GetBytesExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        byte[] byteArray = str.getBytes();

        System.out.print("Bytes: ");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
    }
}
