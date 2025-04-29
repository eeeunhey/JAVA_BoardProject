package ui;

import java.util.Scanner;

public abstract class BaseUI implements IBoardUI {
	/**
	 * public class ExitUI extends BaseUI implements IBoardUI
	 * 모든 UI마다 똑같이 적어줘야 되는데 하.. 귀찮다 
	 * 그래 그럼 이미 어차피 BaseUI를 상속받을거잖아
	 * 그니깐 여기다가 인터페이스 넣어주면 되잖아.. 그래 넣었어
	 * 각각의 객체마다 상속받았어 이제 이 부모객체가 상속받은 인터페이스 쓸라해 
	 * 인터페이스에서 execute로 정의 했어 사용해 근데 물려받은 자식객체는 오버라이딩을 해서 써야되
	 * 부모가 물려받은 인터페이스를 쓸라해 오버라이딩 해 오류나... 아 인터페이스엔 구현된게 없지 이름만 지어논 곳이니깐.. 
	 * 그래 이건 추상 클래스로 만들어 버리자 그럼 execute 사용할 수 있다
	 * */
	
 // 공통적인 기능을 모아놓고 이 기능을 필요로 하는 객체에게 상속하기 위해 만든 클래스이다
 // 이 클래스는 입력받는기능을 모아놓은 클래스입니다
	
   private Scanner sc;
   
   public BaseUI() {
	   sc = new Scanner(System.in);
	   // BaseUI가 생성될 때 만들어지는 입력받기 기능
   }
   
   protected String scanStr(String msg) {
	   /**
	    * 이 기능은 상속받은 객체만 사용하게 할거니깐 protected로 바꿔야 겠당
	    * 상속받은 객체가 호출할 경우 해당 값 가져온다
	    * protected 같은 패키지 내에서만 접근 가능
	    *  단 다른 패키지의 상속관계인 경우 상속받은 자식 클래스 내부에서만 부모객체 접근이 가능하다 
	    *  다른 패키지에서 부모객체를 생성해서 사용하는 건 불가능하지만 같은 패키지는 가능하다 
	    * */
	    System.out.print(msg);
	    return sc.nextLine();
   }
   
   protected int scanInt(String msg) {
	   System.out.print(msg);
	   int no = Integer.parseInt(sc.nextLine());
	   // 문자로 입력받은 숫자 값을 parseInt 사용해서 Int형으로 변환시켜준다
	   // 인트형으로 변환해주었으니 그 값을 int형 변수에 저장한다
	   return no;
	   // 변환된 값을 인트형 변수에 저장한 값을 리턴해준다
	   // 추후 숫자가 아닌 일반 문자가 들어올 경우 에러가 발생할 수 있으므로 추후에 에러처리가 필요하다
   }
   
}
