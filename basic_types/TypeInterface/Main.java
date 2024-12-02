import java.util.ArrayList;

interface Animal {
    void makeSound(); 

    default void eat() { 
        System.out.println("This animal eats food.");
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        var dog = new Dog();
        var cat = new Cat();

        var animals = new ArrayList<Animal>();
        animals.add(dog);
        animals.add(cat);

        for (var animal : animals) {
            animal.makeSound(); 
            animal.eat();       
        }
    }
}
