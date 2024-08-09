public class problem_12 {
    public static void main(String[] args) {
        System.out.print("Enter the dividend: ");
        int dividend = user_input.value_reader();
        System.out.print("Enter the divisor: ");
        int divisor = user_input.value_reader();
        System.out.println("The remainder: "+remainder(dividend,divisor));
    }

    public static int remainder(int n1,int n2) {
        return (n1%n2);
    }
}
