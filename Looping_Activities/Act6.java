package Looping_Activities;
import java.util.Scanner;

public class Act6 {
    public static void mulTable(int number){ //static වෙන්නම ඕනෙ, static main එකේදි call කරන්නනම්...
        for(int i=1; i<=10; i++){
            int mul=number*i;
            System.out.println(number+" x "+i+" = "+mul);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for create the multifivation table : ");
        int num = scanner.nextInt();

        mulTable(num);
    }
}
