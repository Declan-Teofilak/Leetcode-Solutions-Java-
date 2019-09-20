//takes input of a string roman numeral and converts it to an integer

package romanToInteger;
//SUCCESS
public class main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String r = "XXXI";
		System.out.println(romanToInt(r));

	}
	public static int romanToInt(String s)
	{
		//workable length
		int l = s.length() - 1;
		//initialize number to return
		int converted = 0;
		for (int i = 0; i <= l; i++)
		{
			//if I
			//jumps in, checks following numeral incase of V or X
			//adjusts index if needed and adds to converted
			///repeat for all numerals
			if (s.charAt(i) == 'I')
			{
				
				if (l != i && s.charAt(i + 1) == 'V')
				{
					converted = converted + 4;
					//moves counter up to to skip V
					i++;
				}
				else if (l != i && s.charAt(i + 1) == 'X')
				{
					converted = converted + 9;
					i++;
				}
				else
				{
					converted = converted + 1;
				}
						
			}
			//if V
			else if (s.charAt(i) == 'V')
			{
				
				converted = converted + 5;
			}
			//if X
			else if (s.charAt(i) == 'X')
			{
				
				if (l != i && s.charAt(i + 1) == 'L')
				{
					converted = converted + 40;
					i++;
				}
				else if (l != i && s.charAt(i + 1) == 'C')
				{
					converted = converted + 90;
					i++;
				}
				else
				{
				converted = converted + 10;
				}

			}
			//if L
			else if (s.charAt(i) == 'L')
			{
				
				converted = converted + 50;
			}
			//if C
			else if (s.charAt(i) == 'C')
			{
				
				if (l != i && s.charAt(i + 1) == 'D')
				{
					converted = converted + 400;
					i++;
				}
				else if (l != i && s.charAt(i + 1) == 'M')
				{
					converted = converted + 900;
					i++;
				}
				else
				{
				converted = converted + 100;
				}
			}
			//if D
			else if (s.charAt(i) == 'D')
			{
				
				converted = converted + 500;
			}
			//if M
			else if (s.charAt(i) == 'M')
			{
				
				converted = converted + 1000;
			}

		}
		//returns final number
		return converted;
	}

}
