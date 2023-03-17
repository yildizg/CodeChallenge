package thirdCodeChallenge;
import java.util.Scanner;
import static thirdCodeChallenge.Q03_MethodCreation_EvenNumber.isEven;
public class Q04_MethodCreation {
    /*
   Kullanicidan bir tam sayi alin.
   Bu sayinin negatif veya pozitif oldugunu,
   tek mi cift mi oldugunu ve
   uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
   100'den kucukse sadece birler basamagini yazdirin.
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=input.nextInt();
        negatifPozitifMethod(sayi);//. nokta koy  gelmezse sout a gerek yok
        System.out.println(isEven(sayi));
        System.out.println(sayi >= 100  ? yuzdenBuyuk(sayi) : yuzdenKucuk(sayi));
    }
    private static int yuzdenBuyuk(int sayi) {
        int birler = sayi % 10, onlar=(sayi/10) %10, yuzler = sayi/100;
        int toplam=0;
        return toplam=birler+onlar+yuzler;
    }
    private static int yuzdenKucuk(int sayi) {// 99 55 66 22
        return sayi % 10;
    }
    private static void negatifPozitifMethod(int sayi) {
        System.out.println(sayi > 0 && sayi != 0 ? "pozitif " : " negatif");
    }
}
