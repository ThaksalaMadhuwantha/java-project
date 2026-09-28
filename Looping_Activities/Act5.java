package Looping_Activities;
import java.util.Scanner;

public class Act5 {
    public static int countDigits(int number){
        if(number == 0){
            return 1; //0 පෙන්නුවොත් ඒකත් count වෙන්න ඕනෙ හින්ද 1 විදිහට return කරනවා
        }

        int count=0;
        int n = Math.abs(number); //negative numbers handle කරනවා...

        while (n > 0) {
            n /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number");
            int num = scanner.nextInt();

            int result=countDigits(num);
            System.out.println("The num "+num+ " has : "+result+" Digits");
    }
}
