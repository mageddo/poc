package com.mageddo.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {
    public String hello() {
        return "<h1>Hello World!!!</h1>";
    }
}
