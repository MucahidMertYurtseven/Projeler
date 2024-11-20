import java.util.Scanner;

public class DonemSonuOrtalama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Birinci vize notunuzu giriniz : ");
        float vize1 = sc.nextInt();
            System.out.println("İkinci vize notunuzu giriniz : ");
            float vize2 = sc.nextInt();
        System.out.println("Final notunuzu giriniz : ");
            float final1 = sc.nextInt();
                sc.close();
       float donemsonu = (vize1*0.3f)+(vize2*0.3f)+(final1*0.4f);
       System.out.printf("Donem sonu ortalamaniz : %f'dir.", donemsonu);
       if (donemsonu >= 85) {
           System.out.println("\n Tebrikler ustun basari ile gectiniz.");
       }else if (donemsonu >= 50) {
           System.out.println("\nTebrikler, gectiniz. Birdahaki donem dah cok calismalisin :) ");
       }else {
           System.out.println("\nMaalesef gecemediniz :( Lutfen seneye daha cok calis.");
       }
    }
}
