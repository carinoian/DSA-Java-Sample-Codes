package com.dsa;
import java.util.ArrayList;
import java.util.List;
 
public class Dequeue {
    private List<Integer> deque = new ArrayList<Integer>();
 
    public void insertFront(int item){
        System.out.println("Adding element at front: "+item);
        deque.add(0,item);
        System.out.println(deque);
    }
 
    public void insertRear(int item){
        System.out.println("Adding element at rear: "+item);
        deque.add(item);
        System.out.println(deque);
    }
 
    public void removeFront(){
        if(deque.isEmpty()){
            System.out.println("Underflow state.");
            return;
        }
        int rem = deque.remove(0);
        System.out.println("Remove element from front: "+rem);
        System.out.println(deque);
    }
 
    public void removeRear(){
        if(deque.isEmpty()){
            System.out.println("Underflow state.");
            return;
        }
        int rem = deque.remove(deque.size()-1);
        System.out.println("Removed element from front: "+rem);
        System.out.println(deque);
    }
 
    public int peakFront(){
        int item = deque.get(0);
        System.out.println("Element at first: "+item);
        return item;
    }
 
    public int peakRear(){
        int item = deque.get(deque.size()-1);
        System.out.println("Element at rear: "+item);
        return item;
    }
 
	public static void main(String args[]){
		try {
			Dequeue deque = new Dequeue();
			deque.insertFront(134);
			deque.insertFront(14);
			deque.insertFront(13);
			deque.removeFront();
			deque.insertRear(455);
			deque.removeFront();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
