//*This program is to calculate the charge on the transportation of the parcel(DTDC)*/
import java.io.*;
class ParcelDTDC
{
public static void main(String args[])throws IOException
{
char ch;
InputStreamReader in=new InputStreamReader(System.in);
do
{
System.out.println("\f");
BufferedReader br=new BufferedReader(in);
BufferedReader br1=new BufferedReader(in);
System.out.println("Enter the grams(grams) of the parcel.");
int grams=Integer.parseInt(br.readLine());
double charge=0.0;
if(grams<=100)
{
System.out.println("The charge of the transportation is Rs.30");                                         
}
else
{
int h,m,d,f;
m=grams-100;
d=m/50;
f=d*10;
int rem=m%50;
if(rem==0)
{
h=0;        
}
else
{
h=10;
}
charge=30+f+h;
System.out.println("The charge of the transportation to be paid is "+charge); 
}
System.out.println("Do you want to continue(y/n)");
ch=(char)br1.read();
}while(ch=='y'||ch=='Y');
}
}
