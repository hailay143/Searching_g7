package com.searching;

import java.util.Arrays;

public class BinarySearching {
    public static void main(String args[]){
        int array[] = {5,10,15,20,25,30,35};
        System.out.println("The input array: " + Arrays.toString(array));
        int value = 30;
        System.out.println("\nKey to be searched= " + value);
        int low = 0;
        int high =array.length-1;
        int mid = (low + high)/2;
        while( low <= high ){
            if ( array[mid] < value ){
                low = mid + 1;
            }else if ( array[mid] == value ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                high = mid - 1;
            }
            mid = (low + high)/2;
        }
        if ( low > high ){
            System.out.println("Element is not found!");
        }
    }
}