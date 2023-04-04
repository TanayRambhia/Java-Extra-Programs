// Write a Program for Calculating the rent of the cycle
import java.util.*;
class CycleShop
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int days,rent;
		days=rent=0;

		System.out.println("Enter no of days:");
		days = sc.nextInt();

		if(days>=1 && days<=5)
		{
			rent = days*10;
		}
		else if (days>=6 && days<=15)
		{
			rent = (5*10) + ((days-5)*20);
		}
		else if (days>=16 && days<=30)
		{
			rent = (5*10) + (10*20) + ((days-15)*20);
		}
		else if (days>=31 && days<=50)
		{
			rent = (5*10) + (10*20) + (15*30) + ((days-15)*40);
		}
		else if (days>50)
		{
			rent = (5*10) + (10*20) + (15*30) + (20*40) + ((days-50)*50);
		}
		else
		{
			System.out.println("Invalid Output");
		}

		System.out.println("Entered Days:" +days);
		System.out.println("Rent:"+rent);
	}
}