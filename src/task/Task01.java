package task;
import java.lang.invoke.MethodHandleInfo;
import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		System.out.print("Welcome."); //줄바꿈 없는 출력메소드 
		System.out.print("Java World"); //줄바꿈 없는 출력메소드
		
		System.out.println("===================");
		
		System.out.println("Welcome."); //줄바꿈이 있는 출력메소드 
		System.out.println("Java World"); //줄바꿈이 있는 출력메소드
		
		System.out.printf("저는 대학교 %d학년에 재학중입니다.", 3); //서식 출력 메소드(%d는 정수형.)
		System.out.printf("%d은 첫번째, %f은 두번째, %s는 세 번째.", 1, 2.0, "셋"); //서식 출력 메소드(%d는 정수형, f는 실수형, s는 문자)
		
		System.out.println("===================");
		
		System.out.printf("%5d", 1); //서식 출력 메소드(%d는 정수형.)
		System.out.println(""); //줄바꿈
		System.out.printf("%5d", 12); //서식 출력 메소드(%d는 정수형.)
		System.out.println(""); //줄바꿈
		System.out.printf("%5d", 123); //서식 출력 메소드(%d는 정수형.)
		System.out.println(""); //줄바꿈
		System.out.printf("%5d", 1234); //서식 출력 메소드(%d는 정수형.)
		System.out.println(""); //줄바꿈
		System.out.printf("%5d", 12345); //서식 출력 메소드(%d는 정수형.)
		System.out.println();
		System.out.printf("%.1f", 1.1234567); //서식 출력 메소드(%f는 실수형.)
		System.out.println(""); //줄바꿈
		System.out.printf("%.2f", 1.1234567); //서식 출력 메소드(%f는 실수형.)
		System.out.println(""); //줄바꿈
		System.out.printf("%.3f", 1.1234567); //서식 출력 메소드(%f는 실수형.)
		System.out.println(""); //줄바꿈
		System.out.printf("%.4f", 1.1234567); //서식 출력 메소드(%f는 실수형.)	
		System.out.println(""); //줄바꿈
		System.out.printf("%.5f", 1.1234567); //서식 출력 메소드(%f는 실수형.)
		
		System.out.println("===================");
		
		int studentAge; //정수형으로 변수 선언
		studentAge = 20; //변수에 20값 할당
		System.out.println(studentAge); //해당 변수 출력
		System.out.println("===================");
		String myCity = "Seoul"; //문자열로 변수 선언 후 값 지정
		System.out.println("I am from "+myCity); //I am from에 변수 연결 후 출력
		System.out.println("===================");
		int myAge = 20; //정수형으로 변수 선언 후 20값 할당
		int yourAge = myAge; //정수형으로 변수 선언 후 myAge값 할당
		System.out.println(myAge); //myAge변수 출력
		System.out.println(yourAge); //yourAge변수 출력
		System.out.println("===================");
		int myAge1 = 20; //정수형으로 변수 선언 후 20값 할당
		int yourAge1 = 30; //정수형으로 변수 선언 후 30값 할당
		int tempAge; //정수형으로 변수 선언
		tempAge = myAge1; //tempAge에 myAge1값 할당 : 20
		myAge1 = yourAge1; //myAge1에 yourAge1값 할당 : 30
		yourAge1 = tempAge; //yourAge에 teampAge값 할당 : 20
		System.out.println(myAge1); //최종적으로 30
		System.out.println(yourAge1); //최종적으로 20
		System.out.println("===================");
		byte num1 = 20; //byte형으로 변수 선언 후 20값 할당
		short num2 = 30; //short형으로 변수 선언 후 30값 할당
		int num3 = 40; //int형으로 변수 선언 후 40값 할당
		long num4 = 50; //long형으로 변수 선언 후 50값 할당
		System.out.println(num1); //num1출력
		System.out.println(num2); //num2출력
		System.out.println(num3); //num3출력
		System.out.println(num4); //num4출력
		System.out.println("===================");
		byte num1_1 = 0110; //byte형으로 변수 선언 후 값 0110할당
		short num2_2 = 0107; //short형으로 변수 선언 후 값 0107할당
		int num3_3 = 0x46; //int형으로 변수 선언 후 값 0x46할당
		long num4_4 = 69L; //long형으로 변수 선언 후 값 69L할당
		System.out.println(num1_1); //num1_1출력
		System.out.println(num2_2); //num2_2출력
		System.out.println(num3_3); //num3_3출력
		System.out.println(num4_4); //num4_4출력
		System.out.println("===================");
		double marathon = 42.195; //double형으로 변수 선언 후 값 42.195할당
		float halfMarathon = 21.0975f; //float형으로 변수 선언 후 값 21.0975할당(float은 값 뒤에 f붙임)
		System.out.println("마라톤은 "+marathon+"km 달립니다."); //문자와 변수 붙여서 출력
		System.out.println("하프마라톤은 "+halfMarathon+"km 달립니다."); //문자와 변수 붙여서 출력
		System.out.println("===================");
		double pieDouble = 3.141592653589793; //double형으로 변수선언 후 3.141592653589793값 할당
		float pieFloat = 3.141592653589793f; //float형으로 변수선언 후 3.141592653589793f값 할당
		System.out.println("doeble : "+pieDouble);//문자와 변수 붙여서 출력
		System.out.println("float : "+pieFloat);//문자와 변수 붙여서 출력
		System.out.println("===================");
		char ga = '가'; //char형으로 변수 선언 후 가 할당
		char na = '나'; //char형으로 변수 선언 후 나 할당
		char alphabetA = 'A'; //char형으로 변수 선언 후 A 할당
		char alphabetB = 'B'; //char형으로 변수 선언 후 B 할당
		System.out.println(ga);//변수 출력
		System.out.println(na);//변수 출력
		System.out.println(alphabetA+", "+alphabetB);//문자와 변수 붙여서 출력
		System.out.println("===================");
		int ga1 = '가';//int형으로 변수 선언 후 가 할당
		int na1 = '나';//int형으로 변수 선언 후 가 할당
		int alphbetA1 = 'A';//int형으로 변수 선언 후 A 할당
		int alphbetB1 = 'B';//int형으로 변수 선언 후 B 할당
		System.out.println(ga1); //유니코드로 자동형변환 후 출력
		System.out.println(na1); //유니코드로 자동형변환 후 출력
		System.out.println(alphbetA1); //유니코드로 자동형변환 후 출력
		System.out.println(alphbetB1); //유니코드로 자동형변환 후 출력
		System.out.println("===================");
		int alphabetA2 = 'A'; //int형으로 변수 선언 후 A 할당
		int alphabetB2 = 'B'; //int형으로 변수 선언 후 A 할당
		System.out.println(alphabetA2); //유니코드로 자동형변환 후 출력
		System.out.println(alphabetB2); //유니코드로 자동형변환 후 출력
		char alphabetC = 67; //char형으로 변수 선언 후 값 정수형 67할당
		System.out.println(alphabetC); //유니코드에서 자동형변환 후 출력
		System.out.println("===================");
		boolean isStudent = true; //boolean형으로 변수 선언 후 true지정
		System.out.println(isStudent); //변수 출력
		System.out.println("===================");
		boolean isStudent1 = true;//boolean형으로 변수 선언 후 true지정
		if(isStudent1) { //조건문에서 만약 isStudent가 True면?
			System.out.println("저는 학생입니다"); //해당 메세지 출력
		} else { //만약 True가 아니라면?
			System.out.println("저는 학생이 아닙니다"); //해당 메세지 출력
		}
		System.out.println("===================");
		String hi = "안녕하세요"; //String형으로 변수 선언 후 값 할당
		String niceMeetYou = "만나서 반갑습니다"; //String형으로 변수 선언 후 값 할당
		System.out.println(hi); //변수 출력
		System.out.println(niceMeetYou); //변수 출력
		System.out.println("===================");
		int num_1 = 11; //int형으로 값 11할당
		double num_2 = 3.14; //double형으로 값 3.14지정
		double num_1Change = (double)num_1; //double형으로 
		System.out.println("num_1 : "+num_1);//문자와 변수 붙여서 출력
		System.out.println("num_1Change : "+num_1Change);//문자와 변수 붙여서 출력
		System.out.println(num_1Change+num_2); //num_1Change변수와 num_2변수 합
		System.out.println((int)1.23); //정수형으로 변환 후 출력
		System.out.println("===================");
		int i1 = 10; //int형으로 변수 생성 후 10값 할당
		byte b1 = (byte)i1; //i1변수를 byte로 형변환
		System.out.println(b1); //b1출력
		int i2 = 128; //int형으로 i2변수 생성 후 128값 할당
		byte b2 = (byte)i2; //byte로 형변환
		System.out.println(b2); //b2출력
		System.out.println("===================");
		double d1 = 1.0e100; //double형으로 d1변수 생성 후 값 1.0e100할당
		float f1 = (float)d1; //d1변수의 값을 float으로 변환
		System.out.println(f1); //f1값 출력
		double d2 = 1.0e-100; //double형으로 d2변수 생성 후 값 1.0e - 100 연산 후 값 할당
		float f2 = (float)d2; //d2변수의 값을 float으로 변환
		System.out.println(f2); //f2값 출력
		System.out.println("===================");
		double pie = 3.14; //double형으로 pie변수 생성 후 3.14값 할당
		int pieInt = (int)pie; //pie값을 정수형으로 변형 후 값 할당
		System.out.println(pieInt); //pieInt값 출력
		int num5 = 100; //int형으로 변수 num5생성 후 100값 할당
		double numD = (double) num5; //double형으로 numD변수 생성 후 num5값을 double형변환
		float numF = (float)100; //float형으로 변수 numF생성 후 100을ㄹ float변환
		System.out.println(numD); //numD값 출력
		System.out.println(numF); //numF값 출력
		int i = 9999999; //int형 i변수 생성 후 9999999값 할당
		float f = (float)i; //변수 i값을 float변환
		System.out.println(f); //f값 출력
		System.out.println("===================");
		int num6 = 14; //int형으로 num6변수 생성 후 값 14할당
		double num7 = 3.14; //double형으로 num7생성 후 값 3.14할당
		int num8 = (int)num7; //num7을 int로 변환 후 num8저장
		System.out.println(num8); //num8출력
		System.out.println("===================");
		int i_1 = 100; //int형으로 변수 i_1생성 후 값 100할당
		char c_2 = 'a'; //char형으로 변수 c_2 생성 후 값 'a'지정
		int j = c_2; //int형으로 변수 j생성 후 c_2변수의 값 할당
		double d = i; //double형으로 변수 d생성 후 i의 변수 값 할당
		System.out.println("int형 변수 j의 값 : " + j);//문자와 변수 붙여서 출력
		System.out.println("double형 변수 d의 값 : "+d);//문자와 변수 붙여서 출력
		System.out.println("===================");
		int i_2 = 10; //int형으로 변수 i_2생성 후 10값 할당
		byte b = (byte) i; //byte형으로 변수 b생성 후 i값을 byte변환
		System.out.println("[int → byte]i의 값 : "+i+" b의 값 : "+b);//문자와 변수 붙여서 출력
		int j_1 = 1000;//int형으로 변수 j_2생성 후 1000값 할당
		byte c=(byte)j_1; //byte형으로 변수 c생성 후 j_1값을 byte변환
		System.out.println("[int → byte]j_1의 값 : "+j_1+" c의 값 : "+c);//문자와 변수 붙여서 출력
		System.out.println("===================");
		double d1_1 = 1.1234; //double형으로 b1_1변수 선언 후 값 1.1234값 할당
		float f1_1 = (float)d1_1; //float형으로 f1_1변수 선언 및 d1_1의 값 변환 후 할당
		System.out.println("[double → float]d1_1의 값 : "+d1_1+" f1_1의 값 : "+f1_1);//문자와 변수 붙여서 출력
		double d1_2 = 1.0e-50; //double형으로 b1_2변수 선언 후 값 1.0e-50값 할당
		float f1_2 = (float)d1_2; //float형으로 f1_2변수 선언 및 d1_2의 값 변환 후 할당
		System.out.println("[double → float]d1_2의 값 : "+d1_2+" f1_2의 값 : "+f1_2);//문자와 변수 붙여서 출력
		double d1_3 = 1.0e100; //double형으로 b1_3변수 선언 후 값 1.0e100값 할당
		float f1_3 = (float)d1_3; //float형으로 f1_3변수 선언 및 d1_3의 값 변환 후 할당
		System.out.println("[double → float]d1_3의 값 : "+d1_3+" f1_3의 값 : "+f1_3);//문자와 변수 붙여서 출력
		double d1_4 = 9.123456789; //double형으로 b1_4변수 선언 후 값 9.123456789값 할당
		float f1_4 = (float)d1_4; //float형으로 f1_4변수 선언 및 d1_4의 값 변환 후 할당
		System.out.println("[double → float]d1_4의 값 : "+d1_4+" f1_4의 값 : "+f1_4);//문자와 변수 붙여서 출력
		System.out.println("===================");
		float f1_5 = 12345.67f; //float형으로 f1_5변수 선언 후 값 9.123456789값 할당
		int d1_5 = (int)f1_5; //int형으로 d1_5변수 선언 및 f1_5의 값 변환 후 할당
		System.out.println("[float → int]d1_4의 값 : "+d1_4+" f1_4의 값 : "+f1_4);//문자와 변수 붙여서 출력
		double d1_6 = 12345.678; //double형으로 b1_4변수 선언 후 값 9.123456789값 할당
		int f1_6 = (int)d1_6; //float형으로 f1_4변수 선언 및 d1_4의 값 변환 후 할당
		System.out.println("[double → float]d1_4의 값 : "+d1_4+" f1_4의 값 : "+f1_4);//문자와 변수 붙여서 출력
		System.out.println("===================");
//		Scanner scanner = new Scanner(System.in); //스캐너 메소드 선언 후 scanner변수에 저장
//		String name, address; //name, address 변수 선언
//		int age; //age변수 선언
//		double weight; //weight변수 선언
//		System.out.println("이름,주소,나이,체중을 빈칸으로 구분하여 순서대로 입력하세요."); //ㄱㄱ
//		name = scanner.next(); //name에 입력 받아 저장
//		address = scanner.next(); //address에 입력 받아 저장
//		age = scanner.nextInt(); //age에 입력 받아 저장
//		weight = scanner.nextDouble(); //weight에 입력 받아 저장
//		System.out.printf("당신의 이름은 %s입니다.\n", name); //형식 지정자로 통해 지정 후 출력
//		System.out.printf("당신의 주소는 %s입니다.\n", address); //형식 지정자로 통해 지정 후 출력
//		System.out.printf("당신의 나이는 %d입니다.\n", age); //형식 지정자로 통해 지정 후 출력
//		System.out.printf("당신의 체중은 %1fkg입니다.\n", weight); //형식 지정자로 통해 지정 후 출력
		System.out.println("===================");
		int x = 100; //변수 선언
		int resultPlus = +x; //+부호
		int resultMinus = -x; //-부호
		System.out.println(resultPlus);
		System.out.println(resultMinus);
		System.out.println("===================");
		double d_2 = 1.11; //변수 사용
		double result = -d_2; //-부호
		System.out.println(-d_2); 
		System.out.println(result);
		System.out.println("===================");
		int num9 = 10;
		System.out.println(num9);
		num9++; //num9변수를 증감한다
		System.out.println(num9);
		System.out.println("===================");
		int num10 = 10;
		System.out.println(num10++); //출력 후 증감
		System.out.println(num10);
		System.out.println("===================");
		int num11 = 30;
		System.out.println(++num11); //증감 후 출력
		System.out.println(num11);
		System.out.println(num11++); //출력 후 증감
		System.out.println(num11);
		System.out.println("===================");
		int x1 = 1;
		System.out.println(x1++); //출력 후 증감
		System.out.println(x1);
		System.out.println(++x1); //증감 후 출력
		System.out.println("===================");
		char alphabetX = 'X';
		System.out.println(alphabetX++); //유니코드로 증감
		System.out.println(alphabetX);
		System.out.println("===================");
		boolean isHuman = false; //isHuman = False
		System.out.println(!isHuman); //Not, True
		System.out.println(isHuman); // False
		System.out.println("===================");
		int intX = 100;
		int intY = 100;
		System.out.println(intX + intY); //덧셈
		System.out.println(intX - intY); //뺼셈
		System.out.println(intX / intY); //나눗셈
		System.out.println(intX * intY); //곱셈
		System.out.println(intX % intY); //나머지
		System.out.println("===================");
		double num12 = 1.2345;
		int num12_2 = 6;
		System.out.println(num12+num12_2); // 형변환 후 계산
		System.out.println("===================");
		int result2 = 1000000*1000000;
		System.out.println(result2); //범위 초과
		System.out.println("===================");
		int a = 10;
		int b1_1 = 11;
		System.out.println(a <= b1_1); //a가 b보다 작거나 같은지
		System.out.println(a == b1_1); //둘 다 같은지
		System.out.println(a != --b1_1); //a가 감소된 b보다 다른지
		System.out.println("===================");
		boolean b2_1 = true;
		boolean b2_2 = false;
		boolean b2_3 = true;
		boolean b2_4 = false;
		System.out.println("###논리곱###");
		System.out.println(b2_1&&b2_2);
		System.out.println(b2_1&&b2_3);
		System.out.println(b2_2&&b2_4);
		System.out.println();
		System.out.println("###논리합###");
		System.out.println(b2_1||b2_2);
		System.out.println(b2_1||b2_3);
		System.out.println(b2_2||b2_4);
		System.out.println();
		System.out.println("###논리곱###");
		System.out.println(b2_1^b2_2);
		System.out.println(b2_2^b2_4);
		System.out.println();
		System.out.println("===================");
		int num13 = (7>1) ? 1 : 2;
		System.out.println(num13);
		System.out.println("===================");
		int num14 = 0;
		if(7 > 1) {num14 = 1;} //7이 1보다 크면,true일때 출력
		else {num14 = 2;} //false일때 출력
		System.out.println(num14);
		System.out.println("===================");
		int result3 = 0;
		if(3>2) { //3이 2보다 크다면?
			result3 = 3; //true반환
		}
		System.out.println(result3);
		System.out.println("===================");
		Scanner sc = new Scanner(System.in); //스캐너 선언 sc
		System.out.println("나이를 입력해주세요."); //출력
		int age = sc.nextInt(); //정수형 age변수 생성 후 정수형으로만 값 받기
		if(age>19) { //만약 입력한 값이 19보다 크다면
			System.out.println("성인입니다"); //성인입니다 출력
		}
		System.out.println("프로그램을 종료합니다"); //if문 밖이기 때문에 결과에 상관없이 종료
		System.out.println("===================");
		int num15 = 5;
		
		if(num15 >4) { //만약 num15가 4보다 크다면
			System.out.println(num15+"는 4보다 큽니다"); //true값 출력
		} else { //아니라면 
			System.out.println(num15+"는 4보다 작습니다"); //false값 출력
		}
		System.out.println("===================");
		int a_1 = 4;
		int b_1 = 10;
		if(a_1 > b_1) {
			System.out.println("a가 b보다 큽니다");
		} else {
			System.out.println("a가 b보다 작거나 같습니다");
		}
		System.out.println("===================");
		int a_2 = 4;
		int b_2 = 10;
		int max = 0;
		if(a_2 > b_2) { //만약 a_2가 b_2보다 크다면
			max = a_2; //max에 a_2값 재할당
		} else { //아니라면
			max = b_2; //max에 b_2값 재할당
		}
		System.out.println(a_2+"와 "+b_2+"중 큰 숫자는 "+max+"입니다");
		System.out.println("===================");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("나이를 입력 해 주세요");
		int age1 = sc1.nextInt(); //정수형 변수에 정수만 입력 받기
		if(age > 19) { //만약 내 나이가 19보다 크면
			System.out.println("성인입니다"); //true 값 출력
		} else { //아니면
			System.out.println("미자입니다"); //false값 출력
		}
		System.out.println("===================");
		int favorite = 7;
		if(favorite < 5) { //favorite변수에 값이 5보다 작으면
			System.out.println("좋아하는 숫자가 5보다 작습니다"); //true실행
		} else if(favorite > 5) { //그게 아닌데 favorite이 5보다 크면
			System.out.println("좋아하는 숫자가 5보다 큽니다"); //true 실행
		} else { //둘다 아니면 똑같다는거
			System.out.println("좋아하는 숫자가 5입니다"); //실행
		}
		System.out.println("===================");
		if(favorite > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다");
		} else if(favorite == 7) { //이때 걸리기때문에 출력후 바로 빠져나온다
			System.out.println("좋아하는 숫자는 7입니다");
		}
		System.out.println("===================");
		Scanner sc2 = new Scanner(System.in);
		System.out.println("나이를 입력 해 주세요");
		int age2 = sc2.nextInt();
		if(age > 19) { //나이가 19보다 크ㅁ다?
			System.out.println("성인입니다"); //true
		} else if(age > 6) { //false인데 19보다 작고 6보다 크다?
			System.out.println("어린이입니다"); //true
		} else { //둘다 아니다?
			System.out.println("유아입니다"); //true
		}
		System.out.println("===================");
		int num16 = 7; //정수형 num16변수에 7할당
		switch(num16) { //switch에서 7값을 할당 해 자식객체한테 true/false지정
			case 1 : //경우1번 : 만약 1이면
				System.out.println("num은 1입니다"); //ㄱㄱ
				break; //break로 통해 switch탈출
			case 7 ://경우1번 : 만약 7이면
				System.out.println("num은 7입니다"); //ㄱㄱ
				break; //break로 통해 switch탈출
			default : //모든 경우가 아니라면?
				System.out.println("num은 둘다 아닙니다"); //ㄱㄱ
				break; //break로 통해 switch탈출
		}
		System.out.println("===================");
		int num17 = 7; //정수형 num17변수에 7할당
		switch(num17) { //switch에서 7값을 할당 해 자식객체한테 true/false지정
			case 1 : //경우1번 : 만약 1이면
				System.out.println("num은 1입니다"); //ㄱㄱ
				//break가 없으면 계속 진행
			case 7 ://경우1번 : 만약 7이면
				System.out.println("num은 7입니다"); //ㄱㄱ
				//break가 없으면 계속 진행
			default : //모든 경우가 아니라면?
				System.out.println("num은 둘다 아닙니다"); //ㄱㄱ
				//break가 없으면 계속 진행
		}
		System.out.println("===================");
		Scanner sc3 = new Scanner(System.in);
		System.out.println("원하는 숫자를 입력 해 주세요(1~5) : ");
		int num18 = sc.nextInt(); //정수형 변수 생성 후 정수형으로 입력 받기
		switch(num18) { //switch에서 num18값을 할당 해 자식객체한테 true/false지정
			case 5://경우1번 : 만약 5이면
				System.out.println("5를 입력했습니다");
				break;
			case 4://경우2번 : 만약 4이면
				System.out.println("4를 입력했습니다");
				break;
			case 3://경우3번 : 만약 3이면
				System.out.println("3을 입력했습니다");
				break;
			case 2://경우1번 : 만약 1이면
				System.out.println("2를 입력했습니다");
				break;
			case 1:
				System.out.println("1를 입력했습니다");
				break;
			default:
				System.out.println("1~5까지의 숫자를 입력 해 주세요");
				break;
		}
		System.out.println("===================");
		int sum = 0; //정수변수 선언 후 0초기값 할당
		for(int k=1; k<=10; k++) { //초기식, 조건식, 증감식 지정
			sum += k; //초기식이 조건식과 동일할때까지 sum에 초기식 증가 후 할당
		}
		System.out.println("합: "+sum); //총합
		System.out.println("===================");
		int sum1 = 0;
		for(int k=1; k<=100; k++) { //초기식, 조건식, 증감식 지정
			if(k%2==0) { //만약 k를 2로 나눠서 딱 떨어진다면 : 즉 짝수만 골라내는 조건식
				sum1 += k; //sum1에 할당
			}
		}
		System.out.println("합: "+sum1);
		System.out.println("===================");
		for(int k=2; k<=9; k++) { //구구단을 하기 위한 행 지정(2부터 시작)
			for(int o=1; o<=9; o++) { //이중 for문을 하여 각 단에서 곱셈 시작
				System.out.println(k+" X "+o+" = " + (k*o) + "\t");
			}
			System.out.println(); //단계별로 구분
		}
		System.out.println("===================");
		for(int k=0; k<7; k++) {//7개까지 출력(7개 기준)
			for(int o=0; o<7-k; o++) { //공백으로 하여 틀 잡기
				System.out.println(" "); //요거
			}
			for(int p=0; p<(2*k)+1; p++) { //홀수로 별모양 하기
				System.out.println("*");
			}
			System.out.println(); //줄바꿈
		}
		System.out.println("===================");
		int sum3 = 0;
		int i_4 = 1;
		
		while(i_4<=10) { //i_4가 10보다 크거나 같을때까지 반복
			sum3+=i_4; //sum에 i_4값을 누적
			i_4++; //i_4씩 증가
		}
		System.out.println("합 ; "+sum3);
		System.out.println("===================");
		int sum4 = 0;
		int i_5 = 1;
		
		do { //do는 while문이 true일때만 실행
			sum4 += i_5;
			i_5++;
		} while(i_5<=10); //만약 i_5가 10보다 크거나 같을때
			System.out.println("합 : "+sum4);
		System.out.println("===================");
		int sum5 = 0;
		for(int k=1; k<=100; k++) {
			if(k%2 !=0) { //만약 k를 2로 나눴는데 짝수가 아니면
				continue; //이번꺼는 종료 후 다음 반복 수행
			}
			sum5 += k; //k만큼 증가
		}
		System.out.println("짝수의 합 : "+sum5);
		System.out.println("===================");
		int magicNumber = (int)(Math.random() * 50) +1; //랜덤값을 지정
		Scanner sc4 = new Scanner(System.in); //스캐너 설정
		boolean isMatched = false; //반복문을 탈출하기 위한 값
		for(int k=0; k<=10; k++) { //10번의 기회
			System.out.println("찾는 숫자 입력 >>");
			int guess = sc4.nextInt(); //정수형으로만 받기
			if(guess == magicNumber) { //정답과 추측숫자가 맞다면
				System.out.println((i+1)+"번째 맞췄습니다"); //반봇횟수만큼 지정 후 알려주기(초기값이 0이였으니 +1)
				isMatched = true; //불리언 true로 탈출
				break; //탈출
			} else if(guess > magicNumber) { //추측 숫자가 정답보다 작으면
				System.out.println("맞춰야 할 숫자가 더 작습니다");
			} else if(guess < magicNumber) { //추측 숫자가 정답보다 크면
				System.out.println("맞춰야 할 숫자가 더 큽니다");
			}
		}
		if(!isMatched) { //기회만큼 못맞췄으면
			System.out.println("정답을 맞추지 못했습니다");
		}
		
		
		
		
		
		
	}

}
