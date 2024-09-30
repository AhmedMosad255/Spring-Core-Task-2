package com.spring.core;

public class AccountServiceImpl implements AccountService {
    private final PersonService personService;

    public AccountServiceImpl(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public void getSavePerson(String name) {
        personService.save(name);
    }
}
