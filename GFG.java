import java.util.*;
public class GFG
{
static void main(int arr[],int n)
{
int res=arr[0];
for (int i=1;i<n;i++)
res=math.min(res.arr[i]);
return res;
}
static int findsum(int arr[],int n)
{
int min=getmin(arr,n);
int max=getmax(arr,n);
return min+max;
}
static int find product(int arr[],int n)
{
int min=getmin(arr,n);
int max=getmax(arr,n);
return min*max;
public static void main(String[]args)
{
int arr[]={12,123,1234};
int n=arr.length;
System.out.println("Sum="+findsum(arr,n));
System.out.println("Product="+findsum(arr,n));
}
}