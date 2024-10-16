import java.lang.*;
class prog
{
public static void main(String args[])
{
int n=args.length;
System.out.print("No of args="+n);
System.out.print("The args arre:");

for(int i=0;i<n;i++)
{
System.out.println(args[i]);
}
}
}