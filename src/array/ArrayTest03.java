package array;
//3번 배열의 저장공간과 값
public class ArrayTest03 {
	public static void main(String[] args) {
		int[] arData = {4, 3, 2, 5};
	      //정수형배열 arData stack 메모리영역에 생성, 
	      //heap 메모리 영역에 4칸짜리 4, 3, 2, 5라는 값을 저장한 배열을 생성하고 참조값(주소값)을
	      //arData라는 참조 변수에 담는다
	      System.out.println(arData);
	      
	      System.out.println(arData[0]); //값
	      arData[0] += 10; //산술계산
	      System.out.println(arData[0]); //값
	      
	      int data = arData[3];
	      
	      double[] arData1 = null;
	      arData1 = new double[4];
	      
	      System.out.println(arData1.length);      
	      
	}

}
 