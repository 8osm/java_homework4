package com.osm8.javahomework;

public class Cat implements Voice<String>{
    private static Long ID = 0L;
    public Long Id;
    public String name;
    public Integer age;
    public Double weight;

    public Cat(String name, Integer age, Double weight) {
        this.Id = ID++;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String voice(String phrase) {
        return String.format("Cat #%d says: %s", this.Id, phrase);
    }
}
