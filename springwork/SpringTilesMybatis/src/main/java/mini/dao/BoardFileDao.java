package mini.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mini.dto.BoardFileDto;

@Repository
public class BoardFileDao {
	
	@Autowired
	private SqlSession session;
	
	private String NameSpace="mini.dao.BoardFileDao.";

	public void insertPhoto(BoardFileDto dto)
	{
		session.insert(NameSpace+"insertPhotoOfFile", dto);
	}
	
	public List<String> getPhotoByNum(int num)
	{
		return session.selectList(NameSpace+"selectAllPhotoByNum", num);
	}
	
	public List<BoardFileDto> getFileDataByNum(int num)
	{
		return session.selectList(NameSpace+"selectAllDataByNum", num);
	}
	
	public void deletePhoto(int idx)
	{
		session.delete(NameSpace+"deletePhotoByIdx", idx);
	}
}
