package collection;

import java.util.Stack;

public class C007_StackDemo {
	public static void main(String[] args) {
		
		
		Stack<String> st = new Stack<String>();
		st.push("java");
		st.push("php");
		st.push("android");
		
		//System.out.println(st.pop());
		//System.out.println(st.pop());
		System.out.println(st.peek());
		
		System.out.println("******************");
		
		for(String s : st)
		{
			System.out.println(s);
		}
	}
}
