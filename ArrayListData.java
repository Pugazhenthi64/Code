package com.te.adding;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayListData implements Iterable {


	private Object[] array;
	private int count;
	private int index;


	public ArrayListData(int store) {
		this.array=new Object[store];

	}

	public void add(Object e) {
		if(this.count>=array.length) {
			growArray();
		}
		array[count++]=e;
	}

	public Object get(int index) {
		return this.array[index];
	}

	private void growArray() {
		Object[] temp= new Object[this.array.length+5];
		System.arraycopy(array, 0, temp, 0, index);
		array = temp;
	}

	public int size() {
		return this.count;
	}

	public boolean empty() {
		boolean[] check = new boolean[array.length];
		boolean real=true;
		for(int i=0; i<array.length;i++) {
			if(array[i]!=null) {
				check[i]=true;
			} else {
				check[i]=false;
			}
		}
		for (int j=0; j<check.length; j++) {

			if (check[j]) {
				real = false;
				break;
			} 
		}
		return real;
	}

	public String toString() {

		String returnValue = "["+array[0];
		if(size()==0) {
			return"[]";
		}
		for (int i=1 ; i<size(); i++) {
			returnValue+=","+array[i];
		}
		return returnValue+"]";
	}

	public Iterator iterator() {
		return new MyItr();
	}

	private class MyItr implements Iterator {

		private int index;
		public boolean hasNext() {
			return ((index<count)?true:false);
		}
		
		public Object next() {
			return array[index++];
		}
	}
}






