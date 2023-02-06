import java.util.ArrayList;
import java.util.*;
public class Merge
{
 public static void main(String[]args)
{
List <Integer>first=new ArrayList<Integer>();
first.add(2);
first.add(3);
first.add(5);
System.out.println("First List:"+first);
List<Integer>second=new ArrayList<Integer>();
second.add(4);
second.add(6);
System.out.println("Second List:"+second);
List<Integer>merged=new ArrayList<Integer>();
merged.addAll(first);
merged.addAll(second);
System.out.println("Merged List"+merged);
}
}
