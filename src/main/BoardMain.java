package main;

import ui.BoardUI;

public class BoardMain {

	public static void main(String[] args) {
		
		//1. 키보드를 입력받고 화면에 출력
		//2. UI이란 이름을 붙이자
		//3. 관리를 하기 위해서
		
		BoardUI ui = new BoardUI();
		ui.execute();
		
	}

}
