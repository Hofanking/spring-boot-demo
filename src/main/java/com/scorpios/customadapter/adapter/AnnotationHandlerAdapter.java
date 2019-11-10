package com.scorpios.customadapter.adapter;


import com.scorpios.customadapter.controller.AnnotationController;

public class AnnotationHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return handler instanceof AnnotationController;
    }

    @Override
    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationController();
    }
}
