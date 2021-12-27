package me.pulpury.designpatterns._01_creational_patterns._04_builder._03_java;

import lombok.Builder;

// 이렇게 되면 아래메소드처럼 사용이 가능하다.
@Builder
public class LombokExample {

    private String title;

    private int nights;

    private int days;

    public static void main(String[] args) {
        LombokExample trip = LombokExample.builder()
                .title("여행")
                .nights(2)
                .days(3)
                .build();
    }

}
