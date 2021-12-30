package me.pulpury.designpatterns._02_structural_patterns._09_decorator._02_after;

public class SpamFilteringCommentDecorator extends CommentDecorator {

	public SpamFilteringCommentDecorator(CommentService commentService) {
		super(commentService);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addComment(String comment) {
		if(isNotSpam(comment)) {
			super.addComment(comment);
			
		}
	}

	private boolean isNotSpam(String comment) {
		return !comment.contains("http");
	}

}
