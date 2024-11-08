package com.dsa;

public class Queue1 {
    private int capacity;
    int Queue1Array[];
    int front = 0;
    int rear = -1;
    int currentSize = 0;
 
    public Queue1(int Queue1Size){
        this.capacity = Queue1Size;
        Queue1Array = new int[this.capacity];
    }
 
    /**
     * Adds element at the end of the Queue1.
     * @param item
     */
    public void enQueue1(int item) {
        if (isQueue1Full()) {
            System.out.println("Overflow state.");
        } else {
            rear++;
            if(rear == capacity-1){
                rear = 0;
            }
            Queue1Array[rear] = item;
            currentSize++;
            System.out.println("Element " + item+ " is pushed to Queue1.");
        }
    }
 
    /**
     * Removes an element from the top of the Queue1
     */
    public void deQueue1() {
        if (isQueue1Empty()) {
            System.out.println("Underflow state.");
        } else {
            front++;
            if(front == capacity-1){
                System.out.println("Removed element: "+Queue1Array[front-1]);
                front = 0;
            } else {
                System.out.println("Removed element: "+Queue1Array[front-1]);
            }
            currentSize--;
        }
    }
 
    /**
     * Checks whether the Queue1 is full or not
     * @return boolean
     */
    public boolean isQueue1Full(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }
        return status;
    }
 
    /**
     * Checks whether the Queue1 is empty or not
     * @return
     */
    public boolean isQueue1Empty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }
 
	public static void main(String args[]){
	    try {
		Queue1 Queue1 = new Queue1(4);
	        Queue1.enQueue1(41);
	        Queue1.deQueue1();
	        Queue1.enQueue1(6);
	        Queue1.enQueue1(24);
	        Queue1.enQueue1(7);
	        Queue1.deQueue1();
	        Queue1.deQueue1();
	        Queue1.enQueue1(4);
	        Queue1.deQueue1();
	        Queue1.enQueue1(918);
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
}
