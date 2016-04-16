package week1_assignment;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int Count = 12;
         int[] a = new int[Count];
         a[0] = 0;
         a[1] = 1;
         System.out.println(a[0]);
         System.out.println(a[1]);
         
         for(int i=2; i < Count; i++){
             a[i] = a[i-1] + a[i-2];
             System.out.println(a[i]);
         }
    }
}
	
