package xxx;

public class Master {
	private String name;

	public Master(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void feed(Dog dog, Bone bone) {
		System.out.println("zhuren" + name + "gei" + dog.getName() + "chi" + bone.getName());
	}
}
