package p15.textbook.exercises.ex07;

public class Board {
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	public String getTilte() { return title; }
	public String getContent() { return content; }
}