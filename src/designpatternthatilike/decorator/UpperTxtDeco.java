package designpatternthatilike.decorator;

public class UpperTxtDeco extends TextDeco {
	public UpperTxtDeco(Text text) { 
		super(text);
	}
	
	@Override
	public String toText() {
		return this.text.toText().toUpperCase();
	}

}
