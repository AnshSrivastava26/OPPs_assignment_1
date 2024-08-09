public class problem_4 {
    public static void main(String[] args) {
        System.out.print("Enter temperature in celsius: ");
        int temp = user_input.value_reader();
        degree_fahrenheit(temp);
    }

    public static void degree_fahrenheit(int temperature_in_celsius) {
        double fahrenheit = (temperature_in_celsius*9/5)+32;
        System.out.println("The in fahrenheit is "+fahrenheit);
    }
}
