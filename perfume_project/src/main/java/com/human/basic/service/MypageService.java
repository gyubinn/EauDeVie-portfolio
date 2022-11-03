package com.human.basic.service;

import com.human.basic.domain.MemberVO;

public interface MypageService {
	
	public MemberVO insert_idCheck(MemberVO vo);

	public MemberVO login_check(MemberVO vo);
	
	public int userInsert(MemberVO vo);
	
	// 모든 회원 보기 (관리자용)
	// List<MemberVO> memberView();
}
