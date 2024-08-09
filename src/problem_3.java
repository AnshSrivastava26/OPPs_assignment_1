public class problem_3 {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int num = user_input.value_reader();
        if (num<0){
            System.out.println("The number is negative");
        } else if (num==0) {
            System.out.println("The number is zero");
        }else{
            System.out.println("The number is positive");
        }
    }
}
