package thirdCodeChallenge;
import java.util.Scanner;
public class Q02_MethodCreation {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str=input.nextLine().toLowerCase();
        System.out.println(xyzKontrol(str));
        //return type li methodlar call edildiginde mutlaka konsolda gormek isterseniz sout ile call edin
        xyzMethodVoid(str);
    }
    private static void xyzMethodVoid(String str2) {
        System.out.println(str2.contains("xyz") ? true : false);
    }
    private static boolean xyzKontrol(String s) {
        //1.yol  return   s.contains("xyz") ? true : false;
        //2. yol
        if (s.contains("xyz")){
            return true;
        }else return false;
    }
}