package com.toy.ToyEbook.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data //getter,setter
@NoArgsConstructor //모든 필드를 매개변수로 갖는 생성자
@AllArgsConstructor //매개변수를 갖지않는 생성자
public class Member {
	
	private int memberno;
	private String id;
	private String pw;
	private String email;
	private String role;

}
