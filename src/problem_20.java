public class problem_20
{
    public static void main(String[] args) {
        System.out.print("Enter weight in kilograms: ");
        int weight = user_input.value_reader();
        System.out.print("Enter height in meters: ");
        double height = user_input.Double_reader();
        BMI_calculator(weight,height);
    }

    public static void BMI_calculator(int wt, double ht) {
        double bmi = wt/(ht*ht);
        System.out.println("The BMI is "+bmi);
    }
}
