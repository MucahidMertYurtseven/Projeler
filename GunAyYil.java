import java.util.*;

public class GunAyYil {
    public static void main(String[] args) {
//        Kullanıcıdan belirli bir gün sayısını girdi olarak alan ve gün sayısını yıl, ay, hafta ve
//        gün cinsinden ekrana yazdıracak programı java programlama dilinde yazınız.
//                Bu hesaplamayı yaparken her yıl 365 gün, her ay 30 gün ve her hafta 7 gün olarak
//        kabul edilmelidir. Programda döngü ve koşul ifadeleri kullanılmamalıdır.
        int ay, yil, hafta, kalanGun;
        Scanner oku = new Scanner(System.in);
        System.out.println("Bir gün değeri giriniz : ");
        int gun = oku.nextInt();
        yil = gun / 365;
        ay = gun % 365 / 30;
        hafta = gun % 365 % 30 / 7;
        kalanGun = gun % 365 % 30 % 7;
        System.out.printf("%d YIL %d AY %d HAFTA %d GUN", yil, ay, hafta, kalanGun);

    }
}

