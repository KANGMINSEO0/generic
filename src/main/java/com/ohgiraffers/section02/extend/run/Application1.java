package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. extends 키워드를 이용하여 특정 타입만 사용하도록 제네릭 범위를 제한할 수 있다. */

//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<>();    // 토끼나 토끼 후손만 됨
//        RabbitFarm<Snake> farm2 = new RabbitFarm<Snake>()
        RabbitFarm<Rabbit> farm3 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm4 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm5 = new RabbitFarm<>();

        farm3.setAnimal(new Rabbit());
        ((Rabbit) farm3.getAnimal()).cry();
        farm3.getAnimal().cry();

        farm4.setAnimal(new Bunny());
        ((Bunny) farm4.getAnimal()).cry();
        farm4.getAnimal().cry();

        farm5.setAnimal(new DrunkenBunny());
        ((DrunkenBunny) farm5.getAnimal()).cry();
        farm5.getAnimal().cry();
    }
}
