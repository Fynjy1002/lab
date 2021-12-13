import java.util.Scanner;

public class Primes {
    public static void main(String args[]) {
        var scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i=2;i<n;i++){
            if (IsPrime(i)==true){
                System.out.println(i);
            }
        }
    }
    public static boolean IsPrime(int n){
        for (int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}