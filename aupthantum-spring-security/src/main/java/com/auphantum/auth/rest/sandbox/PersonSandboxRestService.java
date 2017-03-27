package com.auphantum.auth.rest.sandbox;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonSandboxRestService {
    private static final List<PersonSandbox> persons;

    static {
        persons = new ArrayList<>();
        persons.add(new PersonSandbox("Hello", "World"));
        persons.add(new PersonSandbox("Foo", "Bar"));
    }

    @RequestMapping(path = "/sandbox/persons", method = RequestMethod.GET)
    public static List<PersonSandbox> getPersons() {
        return persons;
    }

    @RequestMapping(path = "/sandbox/persons/{name}", method = RequestMethod.GET)
    public static PersonSandbox getPerson(@PathVariable("name") String name) {
        return persons.stream()
                .filter(person -> name.equalsIgnoreCase(person.getName()))
                .findAny().orElse(null);
    }
}
