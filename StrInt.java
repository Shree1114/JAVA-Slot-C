import java.util.Scanner;
public class StrInt
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter A String To Convert It As Integer:");
  String x=sc.nextLine();
  System.out.println("After Converting To Integer");
  
   int y=Integer.parseInt(x);
   System.out.println(y);
int m= Integer.valueOf(x);
  System.out.print(m);
 }
}