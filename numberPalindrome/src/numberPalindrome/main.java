package numberPalindrome;
//SUCCESS
public class main {
	public static void main(String[] args)
	{
		int num = 123321;
		System.out.println(isPalindrome(num));
	}
    public static boolean isPalindrome(int x) {
    	//return false if negative because of "-"
    	if (x < 0)
    	{
    		return false;
    	}
    	//convert to string
        String newNum = Integer.toString(x);
        //create usable length
        int a = newNum.length() - 1;
        //set to true incase single digit
        boolean answer = true;
        //loop through string by character
        for (int i = 0; i < newNum.length(); i++)
        {
        	//c is first num
        	char c = newNum.charAt(i);
        	//if met in the middle end loop
        	if (a == i)
        	{
        		return answer;
        	}
        	
        	//if first loop through
        	if (i == 0)
        	{
        	//check if first and last char the same
        	if (c == newNum.charAt(a))
        	{
        	}
        	else
        	{
        		return answer = false;
        	}
        	}
        	//for every other loop
        	if (i != 0)
        	{
        	//check if every other char the same, redundant?
        	if (c == newNum.charAt(a))
        	{
        	}
        	else
        	{
        		return answer = false;
        	}
        	}
        	//shrink length counter
        	a--;
        }
        //return final answer
        return answer;
    }
}
