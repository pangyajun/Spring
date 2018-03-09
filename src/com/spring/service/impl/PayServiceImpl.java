package com.spring.service.impl;




import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.stereotype.Service;

import com.spring.dao.PayDao;
import com.spring.service.PayService;

@Service("carService")
public class PayServiceImpl implements PayService{
	
	@Resource
	private PayDao pd;

	@Override
	@Test
	public String pay() {
		return pd.pay();
		
	}
	
	
}
