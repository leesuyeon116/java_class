package ch02_operator;

public class Ex01_Arithmeticoperator {
	
	public static void main(String[] args) {
		// 산술연산자
		/**
		 * nu1, num2 두개의 정수형 변수를 선언하고 값은 마음대로
		 * 두 변수의 _, -, *, /, % 연산결과를 print()를 활용하여 출력해봅시다.
		 * 출력방법
		 * System.out.println(num1 + num2)
		 */
		// int num1 = 10, num2 = 7; // 같으면 이렇게도 가능
		int num1 = 10;
		int num2 = 7;
		System.out.println(num1 + num2);
		System.out.println("덧셈결과: " + num1 + num2);	// XX
		System.out.println("덧셈결과: " + (num1 + num2)); // 괄호 안에 있는 거부터 계산 
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
		// 계산 결과를 담을 변수 활용 
		int result = 0;
		result = num1 + num2;
		System.out.println(result);
		result = num1 - num2;
		System.out.println(result);
		result = num1 * num2;
		System.out.println(result);
		result = num1 / num2;
		System.out.println(result);
		result = num1 % num2;
		System.out.println(result);
		
		// 계산 결과 변수를 따로 선언
		int sumResult = num1 + num2;
		System.out.println(sumResult);
		int subResult = num1 - num2;
		System.out.println(subResult);
		int mulResult = num1 * num2;
		System.out.println(mulResult);
		int divResult = num1 / num2;
		System.out.println(divResult);
		int remainResult = num1 % num2;
		System.out.println(remainResult);
		
		
		
		
		
	}
}
