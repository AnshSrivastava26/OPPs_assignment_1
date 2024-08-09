public class problem_13 {
    public static void main(String[] args) {
        System.out.print("Enter time in hours: ");
        int time  = user_input.value_reader();
        System.out.println("The time in minutes is "+hrs_to_mins(time));

    }

    public static long hrs_to_mins(int t) {
        return (t*60);
    }
}
