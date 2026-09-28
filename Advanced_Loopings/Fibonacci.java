package Advanced_Loopings;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for Fibonacci : ");
        int number = scanner.nextInt();

        int first=0;
        int second=1;
        int next=0;

        for(int i=1; i<=number; i++){
            next = first+second;
            first=second;
            second=next;
        }

        System.out.println("Fibonacci of the number "+number+ " is "+ next);
    }
}
//මේ තියෙන්නෙ Fibonacci n වෙනි number එක
//Fibonacci ශ්‍රේණිය ගැනත් බලන්න (Fibonacci series up to n terms?)