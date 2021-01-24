package spring_6.di.ui;

import spring_6.di.entity.Exam;

public class InlineExamConosle implements ExamConsole {

	private Exam exam;
	
	public InlineExamConosle() {
		
	}
	
	public InlineExamConosle(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("total: %d, avg: %f \n", exam.total(), exam.avg());
	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
