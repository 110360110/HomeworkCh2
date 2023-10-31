import java.lang.reflect.Array;

public class p40 {
	public static void main(String[] args)
	{
		int[]intArray = (int[]) Array.newInstance(int.class, 3);
		
		Array.setInt(intArray, 0, 123);
		Array.setInt(intArray, 1, 456);
		Array.setInt(intArray, 2, 789);
		
		System.out.println("intArray0[]="+Array.getInt(intArray, 0));
		System.out.println("intArray1[]="+Array.getInt(intArray, 1));
		System.out.println("intArray2[]="+Array.getInt(intArray, 2));
	}
}
