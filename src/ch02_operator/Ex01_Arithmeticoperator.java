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
		// int num1 = 10, num2 = 7; // 한 번에 여러 변수를 선언, 만약 두 변수가 동일한 데이터 형식 아니면 사용 X
		int num1 = 10; 
		int num2 = 7; 
		System.out.println(num1 + num2);
		System.out.println("덧셈결과: " + num1 + num2);	// 이렇게 적으면 두 숫자를 이어붙인 값이 출력됨 
		System.out.println("덧셈결과: " + (num1 + num2)); // ()괄호 안 숫자의 연산을 먼저 수행 
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
