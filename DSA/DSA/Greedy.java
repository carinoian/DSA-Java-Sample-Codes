package com.dsa;
import java.util.Arrays;

//Class to represent a Greedy 
class Greedy { 
int start; 
int end; 
int length; 

// Constructor 
public Greedy(int start, int end, int length) 
{ 
   this.start = start; 
   this.end = end; 
   this.length = length; 
} 


//Function to find the optimal schedule 
public void findOptimalSchedule(Greedy[] Greedys) { 
// Sort Greedys according to their end times 
Arrays.sort(Greedys); 

// Initialize result 
int result = 0; 

// Iterate over all Greedys 
for (int i = 0; i < Greedys.length; i++) { 

   // Check if current Greedy can be included 
   // in the optimal solution 
   if (Greedys[i].start >= result) { 
       result = Greedys[i].end; 
   } 
  } 

 // Print result 
 System.out.println("Optimal Schedule: " + result); 
} 
}