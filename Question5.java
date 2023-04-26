import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;

public class Question5
{
  public static void main(String[] args)
  {
    
    int inputKey;
    int freqValue;
    int max = 0;
    int mode = -1;
    
    Scanner in = new Scanner(System.in);
    int noOfInput = in.nextInt();
    Dictionary<Integer, Integer> freqDict = new Hashtable<Integer, Integer>();
    
    for (int i = 0; i < noOfInput; i++)
    {
      inputKey = in.nextInt();
      if(freqDict.get(inputKey) != null)
      {
        freqValue = freqDict.get(inputKey);
        freqDict.put(inputKey, freqValue+1);
        if (freqValue > max)
        {
          max = freqValue;
          mode = inputKey;
        }
      }
      
      else
        freqDict.put(inputKey, 1);
    }

    if (max != 0)
      System.out.println(mode);
    else
      System.out.println("No mode");
        
  }
}
