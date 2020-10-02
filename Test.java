class Myclass
{
 void Aclass()
{
   System.out.println("one");
}
public void myMethod()
{
  this.Aclass();
  System.out.println("two");
}
}

public class Test
{
  public static void main(String[] args)
  {
     Myclass obj=new Myclass();
	 obj.myMethod();
  }
}
