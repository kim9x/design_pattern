package me.pulpury.designpatterns._01_creational_patterns._05_prototype._02_after;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);
        
        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());
        
        // 레퍼런스는 다르다.
        System.out.println(clone != githubIssue);
        
        // 값은 같다.
        System.out.println(clone.equals(githubIssue));
        
        // 같은 클래스이다.
        System.out.println(clone.getClass() == githubIssue.getClass());
        
        // shallow copy 이기 때문에 참조가 같다.
        // 완전히 새로운 deep copy를 만들고 싶다면?
        // clone을 직접 구현하면 됨!
        System.out.println(clone.getRepository() == githubIssue.getRepository());
    }

}
