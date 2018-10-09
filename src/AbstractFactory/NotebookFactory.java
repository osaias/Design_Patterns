package AbstractFactory;

import Factory.Computer;
import Factory.Notebook;

public class NotebookFactory implements ComputerAbstractFactory{

	private String nome;
	private String cpu;
	private String ram;
	private String hdd;
	
	
	public NotebookFactory(String nome, String cpu, String ram, String hdd) {
		super();
		this.nome = nome;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}


	//cria computador de acordo com o tipo
	@Override
	public Computer createComputer() {
		return new Notebook(nome, cpu, ram, hdd);
	}
	
}
