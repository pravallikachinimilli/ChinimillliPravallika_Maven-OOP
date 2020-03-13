package co.epam.mavonprojectdemo;

import java.util.TreeMap;

public class Chocolates extends Gifts{

	String name;
	int weight, cost;
	public static TreeMap<Integer, String> tm = new TreeMap<>();
	public Chocolates(int p, int wt, String name) {
		weight = wt;
		cost = p;
		this.name = name;
		if(!tm.containsKey(p)) {
			tm.put(p, name);
		}
		else {
			tm.put(p,  tm.get(p));
		}
	}
	public Chocolates() {
		
	}
	
	public void sorting() {
		for(int i : tm.keySet()) {
			System.out.println(tm.get(i)+" "+i);
		}
	}
	
	public void chocInRangeOf(int l,int h) {
		System.out.println("Chocolates in range "+l+" and "+h+ " are as follows:");
		for(int i : tm.keySet()) {
			if(i>=l && i<=h)
				System.out.println(tm.get(i));
		}
		System.out.println();
	}
}
