package org.xichaun.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class StaticMethod <T> implements ApplicationContextAware {
    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        StaticMethod.applicationContext = applicationContext;
    }

    public static <T> T  getBean(Class<T> clazz) {
        return applicationContext != null?applicationContext.getBean(clazz):null;
    }

}
