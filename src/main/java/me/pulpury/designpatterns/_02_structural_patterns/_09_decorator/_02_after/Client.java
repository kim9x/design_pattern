package me.pulpury.designpatterns._02_structural_patterns._09_decorator._02_after;

public class Client {
	
	CommentService commentService;

	public Client(CommentService commentService) {
		this.commentService = commentService;
	}
	
	public void writeComment(String comment) {
		commentService.addComment(comment);
	}
	
	
}
