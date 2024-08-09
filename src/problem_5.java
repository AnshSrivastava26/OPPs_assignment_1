public class problem_5 {
    public static void main(String[] args) {
        System.out.print("Enter hourly wage: ");
        int wage = user_input.value_reader();
        System.out.print("Enter hours worked: ");
        int hours = user_input.value_reader();
        System.out.println("The total salary is "+total_salary(wage,hours));
    }

    public static long total_salary(int wage,int hours) {
        return (wage*hours);
    }
}
