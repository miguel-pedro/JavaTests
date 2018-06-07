package p1;

public class MyFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		int x = 10;
		int y = 10;
		
		y += 10;
		
		int result = x+y;
		System.out.println("result = " + result);
		
		int[] a = {1,2,3,4};
		System.out.println(a[1] + " <- a[1] a[2]->" + a[2]);
		
		int[] aq = new int[4]; // indices 0 1 2 3, starts with zeros if empty
		aq[1] = 123;
	
		String[] st = {"qwert", "qwer", "qwerty"}; //starts with null if empty
		
		
		
	}

}
