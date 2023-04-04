/* Write a Program for Calculating the book charge by taking the no of days required to return the book
Days                    Fine
1 - 7					No Fine
8 - 20					Rs 5/day
21 - 37 				Rs 10/day
38 - 58 				Rs 15/day
>58 					Rs 20/day
*/

import java.util.*;
class LibraryCharges
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int days, fine;
		
		days = 0;
		fine = 0;

		System.out.println("Enter no of days:");
		days = sc.nextInt();

		if(days>=1 && days<=7)
		{
			fine = 0;
		}
		else if (days>=8 && days<=20)
		{
			fine = (0) + ((days-7)*5);
		}
		else if (days>=21 && days<=37)
		{
			fine = (0) + (5*13) + ((days-20)*10);
		}
		else if (days>=38 && days<=58)
		{
			fine = (0) + (5*13) + (17*10) + ((days-38)*15);
		}
		else if (days>58)
		{
			fine = (0) + (5*13) + (17*10) + (21*15) + ((days-38)*15);
		}
		else
		{
			System.out.println("Invalid Output");
		}

		System.out.println("Entered days:" +days);
		System.out.println("Fine:"+fine);
	}
}