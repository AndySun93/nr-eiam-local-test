package com.szp.study.nacos;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created on 2021/6/16.
 *
 * @author SunZhiPeng
 */
@EnableDubbo
@SpringBootApplication
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "${nacos.config.addrs}"))
@NacosPropertySource(dataId = "local", autoRefreshed = true)
public class StarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarterApplication.class,args);
    }
}

