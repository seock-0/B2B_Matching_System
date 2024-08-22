package com.mis.domain;

import java.util.Date;
import java.util.List;

public class BuyerVO {

	
	private String buyer_id;  // 바이어 아이디 
	private String buyer_name;  // 바이어 이름	
	private String buyer_pw ;	// 바이어 비밀번호
	private String buyer_company;	// 소속 기업
	private String buyer_address;	// 주소
	private String buyer_email;	// 이메일
	private String main_product;	// 주력상품
	private String act_nat;	// 활동 국가

	private Date buyer_regdate;  // 등록일
	
	public List<BuyerAttachVO>  buyer_attach_list;
	
	public List<BuyerImageVO>  buyer_img_list;
	
	
	
	
}
