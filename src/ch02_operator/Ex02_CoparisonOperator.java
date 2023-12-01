package ch02_operator;

public class Ex02_CoparisonOperator {
	
	public static void main(String[] args) {
		// 대입연산자
		System.out.println(10 > 5);
		System.out.println(10 < 5);
		boolean result = 77 <= 60;
		System.out.println(result);
		result = (8 == 100);
		System.out.println(result);
		// result = 10 + 5;   옳은 식 X 
		result =  true;
		boolean bool1 = true;
		// 변수값을 다른 변수에 대입하는 것은 복사 개념
		result = bool1;
		System.out.println(result);
		System.out.println(bool1);
	}

}
