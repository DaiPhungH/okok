package exxxx;

 class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b; // Lỗi chia cho 0
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException s) {
            System.out.println("Lỗi: Không thể chia cho 0.");
        } finally {
            System.out.println("Khối finally luôn được thực thi.");
        }
        System.out.println("Chương trình tiếp tục chạy...");
    }
}

