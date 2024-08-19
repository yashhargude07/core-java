import java.lang.*;
class reves_order
{
public static void main(String args[])

{
String str="Java",nstr="  ";
char ch;
System.out.print("Orignal word:");
System.out.println("Java");

for(int i=0;i<str.length();i++)
{
ch=str.charAt(i);
nstr=ch+nstr;
}
System.out.println("Revesed word:"+nstr);
}
}