import java.util.Scanner;
public class user_input {
    public static int value_reader() {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        return value;
    }
    public static double Double_reader(){
        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();
        return value;
    }
}
