package key_super;

class Parent2 {
    public Parent2() {}

    public void printInfo() {
        System.out.println("Đây là lớp cha");
    }
}

class Child2 extends Parent2{
    public Child2() {}

    public void printInfo() {
        System.out.println("Đây là lớp con");
    }

    public void displayUseSuper() {
        // Sử dụng từ khóa super
        super.printInfo();
    }

    public void displayNotUseSuper() {
        // Không sử dụng từ khóa super
        printInfo();
    }
}

     class SuperInJava2 {
    public static void main(String[] args) {
        Child2 child = new Child2();
        child.displayUseSuper();
        child.displayNotUseSuper();
    }
}
