import java.util.*;
import java.util.Scanner;
class dipak
{
	

	public static void main(String args[])
	{
	        String str= "Gauhati University ";
	        char a = 'a';char c = 'c';char e = 'e';char g = 'g';char h = 'h';char i = 'i';char l = 'l';char n = 'n';char o = 'o';char r = 'r';char s = 's';char t = 't';char u = 'u';char v = 'v';char y = 'y';
			        
System.out.println("string is = "+str);
System.out.println(" Ocurance character of this string are as follows ->");	
System.out.println("\n");
System.out.println("a="+cout(str, a)+"\n"+"c="+cout(str, c)+"\n"+"e="+cout(str, e)+"\n"+"g="+cout(str, g)+"\n"+"h="+cout(str, h)+"\n"+"i="+cout(str, i)+"\n"+"l="+cout(str, l)		+"\n"+"n="+cout(str, n)+"\n"+"o="+cout(str, o)+"\n"+"r="+cout(str, r)+"\n"+"s="+cout(str, s)+"\n"+"t="+cout(str, t)+"\n"+"u="+cout(str, u)+"\n"+"v="+cout(str, v)+"\n"+"y="+cout(str, y));
	 
System.out.println("To capitalise");
Scanner sc=new Scanner(System.in);
 System.out.println("\n");
 String cde=sc.nextLine();
 String[] asd=cde.split(" ");
 System.out.println("string is ->");
 System.out.println("\n");
	for(String x:asd)
	{
		int abc=0;
		for(Character ch:x.toCharArray())
		{
			if(abc%2==0)
			System.out.print(Character.toUpperCase(ch));
			else
			System.out.print(Character.toLowerCase(ch));
			abc++;
		}
		System.out.print(" ");
		                   }
          	}  



public static int cout(String s, char c)
{
	int res = 0;
for (int i=0; i<s.length(); i++)
		{
		if (s.charAt(i) == c)
		res++;
	} 
		return res;
	}
 
}
