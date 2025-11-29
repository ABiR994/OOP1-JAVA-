public class WrapperClassDemo {
    public static void main(String[] cha) {
        

        int a=10;
		Integer intObj = a;           // int → Integer
        Double doubleObj = 5.5;        // double → Double
        Character charObj = 'A';       // char → Character
        Boolean boolObj = true;        // boolean → Boolean
		
		
        System.out.println("Wrapper Objects:");
        System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Boolean object: " + boolObj);

       
        int intValue = intObj;
        double doubleValue = doubleObj;
        char charValue = charObj;
        boolean boolValue = boolObj;


        System.out.println("Primitive Values:");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("char value: " + charValue);
        System.out.println("boolean value: " + boolValue);

        // Using wrapper class methods
        System.out.println("\nSome useful methods:");
        System.out.println("Integer max value: " + Integer.MAX_VALUE);
        System.out.println("Double parsed from string: " + Double.parseDouble("12.34"));
        System.out.println("Character to lowercase: " + Character.toLowerCase('S'));
    }
}