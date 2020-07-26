package com.demo.aop;

import com.demo.aop.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AopApplicationInit implements CommandLineRunner {

    private final Student student;

    @Autowired
    public AopApplicationInit(Student student) {
        this.student = student;
    }

    @Override
    public void run(String... args) throws Exception {
        student.sayHello();

        student.echo("123");
    }
}
