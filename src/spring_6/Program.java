package spring_6;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_6.di.entity.Exam;
import spring_6.di.entity.NewlecExam;
import spring_6.di.ui.ExamConsole;
import spring_6.di.ui.InlineExamConosle;

public class Program {

	public static void main(String[] args) {
		
		/*

		주석 부분을 지시서로 바꿀 것임
		
		Exam exam = new NewlecExam();
		ExamConsole console = new InlineExamConosle();
		
		console.setExam(exam);
		
		*/
		
		// 성공적으로 xml 파일을 읽었다면 지시서대로 객체를 생성함
		// 이를 IoC Container에 담음
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring_6/di/setting.xml");
		
		// 이름에 해당된 객체가 어떤 객체인지 확인할 수 없어 Object 형으로 꺼내짐
		// 그렇기에 형변환을 해주어야함
		// ExamConsole console = (ExamConsole) context.getBean("console");
		
		// 자료형명 이용하기
		// 매개변수로 넘겨주는 타입의 객체를 xml파일에서 가져와달라는 뜻
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		
		ExamConsole console =  context.getBean(ExamConsole.class);
		console.print();
		
		List<Exam> exams = (List<Exam>) context.getBean("exams"); //new ArrayList<>();
		
		for (Exam element:exams) {
			System.out.println(element);
		}
		
	}
	
}
