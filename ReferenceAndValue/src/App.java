public class App {

    // Phương thức có tham số kiểu int, với kiểu int (kiểu nguyên thủy)
    // thì tham số truyền là giá trị (tham trị)
    static void addOneTo(int num) {
        num = num + 1;
    }

    static void Test_addOneTo()
    {
        int x = 5;

        // giá trị biến x được truyền (copy) vào tham số hàm (biến cục bộ), 
        // bản thân địa chỉ ô nhớ lưu giá trị biến x hàm không biết
        addOneTo(x);
        System.out.println(x);  // In ra 5
    }

    static void celebrateBirthday(Student p) {
        p.setAge(p.getAge() + 1);
    }

    static void test_celebrateBirthday()
    {
        Student j;
        j = new Student("XuanThuLab");
        j.setAge(20);

        // j là đối tượng do nó là tham số tham chiếu, hàm celebrateBirthday tương tác với chính đối tượng
        // lớp Person mà biến trỏ tới
        celebrateBirthday(j);
        System.out.println(j.getAge());
    }

    public static void main(String[] args) throws Exception {
        // Test_addOneTo();
        test_celebrateBirthday();
    }

}
