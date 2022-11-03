package com.human.basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.human.basic.dao.MypageDAO;
import com.human.basic.domain.MemberVO;

@Service("mypageService")
public class MypageServiceImpl implements MypageService {

	@Autowired
	private MypageDAO mypageDAO;
	
	// 아이디 중복확인
	public MemberVO insert_idCheck(MemberVO vo){
		  return mypageDAO.idCheck(vo);
	}
	
	// 로그인
	public MemberVO login_check(MemberVO vo) {
		return mypageDAO.memberLogin(vo);
	}
	
	// 회원가입
	public int userInsert(MemberVO vo){
		  return mypageDAO.memberInsert(vo);
	}
	   
	// 모든 회원정보 보기
//	   public List<MemberVO> memberView() {
//		   return mypageDAO.memberView();
//	}
	  
}