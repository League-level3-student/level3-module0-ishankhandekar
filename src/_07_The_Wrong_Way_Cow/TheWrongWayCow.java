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

import java.util.ArrayList;
import java.util.Arrays;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
    	
    	ArrayList<String> cowArrayUp = new ArrayList(); 
    	ArrayList<String> cowArrayDown = new ArrayList(); 
    	ArrayList<String> cowArrayLeft = new ArrayList(); 
    	ArrayList<String> cowArrayRight = new ArrayList(); 
        for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				
				if (field[i][j] == 'c') {
					if (i<field.length-1&&field[i+1][j] == 'o') {
						
						cowArrayUp.add(""+ i + " " + j);
					}
					if ( i>0&&field[i-1][j] == 'o' ) {
						
						cowArrayDown.add(""+ i +" "+ j) ;
					}
					if ( j<field[i].length-1&&field[i][j+1] == 'o') {
						
						cowArrayLeft.add(""+ i +" "+ j) ;
					}
					if (j>0&&field[i][j-1] == 'o') {
						
						cowArrayRight.add(""  +i +" "+ j);
					}
				}
			}	
		}
        
        int array[] = new int[2];
        if (cowArrayUp.size() == 1) {
			array[1] = Integer.parseInt(cowArrayUp.get(0).split(" ")[0]);
			array[0] = Integer.parseInt(cowArrayUp.get(0).split(" ")[1]);
 		}
        if (cowArrayDown.size() == 1) {
        	array[1] = Integer.parseInt(cowArrayDown.get(0).split(" ")[0]);
			array[0] = Integer.parseInt(cowArrayDown.get(0).split(" ")[1]);
		}
        if (cowArrayLeft.size() == 1) {
        	array[1] = Integer.parseInt(cowArrayLeft.get(0).split(" ")[0]);
			array[0] = Integer.parseInt(cowArrayLeft.get(0).split(" ")[1]);
		}
        if (cowArrayRight.size() == 1) {
        	array[1] = Integer.parseInt(cowArrayRight.get(0).split(" ")[0]);
			array[0] = Integer.parseInt(cowArrayRight.get(0).split(" ")[1]);
		}
        System.out.println(cowArrayUp);
        System.out.println(cowArrayDown);
        System.out.println(cowArrayLeft);
        System.out.println(cowArrayRight);
        return array;
        
       
    }
}
