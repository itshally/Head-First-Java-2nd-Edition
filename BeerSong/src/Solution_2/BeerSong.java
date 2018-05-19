/*
 * This is the solution I made up. It is a long and kind of complicated one, I know,
 * but I just want to try doing another solution.
 * */

package Solution_2;

public class BeerSong {

	public static void main(String[] args) {
		String i = "";
		int count = 100;

		while(count > 3) {
				count = count - 1;
				System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer.");
				System.out.println("Take one down and pass it around, " + (count - 1) +" bottles of beer on the wall.\n");
		
			}//end of while loop
		
		if(count > 2) {
				i = "bottle";
				count = count - 1;
				System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer.");
				System.out.println("Take one down and pass it around, " + (count - 1) + " " + i +" of beer on the wall.\n");
			}
				
		
		if(count > 1) {
				i = "bottle";
				count = count - 1;
				System.out.println(count + " bottle of beer on the wall, " + count + " bottle of beer.");
				System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
			}
		
		if(count > 0) {
				System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
				System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall. \n");
			}
			
		}//end of main method
		
	}//end of class