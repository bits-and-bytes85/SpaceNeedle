/* Shriya Gautam
   Peterson P1
   9/27/21
   This program creates an ASCII replica of the Space Needle
*/
public class SpaceNeedle {
	public static final int Size = 4; // class constant
	public static void main(String[] args) { // including each of the methods for each part
		Line();
		TopPart();
		MiddlePart();
		BottomPart();
		Line();
		TowerPart();
		TopPart();
		MiddlePart();
		

	}
	public static void Line() { //creates the needle part at the very top
		
		for (int j = 0; j < Size; j++) {
			for (int i = 1; i <= Size*3; i++) {
				System.out.print(" ");
			
			} 
			System.out.println("||");
		}
	}
	
	public static void TopPart() { // creates the top part of the Space Needle head
		for (int i = 0; i < Size; i++) { //goes through each row
			for (int j = Size - 1; j > i; j--) { //spaces
				System.out.print("   ");
			}	
			System.out.print("__/");	
			for (int j = 0; j < i; j++ ) { //left dots
					System.out.print(":::");
				}
			System.out.print("||");
			for (int j = 0; j < i; j++ ) {
					System.out.print(":::");
			}
			System.out.print("\\__");
			
			System.out.println("");
			}
		}
	public static void MiddlePart() {	// creates the middle line that represents the windows
		System.out.print("|");
		for (int i = 0; i < Size*6; i ++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	public static void BottomPart() { // Bottom part of the head of the space needle
		for (int row = 0; row < Size; row++) { // iterating each row 
			for (int j = 0; j < row; j++) { //placing the spaces
				System.out.print("  ");
			}	
			System.out.print("\\_");
			for (int x = (Size * 2) + Size ; x > (row*2)+ 1 ; x --) { //changing number of /\ printed
						System.out.print("/\\");
			}
			System.out.print("_/");
			System.out.println(" ");
			}
		}
	
			
			
						
		
	public static void TowerPart() { //creates the tower holding up the head
		for (int j = 0; j < Size*Size; j++) { // iterates through row number, depending on static variable
			for (int i = 1; i <= (Size*3)-3; i++) {
				System.out.print(" ");
			
			} 
			System.out.println("|%%||%%|");
		}
	}
	}


