package Collection_Queue;

import java.util.PriorityQueue;

public class PriorityQueue_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating a priority queue
		 PriorityQueue<Integer> numbers = new PriorityQueue<>();
		
		 // Using the add() method
		 //numbers.add(4);
		 numbers.add(1);
		 numbers.add(2);
		 //numbers.add(3);
		 System.out.println("PriorityQueue: " + numbers);
		 
		 // Using the offer() method
		 numbers.offer(7);
		 numbers.offer(8);
		 numbers.offer(4);
		 System.out.println("Updated PriorityQueue: " + numbers);

	}

}
