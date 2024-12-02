package otherpackage;

import mypackage.AccessModifiersDemo;

public class AccessModifiersChild extends AccessModifiersDemo {
    public void showParentAccess() {
        System.out.println("Доступ к publicValue: " + publicValue);  // доступен
        System.out.println("Доступ к protectedValue: " + protectedValue);  // доступен
    }
}
