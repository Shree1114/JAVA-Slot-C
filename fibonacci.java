import java.util.*;
public class fibonacci
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int number=sc.nextInt();
if(number%2==0)
{
System.out.println("Its Even Number");
}
else
{
System.out.println("Its Odd Number");
}
}
}