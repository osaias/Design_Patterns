package Factory;

public class Notebook extends Computer{

	private String nome;
	private String cpu;
	private String ram;
	private String hdd;
	
	
	public Notebook(String nome, String cpu, String ram, String hdd) {
		super();
		this.nome = nome;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}

}
