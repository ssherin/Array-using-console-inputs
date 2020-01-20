//wajp to read n marks and find 1) sum  2) avg  3) highest 4) lowest
// using arrays

import java.io.*;
import java.util.*;
class Pr1{
	public static void main(String[] args) {		//declarations
		int n, sum, high, low, marks[];				//array reference marks[]
		double avg;
		Console c= System.console();				//declarations

		n = Integer.parseInt(c.readLine("enter no. of students"));			//array creation
		marks = new int[n];
		for (int i =0;i<n ;i++ ) {											//reading marks
			marks[i]= Integer.parseInt(c.readLine("enter marks"));

			sum= 0;															//sum and avg
			for(int m: marks)
					sum = sum+m;
			avg = sum * 1.0/n;
			

				System.out.println("sum "+sum);	
				System.out.println("avg "+avg);
				System.out.printf("sum = %d ",sum);	
				System.out.printf("avg = %.2f",avg);


			
				Arrays.sort(marks);
				low = marks[0];
				high = marks[marks.length - 1];
				System.out.println("lowest "+ low+ " highest "+high);
			
			}


		}
	}
