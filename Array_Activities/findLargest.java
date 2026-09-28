package Array_Activities;
import java.util.Scanner;

public class findLargest {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number of elements of the array? : ");
        int noe = scanner.nextInt();

        int[] numbers = new int[noe];

        for(int i=0;i<noe; i++){
            System.out.println("Enter the number "+(i+1));
            int num = scanner.nextInt();
            numbers[i]=num;
        }
        int large=numbers[0];
        int small=numbers[0];

        for(int n : numbers){
            if(n>large){
                large=n;
            }
            if(n<small){
                small=n;
            }
        }
        System.out.println("The largest number is : "+large);
        System.out.println("The smalest number is : "+small);
    }
}