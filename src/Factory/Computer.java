package Factory;

public abstract class Computer {

	public abstract String getCPU();
	public abstract String getRam();
	public abstract String getHDD();
	public abstract String getNome();
	
	@Override
	public String toString() {
		return "NOME: " + this.getNome() + " HDD: " + this.getHDD() + 
				" CPU: " + this.getCPU() + " RAM: " + this.getRam() + "\n";
	}
}
