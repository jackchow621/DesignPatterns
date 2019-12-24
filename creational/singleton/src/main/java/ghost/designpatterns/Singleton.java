package ghost.designpatterns;

/**
 * @Author jackchow
 * @Description 单例模式
 * @Date 15:40 2019-12-24
 * @Param
 * @return
 **/
public class Singleton {
	private static Product product;

	public Singleton() {
	}

	//懒汉
	public Product create(){
		if(product == null){
			System.out.println("init product");
			product = new Product();
		}
		return product;
	}

	//饿汉
	public Product create2(){
		return new Product();
	}
}
