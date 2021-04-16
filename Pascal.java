//*This program is to display the Pascal's triangle.*/
import java.io.*;
class Pascal
{
public static void main(String args[])throws IOException
{
char ch;
double p=0;
InputStreamReader in=new InputStreamReader(System.in);
do
{
System.out.println("\f");
BufferedReader br=new BufferedReader(in);
BufferedReader br1=new BufferedReader(in);
System.out.println("Enter the number of times.");
int num=Integer.parseInt(br1.readLine());
System.out.println("1");
for(int i=1;i<=num;i++)
{
p=Math.pow(11,i);
System.out.println(p);
}
System.out.println("Do you want to continue(y/n)");
ch=(char)br.read();
}while(ch=='y'||ch=='Y');
}
}
