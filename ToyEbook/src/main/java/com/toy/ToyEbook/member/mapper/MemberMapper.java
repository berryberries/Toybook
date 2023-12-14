package com.toy.ToyEbook.member.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.toy.ToyEbook.member.dto.Member;

@Mapper
public interface MemberMapper {

	/**
	 * 유저 insert
	 * @param member
	 * @return insert성공 : 1
	 */
	int memberInsert(Member member);
	
	

}
