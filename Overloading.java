class XYZ
{
	int height;
	int width;
	int length;
	public XYZ()
	{
		height=2;
		width=4;
		length=2;
	}
	public XYZ(int a)
	{
		height=a;
		width=a;
		length=a;
	}
	public XYZ(int x,int y,int z)
	{
		height=x;
		width=y;
		length=z;
	}
	void showarea()
	{
		 System.out.println("Area is "+height*width*length);
	}
}

public class Overloading
{
	public static void main(String[] args)
	{
		XYZ b1=new XYZ();
		b1.showarea();
		XYZ b2=new XYZ(3);
		b2.showarea();
		XYZ b3=new XYZ(6,7,2);
		b3.showarea();
	}
}