package kr.ac.hansung.cse;

public class Cat implements AnimalType {

	private String myName;

	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}

	@Override
	public void sound() {
		System.out.println("Cat name = " + myName + " : " + "Meow");
	}

}
