import java.util.Random;

class Dicegame
{
    public static void main(String args[])
    {
	int num;
	int sum = 0;
	
	System.out.println("Rolling the dice...");

	for(int i = 0; i < 2; i++)
	    {
		num = new Random().nextInt(6) + 1;
		sum += num;
		System.out.println("Die " + (i+1) + ": " + num);	
	    }

	System.out.println("Total value: " + sum);
    }
}
