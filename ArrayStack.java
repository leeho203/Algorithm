package com.project.structure;

public class ArrayStack {
	private int top;
	private int maxSize;
	private Object[] stackArray;

	public ArrayStack(int maxSize) {
		this.maxSize = maxSize;
		this.stackArray = new Object[maxSize];
		this.top = -1;
	}
	
	public boolean empty() {
		return (top == -1);
	}
	
	public boolean full(){
		return (top == maxSize - 1);
	}
	
	public void push(Object item){
		if(full()){throw new ArrayIndexOutOfBoundsException();}
		stackArray[++top] = item;
	}
	
	public Object peek(){
		if(empty()){throw new ArrayIndexOutOfBoundsException();}
		return stackArray[top];
	}
	
	public Object pop(){
		Object item = peek();
		top--;
		return item;
	}
}
