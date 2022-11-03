package com.human.basic.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.basic.domain.MemberVO;

@Repository("mypageDAO")
public class MypageDAOImpl implements MypageDAO{

	@Autowired
	private SqlSessionTemplate mybatis;
	
	@Override
	public MemberVO idCheck(MemberVO vo) {
		System.out.println("===> MemberMapper idCheck 호출");
		return mybatis.selectOne("user.idCheck", vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		System.out.println("===>  MemberMapper userInsert() 호출");
		return mybatis.insert("user.userInsert", vo);
	}

	@Override
	public MemberVO memberLogin(MemberVO vo) {
		System.out.println("===> MemberMapper userLogin 호출");
		return mybatis.selectOne("user.userLogin", vo);
	}

//	@Override
//	public List<MemberVO> memberView() {
//		System.out.println("===> MemberMapper memberView 호출");
//		return mybatis.selectList("user.memberView");
//	}
}
