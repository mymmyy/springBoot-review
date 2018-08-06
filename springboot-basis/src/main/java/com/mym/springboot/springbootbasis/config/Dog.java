package com.mym.springboot.springbootbasis.config;



public class Dog {
    private int gender;

    private int age;

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "gender=" + gender +
                ", age=" + age +
                '}';
    }
}
