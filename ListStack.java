package com.project.structure;

public class ListStack {

	private Node top;

	private class Node {
		private Object data;
		private Node prevNode;

		Node(Object data) {
			this.data = data;
			this.prevNode = null;
		}
	}

	public ListStack() {
		this.top = null;
	}

	public boolean empty() {
		return (top == null);
	}
	
	public void push(Object item){
		Node node = new Node(item);
		node.prevNode = top;
		top = node;
	}
	
	public Object peek(){
		if(empty()){throw new ArrayIndexOutOfBoundsException();}
		return top.data;
	}
	
	public Object pop(){
		Object item = peek();
		top = top.prevNode;
		return item;
	}
	

}
