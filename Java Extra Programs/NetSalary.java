/* Write a Program for Calculating the Net Salary
For Deluxe Rooms:
sal                    Fare/Day
First 3 sal			Rs 1500
First 5 sal			Rs 1250
First 8 sal			Rs 1000

*/

import java.util.*;
class NetSalary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int sal;
		double hra,ea,it,da,pf,perks,netsal,ded;
		
		sal = 0;
		hra=ea=it=da=pf=perks=netsal=ded =0.0;

		System.out.println("Enter Salary:");
		sal = sc.nextInt();

		if(sal>=0 && sal<=10000)
		{
			hra = (2.12/100.0)*sal;
			ea = 2129.0;
			it = (10.0/100.0) * sal;
		}
		else if (sal>=10001 && sal<=25000)
		{
			hra = (3.34/100.0)*sal;
			ea = 3233.0;
			it = (12.5/100.0) * sal;	
		}
		else if (sal>=25001 && sal<=50000)
		{
			hra = (4.45/100.0)*sal;
			ea = 4321.0;
			it = (15.0/100.0) * sal;	
		}
		else if (sal>=50001 && sal<=100000)
		{
			hra = (5.58/100.0)*sal;
			ea = 5625.0;
			it = (17.5/100.0) * sal;	
		}
		else if (sal>=100001)
		{
			hra = (6.61/100.0)*sal;
			ea = 6385.0;
			it = (20.5/100.0) * sal;	
		}
		else
		{
			System.out.println("Invalid Output");
		}
		
		da = (3.29/100.0)*sal;
		pf = 2623.0;
		perks = hra + da + ea;
		ded = pf + it;
		netsal = sal + perks - ded; 

		System.out.println("Salary:" +sal);
		System.out.println("HRA:" +hra);
		System.out.println("EA:"+ea);
		System.out.println("DA:"+da);
		System.out.println("IT:"+it);
		System.out.println("PF:"+pf);
		System.out.println("Perks:"+perks);
		System.out.println("Deduction:"+ded);
		System.out.println("Net Salary:"+netsal);
	}
}