package com.infiniteskills.spring;

import org.springframework.beans.factory.BeanNameAware;

public class BeanC implements BeanNameAware, AccessibleBeanName {

	private String beanName;

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return beanName;
	}

}
