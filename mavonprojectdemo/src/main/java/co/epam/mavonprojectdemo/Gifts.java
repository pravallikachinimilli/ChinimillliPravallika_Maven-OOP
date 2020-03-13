package co.epam.mavonprojectdemo;

import java.util.ArrayList;

public class Gifts {

	public int weight, cost;
	public static ArrayList<Integer> ar = new ArrayList<>();
	public int getWt() {
		int sum = 0;
		for(int i =0; i<ar.size(); i++) {
			sum+=ar.get(i);
		}
		return sum;
	}

}
