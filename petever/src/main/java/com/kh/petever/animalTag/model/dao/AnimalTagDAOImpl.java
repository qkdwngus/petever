package com.kh.petever.animalTag.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.petever.animalTag.model.vo.AnimalTag;

@Repository
public class AnimalTagDAOImpl implements AnimalTagDAO {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertAniTag(AnimalTag aniTag) {
		return sqlSession.insert("animalTag.insertAniTag", aniTag);
	}

	@Override
	public List<AnimalTag> selectList(String userId) {
		return sqlSession.selectList("animalTag.selectList", userId);
	}

}
