package de.vedantwankha.java.liang.io;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface OnlyForInternalUse {
    boolean value() default true;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface OnlyForLocalUse {
    boolean value() default true;
}

public class AnnotationsExample {

    @OnlyForLocalUse
    int myVar = 22;

    @OnlyForLocalUse(false)
    int notMyVar = 99;

    @OnlyForInternalUse
    public static void method1() {

    }
    @OnlyForInternalUse(false)
    public static void method2() {

    }

    public static void demo() throws NoSuchMethodException, NoSuchFieldException {
        Method m1 = AnnotationsExample.class.getMethod("method1");
        OnlyForInternalUse ann1 = m1.getAnnotation(OnlyForInternalUse.class);
        System.out.println("Internal use? : " + ann1.value());

        Method m2 = AnnotationsExample.class.getMethod("method2");
        OnlyForInternalUse ann2 = m2.getAnnotation(OnlyForInternalUse.class);
        System.out.println("Internal use? : " + ann2.value());

        Field d1 = AnnotationsExample.class.getDeclaredField("myVar");
        OnlyForLocalUse ann3 = d1.getAnnotation(OnlyForLocalUse.class);
        System.out.println("Local use? : " + ann3.value());

        Field d2 = AnnotationsExample.class.getDeclaredField("notMyVar");
        OnlyForLocalUse ann4 = d2.getAnnotation(OnlyForLocalUse.class);
        System.out.println("Local use? : " + ann4.value());

    }
}
