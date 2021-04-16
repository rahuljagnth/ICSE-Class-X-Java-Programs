//* This program is to take a word from the user and print it in triangle or an inverted triangle pattern depending on the user's choice.*/ 
import java.io.*;
class Pattern
{
public static void main(String args [])throws IOException
{
InputStreamReader in=new InputStreamReader(System.in);
char ch;
char cha;
do
{
System.out.println("\f");
BufferedReader br=new BufferedReader(in);
BufferedReader br1=new BufferedReader(in);
BufferedReader br2=new BufferedReader(in);
System.out.println("Enter a word.");
String str=br.readLine();
int l=str.length();
System.out.println("Enter 1 for Tiangle");
System.out.println("Enter 2 for Inverted Triangle");
int choice=Integer.parseInt(br1.readLine());
switch(choice)
{
case 1:
{
System.out.println("The triangle pattern is ");
for(int i=0;i<=l;i++)
{
for(int j=0;j<=i;j++)
{
ch=str.charAt(j);
System.out.print(ch);
}
System.out.println();
}
break;
}
case 2:
{
System.out.println("The inverted triangle pattern is ");
for(int i=l;i>=1;i--)
{
for(int j=0;j<=i;j++)
{
ch=str.charAt(j);
System.out.print(ch);
}
System.out.println();
}
break;
}
default:
{
System.out.println("Invalid choice");
break;
}
}
System.out.println("Do you want to continue(y/n)");
cha=(char)br2.read();
}while(cha=='y'||cha=='Y');
}
}

