public class MyClass1
{
  private int a;
  public double b;
  
  public MyClass1(int first, double second)
  {
    this.a = first;
    this.b = second;
  }
  public static void main(String[] args)
  {
    MyClass1 c1 = new MyClass1(10, 20.5);
    MyClass1 c2 = new MyClass1(10, 31.5);
    System.out.println(c1.a + ", " + c1.b);
  }
}