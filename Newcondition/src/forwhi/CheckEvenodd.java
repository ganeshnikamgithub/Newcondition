package forwhi;

public class CheckEvenodd {
	public static void main(String[] args)
	{
	    int i=1;
		System.out.println("\tOdd Noumber: " + "\t Even Number:");
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.println("\t\t\t" + i);
			}
			if(i%2==1) 
			{
				System.out.println("\t" + i);
	      	}
			i++;
	}
	}
}

