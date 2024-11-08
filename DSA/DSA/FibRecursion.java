package com.dsa;

public class FibRecursion {
	
   // Function to calculate the nth FibRecursiononacci number using
   // recursion
   static int nthFibRecursiononacci(int n){
       // Base case: if n is 0 or 1, return n
       if (n <= 1) {
           return n;
       }
       // Recursive case: sum of the two preceding
       // FibRecursiononacci numbers
       return nthFibRecursiononacci(n - 1) + nthFibRecursiononacci(n - 2);
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
       int result = nthFibRecursiononacci(n);
       System.out.println(result);
	}

}
