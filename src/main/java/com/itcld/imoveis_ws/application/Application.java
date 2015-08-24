package com.itcld.imoveis_ws.application;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class Application {
	
	@Bean
	@Profile("prod")
	public EmbeddedServletContainerFactory tomcat() {
	    TomcatEmbeddedServletContainerFactory myFactory = new TomcatEmbeddedServletContainerFactory();
	    myFactory.setProtocol("AJP/1.3");
	    myFactory.setPort(8009);
	    return myFactory;
	}

	@Bean
	@Profile("prod")
	public EmbeddedServletContainerCustomizer containerCustomizer() {
	    return new EmbeddedServletContainerCustomizer() {
	        @Override
	        public void customize(ConfigurableEmbeddedServletContainer container) {
	            TomcatEmbeddedServletContainerFactory tomcat = (TomcatEmbeddedServletContainerFactory) container;
	            tomcat.addConnectorCustomizers(new TomcatConnectorCustomizer() {
	                @Override
	                public void customize(Connector connector) {
	                    connector.setRedirectPort(8443);
	                }
	            });
	        }
	    };
	} 
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
