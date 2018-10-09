package AbstractFactory;

import Factory.Computer;

public class TesteAbstractFactory {

	public static void main(String[] args) {
		
		//Aqui poderia ser criada uma classe que implementava o metodo createFactory
		Computer notebook = createFactory(new NotebookFactory("Notebook ASUS", "Intel i3", "DDR3 8GB", "Maxtom 2tb"));
		Computer pc = createFactory(new PcFactory("PC Positivo", "Intel i3", "DDR3 8GB", "Maxtom 500gb"));
		Computer servidor = createFactory(new ServerFactory("Servidor", "Intel i10", "DDR3 128GB", "Maxtom 12tb"));
		
		System.out.println(notebook);
		System.out.println(pc);
		System.out.println(servidor);
	}

	public static Computer createFactory(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
