package cse360assign02;
//Author: Samira Said

public class SimpleList{
	
	private int[] list;
	private int count;
	
	
	//constructor
	public SimpleList () {
		list = new int[10];
		count = 0;
	}
	
	public void add(int index) {
		for (int i = 1; i < list.length-1; i++) {
				list[i] = list[i-1];
		}
		list[0] = index;
		this.count++;
	}
	
	public void remove(int index) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == index) {
				this.count--;
				for (int j = i; j < list.length-1; j++) {
					list[j] = list[j+1];
				}
				break;
			}
		}
	}
	
	public int count() {
		return this.count;	
	}
	
	public String toString() {
		String str = "";
		for (int i = 0; i < this.list.length; i++) {
			str += list[i] + " ";
		}
		return str;
	}
	
	public int search(int index) {
		int paramIndex = -1;
		
		for (int i = 0; i < this.list.length; i++) {
			if (list[i] == index) {
				paramIndex = i;
			}
		}
		return paramIndex;
	}
	
}