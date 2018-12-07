package com.example.helloworld.pojo;

import org.hibernate.validator.constraints.Email;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String lastName;
    private Integer age;
    private boolean boos;
    private String brith;

    private Map<String,Object> maps1;
    private Map<String,Object> maps2;
    private List<String> list1;
    private List<String> list2;
    private Dog dog;

    @Email
    private String email;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoos() {
        return boos;
    }

    public void setBoos(boolean boos) {
        this.boos = boos;
    }

    public String getBrith() {
        return brith;
    }

    public void setBrith(String brith) {
        this.brith = brith;
    }

    public Map<String, Object> getMaps1() {
        return maps1;
    }

    public void setMaps1(Map<String, Object> maps1) {
        this.maps1 = maps1;
    }

    public Map<String, Object> getMaps2() {
        return maps2;
    }

    public void setMaps2(Map<String, Object> maps2) {
        this.maps2 = maps2;
    }

    public List<String> getList1() {
        return list1;
    }

    public void setList1(List<String> list1) {
        this.list1 = list1;
    }

    public List<String> getList2() {
        return list2;
    }

    public void setList2(List<String> list2) {
        this.list2 = list2;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boos=" + boos +
                ", brith='" + brith + '\'' +
                ", maps1=" + maps1 +
                ", maps2=" + maps2 +
                ", list1=" + list1 +
                ", list2=" + list2 +
                ", dog=" + dog +
                '}';
    }
}
