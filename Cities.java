//* This program is used to arrange the given city names by the user in alphabetic order.*/
import java.io.*;
class Cities
{
public static void main(String args[])throws IOException
{
System.out.println("\f");
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
String c[]=new String[10];
char ch;
for(int i=0;i<10;i++)
{
System.out.println("Enter the name of the cities.");
c[i]=br.readLine();
}
for(int i=0;i<9;i++)
{
for(int j=(i+1);j<10;j++)
{
if(c[i].compareTo(c[j])>0)
{
String p=c[i];
c[i]=c[j];
c[j]=p;
}
}
}
System.out.println("The names arranged in alphabetic order is:");
for(int i=0;i<10;i++)
System.out.println(c[i]);
}
}


