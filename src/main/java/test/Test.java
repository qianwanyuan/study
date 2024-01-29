package test;

public class Test {

	public static void main(String[] args) {
		int[] x = {6, 11, 3, 444, 0};
		int max=x[0];
		for(int i=0;i<x.length - 1;i++) {
			if(x[i]>x[i+1]) {
				max=x[i];
                x[i]=x[i+1];
                x[i+1]=max;
		    }
		}
		System.out.println(x);
		}
}