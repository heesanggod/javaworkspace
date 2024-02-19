package myFirstProject;

import java.util.Scanner;

public class MyFirstProgram {

	public static void main(String[] args) {
		/*
		작성자 : 신희상
		작성일 : 2024-01-18
		내용 : 문자열 출력 프로그램
		*/
		
		// 아래 코드는 문자 출력 코드입니다.
     System.out.println(/*"Hello */ "world!");
     
     int[] numbers;
     int[] numbers2 = {1, 3, 5, 7, 9, 11};
     System.out.println(numbers2);
     numbers = new int[3];
     System.out.println(numbers2);
     int[] numbers3 = new int[] {1, 2, 3, 4, 5, 6};
     System.out.println(numbers3);
     int item = numbers2[2];
     System.out.println(item);
     int item1 = numbers2[5];
     System.out.println(item1);
     item = numbers[0];
     System.out.println(item);
     item = numbers2[1];
     System.out.println(item);
     item1 = numbers3[5];
     System.out.println(item1);
     System.out.println(numbers);
     System.out.println(numbers2);
     System.out.println(numbers3);
     int item2 = numbers3[3];
     System.out.println(item2);
     item2 = numbers2[0];
     System.out.println(item2);
     item2 = numbers[2];
     System.out.println(item2);
     item2 = numbers3[1];
     System.out.println(item2);
     
     String item4 = " 하나도 모르겠어요.";
     System.out.println(item4 + " 진짜루다가 ");
     System.out.println(item4.length());
     System.out.println(item4.indexOf("모"));
     System.out.println(item4.substring(0, 7));
     System.out.println(item4.trim());
     String item5 = " Array Index Out Of Bounds Exception";
     System.out.println(item5.toUpperCase());
     
     String string = "데이터 조작을 위한 각종 연산자 : ";
     System.out.println(string + "1. 덧셈 연산자는 + 로 표기");
     
     
     // default는 expression이 어떤 case 값과도 일치하지 않을 때 실행된다.
     
     
     
     int a = 12;
     int b = 5;
     int c = 10;
     int d = 15;
     
    boolean booleanResult;
    booleanResult = a < b && c < d;  // 둘다 true가 나와야 true 하나라도 false 나오면 false
    System.out.println(booleanResult);
    booleanResult = a > b && c < d;
    System.out.println(booleanResult);
    booleanResult = a < b || c < d;  // 하나라도 true 나오면 true 둘다 false 나오면 false
    System.out.println(booleanResult);
    booleanResult = a < b || c > d;
    System.out.println(booleanResult);
    
    
    // **- PC Registers (PC 레지스터)** : 각 쓰레드 별로 생성되며, 현재 실행되는 JVM 명령의 주소를 가지고 있다.

    // **- Native Method Stacks (네이티브 메서드 스택)** : Java 외의 언어로 작성된 네이티브 메서드에 대한 스택을 저장한다.
    
    
    
    String a1 = "ba";
    System.out.println(a1.equals("ab"));
    System.out.println(a1.equals("ba"));
    System.out.println(a1 + " nana");
    System.out.println(a1.compareTo("ga") );
    System.out.println(a1.compareToIgnoreCase("ba"));
    
    
    int c3 = 12;
    int c4;
    c4 = c3++ + 7;
    System.out.println(c4);
    System.out.println(c3);
    
    String msg = "Spring is";
    int val1 = 3;
    String val2 = "3";
    System.out.println(msg);
    System.out.println(val1 + 10);
    System.out.println(val2 + "10");
     
     
   // (~˘▾˘)~

   
     
     
     
     
     
     
	}

}
    