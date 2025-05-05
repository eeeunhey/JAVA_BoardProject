package accountUI;


import exception.ChoiceOutOfBoundException;
import ui.BaseUI;
import ui.IBoardUI;

public class AccountUI extends BaseUI {

	private String signUp() {
		System.out.println("");
		System.out.println(" █████╗ ██╗     ███████╗  █████╗ ██╗████████╗");
		System.out.println("██╔══██╗██║     ██╔═══██ ██╔══██╗██║╚══██╔══╝");
		System.out.println("███████║██║     ███████═╗███████║██║   ██║   ");
		System.out.println("██╔══██║██║     ██║   ██║██╔══██║██║   ██║   ");
		System.out.println("██║  ██║███████╗███████╔╝██║  ██║██║   ██║   ");
		System.out.println("╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚═╝   ╚═╝   ");

		System.out.println("           👟 아르바이트 구인·구직 플랫폼           ");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("                  🌐 로그인 페이지                  ");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.println("\t\t1. 개인 회원 로그인");
		System.out.println("\t\t2. 기업 회원 로그인");
		System.out.println("\t\t3. 관리자 로그인");
		System.out.println("\t\t4. 회원 가입");
		System.out.println("------------------------------------------------");
		String type = scanStr("\t\t항목을 선택하세요 : ");

		return type;

	}

	public void execute() throws Exception {
		// 메뉴 창을 출력하는 부분

		String choice = signUp();
		IBoardUI ui = null;
		while (true) {
			switch (choice) {
			case "1":
				ui = new LoginUI("개인");
				break;
			case "2":
				ui = new LoginUI("기업");
				break;
			case "3":
				ui = new LoginUI("관리자");
				break;
			case "4":
				SignUpUI signUp = new SignUpUI(); // 회원가입 UI 실행
				signUp.execute();
				break;
			default:
				throw new ChoiceOutOfBoundException("⚠️ 1~4번 중에서만 선택해주세요.");
			}

			if (ui != null) {
				ui.execute();
				break;

			}

		}
	}
}
