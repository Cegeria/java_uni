public class StringConversion {
    public static void main(String[] args) {
        // создаем объекты String, StringBuffer и StringBuilder
        String str = "Hello, World!";
        StringBuffer sbf = new StringBuffer("Hello, StringBuffer!");
        StringBuilder sbd = new StringBuilder("Hello, StringBuilder!");

        // преобразование String в StringBuffer
        StringBuffer sbfFromString = new StringBuffer(str);
        System.out.println("String to StringBuffer: " + sbfFromString);  // String to StringBuffer: Hello, World!

        // преобразование String в StringBuilder
        StringBuilder sbdFromString = new StringBuilder(str);
        System.out.println("String to StringBuilder: " + sbdFromString);  // String to StringBuilder: Hello, World!

        // преобразование StringBuffer в String
        String strFromStringBuffer = sbf.toString();
        System.out.println("StringBuffer to String: " + strFromStringBuffer);  // StringBuffer to String: Hello, StringBuffer!

        // преобразование StringBuilder в String
        String strFromStringBuilder = sbd.toString();
        System.out.println("StringBuilder to String: " + strFromStringBuilder);  // StringBuilder to String: Hello, StringBuilder!

        // преобразование StringBuffer в StringBuilder 
        StringBuilder sbdFromStringBuffer = new StringBuilder(sbf.toString());
        System.out.println("StringBuffer to StringBuilder: " + sbdFromStringBuffer);  // StringBuffer to StringBuilder: Hello, StringBuffer!
    }
}
