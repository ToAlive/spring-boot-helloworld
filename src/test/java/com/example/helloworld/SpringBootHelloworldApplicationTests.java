package com.example.helloworld;

import com.example.helloworld.pojo.Dog;
import com.example.helloworld.pojo.Peopel;
import com.example.helloworld.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootHelloworldApplicationTests {

    @Autowired
    Person person;

    @Autowired
    Dog dog;


    @Autowired
    Peopel people;
    @Test
    public void contextLoads() {

        System.out.println(person);
    }


    @Test
    public void contextLoads2(){
        System.out.println(dog);
    }

    @Test
    public void contextLoads3(){
        System.out.println(people);
    }
}
