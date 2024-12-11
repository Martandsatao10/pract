import java.util.*;

abstract class shape
{
	private double d1,d2;

	double getd1()
	{
		return d1;
	}

	double getd2()
	{
		return d2;
	}

	shape(){};

	shape(double a,double b)
	{
		d1=a;
		d2=b;
	}

	abstract double compute_area();

	void read()
	{
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter First Dimension :");
		d1=sc.nextDouble();

		System.out.print("Enter Second Dimension :");
		d2=sc.nextDouble();
	}

}

class triangle extends shape
{
	double area;

	triangle(){};

	triangle(double b,double h)
	{
		super(b,h);
	}

	double compute_area()
	{
		area=(0.5*getd1()*getd2());
		return area;
	}

}

class rectangle extends shape
{
	double area;

	rectangle(){};

	rectangle(double l,double b)
	{
		super(l,b);
	}

	double compute_area()
	{
		area=(getd1()*getd2());
		return area;
	}

}

class main
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int x;
		shape s;

		do
		{
			System.out.print("\t\tMENU\n1.Triangle\n2.Rectangle\n3.Exit\n\nEnter your choice :: ");
			x=sc.nextInt();
			switch (x)
			{
			case 1:
				triangle t=new triangle();
				s=t;
				s.read();
				System.out.println("Area of Triangle : "+s.compute_area());
				System.out.println("=====================================================================");
				break;

			case 2:
				rectangle r= new rectangle();
				s=r;
				s.read();
				System.out.println("Area of Rectangle : "+s.compute_area());
				System.out.println("=====================================================================");
				break;

			case 3:
				System.out.println("Exiting the program.........");
				System.out.println("=====================================================================");
				break;

			default :
				System.out.println("!!!!!!!!! INVALID INPUT !!!!!!!!!!!");
				break;
			}
		}
		while (x!=3);

		sc.close();
	}
}
