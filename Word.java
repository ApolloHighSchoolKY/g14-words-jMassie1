import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Word
{
	//Instance field (variable)
	private String word;

	//Class field(variable)
	private static final String VOWELS = "AEIOUaeiou";   //static means only one


	public Word()
	{
		word = "";
	}

	public Word(String newWord)
	{
		setWord(newWord);
	}

	public void setWord(String newWord)
	{
		word = newWord;
	}

	public int getNumVowels()
	{
		int count = 0;
		
		//Loop for every letter in "word"
		for(int i = 0; i<= word.length()-1; i++)
		{
			//Use indexOf to see if the letter is in the string "vowels"
			if(VOWELS.indexOf(word.charAt(i)) != -1)
				count++;

		}	

		
		return count;
		
	}

	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
		String returnString = "";

		returnString = "\n" + word + "\n";
		returnString += word + " Number of vowels == " + getNumVowels() + "\n";
		returnString += word + " Length == " + getLength() + "\n";

	   return "" + word + "";
	}
}