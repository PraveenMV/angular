/**
 * 
 */
package com.po.ssais.web.converter;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

/**
 * @author muraliananthr
 * 
 */
@Component
public class ConverterRegister {
	@Autowired
	private RequestMappingHandlerAdapter adapter;

	private List<HttpMessageConverter<?>> messageConverters;

	@PostConstruct
	public void bindMessageConverters() {
		adapter.setMessageConverters(messageConverters);
	}

	/**
	 * @return the messageConverters
	 */
	public List<HttpMessageConverter<?>> getMessageConverters() {
		return messageConverters;
	}

	/**
	 * @param messageConverters
	 *            the messageConverters to set
	 */
	public void setMessageConverters(
			List<HttpMessageConverter<?>> messageConverters) {
		this.messageConverters = messageConverters;
	}

	// @Autowired
	// private AnnotationMethodHandlerAdapter adapter;
	//
	// private HttpMessageConverter<?>[] messageConverters;
	//
	// public void setMessageConverters(HttpMessageConverter<?>[]
	// messageConverters) {
	// this.messageConverters = messageConverters;
	// }
	//
	// @PostConstruct
	// public void bindMessageConverters() {
	// adapter.setMessageConverters(messageConverters);
	// }
}
