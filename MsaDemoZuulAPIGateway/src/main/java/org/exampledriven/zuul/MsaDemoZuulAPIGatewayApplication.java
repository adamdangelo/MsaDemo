package org.exampledriven.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import java.net.MalformedURLException;

@EnableZuulProxy
@SpringBootApplication
public class MsaDemoZuulAPIGatewayApplication {

    public static void main(String[] args) throws MalformedURLException {

//        Object[] sources = {SpringCloudZuulExampleApplication.class, new UrlResource(new URL("file:C:/dev/abc_dynamic.groovy"))};
        //Object[] sources = {SpringCloudZuulExampleApplication.class, new ClassPathResource("groovy/ExampleSurgicalDebugFilterBean.groovy")};
        //SpringApplication.run(sources, args);
        SpringApplication.run(MsaDemoZuulAPIGatewayApplication.class, args);
    }

}
