import java.util.Scanner;

public class SaatSaniyeDakikaDonusum {
    public static void main(String[] args) {
        float saat, saniye, dakika;
        String str1 = "saat";
        String str2 = "saniye";
        String str3 = "dakika";
        Scanner oku = new Scanner(System.in);
             System.out.println("Neyi donusturmek istiyorsunuz? (Saat / Saniye / Dakika)");
        String neyi = oku.nextLine();
                System.out.println("Neye donusturmek istiyorsunuz? (Saat / Saniye / Dakika)");
        String neye = oku.nextLine();
        if (neyi.equalsIgnoreCase(str1)) {
            System.out.println("Bir saat degeri giriniz : ");
            saat = oku.nextFloat();
            if (neye.equalsIgnoreCase(str3)) {
                System.out.println((saat * 60) + " dakikadir.");
            } else if (neye.equalsIgnoreCase(str2)){
                System.out.println((saat * 60 * 60) + " saniyedir.");
            }
        } else if (neyi.equalsIgnoreCase(str3)){
            System.out.println("Bir dakika degeri giriniz : ");
            dakika = oku.nextFloat();
            if (neye.equalsIgnoreCase(str1)){
                System.out.println((dakika/60)+ " saattir.");
            }else if (neye.equalsIgnoreCase(str2)){
                System.out.println((dakika*60)+" saniyedir.");
            }
        }else if (neyi.equalsIgnoreCase(str2)){
            System.out.println("Bir saniye degeri giriniz : ");
            saniye = oku.nextFloat();
            if (neye.equalsIgnoreCase(str1)){
                System.out.println((saniye/60/60)+" saattir.");
            }else if (neye.equalsIgnoreCase(str3)){
                System.out.println((saniye/60)+" dakikadir.");
            }
        }else {
            System.out.println("HATALI GIRIS YAPTINIZ!!!");
        }
    }
}