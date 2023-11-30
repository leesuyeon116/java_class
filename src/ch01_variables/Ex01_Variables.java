package ch01_variables;

public class Ex01_Variables {

	public static void main(String[] args) {
		// 본인의 이름(name), 나이(age), 키(height), 주소(address), 전화번호(mobile)를 입력할 수 있는 변수를 각각 선언해봅시다.
		// 변수 선언
		// String; // 타입만 주면 안됨XX 
		// name = "이름"; // 변수이름만 주면 안됨XX
		String name = "이수연";
		int age = 24; // "" 안 씀 
		double height = 164.8;
		String address = "인천서구XXXXXX";
		String mobile = "010-1234-5678";
		
		// 변수값 출력
		System.out.println(name);	// name의 값을 출력
		System.out.println("name");	// 문자열 "name"을 그대로 출력함 
//		System.out.println(name1); 없는 변수 쓰면 오류 뜸
		System.out.println("저의 이름은 : " + name);
		System.out.println("저의 이름은 : " + name + "입니다"); // + 기호 두 가지 의미 : 1. 숫자와 숫자끼리는 덧셈을 의미 / 2. 문자열끼리는 연결을 의미 
		System.out.println(age);
		System.out.println(height);
		System.out.println(address);
		System.out.println(mobile);
	}

}
