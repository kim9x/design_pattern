package me.pulpury.designpatterns._01_creational_patterns._04_builder._03_java;

public class StringBuilderExample {

    public static void main(String[] args) {
    	// StringBuffer와 StringBuilder의 차이는
    	// StringBuffer는 syncronized를 지원해준다.!
    	// 반면, StirngBuilder는 지원하지 않음.
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("whiteship").append("keesun").toString();
        System.out.println(result);
    }
}
