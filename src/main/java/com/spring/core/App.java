package com.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = context.getBean("accountServiceImpl", AccountService.class);
        accountService.getSavePerson("Ahmed");
        context.close();
    }
}
