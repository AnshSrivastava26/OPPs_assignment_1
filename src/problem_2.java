public class problem_2 {
    public static void main(String[] args) {
        System.out.print("Enter the length : ");
        int len = user_input.value_reader();
        System.out.print("Enter the width : ");
        int width = user_input.value_reader();
        Area_of_rect(len,width);
    }

    public static void Area_of_rect(int len,int width) {
        int Area_of_rectangle = (len*width);
        System.out.println("The area of the rectangle is "+Area_of_rectangle);
    }
}
