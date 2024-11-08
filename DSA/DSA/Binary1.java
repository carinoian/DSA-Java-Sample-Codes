package com.dsa;

public class Binary1 {
    public static int Binary1Search(int[] data,int start, int end,int key){    
        if (start < end) {
            int mid = start + (end - start) / 2;  
            if (key < data[mid]) {
                return Binary1Search(data, start, mid, key);
 
            } else if (key > data[mid]) {
                return Binary1Search(data, mid+1, end , key);
 
            } else {
                return mid;   
            }
        }
        return -(start + 1);    
    }    
 
    public static void main(String args[]){
	int[] data= {50,127,130,150,170,910,1009};    
        int key = 1009;    
        System.out.println(key+" is found at index: "+Binary1Search(data,0, data.length, key));  
   }
}
