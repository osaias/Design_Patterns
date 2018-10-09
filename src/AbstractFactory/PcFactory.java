package AbstractFactory;

import Factory.Computer;
import Factory.PC;

public class PcFactory implements ComputerAbstractFactory{

	private String nome;
	private String cpu;
	private String ram;
	private String hdd;
	
	
	public PcFactory(String nome, String cpu, String ram, String hdd) {
		super();
		this.nome = nome;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	//cria computador de acordo com o tipo
	@Override
	public Computer createComputer() {
		
		return new PC(nome,cpu,ram,hdd);
	}

}
