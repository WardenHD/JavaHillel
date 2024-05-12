package com.wardendev.hillelproject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import com.wardendev.hillelproject.string.StringOperations;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // Used some Reflection
        Method[] stringMethods = StringOperations.class.getDeclaredMethods();

        for (Method method : stringMethods) {
            if(method.getReturnType() == String[].class) 
                System.out.println(Arrays.toString((String[]) method.invoke(null, "Hello World")));
            else System.out.println(method.invoke(null, "hello"));
        }
    }
}
