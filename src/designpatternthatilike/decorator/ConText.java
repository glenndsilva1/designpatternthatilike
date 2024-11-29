package designpatternthatilike.decorator;

public class ConText implements Text{
	private String name;
	
	public ConText(String name) {
		this.name = name;
	}
	
	@Override
	public String toText() {
		return this.name;
	}
	
	public static void main(String args[]) {
		Text text = new ConText("glenN");
		Text tdeco =  new LowerCaseDeco(new UpperTxtDeco(text));
		System.out.println(tdeco.toText());
		
	}
}
