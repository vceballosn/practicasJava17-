package test;

public class Main {
	public static int lowestToZero(int[] temperatures) {
	    int min = Integer.MAX_VALUE;
	    if (temperatures.length == 0) {
	        return 0;
	    }

	    for (int i = 0; i < temperatures.length; i++) {
	        if (Math.abs(temperatures[i]) < min) {
	            min = temperatures[i];
	        } else if (Math.abs(min) == Math.abs(temperatures[i])) {
	            min = Math.abs(min);
	        }
	    }
	    return min;

	}

	public static void main(String[] args) {
	    //-1, 2, 1, 5, -5
	    int[] temperatures = new int[]{-1, 2, 1, 5, -5};
	    System.out.println("lowestToZero(temperatures) = " + lowestToZero(temperatures));
	    Ileg
	}

}
