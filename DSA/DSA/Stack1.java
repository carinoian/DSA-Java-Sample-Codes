package com.dsa;

public class Stack1 {
    private int Stack1Size;
    private int[] Stack1Arr;
    private int top;
 
    /**
     * constructor to create Stack1 with size
     * @param size
     */
    public Stack1(int size) {
        this.Stack1Size = size;
        this.Stack1Arr = new int[Stack1Size];
        this.top = -1;
    }
 
    /**
     * Adds new entry to the top of the Stack1
     * @param entry
     * @throws Exception 
     */
    public void push(int entry) throws Exception {
        if(this.isStack1Full()){
        	System.out.println("Stack1 Overflow");
        }
        System.out.println("Adding: "+entry);
        this.Stack1Arr[++top] = entry;
    }
 
    /**
     * Removes an entry from the top of the Stack1.
     * @return
     * @throws Exception 
     */
    public int pop() throws Exception {
        if(this.isStack1Empty()){
        	System.out.println("Stack1 underflow.");
        }
        int entry = this.Stack1Arr[top--];
        System.out.println("Removed entry: "+entry);
        return entry;
    }
 
    /**
     * Returns top of the Stack1 without removing it.
     * @return
     */
    public int peek() {
        return Stack1Arr[top];
    }
 
    /**
     * Returns true if the Stack1 is empty
     * @return
     */
    public boolean isStack1Empty() {
        return (top == -1);
    }
 
    /**
     * Returns true if the Stack1 is full
     * @return
     */
    public boolean isStack1Full() {
        return (top == Stack1Size - 1);
    }
 
  public static void main(String args[]){
	Stack1 Stack1 = new Stack1(4);
	try {
		Stack1.push(14);
		Stack1.push(82);
		Stack1.push(32);
		Stack1.push(8);
		Stack1.pop();
		Stack1.push(3);
		Stack1.pop();
		Stack1.pop();
		Stack1.pop();
		Stack1.pop();
		Stack1.pop();
		Stack1.pop();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
  }
}