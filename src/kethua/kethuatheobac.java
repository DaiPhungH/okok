package kethua;

class kethuatheobac {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends kethuatheobac {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog {
    void sleep() {
        System.out.println("ZZZ...");
    }
}

    class TestInheritance2 {
    public static void main(String args[]) {
        BabyDog d = new BabyDog();
        d.sleep();
        d.bark();
        d.eat();
    }
}
