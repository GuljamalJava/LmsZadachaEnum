package Enums;

import java.util.Scanner;

enum Days {
    MONDAY("Дуйшөмбү куну Жавада окуйм"),
    TUESDAY("Шейшемби куну Англис тилинде окуйм"),
    WEDNESDAY("Шаршемби куну Араб тилин окуйм"),
    THURSDAY("Бейшемби куну СММ окуйм"),
    FRIDAY("Жума куну Куран курсунда онлайн окуйм"),
    SATURDAY("Ишемби куну таалимге барам"),
    SUNDAY("Жекшемби куну Эс алам");
   private final String discription;

    Days(String discription) {
        this.discription = discription;
    }

    public String getDiscription() {
        return discription;
    }

    @Override
    public String toString() {
        return "Days{" +
                "discription='" + discription + '\'' +
                '}';
    }
}
