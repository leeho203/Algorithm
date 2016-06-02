package com.project.structure;

public class ArrayQueue {
	private int front;
	private int rear;
	private int maxSize;
	private Object[] queueArray;
	
	public ArrayQueue(int maxSize){
		this.front = 0;
		this.rear = 0;
		this.maxSize = maxSize;
		this.queueArray = new Object[maxSize];		
	}
	
	public boolean empty(){
		return (front == rear);
	}
	
	public boolean full(){
		return (maxSize == rear);
	}
	
	public Object peek(){
		if(empty()){throw new ArrayIndexOutOfBoundsException();}
		return queueArray[front];
	}
	
	public Object remove(){
		Object item = peek();
		front++;
		return item;
	}
	
	public void insert(Object item){
		if(full()){throw new ArrayIndexOutOfBoundsException();}
		this.queueArray[rear]=item;
		rear++;
	}
}
