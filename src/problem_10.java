public class problem_10 {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        int n1 = user_input.value_reader();
        System.out.print("Enter the second number: ");
        int n2 = user_input.value_reader();
        System.out.print("Enter the third number: ");
        int n3 = user_input.value_reader();
        average_of_3(n1,n2,n3);
    }

    public static void average_of_3(int n1,int n2,int n3)
    {
        double avg =  (n1+n2+n3)/3;
        System.out.println("The average is "+avg);
    }
}
