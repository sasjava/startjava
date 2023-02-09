package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerGipsyDanger = new Jaeger();
        jaegerGipsyDanger.setNickName("Yancy"); 
        jaegerGipsyDanger.setModelName("Gipsy Danger1"); 
        jaegerGipsyDanger.setMark("Mark-3");
        jaegerGipsyDanger.setOrigin("USA");
        jaegerGipsyDanger.setHeight(79.25f);
        jaegerGipsyDanger.setWeight(1.98f);
        jaegerGipsyDanger.setStrength(8); 
        jaegerGipsyDanger.setArmor(6);

        Jaeger jaegerBracerPhoenix = new Jaeger("The Shanghai Shield", "Bracer Phoenix1", 
                "Mark-5", "UK", 70.7f, 2.1f, 8, 9 );

        jaegerGipsyDanger.printCharacteristics();
        jaegerBracerPhoenix.printCharacteristics();

        jaegerBracerPhoenix.setNickName("");
        jaegerBracerPhoenix.setModelName("");
        jaegerBracerPhoenix.printCharacteristics();

        jaegerBracerPhoenix.setModelName("Bracer Phoenix2");
        jaegerBracerPhoenix.setArmor(10);
        jaegerBracerPhoenix.printCharacteristics();

        jaegerGipsyDanger.move();
        jaegerBracerPhoenix.move();
        System.out.println();
        jaegerGipsyDanger.run();
        jaegerBracerPhoenix.run();
    }
}