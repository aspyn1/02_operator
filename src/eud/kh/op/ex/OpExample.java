package eud.kh.op.ex;

import java.util.Scanner;

public class OpExample { // 예제 코드 작성용 클래스
	
	// ex1() method : 객체 지향 프로그래밍에서 객체와 관련된 함수
	// -> OpExample이 가지고 있는 기능들 중 ex1()이라는 기능
	public void ex1() {
		System.out.println("OpExample 클래스에 ex1() 기능 수행");
		System.out.println("클래스 분리 테스트");
		System.out.println("성공");
	}
	
	public void ex2() {		
		Scanner sc = new Scanner(System.in);
		// 실행될 때 ExmapleRun -> OpExample -> Scaner 순으로 만들어냄
		// Scanner는 같은 패키지 내에 있지 않기때문에 import 사용해야한다
		
		System.out.print("정수 입력 1 : ");
		int input1 = sc.nextInt(); // 다음 입력되는 정수를 읽어옴.
		
		System.out.print("정수 입력 2 : ");
		int input2 = sc.nextInt(); // 다음 입력되는 정수를 읽어옴.
		
		System.out.printf("%d / %d = %d\n", input1, input2, input1/input2);
		System.out.printf("%d %% %d = %d\n", input1, input2, input1%input2);
		// printf에서 %(mod)를 사용하려면 '%'를 두번 써야한다
	}
	
	public void ex3() {
		// 증감(증가,감소) 연산자 : ++, --
		// -> 피연산자(값)을 1 증가 또는 감소시키는 연산자
		
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++; // iNum1을 1 증가 시킴
		iNum2--; // iNum2을 1 감소 시킴
		
		System.out.println("iNum1 : " + iNum1);
		System.out.println("iNum2 : " + iNum2);
		
		// 전위 연산 : ++3, --2 연산자가 앞쪽에 배치되는 것
		// -> 다른 연산자보다 먼저 증가/감소함
		
		int temp1 = 5;

		System.out.println(++temp1 + 5);
						  // ++5   +  5
						  //  6    +  5 == 11
		System.out.println("temp1 : " + temp1); // 6
		
		// 후위 연산 : 10++, 6-- 연산자가 뒤쪽에 배치되는 것
		// -> 다른 연산자 보다 나중에 증가/감소함

		int temp2 = 3;
		System.out.println(temp2-- + 2 );
						 // 3 + 2 // 5
						 // -> temp2 -1 감소
		
		System.out.println("temp2 : " + temp2); // 2
		
		int a = 3;
		int b = 5;
		int c = a++  + --b;
		
		System.out.printf("%d / %d / %d\n", a, b, c);
		// c : 3++ + --5 => 3++ + 4 => 7
		// 미뤄놨던 a = 3++ => a == 4
		// b == 4
	}
	
	public void ex4() {
		
		// 비교 연산자 : >, <, >=, <=, ==, !=
		// - 비교연산자의 결과는 항상 논리값(true/false)이다
		// - 등호(=)가 포함된 연산자에서 등호는 항상 오른쪽에 있다
		
		// 같다 기호는 '==' 이다.
		// 등호 1개 '='는 대입연산자로 사용한다.
		
		int a = 10;
		int b = 20;
		
		System.out.println(a > b); // false
		System.out.println(a < b); // true
		System.out.println(a != b); // true
		System.out.println( (a == b) == false ); // true
						  // 괄호 안에있는 것 부터 먼저 연산
						  // -> (false == false) -> true
		System.out.println("--------------------------------");
		
		int c = 4;
		int d = 5;
		
		System.out.println(c < d); // true
		System.out.println(c + 1 <= d); // true
		// 산술 연산이 비교연산보다 우선순위가 높기때문에 더하기 먼저
		System.out.println(c >= d-1); // ture 
		System.out.println( (++c != d) == (--c != d) );
							// (5 != 5) / false 
							//					 (--5 != 5) / true
							// false == true => false
		System.out.println("---------------------------");
		
		int temp = 723;
		
		System.out.println("temp는 짝수인가? " + (temp % 2 == 0));
		System.out.println("temp는 짝수인가? " + (temp % 2 != 1));

		System.out.println("temp는 홀수인가? " + (temp % 2 == 1));
		System.out.println("temp는 홀수인가? " + (temp % 2 != 0));

		
		System.out.println("temp는 3의 배수인가? " + (temp % 3 == 0)); // true
		System.out.println("temp는 4의 배수인가? " + (temp % 4 == 0)); // false
		System.out.println("temp는 5의 배수인가? " + (temp % 5 == 0)); // false

	}
	
	public void ex5() {
		// 논리 연산자 : &&(and), ||(or)
		
		// &&(and) : 둘 다 true면 true, 나머지는 false
		// -> ~와, 그리고, ~면서, ~이면서, ~부터 ~까지, ~사이
		// -> 사과와 바나나, 사과 그리고 바나나, 사과 이면서 바나나 등
		
		int a = 100 ;
		// a는 100이상이면서 짝수인가?
		System.out.println((a >= 100) && (a % 2 == 0));
		
		int b = 5;
		// b는 1부터 10까지 숫자 범위에 포함되어있는가?
		System.out.println((b >= 1) && (b <= 10));
		
		System.out.println("-------------------------------");
		
		// ||(or) : 둘 다 false면 false, 나머지는 true
		// -> 또는, ~이거나
		// -> 사과 또는 바나나, 사과 또는 바나나이거나
		
		int c = 10;
		// c는 10을 초과했거나 짝수인가?
		System.out.println((c > 10) || (c % 2 == 0));
		
	}
	
	public void ex6() {
		// 논리 부정 연산자 : !
		// -> 논리값을 반대로 바꾸는 연산자

		boolean bool1 = true;
		boolean bool2 = !bool1;
		
		System.out.println("bool1 : "+ bool1);
		System.out.println("bool2 : "+ bool2);
		
		System.out.println("------------------------");
		
		Scanner sc = new Scanner(System.in);
		// 정수를 하나 입력 받았을 때 
		// 1) 해당 정수가 1부터 100 사이 값이 맞는지 ?
		// 2) (반대) 1부터 100사이 값이 아닌지 ?
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		boolean result1 = (input >= 1) && (input <= 100);
		System.out.printf("%d은/는 1이상, 100 이하의 정수인가? : %b\n", input, result1);

		// 1이상 이면서 100이하 <-> 1미만 또는 100 초과
		boolean result2 = (input < 1) || (input >100);
		boolean result3 = ! ( (input >= 1) && (input <= 100) );
		System.out.printf("%d은/는 1미만, 100 초과의 정수인가? : %b %b\n", input, result2, result3);
		
	}
	
	public void ex7() {
		// 복합 대입 연산자 : +=, -=, *=, /=, %=
		// -> 피연산자(값)가 자신과 연산 후 결과를 다시 자신에게 대입하는 것
		
		int a = 10;
		
		// a를 1증가
		a++; // a = a + 1 // a += 1과 같음
		System.out.println("a를 1 증가 : " + a); // 11
		
		// a를 4증가
		a += 4; // a = a + 4
		System.out.println("a를 4 증가 : " + a); // 15
		
		// a를 10 감소
		a -= 10; // a = a - 10
		System.out.println("a를 10 감소 : " + a); // 5
		
		// a를 3배 증가
		a *= 3;
		System.out.println("a를 3배 증가: " + a); // 15
		
		// a를 6으로 나눴을 때 몫
		a /= 6;
		System.out.println("a를 6으로 나눴을 때 몫 : " + a); // 2
		
		// a를 2로 나눴을 때 나머지
		a %= 2;
		System.out.println("a를 2로 나눴을 때 나머지 : " + a); // 0
	}
	
	public void ex8() {
		
		// 삼항 연산자 : 조건식 ? 식1 : 식2;
		// 조건식의 결과가 true면 식1을 수행, false면 식2를 수행
		// * 조건식 : 연산 결과가 true/false인 식(비교, 논리, 논리부정 연산)
		
		int num = 30;
		
		// num이 30보다 크면 "num"은 30보다 큰 수 이다.를 출력
		// 아니면, num은 30 이하의 수이다.를 출력
		
		String result = num > 30 ? "num은 30보다 큰 수 이다." : "num은 30 이하의 수이다.";
		System.out.println(result);
		
		System.out.println("-------------------------");

		// 입력받은 정수가 음수인지 양수인지 구분
		// 단, 0은 양수로 처리
		
		// ex) 정수 입력 : 4
		// 양수 입니다.
		// 음수 입니다.
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input1 = sc.nextInt();
		
		// String result2 = input1 >= 0 ? "양수 입니다" : "음수 입니다";
		// System.out.println(result2);
		
		String st1 = "양수입니다.";
		String st2 = "음수입니다.";

		String result2 = input1 >= 0 ? st1 : st2;
		System.out.println(result2);

	}
	
}
