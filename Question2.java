import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {    
    double height;
    double weight;
    double bmi;
     
    Scanner input = new Scanner(System.in);
    //System.out.println("Enter height (in m): ");
    height = input.nextDouble();
    
    //System.out.println("Enter weight (in kg): ");
    weight = input.nextDouble();
    
    bmi = weight / Math.pow(height,2);
    
    System.out.println(bmi);
  }
}
