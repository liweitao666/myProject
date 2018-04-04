package com.example.demo.pattern.stratege.s2;

/**
 * Created by jiaozhiguang on 2017/10/19.
 */
public class RedheadDuck extends Duck implements Flyable,Quackable {
    @Override
    public void display() {
        System.out.println("红头鸭的颜色...");
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}
