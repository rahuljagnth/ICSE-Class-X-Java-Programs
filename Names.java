//* This program is used to arrange the given names by the user in alphabetic order.*/
import java.io.*;
class Names
{
public static void main(String args[])throws IOException
{
InputStreamReader in=new InputStreamReader (System.in);
char ch;
do
{
System.out.println("\f");
BufferedReader br=new BufferedReader(in);
BufferedReader br1=new BufferedReader(in);
String n[]=new String[10];
int a=0;
for(int i=0;i<10;i++)
{
System.out.println("Enter any 10 names.");
n[i]=br.readLine();
}
System.out.println("Enter the first character of the name to be searched.");
char b=(char)(br.read());
for(int i=0;i<10;i++)
{
String c=n[i];
if(c.charAt(0)==b)
{
System.out.println("They are:");
System.out.println(n[i]);
a=a+i;
}
}
if(a==0)
{
System.out.println("The name is not found.");
}
System.out.println("Do you want to continue(y/n)");
ch=(char)br1.read();
}while(ch=='y'||ch=='Y');
}
}