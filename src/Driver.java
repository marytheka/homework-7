import animals.*;
import utils.*;

import java.lang.Math;

public class Driver {
	public static void main(String[] args) {
		Puppy joey = new Puppy("Joey");
		Puppy chandler = new Puppy("Chandler");
		Puppy ross = new Puppy("Ross");

		System.out.println(joey.getName());
		System.out.println(chandler.getName());
		System.out.println(ross.getName());

		int[] array = {9,20,3,44,88,300};

		ArrayUtils.reverse(array);
		String result = ArrayUtils.stringifyArray(array);
		System.out.println(result);

		double num = 15.4;
		int res = utils.Math.factorial((int)num);
		System.out.println(res);
	}
}
