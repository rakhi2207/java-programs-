import java.rmi.*;  
public class MyClient{  
public static void main(String args[]){  
try{  
Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo");  
System.out.println("The Sum is(34+4) : "+stub.add(34,4));  
System.out.println("The Sub is(20-15) : "+stub.sub(20,15));  
System.out.println("The Mul is(5*6) : "+stub.mul(5,6));  
System.out.println("The Div is(10/5) : "+stub.div(10,5));  
}catch(Exception e){}  
}  
}  