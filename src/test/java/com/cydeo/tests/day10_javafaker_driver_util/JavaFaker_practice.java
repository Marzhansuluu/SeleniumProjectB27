package com.cydeo.tests.day10_javafaker_driver_util;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker_practice {

    @Test
    public void java_faker_test(){
        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        System.out.println("faker.address().city() = " + faker.address().city());

        System.out.println("faker.numerify(\"520-###-####\") = " + faker.numerify("520-###-####"));

        System.out.println("faker.bothify(\"##???##???\") = " + faker.bothify("##???##???"));// ?-letters, #-number

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());

        System.out.println("faker.finance().creditCard().replaceAll(\"-\", \"\") = " + faker.finance().creditCard().replaceAll("-", ""));

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());

    }

}
