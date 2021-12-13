import java.util.Scanner;
public class Main {static String result ="";
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        reverseString(S);
        if(isPalindrome(S)==true)System.out.println("True");
        else System.out.println("False");
    }
    public static String reverseString(String S) {//переворот строки
        int stringLength = S.length();
        for (int i = 0; i < stringLength; i++) {
            result = S.charAt(i) + result;
        }
        return result;
    }
    public static boolean isPalindrome(String S){//Сравнивает строки
        return result.equals(S);
    }
}