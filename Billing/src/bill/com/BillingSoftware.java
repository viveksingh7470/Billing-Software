package bill.com;
import java.util.ArrayList;
import java.util.Scanner;

class Bills
{
	int id;
	private String item;
	int price;
	private int quntity;
	private int total;

	public Bills(int id,String item, int price,int quntity, int total) {
		super();
		this.id=id;
		this.item = item;
		this.price=price;
		this.quntity = quntity;
		this.total = total;
	}
	
	@Override
	public String toString() 
	{
		return id+"   "+item+"               " + price + "                      " + quntity + "            "+total;



	}

}
public class BillingSoftware 
{

	public static void main(String[] args)
	{
		int price=0;
		int total=0;
		int grend=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Customer Name");
		String name=sc.nextLine();
		System.out.println("Enter the Customer Mobile No");
		Long mobile=sc.nextLong();
		ArrayList<Bills> someItem = new ArrayList<Bills>();
		char quit = 'Y';
		while (quit == 'Y')
		{
			System.out.println("Chose your Favorite item");
			System.out.println("1 Coffe\n2 Black Coffe\n3 Tee\n4 Dosa\n5 Pani Puri\n6 Milk");
			System.out.println("Enter the item id");
			int id=sc.nextInt();
			String item="";

			System.out.println("Enter the quntity");
			int quntity=sc.nextInt();

			switch(id)
			{    
			case 1:

				item="Coffe";

				total=10*quntity;
				price=10;
				System.out.println(price);
				System.out.println(quntity);
				System.out.println(total);
				break; 
			case 2:

				item="Black Coffe";
				total=100*quntity;
				price=100;
				System.out.println(price);
				System.out.println(quntity);
				System.out.println(total);
				break;
			case 3:

				item="Tee";
				total=10*quntity;
				price=10;
				System.out.println(price);
				System.out.println(quntity);
				System.out.println(total);
				break;
			case 4:

				item="Dosa";
				total=55*quntity;
				price=55;
				System.out.println(price);
				System.out.println(quntity);
				System.out.println(total);
				break;
			case 5:

				item="Pani Puri";
				total=30*quntity;
				price=3;
				System.out.println(price);
				System.out.println(quntity);
				System.out.println(total);
				break;
			case 6:

				item="Milk";
				total=20*quntity;
				price=20;
				System.out.println(price);
				System.out.println(quntity);
				System.out.println(total);
				break;
			default:     
				System.out.println("No item ");
			}

			someItem.add (new Bills(id,item, price,quntity,total));
			System.out.print(" Enter Another Record? (Y/N)");
			String word = sc.next();
			word = word.toUpperCase();
			quit= word.charAt(0);
			grend +=total;	
		}  

		System.out.println("				*******MS Coffe Shop*******");
		System.out.println(" Customer Name  :"+name);
		System.out.println(" Customer Name  :"+mobile);
		System.out.println("__________________________________________________________________________________");
		System.out.println();
		System.out.println("***Item Name ***    "+"***Item price ***    "+"*** Quntity***    "+"***Total***");
		for(Bills stuff : someItem)
		{

			System.out.println(stuff);

		}
		System.out.println("__________________________________________________________________________________");

		System.out.println("                                             Grand Total       "+grend);
	}

}
