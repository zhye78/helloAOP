package kr.ac.hansung.cse;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger { //aop로 지정한 클래스
	
	@Pointcut("execution(void kr.ac.hansung.cse.*.sound())")
	private void selectSound(){}; //pointcut에 대한 id 준것 - id일 뿐이니 메소드 내용 작성 불필요
	
	@After("selectSound()") //pointcut의 id 매개변수로 넣어줌
	public void aboutToSound() {
		System.out.println("advice: about to sound");
	}
}
