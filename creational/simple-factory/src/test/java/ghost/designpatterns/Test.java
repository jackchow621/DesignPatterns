package ghost.designpatterns;

/**
 * @Author jackchow
 * @Description 简单工厂模式
 * @Date 15:43 2019-12-24
 * @Param
 * @return
 **/
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory f = new Factory();
		Product p = f.create("A");
		System.out.println(p.getName());
		p = f.create("B");
		System.out.println(p.getName());
	}

}
