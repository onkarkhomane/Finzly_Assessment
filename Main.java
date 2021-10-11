package udemy;
import java.lang.reflect.Array;
import java.util.*;

class CurreencyConversion{
	String name;
	String currency_pair;
	double amount;
	double convertAmount;
}

public class Main{
	static ArrayList<CurreencyConversion> array = new ArrayList<>();
	static double rate = 74.73;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CurreencyConversion cc = new CurreencyConversion();
		
		while(true)
		{
			System.out.println("Book Trade: 1");
			System.out.println("Print Trade: 2");
			System.out.println("Exit: 3");
			
			int ch = sc.nextInt();
			switch (ch) 
			{
			case 1:
				System.out.println("Enter your Name: ");
				cc.name = sc.next();
				System.out.println("Enter Currency Pair: ");
				cc.currency_pair = sc.next();
				if(!cc.currency_pair.equals("USDINR"))
				{
					System.out.println("InValid....!");
				}
				else
				{
					System.out.println("Enter Amount to transfer: ");
					cc.amount = sc.nextDouble();
					System.out.println("Do you want to get rate (Yes / No): ");
					String y = sc.next();
					if(y.equals("Yes"))
					{
						cc.convertAmount = (cc.amount * rate);
						System.out.println("You are transfering INR "+cc.convertAmount + " (Assuming that rate was "+ rate + " )");
					}
					else
					{
						System.out.println(cc.amount);
					}
					System.out.println("Book / Cancle this trade ?");
					String book = sc.next();
					
					if(book.equals("Book"))
					{
						array.add(cc);
						System.out.println("Trade for "+ cc.currency_pair + " has been booked with rate " + rate + ". The amount of Rs. "+cc.convertAmount+ " will be transfered in 2 working days to "+ cc.name);
						
					}
					else
					{
						System.out.println("Trade is cancled");
					}
				}
				break;

			case 2:
				System.out.println("Trade number \t currency_pair \t Name \t Customer Name \t Amount \t Rate");
				for(int j=0; j<array.size(); j++)
				{
					CurreencyConversion cc1 = array.get(j);
					System.out.print(j++ + "\t\t\r"+ cc1.currency_pair + "\t\t\r" + cc1.name + "\t\t\r" + cc1.convertAmount + "\t\t\r" + rate);
					
				}
				
			case 3:
				System.out.println("Do you want to exit? (y/n)");
				char y = sc.next().charAt(0);
				if(y == 'y')
				{
					System.out.println("Bye. Have a good day");
					break;
				}
				
			}
			
		}
		
	}
	
}