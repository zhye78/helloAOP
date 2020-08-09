package kr.ac.hansung.cse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//bean 정보 들어있는 xml 가져옴
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("kr/ac/hansung/cse/conf/animal.xml");
		
		PetOwner person = (PetOwner) context.getBean("id_petOwner"); //bean을 가져옴
		person.play();
		
		context.close();
	}

}
