package AbstractFactory;

import Factory.Computer;
import Singleton.ServidorSingleton;

public class ServerFactory implements ComputerAbstractFactory{

	private String nome;
	private String cpu;
	private String ram;
	private String hdd;
	
	
	public ServerFactory(String nome, String cpu, String ram, String hdd) {
		super();
		this.nome = nome;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	//cria computador de acordo com o tipo
	@Override
	public Computer createComputer() {

		ServidorSingleton srv = ServidorSingleton.getInstance();
		
		if (srv.getNome()== null && srv.getCPU()== null 
				&& srv.getHDD()== null && srv.getRam()== null) {
			
			srv.setNome(this.nome + srv.hashCode());
			srv.setCpu(this.cpu);
			srv.setHdd(this.hdd);
			srv.setRam(this.ram);
		}
		return srv;
	}

}
