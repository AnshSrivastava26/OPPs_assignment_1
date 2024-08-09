public class problem_17 {
    public static void main(String[] args) {
        System.out.print("Enter distance in kilometers: ");int
                distance = user_input.value_reader();
        System.out.println("The distance in miles is "+kilometer_to_miles(distance));
    }
    public static double kilometer_to_miles(int dis){
        return (dis*0.621371);
    }
}
