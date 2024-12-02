package mypackage;

class PackagePrivateClass {
    int defaultValue = 0; 
}

public class AccessModifiersDemo {
    
    public int publicValue = 1;
    protected int protectedValue = 2;
    int defaultValue = 3; 
    private int privateValue = 4;

    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();
        demo.showAccess();
        
        PackagePrivateClass packagePrivateObject = new PackagePrivateClass();
        System.out.println("Доступ к значению из PackagePrivateClass: " + packagePrivateObject.defaultValue); // доступен, так как в одном пакете
    }

    public void showAccess() {
        System.out.println("publicValue: " + publicValue);
        System.out.println("protectedValue: " + protectedValue);
        System.out.println("defaultValue: " + defaultValue);
        System.out.println("privateValue: " + privateValue);
    }
}
