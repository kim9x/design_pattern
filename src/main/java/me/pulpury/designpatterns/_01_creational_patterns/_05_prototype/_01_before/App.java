package me.pulpury.designpatterns._01_creational_patterns._05_prototype._01_before;

public class App {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);
        
        GithubIssue clone = githubIssue.clone();
        
        // clone != githubIssue
        // 레퍼런스가 같지 않음
        // clone.equals(githubIssue) => 같다
        // equals는 그 안의 데이터가 같은지 보는 것이기 때문
        
    }

}
