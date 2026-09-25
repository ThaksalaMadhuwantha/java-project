package Activity_Set_02;
import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        System.out.println("Enter your age : ");
        int age = scanner.nextInt();

        if (age>=18){
            System.out.println("Hi "+name+"you can vote...");
        }else{
            int wait = 18 - age;
            System.out.println("Sorry "+name+"you cannot vote here (pls wait "+wait+"years for voting...");
        }

    }
}
