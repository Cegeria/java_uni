public class Main {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        System.out.println(today.getNameInRussian() + " - выходной? " + today.isWeekend());

        Day weekendDay = Day.SUNDAY;
        System.out.println(weekendDay.getNameInRussian() + " - выходной? " + weekendDay.isWeekend());
    }
}
