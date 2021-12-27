package me.pulpury.designpatterns._01_creational_patterns._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student keesun = new Student("keesun");
        Student whiteship = new Student("whiteship");
        List<Student> students = new ArrayList<>();
        students.add(keesun);
        students.add(whiteship);
        
        // shallow copy..
        // ArrayList가 'Cloneable'를 구현해 줌.
        // 그러나 Cloneable보단 생성자를 사용하여 
        // 기존 Collection을 복사하여 사용한다.
        // 왜냐하면 인터페이스 타입인 List를 주로 사용하기 때문에..
        // List는 확장성에는 용이하지만 (List를 구현하고 있기 때문)
        // Cloneable 인터페이스를 상속받고 있지 않기 때문. 
        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
