package com.example.dog_301_demo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String name;

    @NotNull
    @Min(1)
    private int age;


    private String faveTreat;

    public Dog() {
    }

    public Dog(@NotNull String name, @NotNull @Min(1) int age, String faveTreat) {
        this.name = name;
        this.age = age;
        this.faveTreat = faveTreat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFaveTreat() {
        return faveTreat;
    }

    public void setFaveTreat(String faveTreat) {
        this.faveTreat = faveTreat;
    }
}
