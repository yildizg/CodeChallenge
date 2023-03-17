package firstCodeChallenge;

public class Q03_Increment_Decrement {
    public static void main(String[] args) {

        //int variable create edip artirma ve azaltma operatorelro kullannarak pre ve post inc. dec aksiyonlarini yaziniz
        System.out.println("******* increment **********");
        int a = 1;
        //not atama yapilmasa dahi artirma azaltma operatorleri atama islemi ile ayni sonucu verir (fonksiyonu gorur)
        System.out.println(++a); //2
        System.out.println(a++); //2 yazar aama degeri 3 olur
        System.out.println("a = " + a); // 3
        System.out.println("******* decrement **********");
        int b = 7;
        System.out.println(--b);  //6
        System.out.println(b--); //6 // degeri 5
        System.out.println(b);   // 5
        System.out.println("*********soru 1*******");
        int x = 20;
        int y = 15;
        //post inc. dec. islemlerinde java bunu gosterir the value changed at 'y--' is never used
        System.out.println(++x + y--); //36 // 21 + 15
        System.out.println("x = " + x); //21
        System.out.println("y = " + y); //14
        System.out.println(++x + --y); // x=22 y=13 35
        System.out.println("x = " + x); // 22
        System.out.println("y = " + y); // 13
        System.out.println(" ******* soru2 ******");
        int k = 5;
        System.out.println(++k + k++ + k++ + --k + k-- + k);//      // 6 6  7 7 7 6 ->39
        System.out.println("k = " + k); //6








    }
}
