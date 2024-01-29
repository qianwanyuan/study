package sample02;

public class Person {
 private int id;
 private static int total =0;
 
 public Person() {
	 total++;
	 total++;
	 id =total;
 }
 public static int getTotalPerson() {
	 return total;
 }

}
