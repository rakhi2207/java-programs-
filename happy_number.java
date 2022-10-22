import java.util.*;
class happy_number
{
    int y,n;
    happy_number()
    {
        y=0;
        n=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        n=sc.nextInt();
    }
    int sum_of_digit(int z)
    {
        if(z==0)
        {
            return 0;
        }
        else
        {
            int d=z%10;
            return d*d+sum_of_digit(z/10);
        }
    }
    
    int happy(int x)
    {
        while(x>9)
        {
            y=sum_of_digit(x);
            x=y;
        }
        return y;
    }
    
    void display()
    {
        int q=happy(n);
        if(q==1)
        {
            System.out.println("Happy Number");    
        }
        else
        {
            System.out.println("Not Happy Number");
        }
    }
    
    public static void main()
    {
        happy_number ob=new happy_number();
        ob.input();
        ob.display();
    }
}

