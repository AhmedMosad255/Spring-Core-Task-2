package spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceImpl2 implements AccountService2 {

    private final UserService2 userService;

    @Autowired
    public AccountServiceImpl2(@Qualifier("userService2") UserService2 userService) {
        this.userService = userService;
    }

    @Override
    public void getSavePerson(String name) {
        userService.save(name);
    }
}
