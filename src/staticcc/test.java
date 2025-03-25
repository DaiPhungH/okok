package staticcc;

 class Counter {
    static int count = 0;  // Biến static dùng chung cho tất cả đối tượng của lớp Counter

    public Counter() {
    }

    public void visit() {
        count++;  // Tăng giá trị của biến count
        this.print();
    }

    public void print() {
        System.out.println("count = " + count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.visit(); // count tăng lên 1
        Counter c2 = new Counter();
        c2.visit(); // count tăng lên 2
        Counter c3 = new Counter();
        c3.visit(); // count tăng lên 3
    }
}

