package com.startjava.lesson_2_3_4.animal;

public class Wolf {
    private char gender;
    private String nickname;
    private int weight;
    private int age;
    private String color;
    
    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println(age + " - Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public String getNickname() {
        return nickname;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void go() {
        System.out.println("Идёт");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }
    public void howl() {
        System.out.println("Воет");
    }
    
    public void hunt() {
        System.out.println("Охотится");
    }
}