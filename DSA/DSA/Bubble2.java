package com.dsa;

public class Bubble2 {
	//Bubble Sorting
    public static void bubbleSort(int array[]) {
       int n = array.length;
       int k;
       for (int m = n; m >= 0; m--) {
           for (int i = 0; i < n - 1; i++) {
               k = i + 1;
               if (array[i] > array[k]) {
                   swapNumbers(i, k, array);
               }
           }
           printNumbers(array);
       }
   }

   private static void swapNumbers(int i, int j, int[] array) {  
       int temp;
       temp = array[i];
       array[i] = array[j];
       array[j] = temp;
   }

   private static void printNumbers(int[] data) {          
       for (int i = 0; i < data.length; i++) {
           System.out.print(data[i]);
           if(i != data.length-1){
           	System.out.print(", ");
           }
       }
       System.out.println("\n");
   }    

   public static void main(String args[]){
	int[] data= {5, 1, 4, 2, 8};      
       bubbleSort(data);  
   }
}