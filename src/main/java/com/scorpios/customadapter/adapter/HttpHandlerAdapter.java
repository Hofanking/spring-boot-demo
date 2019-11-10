package com.scorpios.customadapter.adapter;


import com.scorpios.customadapter.controller.HttpController;

public class HttpHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return handler instanceof HttpController;
    }

    @Override
    public void handle(Object handler) {
        ((HttpController) handler).doHttpController();
    }
}
