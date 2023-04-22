import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {    
    int integer;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    integer = in.nextInt();
    
    for (int i = integer; i > 0; i--)
    {        
      for (int j = 0; j < i; j++)
      {
        System.out.print("*");
      }
      
      System.out.println();
    }
  }
}
