public class problem_19 {
    public static void main(String[] args) {
        System.out.print("Enter a year: ");int
                year = user_input.value_reader();
        System.out.println(leap_year_check(year));
    }
    public static String leap_year_check(int year){
        if(year % 4 == 0 && year != 100 || year % 400 == 0){
            return "The year is a leap year";
        }else {
            return "The year is not a leap year";
        }
    }
}
