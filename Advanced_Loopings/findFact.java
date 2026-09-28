package Advanced_Loopings;
import java.util.Scanner;

public class findFact {
    public static int calFact(int number){
        int fact = 1;
        for(int i=1; i<=number; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for find factorial : ");
        int num = scanner.nextInt();

        System.out.println("The Factorial of "+num+" is "+calFact(num));
    }
}
