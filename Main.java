
import java.util.*;

public class Main {
//exception handing
	public static int doCalculations(int num,int deno
			)
	{
		if(deno==0)
		{
			throw new Child();// mansour likes throwing  children
		}
		return num/deno;
		
	}
	public static void main(String[] args) {
	
Scanner keyb=null;
boolean done=false;
int num=0,deno=0,result=0;
do{
	try 
	{
		keyb=new Scanner(System.in);

		System.out.println("Enter the first number");
		num=keyb.nextInt();
		System.out.println("Enter second number");
		deno=keyb.nextInt();
		result=doCalculations(num,deno);
	done=true;
	} 
	catch (NullPointerException e) {
		System.out.println("Scanner is not instantiated");
		e.printStackTrace();
		System.exit(0);
	}
	catch(Child e)
	{
		System.out.println(e.getMessage());
	}
	catch( ArithmeticException e)
	{
		System.out.println(e.getMessage());


	}
	
	catch(InputMismatchException e){
		System.out.println("Only integers are allowed");
		keyb.nextLine();

	}
	catch (Exception e) {
		System.out.println("Oops this shouldn't have happened");
		e.printStackTrace();
		System.exit(0);
	}
}while(!done);
	System.out.println("Answer is"+result);
	}
//NullPointer Exception didnt instantiate the scanner
// Arithmetic Exception:/ by zero<-- message
	//java.util.InputMismatchException<- exception
	/*try
	{
		
	}
	catch()  if you know the exception will be 
	{
	
	}
	*/
}
