package array;

public class ArrayTest04 {

	public static void main(String[] args) {
		//1부터 10까지의 값을 배열에 넎고 출력
		//1) 배열 선언 및 생성
		int [] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int [] number2 = {1, 2, 3, 4, 5};
//		for(int i=0; i<=number2.length; i++) {
//			System.out.println(number[i]);
//			System.out.println(number2[i]);
//		}
		
		
//		==========================================
		//2 1부터 10까지의 값을 배열에 넣고 출력
		//1) 배열선언 및 생성(값을 모를때)
		//2) for문 사용(초기식 int i=0;)
//		int [] number3 = new int[10]; //배열 number3생성 후 10칸짜리로 지정
//		System.out.println(number3);
//		for(int i=0; i<number3.length; i++) {
//			number3[i] = i+1;
//			System.out.println(number3[i]);
//		}
//		==========================================
		
		//5부터 1까지의 값을 배열에 담고 출력하기
		//1) 칸수를 알고있을때
		//2) 값을 대입하는 반복문, 값을 출력하는 반복문을 따로 작성한다
//		int num = 5;							//정수형으로 5숫자 할당
//		int [] number4 = new int[5];			//배열 선언(5칸짜리~)
//		for(int i=0; i<number4.length; i++) {	//배열에 각 위치에 값을 지정하기 위해 반복문(i: 자리를 찾아가기 위한 비교대상)
//			number4[i] = num--;					//num불러와서 배열에 할당 후 1씩 감소(후위형)
//		}
//		for(int i=0; i<number4.length; i++) {	//출력하기 위해 반복문(i: 자리를 찾아가기 위한 비교대상)
//			System.out.println(number4[i]);		//출력하셈ㄱㄱ
//			
//		}
		
//		==========================================
		for(int data : number) {
			System.out.println("값 : "+data);
		}
		
		
	}

}
