package kethua;

class Animals {
    void eat() {
        System.out.println("eating...");
    }
}

class DogTo extends Animals {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends Animals {
    void meow() {
        System.out.println("meowing...");
    }
}

    class TestInheritance3 {
    public static void main(String args[]) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        // c.bark(); //  error
    }
}
