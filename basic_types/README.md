# 1
- byte: 2, -3, 0 (8 bit, -128 to 127)
- short: 1053, -870, 0 (16 bit, -32\_768 to 32\_767)
- int: 1\_000\_040, -524\_367, 0 (32 bit, -2^31 to 2^31-1)
- long: 15\_485\_294\_001, 0L (64 bit, -2^63 to 2^63-1)
- float: 537.24f, -239.30f, 0.0f (32 bit, 7 digits after comma sign)
- double:  53.247e+45, 4085.49, 0.0d (64 bit, 15 digits after comma sign)
- char: '\u0000', '\uffff'
- bool: true, false 
# 2
См. Name
# 3 
В переменной с не будет никакого значения, выскочит ошибка, так как сложение с переменной b происходит вне области действия последней
# 4
См. StringExample
# 5
См. ConvertionExample
# 6
См. ConvertionExample2
# 7
```
int a = 120;
byte b = a + 10; // Error (присваивание результата типа int переменной типа byte без явного преобразования)
byte c = (byte)(a + 10); // Correct
byte d = a + 1; // Error (присваивание результата типа int переменной типа byte без явного преобразования)

```
# 8
См. TypeInterface

