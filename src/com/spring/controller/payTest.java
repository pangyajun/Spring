package com.spring.controller;


import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.context.SpringContextHolder;
import com.spring.dao.PayDao;
import com.spring.entity.AlipayConfig;
import com.spring.entity.WXPayConfig;
import com.spring.service.PayService;



@Controller
public class payTest {
	@Resource
	private PayService ps;
	
	@RequestMapping("testPay")
	public String testPay(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		//BeanFactory bf = new ClassPathXmlApplicationContext("spring.xml");						
		//System.out.println(AlipayConfig.getInstance()+"\n -------------------------------");
		//System.out.println(WXPayConfig.getInstance()+"\n ---------------------------------");
		//PayService ps =bf.getBean(PayService.class);
		String pay = ps.pay();
		//response.setContentType("text/html;charset=utf-8");
		//response.getWriter().write(ps.pay());
		request.setAttribute("Alipay", AlipayConfig.getInstance());
		return "index";
	}
	
	@RequestMapping("return")
	public void getParameter(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Map<String,String> params = new HashMap<String,String>();
		Map<String,String[]> requestParams = request.getParameterMap();
		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			params.put(name, valueStr);
		}
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(params.toString());
	}
}
