package thirdCodeChallenge;
import java.util.Scanner;
public class Q07_MethodCreationMath {


    /*  Problem Tanımı
   Verilen iki sayının kombinasyonunu bulan kodu yazınız.
   Hatırlatma C(n,r) = n! / (r!(n-r)!)
   Verilen iki sayının permütasyonunu bulan kodu yazınız.
   Hatırlatma P(n,r) = n! / (n-r)!
   Ekran Çıktısı
   Birinci sayıyı giriniz: 15
   Ikinci sayıyı giriniz: 4
   Kombinasyon: 1365
   permütasyon: 32760
   Birinci sayıyı giriniz: 5
   Ikinci sayıyı giriniz: 3
   Kombinasyon: 10
   permütasyon: 60
 */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("birinci sayiyi gir");
        long n =input.nextLong();
        System.out.println("ikinci sayiyi gir");
        long r =input.nextLong();
        System.out.println("kombinasyon(n,r) = " + kombinasyon(n, r));
        System.out.println("permutasyon(n,r) = " + permutasyon(n, r));
        System.out.println("faktorial(n) = " + faktorial(n));
        System.out.println("faktorial(r) = " + faktorial(r));
    }
    public static  long faktorial(long sayi){
        long faktorialSonuc = 1 ;//
        for (int i = 1; i <=sayi ; i++) {
            faktorialSonuc*=i;//sayiya kdar olan tum sayilar carpildi vve atandi
        }
        return faktorialSonuc;
    }
    private static long permutasyon(long n, long r) {
        // Hatırlatma P(n,r) = n! / (n-r)!
        if (n>0 && r>0 && n>=r){
            return faktorial(n) / faktorial(n-r); //faktorial(n-r) n 5 ve r 3 ise faktorial(2) demek oluyor
        }else return 0 ;
    }
    private static long kombinasyon(long n, long r) {
        // Hatırlatma C(n,r) = n! / (r! (n-r)! )
        if (n > 0 && r > 0 && n >= r){
            return faktorial(n) / (faktorial(r) * faktorial(n-r)); //faktorial(n-r) n 5 ve r 3 ise faktorial(2) demek oluyor
        }else return 0 ;
    }


}