package spring_6.di.entity;

public class NewlecExam implements Exam {
	
	private int kor;
	private int eng;
	private int math;
	private int com;

	public NewlecExam() {
		// TODO Auto-generated constructor stub
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	// 오버라이딩하여 해당 객체를 print할 경우 아래와 같이 출력되도록 함
	public String toString() {
		return "kor: " + this.kor + " eng: " + this.eng + " math: " + this.math + " com: " + this.com;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return kor + eng + math + com;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total() / 4.0f;
	}

}
