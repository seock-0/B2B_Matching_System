package com.mis.domain;

import java.util.Date;
import java.util.List;

public class ProductVO {

	private int prod_num;  // 상품 번호
	private String prod_name;  // 상품명
	private String prod_price;	// 상품 가격
	private String prod_type;	// 상품 종류
	private String prod_manu  ;	// 상품 제조국
	private String prod_detail;	// 상품 내용
	private String prod_keyword ;	//상품 키워드
	private Date prod_regdate;	// 상품 등록일
	
	public List<ProductImageVO>  prod_img_list;


}

