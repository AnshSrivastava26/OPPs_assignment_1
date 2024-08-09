public class problem_9 {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        int
                n1 = user_input.value_reader();
        System.out.print("Enter the second number: ");
        int
                n2 = user_input.value_reader();
        System.out.println("The greatest number is "+greatest_of_2(n1,n2));
    }

    public static int greatest_of_2(int n1, int n2) {
        if (n1>n2)
            return n1;
        else
            return n2;
    }
}
