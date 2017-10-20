package com.spring.dependent;

/**
 * Created by zhuxiaoxiang.zhu on 17-10-20.
 */
public class A {
    private B b;

    public A(B b) {
        this.b = b;
    }

    public A() {
    }

    public void setB(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }
}
