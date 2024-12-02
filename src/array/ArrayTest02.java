package array;
//2번 배열 index
public class ArrayTest02 {
	public static void main(String[] args) {
		int[] ar1 = {1, 2, 3, 4, 5};
		
		//ar1 → stack 메모리에 있는 참조변수 heap 메모리에 저장된 배열의 시작주소 → 참조값
		System.out.println(ar1);
		// heap 메모리에 인덱스번호(저장공간)에 저장된 값 출력
		System.out.printf("%d %d \n \n",ar1[1], ar1[2]);
		
		//int 타입으로 ar2변수를 선언 후 3개의 공간 생성
		int[] ar2 = new int[3]; //0, 1, 2 → 총 3개의 공감 생성
		//ar2는 heap 메모리에 저장된 시작주소값인 참조값ㅇ르 담고 있다
		System.out.println(ar2[2]);
		
		ar2[0] = 1;
		ar2[1] = 2;
		ar2[2] = ar2[0] + ar2[1];
		System.out.println(ar2[2]);
		
		//new : heap메모리의 배열을 만들고 시작 주소값을 가져온다
		
		
	}

}
