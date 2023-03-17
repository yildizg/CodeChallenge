package thirdCodeChallenge;
public class Q06_MethodCreationReverseString {
    /* Interview Question
 Write a Java program to reverse a string.
 Use for loop and create a method called reverseString */
    static String strStatic = "java cok guzel";
    public static void main(String[] args) {
        String str = "java cok guzel";
        System.out.println("reverseString(str) = " + reverseString(str));
        //method overload edelim
        System.out.println("reverseString() = " + reverseString());
    }
    private static String reverseString(String str) {
        String tersStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr += str.charAt(i);
            //   tersStr+=str.substring(i,i-1);
        }
        return tersStr;
    }
    private static String reverseString() {
        String tersStr = "";
        for (int i = strStatic.length() - 1; i >= 0; i--) {
            tersStr += strStatic.charAt(i);
            //   tersStr+=str.substring(i,i-1);
        }
        return tersStr;
    }
}