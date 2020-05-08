package xxmsshargingjdbc.xxmsshargingjdbc.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author: shaozhixing
 * @date: 2020/5/8 18:57
 * @copyright: gofun
 */
@Component
public class ApplicationContextUtils implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public static <T> T getBean(Class<T> clz) throws BeansException {
        return context.getBean(clz);
    }
}
