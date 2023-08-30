import java.util.Scanner;

class leapyear
{
public static void main(String[] args)
{
 
int year, month, day;
Scanner input = new Scanner(System.in);

System.out.print("Enter year: ");
year = input.nextInt();
        
System.out.print("Enter month: ");
month = input.nextInt();
       
System.out.print("Enter day: ");
day = input.nextInt();
System.out.print(" "+day+"/"+month+"/"+year+" ");

if (year%400==0)
{
System.out.print("is a leap year");
}
else if(year%100==0)
{
System.out.print("is not a leap year");
}
if (year%4==0)
{
System.out.print("is a leap year.");
}
else
{
System.out.print("is not a leap year.");
}
}
}