package com.toy.ToyEbook.member.service.face;

import com.toy.ToyEbook.member.dto.Member;

public interface MemberService {

	/**
	 * 로그인시 가져올 유저정보
	 * @return
	 */
	public Member getUserInfo();

	/**
	 * 유저 가입
	 * @param member
	 * @return 가입 성공 : 1
	 */
	public int memberJoin(Member member);

}
