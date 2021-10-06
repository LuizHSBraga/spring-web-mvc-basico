package br.com.globallabs.springwebmvc.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Jedi {

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 3, max = 20, message = "Name must have between 3 and 20 letters")
    private String name;

    @Size(max = 20, message = "Last Name must not have more than 20 letters")
    private String lastname;

    public Jedi(final String name, final String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public Jedi() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
