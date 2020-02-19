class Stack{
	static final int max=10;
	private int top;
	private int arr[]=new int[max];
	
	public Stack(){
		top=-1;
	}
	
	public int peek(){
		return arr[top];
	}
	
	public void push(int n){
		if (top>=max)
			System.out.print("Overflow condition");
		
		arr[++top]=n;
	}
	
	public int pop(){
		if(top<0)
			System.out.println("Underflow condition");
		
		int a=arr[top--];
		return a;
	}
	
}

class StackMain{
		public static void main(String []args){
			Stack s=new Stack();
			s.push(1);
			s.push(2);
			s.pop();
			s.push(3);
			System.out.println(s.peek());
		}
}
