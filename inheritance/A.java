class A {
  int a1;             // пакетный уровень, доступен в том же пакете
  public int a2;      // доступен в любом месте
  protected int a3;   // доступен в подклассах и в том же пакете
  private int a4;     // доступен только в классе A

  void method1() {
    // доступен в классе A
  }

  public void method2() {
    // доступен в любом месте
  }

  protected void method3() {
    // доступен в подклассах и в том же пакете
  }
  
  private void method4() {
    // доступен только в классе A
  }
}

class B extends A {
  void methodInB() {
    // a1, a2, a3 доступны
    // a4 недоступен
  }
}

class C extends B {
  void methodInC() {
    // a1, a2, a3 доступны
    // a4 недоступен
  }
}
