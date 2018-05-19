/*
 * This code is my answer from the book.
 * */

package Solution_1;


public class BeerSong {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum > 0) {
			
			System.out.print(beerNum + " " + word + " of beer on the wall, ") ;
			
			System.out.print(beerNum + " " + word + " of beer.\n");
			
			beerNum = beerNum - 1;
		
			if(beerNum == 1) {
				word = "bottle"; //singular, as in ONE bottle.
			} 
			
			System.out.print("Take one down and pass it around, "); 
			
			if(beerNum > 0) {
				System.out.print(beerNum + " "+ word +" of beer on the wall.\n\n");}
			else {
				System.out.print("no more bottles of beer on the wall \n\n") ;
			}//end else
			
		}//end while loop
		
		System.out.println("No more bottles of beer on the wall, no more bottles of beer. \r\n" + 
				"Go to the store and buy some more, 99 bottles of beer on the wall.");
	
	}//end main method
	
}//end class







