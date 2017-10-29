package ghost.designpatterns.builder;

public class Director {
	private Builder builder;

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public void create(){
		this.builder.productA();
		this.builder.productB();
		this.builder.productC();
	}
}
