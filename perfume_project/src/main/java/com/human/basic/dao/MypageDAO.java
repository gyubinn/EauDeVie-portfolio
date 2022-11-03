package com.human.basic.dao;

import com.human.basic.domain.MemberVO;

public interface MypageDAO {

	// 아이디 중복체크
	MemberVO idCheck( MemberVO vo );
	
	// 회원가입
	int memberInsert(MemberVO vo);
	
	// 로그인 확인
	MemberVO memberLogin(MemberVO vo);
	
	// 모든 회원정보 보기 (관리자용)
//	List<MemberVO> memberView();
	
}
