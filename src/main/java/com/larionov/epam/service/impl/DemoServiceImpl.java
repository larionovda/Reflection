package com.larionov.epam.service.impl;

import com.larionov.epam.annotation.Secured;
import com.larionov.epam.entity.Entity;
import com.larionov.epam.service.DemoService;
import java.lang.reflect.Method;

public class DemoServiceImpl implements DemoService {

    Entity entity = new Entity();

    @Override
    public void service() {
        Method[] methods = entity.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Secured.class)) {
                Secured fAnno = method.getAnnotation(Secured.class);
                System.out.println("Method: " + method.getName() + ", Annotation: " + fAnno + ", Parameters: " +  fAnno.string() + " and " + fAnno.integer());
            } else {
                System.out.println("Simple method is " + method.getName());
            }
        }
    }


}
