package designpatternthatilike.decorator;

public class LowerCaseDeco extends TextDeco {
	LowerCaseDeco(Text text){
		super(text);
	}
	
	@Override
	public String toText() {
		return this.text.toText().toLowerCase();
	}
}

