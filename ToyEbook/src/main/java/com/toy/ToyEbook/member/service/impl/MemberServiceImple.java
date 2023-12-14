package com.toy.ToyEbook.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.ToyEbook.member.dto.Member;
import com.toy.ToyEbook.member.mapper.MemberMapper;
import com.toy.ToyEbook.member.service.face.MemberService;

@Service
public class MemberServiceImple implements MemberService {


	@Autowired MemberMapper memberMapper;
	
	@Override
	public Member getUserInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int memberJoin(Member member) {
		return memberMapper.memberInsert(member);
	}

}
