package key_super;

class Parent {
    public String name = "Cha";
    public String address = "Hà Nội";

    public Parent() {} //Hàm tạo hay Constructor
}

// Tạo class con kế thừa class Parent
class Child extends Parent{
    public String name = "Con";

    public Child() {} //Hàm tạo hay Constructor

    public void display1() {
        // Sử dụng từ khóa super
        System.out.println("Sử dụng super gọi biến name: " + super.name);
        // Không sử dụng từ khóa super
        System.out.println("Không sử dụng super: " + name);
    }

    public void display2() {
        System.out.println("Nơi ở: " + address);

    }
}

    class SuperInJava {
    public static void main(String[] args) {
        Child child = new Child();
        child.display1();
        child.display2();
    }
}
