package com.zxg.thy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/29.
 */
@RequestMapping(value = "/addd")
@SpringBootApplication
public class SpringThyApplication implements EmbeddedServletContainerCustomizer{

    @RequestMapping(value = "/abc")
    public String getDemo(){
        return "Hello world!";
    }
    public static void main(String[] args){

        SpringApplication.run(SpringThyApplication.class,args);
    }

    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(9090);

    }
}
