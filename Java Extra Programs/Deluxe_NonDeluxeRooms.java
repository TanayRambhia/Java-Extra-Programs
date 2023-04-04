/* Write a Program for Calculating the Fare of Deluxe and Non Deluxe Rooms
For Deluxe Rooms:
Days                    Fare/Day
First 3 Days			Rs 1500
First 5 Days			Rs 1250
First 8 Days			Rs 1000

For Non-Deluxe Rooms:
Days                    Fare/Day
First 4 Days			Rs 1000
First 6 Days			Rs 850
First 10 Days			Rs 700
*/

import java.util.*;
class Deluxe_NonDeluxeRooms
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int days, fare;
		char rmtyp;
		
		days = fare = 0;
		rmtyp = '';

		System.out.println("Enter no of days:");
		days = sc.nextInt();
		System.out.println("Enter Room Type:");
		rmtyp = sc.next.charAt(0);

		if(rmtyp == 'D' || rmtyp=='d')
		{
			if(days>=1 && days<=3)
			{
				fare = 1500;
			}
			else if (days>=4 && days<=8)
			{
				fare = (1500) + ((days-3)*1250);
			}
			else if (days>8)
			{
				fare = (1500) + (1250*5) + ((days-3)*1250);
			}
			else
			{
				System.out.println("Invalid Output");
			}
		}
		else if(rmtyp == 'N' || rmtyp=='n')
		{
			if(days>=1 && days<=4)
			{
				fare = 1000;
			}
			else if (days>=5 && days<=10)
			{
				fare = (1000) + ((days-4)*850);
			}
			else if (days>10)
			{
				fare = (1000) + (850*6) + ((days-10)*700);
			}
			else
			{
				System.out.println("Invalid Output");
			}
		}
		else
		{
			System.out.println("Invalid Output");
		}
		
		System.out.println("Room Type:" +rmtyp)
		System.out.println("Days:" +days);
		System.out.println("Fare:"+fare);
	}
}