package vo;

public class BoardVO {
	// 게시글 (글 번호, 제목, 작성자, 내용, 작성일)을 담기 위한 데이터 전용 객체
	// BoardVO 클래스를 호출하는 경우 데이터 저장해서 뭔가를 하는데 뭘 하는지 모르겠다...
	private int no; // 글 번호를 저장하는 변수
	private String title; // 제목을 저장하는 변수
	private String writer; // 작성자 저장하는 변수
	private String content; // 내용을 저장하는 변수
	private String regDate; // 작성일을 저장하는 변수
	
	
	public BoardVO() { // 기본생성자
		super();
		//BoardVO를 호출할 떄 생성되는 생성자
		//부모 클래스의 생성자를 호출한다
		//어떤 부모를 상속받는 거지????
	}
	
	public BoardVO (String title, String writer, String content) { // 제목, 작성자, 내용 만 받는 생성자
		// 생성할 때 오버로딩 
		super();
		this.title = title;
		// this.title(위에 선언된 멤버변수) = 파라미터 변수 넣는다
		this.writer = writer;
		// this.writer(위에 선언된 멤버변수) = 파라미터 변수 넣는다
		this.content = content;
		// this.content(위에 선언된 멤버변수) = 파라미터 변수 넣는다
	}
	
	public BoardVO (String title, String writer, String content, String regDate) { // 모든 데이터를 받는 생성자 
		super();
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = regDate;
		
	}
	// 생성자를 받아서 Getter(읽어온다) / Setter (설정한다) 
	// 멤버변수를 private로 선언했기 때문에 외부에서 접근이 불가능하다
	// 대신 그 값을 읽고 쓰게 하기 위해서 getter / setter를 사용한다 
	
	public int getNo() {
		return no;
		//게시글 번호를 가져오는 녀석이구나
	}
	
	public void setNo (int no) {
		this.no = no;
		// 게시글 번호를 설정하는 녀석이구나
	}
	
	public String getTitle() {
		return title;
		//제목을 가져오는 녀석이구나
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
		//제목을 가져오는 녀석이구나
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getContent() {
		return title;
		//내용을 가져오는 녀석이구나
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
		// regDate 값을 바꾸고 저장
	}
	
//BoardVO [no=1, title=공지, writer=관리자, content=내용입니다, regDate=2025-05-02]

	
	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + "]";
	}
	
	
	
	

	
	
	

}
