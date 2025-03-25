package kethua;

public class oneone {
        void eat() {
            System.out.println("eating...");
        }
    }

    class Dog1 extends oneone {
        void bark() {
            System.out.println("barking...");
        }
    }

    class TestInheritance1 {
        public static void main(String args[]) {
            Dog d = new Dog();
            d.bark();
            d.eat();
        }
    }

