import java.util.Scanner;

public class Diskriminant {
    public static void main(String[] args) {
        Scanner degisken = new Scanner(System.in);
        //ax^2+ bx +c
        double a, b, c;
        System.out.println("x^2 nin katsayısı : ");
        a = degisken.nextDouble();
        System.out.println(a+ ", x^2 nin katsayısıdır.");

        System.out.println("x in katsayısı : ");
        b = degisken.nextDouble();
        System.out.println(b+ ", xin katsayısıdır.");

        System.out.println("sabit sayı : ");
        c = degisken.nextDouble();
        System.out.println(b+ ", sabit sayıdır.");

        System.out.println("Denklem : " +a+"x^2 " +b+"x " +c );

        System.out.println("Diskriminant : " +( (-b) + Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a );


    }
}
