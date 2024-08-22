package com.mis.domain;

import java.util.Date;
import java.util.List;

public class StartupVO {
	
	private String startup_id;  //스타트업 아이디
	private String startup_pw;  //스타트업 비밀번호
	private String startup_name;	//스타트업 이름
	private Date established_year;	//스타트업 설립일
	private String size;	//스타트업 규모
	private String main_product;	//스타트업 주력상품
	private String employees;	//스타트업 직원수
	private String ceo_name;	//스타트업 대표 이름
	private String startup_address;	//스타트업 주소
	private String startup_zipcode;	//스타트업 우편번호
	private String startup_tel;		//스타트업 대표 전화번호
	private String manager_tel;		//스타트업 담당자 전화번호
	private String startup_email ;	//스타트업 대표 이메일
	
	
	private Date startup_regdate;	//등록일
	
	public List<StartupAttachVO>  startup_attach_list;
	
	public List<StartupImageVO>  startup_img_list;
		


}
