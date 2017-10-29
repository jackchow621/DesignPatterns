package ghost.designpatterns;


public class Factory {
	public Product create(String name){
		if ( "A".equals(name))
		{
			return new ProductA();
		}
		else if("B".equals(name))
		{
			return new ProductB();
		}
		return  null;
	}
}
