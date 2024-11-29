package designpatternthatilike.decorator;

public abstract class TextDeco implements Text{
	Text text;
	
	public TextDeco(Text text) {
		this.text = text;
	}
	
	public abstract String toText();
}
