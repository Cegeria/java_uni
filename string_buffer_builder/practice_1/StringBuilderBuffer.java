public class StringBuilderBuffer {
    public static void main(String[] args) {
        // создание объектов StringBuffer и StringBuilder
        StringBuffer sbf = new StringBuffer("Hello");
        StringBuilder sbd = new StringBuilder("World");

        // append() - добавляет строку в конец
        sbf.append(", Java!");
        System.out.println("append(): " + sbf);  // Hello, Java!

        // insert() - вставляет строку в указанную позицию
        sbf.insert(5, ",");
        System.out.println("insert(): " + sbf);  // Hello, Java!

        // delete() - удаляет символы с указанного диапазона
        sbf.delete(5, 7);
        System.out.println("delete(): " + sbf);  // HelloJava!

        // replace() - заменяет символы в указанном диапазоне
        sbf.replace(5, 10, "Java 8");
        System.out.println("replace(): " + sbf);  // HelloJava 8

        // reverse() - переворачивает строку
        sbf.reverse();
        System.out.println("reverse(): " + sbf);  // 8avaJolleH

        // capacity() - возвращает емкость строки
        System.out.println("capacity(): " + sbf.capacity());  // 34

        // ensureCapacity() - гарантирует минимум заданную емкость
        sbf.ensureCapacity(50);
        System.out.println("ensureCapacity(): " + sbf.capacity());  // 50

        // charAt() - возвращает символ по индексу
        System.out.println("charAt(): " + sbf.charAt(0));  // 8

        // substring() - извлекает подстроку
        System.out.println("substring(): " + sbf.substring(2, 6));  // vaJ

        // toString() - преобразует StringBuffer/StringBuilder в String
        String result = sbf.toString();
        System.out.println("toString(): " + result);  // vaJolleH
    }
}
