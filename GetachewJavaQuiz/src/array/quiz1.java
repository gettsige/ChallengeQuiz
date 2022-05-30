package array;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class quiz1 {

    public static void main(String[] args) {
      System.out.println("Get integers:");
      int[] myIntArray = getIntegers(5);

      System.out.println("SortIntegers:");
      int[] sortArray = sortIntegers(myIntArray);

      System.out.println("Print array:");
      printArray(sortArray);
    }

    public static int[] getIntegers(int number) {
      Scanner scanner = new Scanner(System.in);

      int[] values = new int[number];
      for(int i = 0; i < values.length; i++) {
        System.out.println("Enter value " + i);
        values[i] = scanner.nextInt();
      }
      scanner.close();
      return values;
    }

    public static void printArray(int[] array) {
      for(int i = 0; i < array.length; i++) {
        System.out.println("Value of element:" + i + " = " + array[i]);
      }
    }

    public static int[] sortIntegers(int[] array) {
      int[] sortArray = new int[array.length];
      for(int i = 0; i < array.length; i++) {
        sortArray[i] = array[i];  
      } 
      
      int temp;
      boolean sorted = false;
    while(sorted == false) {
      sorted = true;
      for(int i = 0; i < sortArray.length - 1; i++) {
        if(sortArray[i] < sortArray[i+1]) {
          temp = sortArray[i];
            sortArray[i] = sortArray[i+1];
            sortArray[i+1] = temp;

          sorted = false;
        }
      }
    }
      return sortArray;
    }  
    }


//Create a program using arrays that sorts a list of integers in descending order.
//Descending order is highest value to lowest.
//In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
//ultimately have an array with 106,81,26, 15, 5 in it.
//Set up the program so that the numbers to sort are read in from the keyboard.
//Implement the following methods - getIntegers, printArray, and sortIntegers
//getIntegers returns an array of entered integers from keyboard
//printArray prints out the contents of the array
//and sortIntegers should sort the array and return a new array containing the sorted numbers
//you will have to figure out how to copy the array elements from the passed array into a new
//array and sort them and return the new sorted array.