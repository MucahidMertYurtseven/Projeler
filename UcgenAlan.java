import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        int x, y, z;
        Scanner deger = new Scanner (System.in);
        System.out.print("Üçgenin 1. kenarnı giriniz : ");
        x = deger.nextInt();
        System.out.println(x +" Üçgenin 1. kenardır.");

        System.out.print("Üçgenin 2. kenarnı giriniz : ");
        y = deger.nextInt();
        System.out.println(y+" Üçgenin 2. kenardır.");
        System.out.print("Üçgenin 3. kenarnı giriniz : ");
        z = deger.nextInt();
        System.out.println(x +" Üçgenin 3. kenardır.");
        double cevre = (x+y+z)/2;
        System.out.println("Üçgenin alanı : "+Math.sqrt((cevre)*(cevre-x)*(cevre-y)*(cevre-z)));




    }
}
