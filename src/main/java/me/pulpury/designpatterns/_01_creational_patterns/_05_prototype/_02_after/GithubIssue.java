package me.pulpury.designpatterns._01_creational_patterns._05_prototype._02_after;

import java.util.Objects;

public class GithubIssue implements Cloneable {

    private int id;

    private String title;

    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getRepository() {
        return repository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		// deep copy로 만들기 위해 직접 구현해줌.
		GithubRepository repository = new GithubRepository();
		repository.setUser(this.repository.getUser());
		repository.setName(this.repository.getName());
		
		GithubIssue githubIssue = new GithubIssue(repository);
		githubIssue.setId(this.id);
		githubIssue.setTitle(this.title);
		
		return githubIssue;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, repository, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GithubIssue other = (GithubIssue) obj;
		return id == other.id && Objects.equals(repository, other.repository) && Objects.equals(title, other.title);
	}

	
    
}
