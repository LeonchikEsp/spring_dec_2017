package com.example.spring.spring_dec_2017.MyAnnotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Random;

public class InjectRandomIntegerAnnotationBeanPostProcessor
        implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            InjectRandomInteger annotation = field.getAnnotation(
                    InjectRandomInteger.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();

                Random random = new Random();
                int r = min + random.nextInt(max - min);
                field.setAccessible(true);
                //field.set(r);//Exception
                ReflectionUtils.setField(field, bean, r);
            }
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String s) throws BeansException {
        return bean;
    }
}
