public class problem_15 {
    public static void main(String[] args) {
        System.out.print("Enter the side length of the square: ");
        int side = user_input.value_reader();
        System.out.println("The perimeter of the square is "+perimeter_of_Square(side));
    }
    public static long perimeter_of_Square(int side){
        return side*4;
    }
}
