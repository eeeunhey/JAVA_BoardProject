package ui;

public class AddUI extends BaseUI {
	// 새글을 추가하는 UI
	
	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub
		String title = scanStr("제목을 입력하세요 : ");
		// BaseUI의 입력기능을 상속받았으니 scanStr 사용해서 title변수에 넣기
		String writer = scanStr("글쓴이를 입력하세요 : ");
		// BaseUI의 입력기능을 상속받았으니 scanStr 사용해서 writer변수에 넣기
		String content = scanStr("내용을 입력하세요 : ");
		// BaseUI의 입력기능을 상속받았으니 scanStr 사용해서 contents변수에 넣기
		
		Thread.sleep(1000);
		// 새글 등록을 마치고 메뉴가 너무 빨리 뜬다 -> 조금 텀을 주자
		
		System.out.println("\n\t게시글 등록이 완료되었습니다.");
		//게시글 등록이 완료되면 출력
		// BoardUI에 가서 호출하기
	}
}
