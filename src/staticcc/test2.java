package staticcc;

// Lớp chứa biến static WEBSITE
class MyWebsite {
    public static String WEBSITE = "default.com"; // Biến static dùng chung cho tất cả đối tượng
}

 class UsingStaticExample {
    private String subject; // Biến instance, mỗi đối tượng có một bản sao riêng

    // Constructor khởi tạo subject
    UsingStaticExample(String subject) {
        this.subject = subject;
    }

    // Phương thức in thông tin subject và WEBSITE
    public void print() {
        System.out.println("Subject = " + subject); // Subject là biến instance
        System.out.println("Website = " + MyWebsite.WEBSITE); // WEBSITE là biến static
    }

    // Phương thức static để thay đổi giá trị của WEBSITE
    public static void changeWebsite(String website) {
        MyWebsite.WEBSITE = website; // Thay đổi giá trị biến static
    }

    public static void main(String[] args) {
        // Tạo đối tượng ex1 với subject = "Core Java"
        UsingStaticExample ex1 = new UsingStaticExample("Core Java");

        // Gọi phương thức static để thay đổi WEBSITE thành "abc.com"
        ex1.changeWebsite("abc.com");
        ex1.print(); // In thông tin, WEBSITE đã thay đổi thành "abc.com"

        System.out.println("----");

        // Gọi phương thức static để thay đổi WEBSITE thành "https://gpcoder.com"
        UsingStaticExample.changeWebsite("https://gpcoder.com");
        ex1.print(); // In lại thông tin, WEBSITE đã thay đổi thành "https://gpcoder.com"
    }
}

