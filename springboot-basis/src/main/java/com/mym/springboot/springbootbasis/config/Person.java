package com.mym.springboot.springbootbasis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.*;

@ConfigurationProperties(prefix = "person")
@Component
public class Person {

    private String lastName;

    private int age;

    private Date birth;

    private Dog dog;

    private Map<String, Object> maps = new HashMap<>();

    private List<Integer> lists = new ArrayList<>();

    public Person(){
        System.out.println("init person!");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Integer> getLists() {
        return lists;
    }

    public void setLists(List<Integer> lists) {
        this.lists = lists;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", dog=" + dog +
                ", maps=" + maps +
                ", lists=" + lists +
                '}';
    }
}
