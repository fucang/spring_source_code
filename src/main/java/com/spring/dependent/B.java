package com.spring.dependent;

import com.spring.dependent.A;

/**
 * Created by zhuxiaoxiang.zhu on 17-10-20.
 */
public class B {
    private A a;

    public B(A a) {
        this.a = a;
    }

    public B() {
    }

    public void setA(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }
}
