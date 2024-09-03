package jpabook.jpashop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor	// 기본 생성자
@AllArgsConstructor	// 모든 필드에 대한 매개변수 생성자
@ToString
public class Hello {
	
	// lombok 라이브러리 : getter / setter , 생성자, toString() 자동완성 라이브러리
	private String data;

}
