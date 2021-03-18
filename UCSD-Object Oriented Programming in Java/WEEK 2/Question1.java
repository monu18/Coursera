public class Question1
{
  private int a;
  public double b;

  public Question1(int first, double second)
  {
    this.a = first;
    this.b = second;
  }
  public static void main(String[] args)
  {
    Question1 c1 = new Question1(10, 20.5);
    Question1 c2 = new Question1(10, 31.5);
    System.out.println(c1.a + ", " + c1.b);
  }
}
