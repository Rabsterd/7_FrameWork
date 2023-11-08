package com.kh.test.user.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// lombok을 사용하는 어노테이션
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
	// DB에서 가져온 유저들의 정보
	private int user​No;
    private String userId;
	private String userName;
	private int age;
}


