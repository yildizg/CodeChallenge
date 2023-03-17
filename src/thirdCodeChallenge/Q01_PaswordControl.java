package thirdCodeChallenge;
import java.util.Scanner;
public class Q01_PaswordControl {
    /*
     * ask user to create a password.
     * it should have at least
     * 1 special char    *.,;'
     * 1 uppercase     ASASFSFAS
     * 1 lowercase    dadda
     * 1 digit        21215656
     * the length of password should be at least 8 characters
     *
     *     // 1- Ask user to create a password. tell the conditions
     *     // 2- Check password with all conditions
     *     // 3-Print the result if password is created successfully or not
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("password giriniz \npasswordunuz enaz 1 ozel karakter icermeli\nenaz 1 buyuk harf olmali " +
                "\nenaz 1 kucuk harf olmali \n enaz 1 rakam olmali \n ve 8 karakterden az olmamali");
        String password = input.nextLine();
        // input.close(); bu kod Scanner class in kapatan kod dur. intellij idea da buna gerek kalmiyor
        //password kontrol sartalari yaziniz ipucu herbulunan sart in sayisini tutunuz count ediniz
        int specialCount = 0;
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;
        //   int otherCaseCount=0; TODO
        boolean pass = true;
        for (int i = 0; i < password.length(); i++) {//tum password karakterleri icinde geziliyor
            if (password.charAt(i) >= '!' && password.charAt(i) <= '/') {//karakterler icerisinde ozel karakter varmi kontrol ediliyor
                specialCount++;
            } else if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                upperCaseCount++;
            } else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                lowerCaseCount++;
            } else if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                digitCount++;
            } else if ( password.charAt(i) >= ':' && password.charAt(i)<='@') {
                specialCount++;
            } else {
                System.out.println("senin password hicbirsekilde gecerli olmadi");
                break;
            }
        }//loop sonu
        // passwordun sartlarinin olumsuz olmasi durumlari kontrol ediniz
        if (password.length() < 8) {//8 den kucuk karakter var ise
            System.out.println("password enaz 8 karakter olmali");
            pass = false;
        }
        if (specialCount == 0) {
            System.out.println("password enaz 1 ozel karakter icermeli");
            pass = false;
        }
        if (digitCount == 0) {
            System.out.println("password enaz 1 rakam karakter icermeli");
            pass = false;
        }
        if (lowerCaseCount == 0) {
            System.out.println("password enaz 1 kucuk karakter icermeli");
            pass = false;
        }
        if (upperCaseCount==0){
            System.out.println("password enaz 1 buyuk  karakter icermeli");
            pass=false;
        }
        if (pass) {
            System.out.println("password unuz basarili create edildi");
        }
    }
}
