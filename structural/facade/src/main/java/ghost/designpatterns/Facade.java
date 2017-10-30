package ghost.designpatterns;

import ghost.designpatterns.system.SystemA;
import ghost.designpatterns.system.SystemB;
import ghost.designpatterns.system.SystemC;

public class Facade{
	public void wrapOperate(){
		SystemA systemA = new SystemA();
		SystemB systemB = new SystemB();
		SystemC systemC = new SystemC();
		
		systemA.OperateA();
		systemB.OperateB();
		systemC.OperateC();
	}
}