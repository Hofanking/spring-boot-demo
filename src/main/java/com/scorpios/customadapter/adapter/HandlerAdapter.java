package com.scorpios.customadapter.adapter;


public interface HandlerAdapter {

    boolean supports(Object handler);

    void handle(Object handler);
}
