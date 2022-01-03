package me.pulpury.designpatterns._03_behavioral_patterns._16_iterator._02_after;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import me.pulpury.designpatterns._03_behavioral_patterns._16_iterator._01_before.Post;

public class RecentPostIterator implements Iterator<Post> {
	
	private Iterator<Post> internalIterator;
	
//	private Board board;

	public RecentPostIterator(List<Post> posts) {
//		List<Post> posts = board.getPosts();
		Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
		this.internalIterator = posts.iterator();
//		this.board = board;
	}

	@Override
	public boolean hasNext() {
		return this.internalIterator.hasNext();
	}

	@Override
	public Post next() {
		return this.internalIterator.next();
	}

}
