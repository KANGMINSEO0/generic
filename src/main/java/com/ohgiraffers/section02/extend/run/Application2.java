package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 와일드카드에 대해 이해할 수 있다. */
        /* 필기.
        *  와일드카드(WildCard)
        *  제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
        *  그 객체의 타입 변수를 제한할 수 있다.
        * <?> : 제한 없음
        * <? extends Type> : 와일드카드의 상한 제한(Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용가능)
        * <? super Type> : 와일드 카드 하한 제한(Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용 가능)
        * */

        WildeCardFarm wildeCardFarm = new WildeCardFarm();
//        wildeCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal())); // 포유류랑 파충류는 매개변수로 사용 불가
        wildeCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildeCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildeCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

//        wildeCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));  // Bunny의 상위는 매개변수로 사용 불가
        wildeCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildeCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        wildeCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildeCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildeCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny())); // Bunny의 하위 타입은 매개변수로 사용 불가


    }
}
