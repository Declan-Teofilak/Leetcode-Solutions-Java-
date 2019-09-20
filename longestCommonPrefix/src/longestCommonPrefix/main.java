package longestCommonPrefix;

public class main {

	public static void main(String[] args) {
		String[] test = {"flower", "flow", "flight"};
		longestCommonPrefix(test);

	}
	public static String longestCommonPrefix(String[] strs)
	{
		int a = 0;
		String prefix = "";
		for (String s : strs)
		{
		for (int i = 0; i < strs.length; i++)
		{
		while (s.charAt(a) == strs[i].charAt(a))
		{
			a++;
		}
		}
		}
		System.out.print(a);
		return prefix;
	}

}
