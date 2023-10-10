package br.com.rayana.section06._0603;

import br.com.rayana.section05._0505.MaxKt;

public class HelloKotlinFromJava {

    public static void main(String[] args) {
        Person person = new Person("Robert", "Martin");
        System.out.println("His name is " + person.getFirstName());

        person.setFirstName("Uncle Bob");
        System.out.println("His name is " + person.getFirstName());

        Integer maxInt = MaxKt.max(2001, 2022);
        System.out.println("The max value is: " + maxInt);
    }
}
