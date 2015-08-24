//package com.itcld.imoveis_ws.application;
//
//import static org.junit.Assert.assertNotNull;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.boot.test.WebIntegrationTest;
//import org.springframework.oxm.jaxb.Jaxb2Marshaller;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.util.ClassUtils;
//import org.springframework.ws.client.core.WebServiceTemplate;
//
//import com.itcld.imoveis_ws.schema.GetCountryRequest;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = Application.class)
//@WebIntegrationTest(randomPort = true)
//public class ApplicationTest {
//     private Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//     
//     @Value("${local.server.port}")
//     private int port = 0;
//     
//     @Before
//     public void init() throws Exception {
//    	 marshaller.setPackagesToScan(ClassUtils.getPackageName(GetCountryRequest.class));
//    	 marshaller.afterPropertiesSet();
//     }
//     
//     @Test
//     public void testSendAndReceive(){
//    	 GetCountryRequest request = new GetCountryRequest();
//    	 request.setName("Spain");
//    	 assertNotNull(new WebServiceTemplate(marshaller).marshalSendAndReceive("http://localhost:"
// 				+ port + "/ws", request));
//     }
//
//}
