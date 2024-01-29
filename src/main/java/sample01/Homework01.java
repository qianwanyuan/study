package sample01;

public class Homework01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person[] person= new Person[3];
		person[0]=new Person("jack",10,"JAVAEE");
		person[1]=new Person("dick",11,"JAVAEE");
		person[2]=new Person("nick",12,"JAVAEE");
		
		for(int i=0;i<person.length;i++) {
			System.out.println(person[i]);
		}
		//
	}

}
