import animals.Animal;

class MyClass {

    // Phương thức có tham số
    static void welcome(String name) {
        System.out.println("Xin chào, " + name);
    }
    // Phương thức không tham số
    static void sayHello() {
      System.out.println("Hello World!");
    }
    // Phương thức tham số tùy chọn
    // names là mảng chứa các chuỗi
    static void showProductNames(String ... names) {
        int sotenSanpham = names.length;
        System.out.println("Số tên sản phẩm: " + sotenSanpham);
        // Duyệt qua phần tử mảng các tham số
        for (String name : names) {
            System.out.println(name);
        }
    }

    // Phương thức sum trả về kiểu int, là tổng của hai tham số
    static int sum(int val1, int val2) {
        // phương thức kết thúc khi gặp return
        return val1 + val2;
    }
    
  
    public static void main(String[ ] args) {
        // sayHello(); //Xuất ra: "Hello World!"

        // welcome("Minh");
        // welcome("An");
        // welcome("Tý");

        // showProductNames("Iphone 8", "Note 10", "Macbook Pro");

        // int x = sum(2, 5);
        // System.out.println(x);

        // Animal dog = new Animal();
        // dog.bark();

        //Tạo ra v1, v2 đối tượng của lớp
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();

        //Gán giá trị cho thuộc tính (dữ liệu)
        v1.color = "red";

        //Truy cập phương thức
        v2.horn();

        //Đọc thuộc tính của đối tượng
        String colorv1 = v1.color;


        
    }
}
  
  