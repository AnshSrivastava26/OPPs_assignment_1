public class problem_18 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");int
                num = user_input.value_reader();
        int sum = sum_of_digits(num);
        System.out.println("The sum of the digits is "+sum);
    }

    public static int sum_of_digits(int num) {
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum = sum + rem;
            num /= 10;
        }
        return sum;
    }
}
