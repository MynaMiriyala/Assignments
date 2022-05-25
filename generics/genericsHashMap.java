package generics;

import java.util.HashMap;
import java.util.Random;

public class genericsHashMap {
public static void main(String[] args) {
	Random rand = new Random();
	int rand_int1 = rand.nextInt(20);
	int rand_int2 = rand.nextInt(20);
	int rand_int3 = rand.nextInt(20);
	int rand_int4 = rand.nextInt(20);
	int rand_int5 = rand.nextInt(20);
	int rand_int6 = rand.nextInt(20);
	int rand_int7 = rand.nextInt(20);
	int rand_int8 = rand.nextInt(20);
	int rand_int9 = rand.nextInt(20);
	int rand_int10= rand.nextInt(20);
	double rand_dubl1=rand.nextDouble(10);
	double rand_dubl2=rand.nextDouble(10);
	double rand_dubl3=rand.nextDouble(10);
	double rand_dubl4=rand.nextDouble(10);
	double rand_dubl5=rand.nextDouble(10);
	double rand_dubl6=rand.nextDouble(10);
	double rand_dubl7=rand.nextDouble(10);
	double rand_dubl8=rand.nextDouble(10);
	double rand_dubl9=rand.nextDouble(10);
	double rand_dubl10=rand.nextDouble(10);
	HashMap<Integer, Double> map = new HashMap<>();
	map.put(rand_int1,rand_dubl1);
	map.put(rand_int2,rand_dubl2);
	map.put(rand_int3,rand_dubl3);
	map.put(rand_int4,rand_dubl4);
	map.put(rand_int5,rand_dubl5);
	map.put(rand_int6,rand_dubl6);
	map.put(rand_int7,rand_dubl7);
	map.put(rand_int8,rand_dubl8);
	map.put(rand_int9,rand_dubl9);
	map.put(rand_int10,rand_dubl10);
	System.out.println(map.size());
	System.out.println(map);
	
	}
}
