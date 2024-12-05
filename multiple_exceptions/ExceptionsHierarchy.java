class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class ExceptionsHierarchy {
    public static void main(String[] args) {
        try {
            throw new Ex3();
        } catch (Ex3 e) {
            System.out.println("Ex3 catched");
        } catch (Ex2 e) {
            System.out.println("Ex2 catched");
        } catch (Ex1 e) {
            System.out.println("Ex1 catched");
        }
    }
}
