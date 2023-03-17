package thirdCodeChallenge;
import java.util.Scanner;
public class Q05_WhileLoop {
    /*
  Girilen bir sayıya kadar (dahil olcak )olan sayılardan sadece tek olanlarını ekrana yazdırınız.
  girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=input.nextInt();
        int count =0;//tek sayilarin adedi icin olustruldu
        while (sayi>0){
            if (sayi % 2==1){
                System.out.print(sayi+" ");
                count++;
            }
            sayi--;
        }
        System.out.println();
        System.out.println("count = " + count);
    }
}