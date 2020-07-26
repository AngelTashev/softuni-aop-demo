package com.demo.aop;

import com.demo.aop.model.Student;
import com.demo.aop.slo.SLOsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class AopApplicationInit implements CommandLineRunner {

    private final SLOsConfig config;

    @Autowired
    public AopApplicationInit(SLOsConfig config) {
        this.config = config;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(config);
    }
}
