class Student
{
	
		private int hindi, english, maths;
		private String name;
		double avg;
		 public Student(int h,int e,int m,String n)
		{
			 hindi=h;
			 english=e;
			 maths=m;
			 name=n;
		}
		 public void display()
		{
			System.out.println("Marks in Hindi "+hindi);
			System.out.println("Marks in English "+english);
			System.out.println("Marks in Maths "+maths);
		    System.out.println("Name of Student is "+name);
		}
		
		
		 public double average()
		{
			avg=(hindi+english+maths);
			return(avg/3);
		}
		
		
		public static void main(String[] args)
		{
			Student Jiya=new Student(80,90,95,"Jiya");
			double jiyaavg=Jiya.average();
			Student Rakhi=new Student(80,85,90,"Rakhi");
			double rakhiavg=Rakhi.average();
	        Student pratyush=new Student(100,95,95,"pratyush");
			double praavg=pratyush.average();
			Student swati=new Student(81,89,90,"swati");
			double swatiavg=swati.average();
		    Student saksham=new Student(81,91,85,"saksham");
			double sakavg=saksham.average();
			double[] m={jiyaavg,rakhiavg,praavg,swatiavg,sakavg};
			double highmarks=m[0];
			int highmarksindex=0;
			for(int i=0;i<m.length;i++)
			{
				if(m[i]>highmarks)
				{
					highmarks=m[i];
					highmarksindex=i;
				}
		    }
			        System.out.println("RollNo of Topper Student is " + (highmarksindex+1) + " and average the marks of the Student is " + highmarks ); 
    
			
		}
		
	
}