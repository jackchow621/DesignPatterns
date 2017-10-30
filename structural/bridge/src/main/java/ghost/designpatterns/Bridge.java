package ghost.designpatterns;

public class Bridge {
	private Implementor implementor;

	public Bridge(Implementor implementor) {
		this.implementor = implementor;
	}
	
	public void request(){
		implementor.operate();
	}
}
