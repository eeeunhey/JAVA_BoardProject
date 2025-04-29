package ui;

import java.util.Scanner;

public class BoardUI {
	// 2 UI 클래스 생성하기

	private Scanner sc;
	// 스캔변수 만들기

	public BoardUI() {
		sc = new Scanner(System.in);
		// BoardUI 생성자 : 객체가 생성될 때 자동으로 Scanner도 같이 생성된다
	}

	private String menu() {
		System.out.println("-----------------------------------");
		System.out.println("\t<< 게시판 관리 프로그램 >>");
		System.out.println("-----------------------------------");
		System.out.println("\t1. 전체게시글 조회");
		System.out.println("\t2. 글번호 조회");
		System.out.println("\t3. 게시글 등록");
		System.out.println("\t4. 게시글 수정");
		System.out.println("\t5. 게시글 삭제");
		System.out.println("\t0. 종료");
		System.out.println("-----------------------------------");
		// String type = scanStr("\t항목을 선택하세요 : ");
		String type = sc.nextLine();
		// 입력받은 값을 저장하는 type변수
		return type;
		// 선택한 값을 리턴한다
	}

	public void execute() {
		String choice = menu();
		// 메뉴 창을 출력하는 부분
		// 위에서 선택한 리턴 값을 처리하자
		/**
		 * 행동을 하는데 각 행동의 메소드를 각각 정의하면 
		 * 각각의 UI를 호출할 때마다 기억해야 되잖아
		 * AddUI.execute() / ExitUI.exeport() -> 별루다..
		 * AddUI.execute() / ExitUI.execute() -> 이런식으로 만들어야 하는디
		 * 어떤 UI를 선택하든 같은 메소드 명으로 정의해주면
		 * 뭘 선택하든 execute로 가져오고 싶다 -> 인터페이스를 만들자!!
		 *  
		 * */
		/**
		 * 여러 객체가 입력받는게 필요한데 -> 부모 클래스를 만들어 상속받자!!
		 * 공통적으로 필요로 하는 기능을 부모클래스를 만들자
		 *  
		 * */
		
		
		while (true) {
		// 한번선택하고 끝나면 안되기 때문에 무한루프 
			switch (choice) {
			case "1":
				System.out.println("전체게시글 조회 선택");
				break;
			case "2":
				System.out.println("글번호 조회 선택");
				break;
			case "3":
				System.out.println("게시글 등록 선택");
				break;
			case "4":
				System.out.println("게시글 수정 선택");
				break;
			case "5":
				System.out.println("게시글 삭제 선택");
				break;
			case "0":
				
				
				/**
				 여기 해당하는 값에 명령어를 처리해야 하는데 너무 길다
				 메뉴가 늘면 늘수록 보드 UI가 어마무시하게 늘어나겠다
				 그럼 클래스로 분리해야 되겠네 그럼 종료 클래스 만들자
				 */
				
				/** 종료 행동만들기
				System.out.println("-----------------------------");
				System.out.println("\t프로그램을 종료합니다.");
				System.out.println("-----------------------------");
				System.exit(0);
				// 해당하는 종료값이 들어오면 종료되는 메서드이다
				*/
				break;

			}
		}
	}
}
