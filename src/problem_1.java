import java.util.Scanner;
public class problem_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        int dog_yrs = age * 7;
        System.out.println("Your age in dog years is "+dog_yrs);
    }
}
