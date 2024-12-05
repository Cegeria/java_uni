import java.util.*;

public class Spec2 {
    public static void main(String[] args) {
        // текущие дата и время
        Date now = new Date();

        // создание объекта Formatter
        Formatter formatter = new Formatter();

        // %tY — год в четырехзначном формате
        formatter.format("Year: %tY\n", now);

        // %tB — полное название месяца
        formatter.format("Month: %tB\n", now);

        // %tA — полное название дня недели
        formatter.format("Day of the week: %tA\n", now);

        // %tI — час в 12-часовом формате
        formatter.format("Hour (12-hour format): %tI\n", now);

        // %tM — минуты в двухзначном формате
        formatter.format("Minutes: %tM\n", now);

        System.out.println(formatter.toString());
        formatter.close();
    }
}
