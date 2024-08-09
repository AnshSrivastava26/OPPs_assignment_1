public class problem_16 {
    public static void main(String[] args) {
        System.out.print
                ("Enter the number of weeks: ");int
                week = user_input.value_reader();
        System.out.println("The number of days is "+days_in_week(week));
    }

    public static long days_in_week(int weeks) {
        return (weeks*7);
    }
}
