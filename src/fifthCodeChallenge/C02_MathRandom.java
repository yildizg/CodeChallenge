    package fifthCodeChallenge;

    import java.util.Random;
    import java.util.Scanner;

    public class C02_MathRandom {
    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    Random random=new Random();
    System.out.println("matrisin boyutu ne olsun?");
    int boyut= input.nextInt();
        for (int i = 0; i <boyut ; i++) {
            for (int j = 0; j <boyut ; j++) {
               // System.out.println((int) (Math.random() * 2) + " ");
                System.out.print(random.nextInt(2)+" ");
            }
            System.out.println();

        }
        //chatgpt


    }
}
