import java.io.*;
class EvenOdd
{
public static void main(String args[])throws IOException
{
InputStreamReader in=new InputStreamReader(System.in);
char ch;
do
{
System.out.println("\f");
BufferedReader br=new BufferedReader(in);
System.out.println("Enter a number.");
int num=Integer.parseInt(br.readLine());
int ecount=0;
int ocount=0;
for(int i=1;i<=num;i++)
{
if(i%2==0)
{
ecount++; 
}
else
{
ocount++;
}
}
System.out.println("The total even numbers are: "+ecount); 
System.out.println("The total odd numbers are: "+ocount);
System.out.println("Do u want to continue(y/n)");
ch=(char)br.read();
}while(ch=='y'||ch=='Y');
}
}