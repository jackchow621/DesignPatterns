package ghost.designpatterns;

import ghost.designpatterns.target.impl.ConCreateTarget;

public class Proxy implements Target{
	private Target target;
	
	

	public Proxy() {
		// TODO Auto-generated constructor stub
		this.target = new ConCreateTarget();
	}
	



	public void operate() {
		// TODO Auto-generated method stub
		System.out.println("before......");
		target.operate();
		System.out.println("after......");
		
	}

}
