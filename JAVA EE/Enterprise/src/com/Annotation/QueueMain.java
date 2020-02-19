package com.Annotation;
class Queue{
	private int arr[];
	
	public Queue(int arr[]){
		this.arr=arr;
	}
	
	private int getTop(){
		int i;
		for (i=0;i<arr.length;i++){
			if(arr[i]==0){
				break;
			}
		}	
		return i;
	}
	
	public void push(int n){
		arr[getTop()]=n;
	}
	
	public int pop(){
		int  a=arr[0];
		for (int i=0;i<getTop();i++){
			arr[i]=arr[i+1];
		}
	arr[getTop()]=0;
	return a;
	}
	
	public String toString(){
		String s=""; 
		for (int i=getTop()-1;i>=0;i--){
			s=s+arr[i]+"\n";
		}
	return s;
	}
	
}

class QueueMain{
		public static void main(String []args){
			Queue s=new Queue(new int[10]);
			s.push(1);
			s.push(2);
			s.pop();
			s.push(3);
			s.push(4);
			s.pop();
			s.push(9);
			System.out.println(s);
		}
}


		