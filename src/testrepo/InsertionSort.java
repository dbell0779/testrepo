package testrepo;

/*
 * Dominique Belhumeur
 * 200315589
 * CS203-001
 * Assignment 5 - Question 3
 * Date Completed: December 2, 2016
 */
public class InsertionSort {
	
	public static void main(String[] args){
		int[] intArr={9,23,6,3,83,11,1,7,5,2};
		double[] doubleArr={9.9,3.8,5.2,7.7,1.5,8.8,3.3,6.6,8.3};
		
		//*************** Display insertion sort for integer values***************************
		System.out.println("Integer values in original order: ");
		printArray(intArr);
		System.out.println("Integer values in ascending order: ");
		insertionSort(intArr);
		printArray(intArr);
		//*************** Display insertion sort for double values***************************
		System.out.println("Double values in original order: ");
		printArray(doubleArr);
		System.out.println("Doouble values in ascending order: ");
		insertionSort(doubleArr);
		printArray(doubleArr);
		
	}
	  /** The method for sorting the numbers when given an array of double values*/
	  public static void insertionSort(double[] list) {
	    for (int i = 1; i < list.length; i++) {
	      /** insert list[i] into a sorted sublist list[0..i-1] so that
	           list[0..i] is sorted. */
	      double currentElement = list[i];
	      int k;
	      for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
	        list[k + 1] = list[k];
	      }

	      // Insert the current element into list[k+1]
	      list[k + 1] = currentElement;
	    }
	  }
	  /** The method for sorting the numbers when given an array of integer values*/
	  public static void insertionSort(int[] list) {
		    for (int i = 1; i < list.length; i++) {
		      /** insert list[i] into a sorted sublist list[0..i-1] so that
		           list[0..i] is sorted. */
		      int currentElement = list[i];
		      int k;
		      for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
		        list[k + 1] = list[k];
		      }

		      // Insert the current element into list[k+1]
		      list[k + 1] = currentElement;
		    }
		  }
	  /** The method for printing double values */
	  public static void printArray(double[] list){
		  
		  for(int i=0;i<list.length;i++){
			  System.out.print(list[i]+ " ");
		  }
		  System.out.println(" ");
		  
	  }
	  /** The method for printing int values */
	  public static void printArray(int[] list){
		  
		  for(int i=0;i<list.length;i++){
			  System.out.print(list[i]+ " ");
		  }
		  System.out.println(" ");
		  
	  }
	}
