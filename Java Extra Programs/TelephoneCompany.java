/* Write a Program for Calculating the charges of call by taking the charge per call
calls                   Rate/Unit
1 - 400 				Rs 500
401 - 1000				Rs 2/call
1001 - 1500				Rs 3/call
1501 - 2200				Rs 4/call
>220					Rs 5/call
*/

import java.util.*;
class TelephoneCompany
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int calls;
		double bill;
		
		calls = 0;
		bill = 0.0;

		System.out.println("Enter no of calls:");
		calls = sc.nextInt();

		if(calls>=1 && calls<=400)
		{
			bill = 500;
		}
		else if (calls>=401 && calls<=1000)
		{
			bill = (500) + ((calls-400)*2);
		}
		else if (calls>=1001 && calls<=1500)
		{
			bill = (500) + (600*2) + ((calls-1000)*3);
		}
		else if (calls>=1501 && calls<=2200)
		{
			bill = (500) + (600*2) + (500*3) + ((calls-1500)*4);
		}
		else if (calls>2200)
		{
			bill = (500) + (600*2) + (500*3) + (700*4) + ((calls-2200)*5);
		}
		else
		{
			System.out.println("Invalid Output");
		}

		bill += (18.0/100.0)*bill;
		System.out.println("Entered calls:" +calls);
		System.out.println("Bill:"+bill);
	}
}