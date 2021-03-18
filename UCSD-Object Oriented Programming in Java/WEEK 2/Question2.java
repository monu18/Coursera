public class Question2
{
  private int a;
  public double b;
  
  public Question2(int first, double second)
  {
    this.a = first;
    this.b = second;
  }
  public static void main(String[] args)
  {
    Question2 c1 = new Question2(10, 20.5);
    Question2 c2 = new Question2(10, 31.5);
    // lines below are changed from the question above
    c2 = c1;   
    c1.a = 2;
    System.out.println(c2.a);
  }
}