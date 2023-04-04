/* Write a Program for Calculating the Fare of a Taxi
Km                      Fare
1 - 25					Rs 5
26 - 40					Rs 7
41 - 50 				Rs 8
51 - 55 				Rs 9
>55 					Rs 10
*/

import java.util.*;
class TaxiFares
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int km, fare;
		
		km = 0;
		fare = 0;

		System.out.println("Enter no of km:");
		km = sc.nextInt();

		if(km>=1 && km<=25)
		{
			fare = 5;
		}
		else if (km>=26 && km<=40)
		{
			fare = (25*5) + ((km-25)*7);
		}
		else if (km>=41 && km<=50)
		{
			fare = (25*5) + (15*7) + ((km-40)*8);
		}
		else if (km>=51 && km<=55)
		{
			fare = (25*5) + (15*7) + (10*8) + ((km-50)*9);
		}
		else if (km>55)
		{
			fare = (25*5) + (15*7) + (10*8) + (5*9) + ((km-55)*10);
		}
		else
		{
			System.out.println("Invalid Output");
		}

		fare += (fare *0.18); 
		fare += (fare *0.02);
	
		System.out.println("Entered km:" +km);
		System.out.println("Fare:"+fare);
	}
}