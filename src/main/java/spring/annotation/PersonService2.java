package spring.annotation;

import org.springframework.stereotype.Component;

@Component("userService2")
public class PersonService2 implements UserService2{
    @Override
    public void save(String name) {
        System.out.println("Saving " + name);
    }
}
