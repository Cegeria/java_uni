public class BreakContinueExample {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println("break -> i: " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("continue -> i: " + i); 
        }
    }
}
