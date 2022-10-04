
import org.junit.Test;
import static org.junit.Assert.assertEquals;
//class TestMessage
//{
//  int sum=0;  
//}
class TestMessage
{
	int sum=0;
   static float final_bill=0.0f;
   
    public static float calculation(int bill)
    {
        if(bill>2500 && bill<=5000)
        {
             
          final_bill=0.20f*(float)bill;
           
        }
         if(bill>5000 )
        {
          final_bill=0.50f*(float)bill;
        }
        
        return final_bill;
}
}
//public class TestMessgae {
// public static int linearSearch(int[] arr, int key){
// for(int i=0;i<arr.length;i++){
// if(arr[i] == key){
// return i;
// }
// }
// return -1;
//
//  }
//  @Test
//  public void test1()
//  {
//  int[] s={1,-2,-8,4,5,6,5,10,2,10};
//  int val=TestMessgae.linearSearch(s,-2);
//  assertEquals(1,val);
//  }
//  @Test
//  public void test2()
//  {
//  int[] s={1,-2,-8,4,5,6,5,10,2,10};
//  int val=TestMessgae.linearSearch(s,4);
//  assertEquals(3,val);
//  }
//  @Test
//  public void test3()
//  {
//  int[] s={1,-2,-8,4,5,6,5,10,2,10};
//  int val=TestMessgae.linearSearch(s,5);
//  assertEquals(4,val);
//  }
//  @Test
//  public void test4()
//  {
//	  int[] s={1,-2,-8,4,5,6,5,10,2,10};
//	  int val=TestMessgae.linearSearch(s,2);
//	  assertEquals(8,val);
//	  }
//	  @Test
//	  public void test5()
//	  {
//	  int[] s={1,-2,-8,4,5,6,5,10,2,10};
//	  int val=TestMessgae.linearSearch(s,6);
//	  assertEquals(5,val);
//	  }
//	 }
