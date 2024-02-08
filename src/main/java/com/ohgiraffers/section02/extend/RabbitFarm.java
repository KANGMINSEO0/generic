package com.ohgiraffers.section02.extend;

public class RabbitFarm<T extends Rabbit> {
    // 토끼 타입만 토끼 농장에 들어올 수 있게 제한, 인터페이스 상속 시에도 제네릭 타입은 extends를 사용해야 한다
    // implement 쓰면 에러남
    // ex) <T extends Rabbit & Animal> 로 두가지 상속 가능

    private T animal;

    public RabbitFarm() {}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }
}
