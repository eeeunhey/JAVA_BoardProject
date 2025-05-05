package ui;

import java.util.List;

import boardVO.PostVO;
import dao.PostDAO;

public class SeachAllUI extends BaseUI {
	// 전체 글 조회하는 UI 부분
	@Override
	public void execute() throws Exception {
		PostDAO postDao = new PostDAO();
		List<PostVO> posts = postDao.selectAllPosts();

		if (posts.isEmpty()) {
			System.out.println("📭 게시글이 없습니다.");
			return;
		}

		System.out.println(
				"┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("                                       🧾 채용 정보 전체 보기");
		System.out.println(
				"┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

		System.out.printf(" %-5s  %-13s  %-20s  %-10s  %-8s  %-10s  %-10s  %-10s \n", "ID", "작성자", "제목", "지역",
				"시급", "근무시간", "마감일", "작성일");
		System.out.println(
				"────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");

		for (PostVO post : posts) {
			System.out.printf("│ %-3d │ %-8s │ %-15s │ %-10s │ %-8s │ %-10s │ %-10s │ %-10s │\n", post.getPostId(),
					post.getUserId(), post.getTitle(), post.getLocation(), post.getPay(), post.getWorkTime(),
					post.getDeadline(), post.getCreatedAt());
		}

		System.out.println(
				"────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");

	}

}
