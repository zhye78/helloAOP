package kr.ac.hansung.cse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {
	
	@Autowired //의존성 주입하는 어노테이션
	@Qualifier(value="qf_dog") //animaltype인 bean이 dog,cat 두개라서 추가로 식별해줌
	private AnimalType animal;
	
	/*public PetOwner() {
		super();
	}

	public PetOwner(AnimalType animal) {
		super();
		this.animal = animal;
	}*/

	public void play() {
		animal.sound();
	}
}
