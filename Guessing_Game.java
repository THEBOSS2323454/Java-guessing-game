import java.util.Random;

import TurtleGraphics.KeyboardReader;
public class Guessing_Game {

	public static void main(String[] args) 
	{
		KeyboardReader reader = new KeyboardReader();
		Random Rnjesus = new Random();
		int secret, guess, count, max;
		
		
		char gains;
		
		
		System.out.println("Guessing Game");
		do 
		{
			count=0;
		System.out.println("please enter a maximum guess");
		max=reader.readInt();
		secret= Rnjesus.nextInt(max)+1;
		do 
			
		{
			count++;
			System.out.println("please enter a number from 1 - "+max+" (0 to give up)");
			guess=reader.readInt();
			if ((guess<secret)&&(guess>0)&&(guess<=max))
			{
				System.out.println("too low");
				
			}
			if ((guess>secret)&&(guess>0)&&(guess<=max))
			{
				System.out.println("too high");
				
			}
			if((guess<0)||(guess>max))
			{
				System.out.println("invalid input");
				count=count-1;
			}
		}
		
		while ((secret!=guess)&&(guess!=0));
		
		
		if (guess==0)
		{
			System.out.println("you gave up after "+(count-1)+" tries");
		}
		else if (guess==secret)
		{
			System.out.println("congrats you did it in "+count+" tries");
		}
		System.out.println("Play again (y/n)");
		gains=reader.readChar();
		}while(gains!='n');
		System.out.println("the game is over");
	}

}