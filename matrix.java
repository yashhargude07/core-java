import java.lang.*;
class matrix
{
public static void main(String args[])
{
int i,j;
int array[][]={{1,2,3},{4,5,6},{7,8,9}};

System.out.println("Transpose of matrix is:");

for(i=0;i<3;i++)
{
for(j=0;j<3;j++)

{
System.out.print(array[j][i]+" ");
}
System.out.println(" ");

System.out.println(" ");
}
}
}