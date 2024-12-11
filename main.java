import java.util.*;

class Complex
{
	float real,img;

	public Complex()
	{
		real=0;
		img=0;
	}

	public Complex(float a,float b)
	{
		real=a;
		img=b;
	}

	public void display(Complex C1,Complex C2)
	{
		System.out.println("First number="+C1.real+"+"+C1.img+"i");
		System.out.println("Second number="+C2.real+"+"+C2.img+"i");
	}

	public void addnumber(Complex C1, Complex C2)
	{
		float real,img;
		real=(C1.real+C2.real);
		img=(C1.img+C2.img);
		System.out.println("Addition = ("+real+")+("+img+"i)");
	}

	public void subnumber(Complex C1,Complex C2)
	{
		float real,img;
		real=(C1.real-C2.real);
		img=(C1.img-C2.img);
		System.out.println("Subtraction = ("+real+")+("+img+"i)");
	}

	public void multinumber(Complex C1,Complex C2)
	{
		float real,img;
		real=(C1.real*C2.real-C1.img*C2.img);
		img=(C1.real*C2.img+C1.img*C2.real);
		System.out.println("Multiplication = ("+real+")+("+img+"i)");
	}

	public void divnumber(Complex C1,Complex C2)
	{
		float real,img;
		real=(C1.real*C2.real+C1.img*C2.img)/(C2.real*C2.real+C2.img*C2.img);
		img=(C1.real*C2.img-C1.img*C2.real)/(C2.real*C2.real+C2.img*C2.img);
		System.out.println("Division = ("+real+")+("+img+"i)");
	}

}

//=========================Class Main=====================//

class main
{
	public static void main(String [] args)
	{
		float num1,num2;

		Complex cal=new Complex();

		Scanner sc= new Scanner(System.in);

		System.out.println("Please input the Comlex number");
		System.out.print("Enter real part of First number:");
		num1=sc.nextFloat();
		System.out.print("Enter imaginery part of First number:");
		num2=sc.nextFloat();

		Complex C1=new Complex(num1,num2);
		System.out.println("\n");

		System.out.print("Enter real part of Second number:");
		num1=sc.nextFloat();
		System.out.print("Enter imaginery part of Second number:");
		num2=sc.nextFloat();

		Complex C2= new Complex(num1,num2);

		System.out.println("\n");
		cal.display(C1,C2);
		System.out.println("\n");

		cal.addnumber(C1,C2);
		System.out.println("\n");

		cal.subnumber(C1,C2);
		System.out.println("\n");

		cal.multinumber(C1,C2);
		System.out.println("\n");

		cal.divnumber(C1,C2);
		System.out.println("\n");
	}
}