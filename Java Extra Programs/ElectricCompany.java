/* Write a Program for Calculating the bill by taking the unit of power
Units                   Rate/Unit
1 - 500 				Rs 2.75
501 - 1250				Rs 3.50
1251 - 2250				Rs 4.25
2251 - 3500				Rs 5.00
>3500					Rs 6.25
*/

import java.util.*;
class ElectricCompany
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int units;
		double bill;
		
		units = 0;
		bill = 0.0;

		System.out.println("Enter no of units:");
		units = sc.nextInt();

		if(units>=1 && units<=500)
		{
			bill = units*2.75;
		}
		else if (units>=501 && units<=1250)
		{
			bill = (500*2.75) + ((units-500)*3.50);
		}
		else if (units>=1251 && units<=2250)
		{
			bill = (500*2.75) + (750*3.50) + ((units-1250)*4.25);
		}
		else if (units>=2251 && units<=3500)
		{
			bill = (500*2.75) + (750*3.50) + (100*4.25) + ((units-2250)*5.00);
		}
		else if (units>3500)
		{
			bill = (500*2.75) + (750*3.50) + (100*4.25) + (1250*5) + ((units-3500)*6.75);
		}
		else
		{
			System.out.println("Invalid Output");
		}

		System.out.println("Entered units:" +units);
		System.out.println("Bill:"+bill);
	}
}