package Factory;

public class TesteFactory {
	
	public static void main(String[] args) {
		
		Computer pc1 = ComputerFactory.getComputer("pc", "pc1", "ddr3 4gb", "Seagate 1tb", "AMD 5ghz");
		Computer pc2 = ComputerFactory.getComputer("pc", "pc2", "ddr2 4gb", "Samsung 1tb", "Intel core i3 5ghz");
		
		Computer srv1 = ComputerFactory.getComputer("server", "servidor ", "ddr4 32gb", "Seagate 5tb", "Intel core i7 10ghz");
		
		//Não executa porque o servidor é singleton
		Computer srv2 = ComputerFactory.getComputer("server", "servidor ", "ddr5 teste", "Seagate teste", "Intel core teste");
		
		System.out.println(pc1);
		System.out.println(pc2);
		System.out.println(srv1);
		System.out.println(srv2);
	}
}
