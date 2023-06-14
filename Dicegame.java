import java.util.Random;

class Dicegame
{
    public static void main(String args[])
    {
	int num;
	int sum = 0;
	int JADGE = 7;
	
	System.out.println("Rolling the dice...");

	for(int i = 0; i < 2; i++)
	    {
		num = new Random().nextInt(6) + 1;
		sum += num;
		System.out.println("Die " + (i+1) + ": " + num);	
	    }

	System.out.println("Total value: " + sum);

	if(sum > JADGE) System.out.println("You won!");
	else System.out.println("You lost!");
    }
}
