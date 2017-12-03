package utils;

public class ArrayUtils {
	public static void reverse(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
	}

	public static String stringifyArray(int[] array) {
		String ret = "";
		for (int i = 0; i < array.length-1; i++) {
			ret = ret + array[i] + ", ";
		}
		ret = ret + array[array.length-1];
		return ret;
	}
}
