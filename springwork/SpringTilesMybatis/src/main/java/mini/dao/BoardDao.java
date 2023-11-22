package mini.dao;

import javax.xml.stream.events.Namespace;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {
	
	@Autowired
	private SqlSession session;
	
	private String NameSpace="mini.dao.BoardDao.";

}
