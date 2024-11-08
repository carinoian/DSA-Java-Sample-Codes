package com.dsa;

public class Stack2 {
    private int Stack2Size;
    private int[] Stack2Arr;
    private int top;
 
    /**
     * constructor to create Stack2 with size
     * @param size
     */
    public Stack2(int size) {
        this.Stack2Size = size;
        this.Stack2Arr = new int[Stack2Size];
        this.top = -1;
    }
 
    /**
     * Adds new entry to the top of the Stack2
     * @param entry
     * @throws Exception 
     */
    public void push(int entry) throws Exception {
        if(this.isStack2Full()){
        	System.out.println("Stack2 Overflow");
        }
        System.out.println("Push: "+entry);
        this.Stack2Arr[++top] = entry;
    }
 
    /**
     * Removes an entry from the top of the Stack2.
     * @return
     * @throws Exception 
     */
    public int pop() throws Exception {
        if(this.isStack2Empty()){
        	System.out.println("Stack2 underflow.");
        }
        int entry = this.Stack2Arr[top--];
        System.out.println("Removed entry: "+entry);
        return entry;
    }
 
    /**
     * Returns top of the Stack2 without removing it.
     * @return
     */
    public int peek() {
        return Stack2Arr[top];
    }
 
    /**
     * Returns true if the Stack2 is empty
     * @return
     */
    public boolean isStack2Empty() {
        return (top == -1);
    }
 
    /**
     * Returns true if the Stack2 is full
     * @return
     */
    public boolean isStack2Full() {
        return (top == Stack2Size - 1);
    }
 
  public static void main(String args[]){
	Stack2 Stack2 = new Stack2(4);
	try {
		Stack2.push(1);
		Stack2.push(2);
		Stack2.push(3);
		Stack2.pop();
		Stack2.pop();
		Stack2.pop();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
  }
}