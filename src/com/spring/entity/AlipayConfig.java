package com.spring.entity;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.context.SpringContextHolder;

/* *
 *类名：AlipayConfig
 *功能：支付宝基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 */
@Component("alipayConfig")
public class AlipayConfig {
	
	private static AlipayConfig alipayConfig;
	public  static AlipayConfig getInstance() {
		return alipayConfig==null?SpringContextHolder.getBean(AlipayConfig.class):alipayConfig;
		}	

	@Value("#{app['alipay.appId']}") 
	private  String appId ;
	@Value("#{app['alipay.privateKey']}") 
	private  String privateKey ;	
	@Value("#{app['alipay.publicKey']}") 
	private  String publicKey ;
	@Value("#{app['alipay.gatewayUrl']}") 
	private  String gatewayUrl ;
	@Value("#{app['alipay.notifyUrl']}") 
	private  String notifyUrl ;
	@Value("#{app['alipay.returnUrl']}") 
	private  String returnUrl ;
	public static  final String SIGN_TYPE = "RSA2";	
	public static  final String CHARSET = "UTF-8";	
	public static  final String FORMAT = "JSON";

	
	public static AlipayConfig getAlipayConfig() {
		return alipayConfig;
	}
	public String getAppId() {
		return appId;
	}
	public String getPrivateKey() {
		return privateKey;
	}
	public String getPublicKey() {
		return publicKey;
	}
	public String getGatewayUrl() {
		return gatewayUrl;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public String getReturnUrl() {
		return returnUrl;
	}
	public static String getSignType() {
		return SIGN_TYPE;
	}
	public static String getCharset() {
		return CHARSET;
	}
	public static String getFormat() {
		return FORMAT;
	}

	@Override
	public String toString() {
		return " [支付宝] <br> appId=" + appId + "<br> privateKey=" + privateKey
				+ "<br> publicKey=" + publicKey + "<br> gatewayUrl=" + gatewayUrl + "<br> notifyUrl="
				+ notifyUrl + "<br> returnUrl="+ returnUrl + "<br> SIGN_TYPE=" + SIGN_TYPE + "<br> CHARSET=" + CHARSET
				+ "<br> FORMAT=" + FORMAT ;
	}


 
}

