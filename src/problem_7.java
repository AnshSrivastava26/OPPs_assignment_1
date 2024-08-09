public class problem_7 {
    public static void main(String[] args) {
        System.out.print("Enter principal: ");
        int principal = user_input.value_reader();
        System.out.print("Enter rate of interest: ");
        int rate = user_input.value_reader();
        System.out.print("Enter time (year): ");
        int time = user_input.value_reader();
        System.out.println("The simple interest is "+simple_interest(principal,rate,time));
    }

    public static double simple_interest(int p,int r, int t) {
        return (p*r*t)/100;
    }
}
