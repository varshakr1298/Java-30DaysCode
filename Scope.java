package codingworld;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Scope {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    Scope(int[] elements){
        this.elements=elements;
    }
    public void computeDifference(){
        Arrays.sort(elements);
        this.maximumDifference=Math.abs(elements[elements.length-1]-elements[0]);
    }

} // End of Difference class
