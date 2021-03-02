package ch15.exam08;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		
		TreeSet<Product> set = new TreeSet<>(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if(o1.price<o2.price) {
					return -1;
				}else if(o1.price == o2.price) {
					return 0;
				}
				return 1;
			}
		});
		
		set.add(new Product("TV",10000));
		set.add(new Product("Audio",5000));
		set.add(new Product("Car",12000));
		
		for(Product p :set) {
			System.out.println(p.name + ", "+ p.price);
		}

		TreeMap<Product,String> map = new TreeMap<>(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if(o1.price<o2.price) {
					return -1;
				}else if(o1.price == o2.price) {
					return 0;
				}
				return 1;
			}
		});
		
		map.put(new Product("TV",10000),"LG");
		map.put(new Product("Audio",5000),"�Ｚ");
		map.put(new Product("Car",12000),"����");
		Set<Product> pset = map.keySet();
		for(Product key :pset) {
			System.out.println(key.name + ", "+ key.price + map.get(key));
		}
		
	}

}
