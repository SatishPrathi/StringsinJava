public class MathExample {
    public static void main(String[] args) {
        double base = 5.0;
        double exponent = 2.0;
        double result = Math.pow(base, exponent);

        System.out.println("The square of " + base + " raised to the power of " + exponent + " is: " + result);

        double number = -4.7;

        double absValue = Math.abs(number);
        System.out.println("Absolute value of " + number + " is: " + absValue);

        double sqrtValue = Math.sqrt(absValue);
        System.out.println("Square root of the absolute value is: " + sqrtValue);

        double ceilValue = Math.ceil(sqrtValue);
        double floorValue = Math.floor(sqrtValue);

        System.out.println("Ceiling value: " + ceilValue);
        System.out.println("Floor value: " + floorValue);

        double randomValue = Math.random();
        System.out.println("Random value between 0.0 and 1.0: " + randomValue);
    }
}
