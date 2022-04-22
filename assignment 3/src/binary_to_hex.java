// Binary to Hex conversion from user input
// by Kristopher Smolarek (CSC250)

import java.util.Scanner;

public class binary_to_hex
{
	public static void main(String[] args)
	{
		String user_binary = getBinary();
		System.out.println();
		System.out.println("The binary input is: " + user_binary);
		String Hex = hexConvert(user_binary);
		userOutput(Hex);
	}
	static String getBinary()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a binary number: ");
		String user_binary = input.nextLine();
		input.close();
		return user_binary;
	}
	static String hexConvert(String user_binary)
	{
		// convert user_binary to type int, base 2 (number to convert, base)
		int user_int = Integer.parseInt(user_binary, 2);
		String Hex = Integer.toHexString(user_int);
		return Hex;
	}
	static void userOutput(String Hex)
	{
		System.out.println("The hexadecimal equivilent is: " + Hex.toUpperCase());
	}
}