package com.demo.gp.customCollection;

public class CustomCollection {
	private Object[] 	elementData;
	private int 		size;
	
	public CustomCollection() {
		elementData = new Object[10];
	}
	
	public void add(Object obj) {
		if(size()==capacity()) 
			grow();

		elementData[size++] = obj;
			
	}
	
	//By Using Growable Array Algorithm
	private void grow() {
		Object[] nextArray = new Object[capacity()*2];
		
		//for fast accessing new array object
		Object[] elementData =this.elementData;
		
		//copying array element 
		for(int i=0;i<elementData.length;i++) {
			nextArray[i] = elementData[i];
		}
		this.elementData = nextArray;
	}
	

	public int capacity() {
		return elementData.length;
	}

	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	@Override
	public String toString() {
		if(isEmpty())
			return "[]";
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for(int i=0;i<size;i++) {
			builder.append(elementData[i]);
			builder.append(",");	
		}
		int start = builder.lastIndexOf(",");
		builder.delete(start, start+1);
		builder.append("]");
		return builder.toString();
	}
	
	public boolean contains(Object obj) {
			return indexOf(obj)>=0;
	}

	public int  indexOf(Object obj) {
		Object[] elementData =this.elementData;
		if(obj == null) {
			for(int i=0; i<size; i++) {
				if(elementData[i] == null)
					return i;
			}
		}else {
			for(int i=0; i<size; i++) {
				if(obj.equals(elementData[i]))
					return i;
			}
		}
		return -1;
	}
	
	public int lastIndexOf(Object obj) {
		Object[] elementData = this.elementData;
		if(obj == null) {
			for(int i=size-1;i>=0;i--) {
				if(elementData[i]==null)
					return i;
			}
		}else {
			for(int i=size-1;i>=0;i--) {
				if(obj.equals(elementData[i]))
					return i;
			}
		}
		return -1;
	}
	
	public Object get(int index) {
		checkIndex(index);
		return elementData[index];
	}

	public void checkIndex(int index) {
		if(index<0 && index >=size)
			throw new IndexOutOfBoundsException();	
	}
	

}
