public class problem_8 {
    public static void main(String[] args){
        System.out.print("Enter the first number: ");
        int
                num1 = user_input.value_reader();
        System.out.print("Enter the second number: ");
        int
                num2 = user_input.value_reader();
        System.out.println("The sum is "+sum(num1,num2));
    }

    public static int sum(int n1,int n2) {
        return n1+n2;
    }
}
