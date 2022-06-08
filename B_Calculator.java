import java.util.Scanner;
class B_Calculator{
	static void add(int x,int y){
		System.out.println("Addition of numbers is : "+(x+y));
	}
	static void sub(int x,int y){
		System.out.println("Substraction of numbers is : "+(x-y));
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a=sc.nextInt();
		System.out.print("Enter second number : ");
		int b=sc.nextInt();
		add(a,b);
		sub(a,b);				
	}
}


