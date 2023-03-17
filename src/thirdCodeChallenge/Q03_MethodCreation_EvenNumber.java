package thirdCodeChallenge;
import java.util.Scanner;
public class Q03_MethodCreation_EvenNumber {
    public static void main(String[] args) {
        /* Write a method named isEven that accepts an integer argument.
         The method should return true if the argument is even, or false otherwise.*/
        System.out.println(isEven());
    }
    public static boolean isEven() {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=input.nextInt();
        //gerek yok diyor java return sayi % 2 == 0  ? true : false ;
        return sayi % 2 == 0 ;
    }
    ///overload edilen method
    public static boolean isEven(int x) {
        //gerek yok diyor java return sayi % 2 == 0  ? true : false ;
        return x % 2 == 0 ;
    }
}