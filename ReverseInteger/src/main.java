//Takes an integer and reverse the output i.e 123 returns 321

public class main {

	public static void main(String[] args) {
			int answer = 123;
			System.out.println(reverse(answer));
			

	}
	public static int reverse(int x)
	//take the number and use % to find out how many places the new digit will be
	//
	{
		//final number
		int newNum = 0;
		//number added to last iteration
		int add = 0;
		//tens place that digit is multiplied by
		int multiplier = 0; 
		//use for first loop to find place
		for (int i = 1; x % i != x; i = i * 10)
		{
			multiplier = i;
		}
		for (int i = multiplier; i != 1; i = i/10)
		{
			add = x % 10;
			System.out.println(add);
			x = x - add;
			System.out.println(x);
			add = add * i;
			System.out.println(add);
			newNum = newNum + add;
			System.out.println(newNum);
		}
		return newNum;
	}

}
