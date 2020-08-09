package kr.ac.hansung.cse;

public class Dog implements AnimalType {

	private String myName;

	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}

	@Override
	public void sound() {
		System.out.println("Dog name = " + myName + " : " + "Bow Wow");
	}

}
