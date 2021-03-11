package com.searching;
import java.util.*;

public class RecursiveBinarySearching {


        public static int binary_Search(int array[], int low, int high, int value){

            if (high>=low){

                int mid = low + (high - low)/2;

                if (array[mid] == value){
                    return mid;
                }

                if (array[mid] > value){
                    return binary_Search(array, low, mid-1, value);
                }else
                {
                    return binary_Search(array, mid+1, high, value);
                }
            }
            return -1;
        }
        public static void main(String args[]){

            int intArray[] = {1,11,21,31,41,51,61,71,81,91};
            System.out.println("Input List: " + Arrays.toString(intArray));
            int key = 31;
            System.out.println("\nThe key to be searched:" + key);
            int high=intArray.length-1;

            int result = binary_Search(intArray,0,high,key);

            if (result == -1)
                System.out.println("\nKey not found in given list!");
            else
                System.out.println("\nKey is found at index: "+result + " in the list");
        }
    }

