import java.util.Scanner;

public class Ccalculator {


    public static void main(String[] args) {
        System.out.println("Hesap Makinesi");
        double x1;
        double x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemi giriniz : * / + -");
        char ch = scanner.next().charAt(0);
        System.out.println("Lutfen bir x1 degeri giriniz : ");
        x1 = scanner.nextDouble();
        System.out.println("Lutfen bir x2 degeri giriniz : ");
        x2 = scanner.nextDouble();
        if (ch == '+') {
            System.out.println(x1 + x2);
        } else if (ch == '-') {
            System.out.println(x1 - x2);
        } else if (ch == '*') {
            System.out.println(x1 * x2);
        } else if (ch == '/') {
            if (x2 == 0) {
                System.out.println("Payda 0 olamaz. Lutfen farkli bir x2 degeri giriniz.");
            }
            System.out.println(x1 / x2);
        }

    }

}




