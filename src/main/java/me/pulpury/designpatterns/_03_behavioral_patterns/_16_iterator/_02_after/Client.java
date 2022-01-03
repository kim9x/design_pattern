package me.pulpury.designpatterns._03_behavioral_patterns._16_iterator._02_after;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import me.pulpury.designpatterns._03_behavioral_patterns._16_iterator._01_before.Post;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
        board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");

        // TODO 들어간 순서대로 순회하기
        List<Post> posts = board.getPosts();
//        Iterator<Post> iterator = board.getPosts().iterator();
//        Iterator<Post> iterator = board.getDefaultIterator();
        Iterator<Post> iterator = posts.iterator();
        System.out.println(iterator.getClass());
        
//        while (iterator.hasNext()) {
//        	System.out.println(iterator.next().getTitle());
//        }
        
        for (int i = 0 ; i < posts.size() ; i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        // TODO 가장 최신 글 먼저 순회하기
//        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
//        for (int i = 0 ; i < posts.size() ; i++) {
//            Post post = posts.get(i);
//            System.out.println(post.getTitle());
//        }
        
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while(recentPostIterator.hasNext()) {
        	System.out.println(recentPostIterator.next().getTitle());
        }
    }

}
