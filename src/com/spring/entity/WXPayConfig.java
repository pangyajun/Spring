package com.spring.entity;

import java.io.InputStream;

import com.spring.context.SpringContextHolder;

public class WXPayConfig {
	
	private static WXPayConfig wxPayConfig;
	public  static WXPayConfig getInstance() {
			return wxPayConfig==null?SpringContextHolder.getBean(WXPayConfig.class):wxPayConfig;	
		}

	private String appId;
	private String mchId;
	private String key;
	private String secret;
	private String notifyUrl;
	private String returnUrl;
	
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public void setMchId(String mchId) {
		this.mchId = mchId;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getAppId() {
		return appId;
	}
	public String getMchId() {
		return mchId;
	}
	public String getKey() {
		return key;
	}
	public String getSecret() {
		return secret;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public String getReturnUrl() {
		return returnUrl;
	}	
	public InputStream getCertStream() {
		return null;
	}	
	public int getHttpConnectTimeoutMs() {
		return 8000;
	}
	public int getHttpReadTimeoutMs() {
		return 100000;
	}
	@Override
	public String toString() {
		return " [微信] \r\n appId=" + appId + "\n mchId=" + mchId + "\n key=" + key + "\n secret=" + secret
				+ "\n notifyUrl=" + notifyUrl + "\n returnUrl=" + returnUrl ;
	}
	
	
}
