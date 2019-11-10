package com.scorpios.customadapter;


import com.scorpios.customadapter.adapter.AnnotationHandlerAdapter;
import com.scorpios.customadapter.adapter.HandlerAdapter;
import com.scorpios.customadapter.adapter.HttpHandlerAdapter;
import com.scorpios.customadapter.adapter.SimpleHandlerAdapter;
import com.scorpios.customadapter.controller.AnnotationController;
import com.scorpios.customadapter.controller.Controller;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {


    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();


    DispatchServlet(){
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new AnnotationHandlerAdapter());
    }


    public void doDispatch(){
//        HttpController controller = new HttpController();
//        SimpleController controller = new SimpleController();
        AnnotationController controller = new AnnotationController();

        HandlerAdapter adapter = getHandler(controller);
        adapter.handle(controller);
    }

    private HandlerAdapter getHandler(Controller controller) {

        for(HandlerAdapter adapter : this.handlerAdapters){
            if(adapter.supports(controller)){
                return adapter;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
    }
}
