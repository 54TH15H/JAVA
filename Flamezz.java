import java.util.Scanner;
public class Flamezz
{
/** FLAMES CALCULATION */
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String n1=new String();
String n2=new String();
int l1,l2,i,j,h,a,b;
char t;
System.out.println("\n ENTER FIRST NAME \n");
n1=in.next();
System.out.println("\n ENTER SECOND NAME \n");
n2=in.next();
l1=n1.length();
l2=n2.length();
char[] N1=new char[l1];
char[] N2=new char[l2];
n1.getChars(0,l1,N1,0);
n2.getChars(0,l2,N2,0);

a=l1;
b=l2;

for(i=0;i<l1;i++)
for(j=0;j<l2;j++)
if(N1[i]==N2[j])
{
a--;
b--;
for(h=j;h<l2-1;h++)
N2[j]=N2[j+1];
l2--;
break;
}

//System.out.println(" AFTER CANCELLING ,WE HAVE "+(a+b)+" CHARACTERS ");
i=(a+b);
System.out.println("\n\n success... \n \n");
if(i==0)
System.out.println(" IT'S NOT POSSIBLE TO DO FLAMES ON THESE NAMES. ");
else if(i==1 || i==16)
System.out.println(" ONE PERSON IS SISTER OF OTHER ");
else if(i==10 || i==19)
System.out.println(" THESE TWO PEOPLES ARE LOVERS. ");
else if(i==8 || i==12 || i==13)
System.out.println(" THERE IS AN ATTRACTION BETWEEN THESE TWO PEOPLE.  ");
else if(i==6 || i==11 || i==15 ||i==17)
System.out.println(" THESE TWO PEOPLE ARE GOING TO MARRY EACH OTHER. ");
else if(i==3 || i==5 || i==14 || i==18)
System.out.println(" THESE TWO PEOPLE ARE FRIENDS FOREVER. ");
else if(i==2 ||i==4 || i==7 || i==9 || i==20)
System.out.println(" THESE TWO PEOPLE ARE ENEMIES.  ");
else
System.out.println(" THIS PROGRAM IS NOT ABLE TO DO. ");
}
}
