package key_super;

class Parent3 {
    public Parent3() {
        System.out.println("Hàm tạo lớp cha không tham số");
    }
}

class Child3 extends Parent3{
    public Child3() {
        // Luôn đặt hàm super() đầu tiên
        super();
        System.out.println("Hàm tạo lớp con");
    }
}

    class SuperInJava3 {
    public static void main(String[] args) {
        Child3 child = new Child3();
    }
}
