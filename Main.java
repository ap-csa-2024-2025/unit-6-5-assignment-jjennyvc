import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    
  }

  public static void reverse(String[] arr)
  {
    for (String word : words)
    {
      String reverse = new StringCreater(word).reverse().toString();
      System.out.println(reversed);
    }
  }

  public int product(int[] arr)
  {
    int result = 1;
    for (int num : numbers)
    {
      result *= num;
    }
    return 0;
  }

  public double average(double[] arr)
  {
    if (numbers.length == 0;) return 0;

    double sum = 0;
    for (double num : numbers)
    {
      sum += num;
    }
    return sum / numbers.length;
  }
}
