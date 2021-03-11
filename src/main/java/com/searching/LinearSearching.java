package com.searching;

public class LinearSearching {

        public static int linearSearch(int[] array, int value){

            int n = array.length; // length of the write

            for(int i=0;i<n;i++){
                if(array[i] == value){
                    return i;
                }
            }
            return -1;
        }
        public static void main(String a[]){
            int[] array= {3,0,4,5,1,2};
            int value = 5;
            System.out.println( linearSearch(array, value));
        }
    }


