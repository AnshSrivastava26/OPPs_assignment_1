public class problem_6 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = user_input.value_reader();
        System.out.println(even_odd(num));
    }

    public static String even_odd(int num) {
        if (num % 2 == 0){
            return "The number is even";
        }else {
            return "The number is odd";
        }
    }
}
