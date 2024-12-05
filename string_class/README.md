# 1
См. `practice_1`
# 2
```java
import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        // StringJoiner с разделителем ", "
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("One").add("two").add("three");
        
        System.out.println("StringJoiner: " + joiner.toString());  // One, two, three

        // StringJoiner с разделителем и обрамляющими скобками
        StringJoiner joinerWithBrackets = new StringJoiner(", ", "[", "]");
        joinerWithBrackets.add("First").add("Second").add("Third");
        
        System.out.println("StringJoiner с скобками: " + joinerWithBrackets.toString());  // [First, Second, Third]
    }
}
```
# 3
Три двойные кавычки (""") позволяют создавать многострочные строки
```java
public class TextBlockExample {
    public static void main(String[] args) {
        String textBlock = """
            As for God, his way is perfect:
            The Lord's word is flawless;
            he shields all who take refuge in him.
            """;
        
        System.out.println(textBlock);
    }
}
```
