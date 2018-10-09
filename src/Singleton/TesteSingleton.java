package Singleton;

public class TesteSingleton {

	public static void main(String[] args) {
		ServidorSingleton serv = ServidorSingleton.getInstance();
		System.out.println(serv.hashCode());
		
		ServidorSingleton serv2 = ServidorSingleton.getInstance();
		System.out.println(serv2.hashCode());
	}

}
