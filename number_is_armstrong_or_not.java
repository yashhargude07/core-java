import java.lang.*;
import java.io.*;
import java.util.*;

class number_is_armstrong_or_not

{
public static void main(String args[])
{
int check,rem=0;
int sum=0,num;
System.out.println("Enter the number to check armstrong or not");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
check=num;
while(check!=0)
{
rem=check%10;
sum=sum+(rem*rem*rem);
check=check/10;

}
if(num==sum)
System.out.println("The number is armstrong");
else
System.out.println("The number is not armstrong");
}
}