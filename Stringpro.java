//*This program is to perform different string operations.*/
class Stringpro
{
String str;
public Stringpro(String s)
{
str=s;
}
public void count(char c)
{
char ch;
int t=0;
int l=str.length();
for(int i=0;i<l;i++)
{
ch=str.charAt(i);
if(ch==c)
t++;
}
System.out.println("The frequency of the character "+c+" is "+t);
}
public void compare(String s)
{
if(s.compareTo(str)==0)
System.out.println("The Strings are equal.");
else
if(s.compareTo(str)>0)
System.out.println("The string "+s+" is larger than the string "+str);
else
System.out.println("The string "+str+" is larger than string "+s);
}
}