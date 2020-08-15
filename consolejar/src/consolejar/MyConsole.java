package consolejar;

//Nạp package để sử dụng Scanner và InputStream
import java.io.InputStream;
import java.util.Scanner;

public class MyConsole {

    public static void main(String[] args) {

        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);
        System.out.println("Name:");
        String input = scanner.next();

        System.out.println("Hello " + input);

        scanner.close();

    }
}
