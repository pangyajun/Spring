package com.spring.dao.impl;


import com.spring.dao.PayDao;
import com.spring.entity.AlipayConfig;
import com.spring.entity.WXPayConfig;

public class PayDaoImpl implements PayDao {
	
	private WXPayConfig wxPayConfig;
	private AlipayConfig alipayConfig;
	
	public AlipayConfig getAlipayConfig() {
		return alipayConfig;
	}
	public void setAlipayConfig(AlipayConfig alipayConfig) {
		this.alipayConfig = alipayConfig;
	}

	public WXPayConfig getWxPayConfig() {
		return wxPayConfig;
	}
	public void setWxPayConfig(WXPayConfig wxPayConfig) {
		this.wxPayConfig = wxPayConfig;
	}
	@Override
	public String pay() {
		return getWxPayConfig()+"\n"+getAlipayConfig()+"\n ------------------------------";		
	}

}
