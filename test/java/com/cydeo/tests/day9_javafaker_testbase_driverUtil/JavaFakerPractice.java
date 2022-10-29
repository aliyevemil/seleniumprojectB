package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class JavaFakerPractice {

    @Test
    public void test1(){
        //Creating Faker object  to reach methods
        Faker faker=new Faker( new Locale("en"));

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        //numerify() method will generate random numbers where we pass #
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));
        System.out.println("faker.numerify(\"#321-12###\") = " + faker.numerify("#321-12###"));

        ///letterify() method will return random letters where we pass ?
        System.out.println("faker.letterify(\"???????\") = " + faker.letterify("???-????"));
        System.out.println("faker.letterify(\"??xx??x?x\") = " + faker.letterify("??xx??x?x"));
        //bothify()
        System.out.println("faker.bothify(\"##??#?#?##??-##?\") = " + faker.bothify("##??#?#?##??-##?"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().replaceAll("-",""));

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris","Muhtar"));


    }
}
