package me.pulpury.designpatterns._02_structural_patterns._11_flyweight._03_java;

public class FlyweightInJava {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(1000);
        Integer i2 = Integer.valueOf(1000);
        // 원래는 아래의 주석처럼 euqlas로 비교해주어야한다.
//         System.out.println(i1.equals(i2));
        
        // 아래는 -128~127 범위는 거진 캐싱을 해준다고 보면된다.
        // 그래서 아래는  true 값이 나온다.
        // 범위가 벗어나면 false가 나옴.
        System.out.println(i1 == i2);
        
        int a = 1;
        int b = 2;
        
        String c = "test";
    }
}
