import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    
    double height;
    double weight;
    double bmi;
     
    Scanner h = new Scanner(System.in);
    System.out.println("Enter height: ");
    height = h.nextDouble(h.nextLine());
    
    Scanner w = new Scanner(System.in);
    System.out.println("Enter weight: ");
    weight = w.nextDouble(w.nextLine());
    
    bmi = w / Math.pow(h,2);
    
    System.out.println("Your BMI is: " + bmi);
  }
}
