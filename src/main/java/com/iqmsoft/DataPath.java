package com.iqmsoft;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.language.SimpleExpression;
import org.springframework.stereotype.Component;

@Component
public class DataPath extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("direct:input")
			.setBody(new SimpleExpression("${exchangeId}"))
			.to("activemq:test.in");


	}
}