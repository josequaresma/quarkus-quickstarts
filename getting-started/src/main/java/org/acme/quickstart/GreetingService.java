package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        return "Hello " + name + "! Welcome to the Accenture DK POC\n";
    }

}
