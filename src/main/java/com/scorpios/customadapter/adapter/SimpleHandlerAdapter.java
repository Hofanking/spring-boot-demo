package com.scorpios.customadapter.adapter;


import com.scorpios.customadapter.controller.SimpleController;

public class SimpleHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return handler instanceof SimpleController;
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController) handler).doSimpleController();
    }
}
