//* This program is used print the binominal co-efficient taking the values of m and n.*/
import java.io.*;
class Binominal
{
public static int fact(int k)
{
int f=1;
for(int i=1;i<=k;i++)
f=f*i;
return(f);
}
public static void main(String args[])throws IOException
{
System.out.println("\f");
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
BufferedReader br1=new BufferedReader(in);
int a;
int b;
int c;
int d;
int e;
int f;
System.out.println("Enter the values");
b=Integer.parseInt(br.readLine());
a=Integer.parseInt(br.readLine());
f=fact(b);
c=fact(a);
e=fact(b-a);
d=f/(c*e);
System.out.println("Binominal co-efficient is "+d);
}
}