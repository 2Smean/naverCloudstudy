package board.data;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository // bean을 자동 등록해주는 Annotation : dao 에 붙인다
public class BoardDao {

	@Autowired
	private SqlSession session;

	private String nameSpace = "board.data.BoardDao.";

	// 전체 갯수 반환하는 메서드
	public int getTotalCount() {
		return session.selectOne(nameSpace + "totalCountOfBoard");
	}

	public void insertBoard(BoardDto dto) {
		session.insert(nameSpace + "insertBoard", dto);
	}
	
	public List<BoardDto> getAllDatas()
	{
		return session.selectList(nameSpace+"selectAllBoard");
	}
}
