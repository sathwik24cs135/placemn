package asth;

import java.util.Arrays;
import java.util.Stack;

public class ELE {
	
	public static int[] nge(int [] arr) {
		int res[]=new int[arr.length];
		Stack<Integer>stack=new Stack<Integer>();
		for(int i=arr.length-1;i>=0;i--) {
			int cur=arr[i];
			
		while(!stack.isEmpty()&& stack.peek()<=cur) {
			stack.pop()	;
			}
		res[i]=stack.isEmpty()?-1:stack.peek();
		stack.push(cur);
		
		}
		return res;
	}
	
	public static void main(String[] args) {
		int [] arr= {14,9,11,25,19,100};
		int [] res=nge(arr);
		System.out.println(Arrays.toString(res));
	}

}
