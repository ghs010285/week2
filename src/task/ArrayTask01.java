//고현섭
package task;

import java.util.Scanner;

public class ArrayTask01 {
	public static void main(String[] args) {
		//배열문제 조건
		//1. 칸수만 알고있다고 가정
		//2. 반드시 length 사용
		//3. 값을 대입하는 반복문, 값을 출력하는 반복문 각각 분리해서 사용
		
		
		// 100~1까지의 값을 배열에 넣고 출력
		// 일반 for문 사용

		// 1~10까지의 값을 배열에 넣고 총합 구하기
		// 일반 for문 사용
		
		// 사용자에게 4개의 숫자를 입력 받고 입력받은 값을 배열에 저장한 후 배열의 평균 구라기
		// 일반 for문, for-each문 상관없음
		
		// 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 값을 배열에 담고 출력(순서대로 출력하기)
		// 출력시 for-each 사용
		
		// A~F까지를 C만 제외하고 배열에 담아 출력
		// 일반 for문 사용
		// 초기식 int i=0;
		
		// aBcDeFgHiJkLmNoPqRsTuVwXyZ를 순서대로 배열에 담아 출력
		
		// 5개의 정수를 입력한 뒤 배열에 담고 최소값과 최대값 출력하기
		//일반 for문
		
		//8. 사물함의 비밀번호를 설정하고 사용자에게 이용할 사물함 번호와 비밀번호를 입력받아
	      //    입력된 사물함의 비밀번호와 설정한 비밀번호를 비교하여 일치 여부 출력하기
	      
	      //배열이용x
	      //0) Scanner 입력클래스 import
	      //1) 사물함 번호 설정
	      //2) 비밀번호 설정
	      //3) 사용할 사물함번호와 비밀번호 입력 후 일치여부 확인(if)
	      
	      Scanner sc = new Scanner(System.in);
//	      System.out.println("사물함 번호를 입력하세요 : ");
//	      int num1 = sc.nextInt();
//	      System.out.println("선택한 사물함의 비밀번호를 설정하세요 : ");
//	      int arPw = sc.nextInt();
//	      System.out.println("사용할 사물함 번호를 입력하세요 : ");
//	      int choice = sc.nextInt();
//	      System.out.println("사용할 사물함 번호의 비밀번호를 입력하세요 : ");
//	      int choicePw = sc.nextInt();
//	      if(arPw == choicePw) {
//	         System.out.println("비밀번호가 일치합니다. 사물함을 이용하세요.");
//	      }else {
//	         System.out.println("비밀번호가 일치하지 않습니다.");
//	      }
		//배열 이용
	      int[] arPw = new int[5];
	      String mainMsgString = "번 사물함 비밀번호 설정 : ";
	      String choiceMsgString = "이용할 사물함 번호 입력 : ";
	      String inputMsgString = "비밀번호 입력 : ";
	      int choice = 0, inputPw = 0;
	      for(int i=0; i<arPw.length; i++) {
	    	  
	      }
		
		// 학생 1명의 3과목 총점과 평균(실수 3자리)을 구하고 출력하기
		// 3과목은 배열에 입력받아 저장하며, for-each문만 사용(일반 for문 사용금지)
		
	}

}
