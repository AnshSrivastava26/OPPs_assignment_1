public class problem_14 {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");int
                n1 = user_input.value_reader();
        System.out.print("Enter the second number: ");int
                n2 = user_input.value_reader();
        swap(n1,n2);
    }

    public static void swap(int n1,int n2){
        int temp = n1;
        n1 = n2;
        n2 =temp;
        System.out.println("After swapping, first number is "+n1+" and second number is "+n2);
    }
}
