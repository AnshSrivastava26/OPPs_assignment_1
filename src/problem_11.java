public class problem_11 {
    public static void main(String[] args) {
        System.out.print("Enter the a number: ");int
                n = user_input.value_reader();
        System.out.println("The square of the number is "+square_of_num(n));
    }
    public static long square_of_num(int n){
        return (n*n);
    }
}
