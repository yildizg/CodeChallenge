package secondCodeChallenge;

public class Q04_forLoop {
    public static void main(String[] args) {

 /*
        100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız
        (büyükten küçüğe).
        Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu
         toplamini da yazdirin
        istenen sonuc :
         91
         78
         65
         52
         39
         26
         13
         toplam =364
         */
        System.out.println("***** cozum *******");
        int count  = 0 ;//kendimiz ekledik
        int toplam = 0 ;
        for (int i = 100; i >=0 ; i--) {
            if (i % 13 == 0){
                System.out.println(i);
                count++ ;
                toplam += i;
            }
        }
        System.out.println("toplam = " + toplam);
        System.out.println("count = " + count);





    }
}
