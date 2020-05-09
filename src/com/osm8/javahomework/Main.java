package com.osm8.javahomework;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Cat", 5, 4D);
        Cat secondCat = new Cat("Cat 2", 2, 3.7D);
        Cat thirdCat = new Cat("Cat 3", 1, 2.7D);

        System.out.println(cat.voice("i'm a cat"));
        System.out.println(secondCat.voice("i'm a cat too"));
        System.out.println(thirdCat.voice("meow"));
    }
}
