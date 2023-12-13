public class WrapperExample {
    public static void main(String[] args) {
        int primitiveInt = 42; 
        Integer wrappedInt = Integer.valueOf(primitiveInt); 
        System.out.println("Wrapped Integer: " + wrappedInt);

        double primitiveDouble = 3.14; 
        Double wrappedDouble = Double.valueOf(primitiveDouble); 
        System.out.println("Wrapped Double: " + wrappedDouble);

        boolean primitiveBoolean = true; 
        Boolean wrappedBoolean = Boolean.valueOf(primitiveBoolean); 
        System.out.println("Wrapped Boolean: " + wrappedBoolean);

        char primitiveChar = 'A'; 
        Character wrappedChar = Character.valueOf(primitiveChar);
        System.out.println("Wrapped Character: " + wrappedChar);
    }
}
