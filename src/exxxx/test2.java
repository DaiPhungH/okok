package exxxx;

 class ThrowExample {
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Tuổi phải >= 18!");
        }
        System.out.println("Tuổi hợp lệ.");
    }

    public static void main(String[] args) {
        try {
            checkAge(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}

