package com.demo.gp.customCollection;

public class TestCustomCollection {
	public static void main(String[] args) {
		CustomCollection col = new CustomCollection();
		System.out.println("Capacity: "+col.capacity());
		System.out.println("Size    : "+col.size());
		System.out.println(col);
		
		col.add("a");
		col.add("b");
		col.add(5);
		col.add(6.7);
		col.add('p');
		col.add(true);
		col.add(null);
		col.add("a");
		col.add("a");
		col.add(6.7);
		
		
		System.out.println();
		System.out.println("Capacity: "+col.capacity());
		System.out.println("Size    : "+col.size());
		System.out.println(col.toString());
		System.out.println();
		
		col.add(null);
		col.add(new Ex(5,6));
		col.add(new Ex(8,5));
		col.add(new Ex(5,6));
		
		
		System.out.println("Capacity: "+col.capacity());
		System.out.println("Size    : "+col.size());
		System.out.println(col);
		
		System.out.println();
		System.out.println(col.contains("z"));
		System.out.println(col.contains(new Ex(5,6)));
		System.out.println(col.contains(null));

		System.out.println();
		System.out.println(col.indexOf(5));
		System.out.println(col.indexOf(new Ex(5,6)));
		System.out.println(col.indexOf(null));
		System.out.println(col.indexOf(7));
		
		System.out.println();
//		System.out.println(col.lastIndexOf(new Ex(5,6)));
//		System.out.println(col.lastIndexOf(null));
//		System.out.println(col.lastIndexOf("b"));
		
		System.out.println(col.get(2));
		System.out.println(col.get(12));
		System.out.println(col.get(6));
//		System.out.println(col.get(-1));
//		System.out.println(col.get(23));
	
	
	}
}