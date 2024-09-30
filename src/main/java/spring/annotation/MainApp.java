package spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService2 service = context.getBean(AccountService2.class);
        service.getSavePerson("Omer");
        context.close();
    }
}
