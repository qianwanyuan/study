package sample01;

public class Professor extends Teacher {

	public Professor(String name, int age, String post, double salary, double grade) {
		super(name, age, post, salary, grade);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void introduce() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("jiaoshou");
		super.introduce();
	}
	 
	

}
