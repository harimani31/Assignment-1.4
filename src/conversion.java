import java.util.Scanner;  

public class conversion {
	
	public static void main(String[] args) 
    {
		   byte a; short b; int c; long d; float e; double f;
	       Scanner scan = new Scanner(System.in);    //Declaring obj scan to class scanner        
	       System.out.println("Enter the value for a");
	       a = scan.nextByte();     // assigning value to the variable aValue
	       System.out.println("Enter the value for b");
	       b = scan.nextShort();     // assigning value to the variable aValue
	       c=(int) a+b;
	       System.out.println("byte and short sum in int" + " " + c);
	       d=(long)b+c;
	       System.out.println("short and int sum in long" + " " + d);
	       e=(float)c+d;
	       System.out.println("int and long sum in float" + " " + e);
	       f=(double)d+e;
	       System.out.println("long and float sum in double" + " " + f);
	       a=(byte) (e+f);
	       System.out.println("float and double sum in byte" + " " + a);
	       b=(short) (f+a);
	       System.out.println("double and byte sum in short" + " " + b);

  
   }

}
