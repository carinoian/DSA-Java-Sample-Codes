package com.dsa;
import java.util.Arrays;

//Class to represent a Greedy1 
class Greedy1 { 
int start; 
int end; 
int length; 

//Constructor 
public Greedy1(int start, int end, int length) 
{ 
 this.start = start; 
 this.end = end; 
 this.length = length; 
} 


//Function to find the optimal schedule 
public void findOptimalSchedule(Greedy1[] Greedy1s) { 
//Sort Greedy1s according to their end times 
Arrays.sort(Greedy1s); 

//Initialize result 
int result = 0; 

//Iterate over all Greedy1s 
for (int i = 0; i < Greedy1s.length; i++) { 

 // Check if current Greedy1 can be included 
 // in the optimal solution 
 if (Greedy1s[i].start >= result) { 
     result = Greedy1s[i].end; 
 } 
} 

// Print result 
System.out.println("Optimal Schedule: " + result); 
} 
}