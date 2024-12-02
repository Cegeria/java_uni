public class DecodeExample {
    public static void main(String[] args) {
        Integer value1 = Integer.decode("533");      
        Integer value2 = Integer.decode("0x215");     
        Integer value3 = Integer.decode("01025");     
        Integer value4 = Integer.decode("-0x215");    

        System.out.println(value1); 
        System.out.println(value2); 
        System.out.println(value3); 
        System.out.println(value4); 
    }
}

