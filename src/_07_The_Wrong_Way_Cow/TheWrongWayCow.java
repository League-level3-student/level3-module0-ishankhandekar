/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Taskx
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
    	int howManyCows = 0;
    	String cowArray[] = {null,null,null};  
        for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field.length; j++) {
				if (howManyCows == 4) {
					break;
				}
				if (field[i][j] == 'c') {
					if (i<field.length-1&&field[i+1][j] == 'o') {
						howManyCows++;
						cowArray[howManyCows-1] = "u"+ i + j;
					}
					if ( i>field.length-1&&field[i-1][j] == 'o' ) {
						howManyCows++;
						cowArray[howManyCows -1] = "d"+ i + j;
					}
					if ( j<field.length-1&&field[i][j+1] == 'o') {
						howManyCows++;
						cowArray[howManyCows - 1] = "r"+ i + j;
					}
					if (j>field.length-1&&field[i][j-1] == 'o') {
						howManyCows++;
						cowArray[howManyCows -1 ] = "l"+ i + j;
					}
				}
			}	
		}
        int howManyCharacters = 0;
        int number = 0;
        for (int i = 0; i < 3; i++) {
			if (cowArray[i].charAt(0) == 'u') {
				howManyCharacters++;
				number = i;
			}
		}
        if (howManyCharacters == 1) {
        	int array[] = {(int)cowArray[number].charAt(1),(int)cowArray[number].charAt(2)};
        	System.out.println(array);
        	 return array;
		}
        for (int i = 0; i < 3; i++) {
			if (cowArray[i].charAt(0) == 'd') {
				howManyCharacters++;
				number = i;
			}
		}
        if (howManyCharacters == 1) {
        	int array[] = {(int)cowArray[number].charAt(1),(int)cowArray[number].charAt(2)};
        	System.out.println(array);
        	 return array;
		}
        for (int i = 0; i < 3; i++) {
			if (cowArray[i].charAt(0) == 'l') {
				howManyCharacters++;
				number = i;
			}
		}
        if (howManyCharacters == 1) {
        	int array[] = {(int)cowArray[number].charAt(1),(int)cowArray[number].charAt(2)};
        	System.out.println(array);
        	 return array;
        	 
		}
        for (int i = 0; i < 3; i++) {
			if (cowArray[i].charAt(0) == 'r') {
				howManyCharacters++;
				number = i;
			}
		}
        if (howManyCharacters == 1) {
        	int array[] = {(int)cowArray[number].charAt(1),(int)cowArray[number].charAt(2)};
        	System.out.println(array);
        	 return array;
		}
       return null;
       
    }
}
