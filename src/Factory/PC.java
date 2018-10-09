package Factory;

public class PC extends Computer{
	
	private String nome;
	private String cpu;
	private String ram;
	private String hdd;
	
	public PC(String nome, String cpu, String ram, String hdd) {
		super();
		this.nome = nome;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	@Override
	public String getCPU() {
		return this.cpu;
	}

	@Override
	public String getRam() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getNome() {
		return this.nome;
	}
	
}
