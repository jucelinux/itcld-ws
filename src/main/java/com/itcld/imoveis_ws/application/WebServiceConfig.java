package com.itcld.imoveis_ws.application;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ws/*");
	}

	@Bean(name = "123i")
	public DefaultWsdl11Definition _123iWsdlDefinition(XsdSchema _123iSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("123iPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://itcld.com/imoveis-ws/schema/123i");
		wsdl11Definition.setSchema(_123iSchema);
		return wsdl11Definition;
	}
	
	@Bean
	public XsdSchema _123iSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/schema/123i.xsd"));
	}
	
	@Bean(name = "bossanova")
	public DefaultWsdl11Definition BossaNovaDefinition(XsdSchema BossaNovaSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("BossaNovaPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://itcld.com/imoveis-ws/schema/bossanova");
		wsdl11Definition.setSchema(BossaNovaSchema);
		return wsdl11Definition;
	}
	
	@Bean
	public XsdSchema BossaNovaSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/schema/bossa_nova.xsd"));
	}
	
	@Bean(name = "vivareal")
	public DefaultWsdl11Definition VivaRealDefinition(XsdSchema VivaRealSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("VivaRealPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://www.vivareal.com/schemas/1.0/VRSync");
		wsdl11Definition.setSchema(VivaRealSchema);
		return wsdl11Definition;
	}
	
	@Bean
	public XsdSchema VivaRealSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/schema/viva_real.xsd"));
	}
	
	@Bean(name = "moving")
	public DefaultWsdl11Definition _MovingWsdlDefinition(XsdSchema MovingSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("MovingPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://itcld.com/imoveis-ws/schema/moving");
		wsdl11Definition.setSchema(MovingSchema);
		return wsdl11Definition;
	}
	
	@Bean
	public XsdSchema MovingSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/schema/moving.xsd"));
	}
	
	
}
