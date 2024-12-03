public enum Day {
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESDAY("Среда", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7);

    private final String nameInRussian;
    private final int dayNumber;

    Day(String nameInRussian, int dayNumber) {
        this.nameInRussian = nameInRussian;
        this.dayNumber = dayNumber;
    }

    public String getNameInRussian() {
        return nameInRussian;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public String isWeekend() {
        if (this == SATURDAY || this == SUNDAY) {
			return "Да!";
		} else {
			return "Нет(";
		}
    }
}
