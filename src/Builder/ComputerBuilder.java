package Builder;

public class ComputerBuilder {

	private Computer computador;
	
	public ComputerBuilder() {
		computador = new Computer();
	}
	
	public void setCPU(String cpu) {
		computador.cpu = cpu;
	}

	public void setRam(String ram) {
		computador.ram = ram;
	}
	public void setHDD(String hdd) {
		computador.hdd = hdd;
	}
	public void setNome(String nome) {
		computador.nome = nome;
	}
	public void setPlacaVideo(String video) {
		computador.placaVideo = video;
	}

	public void setPlacaSom(String som) {
		computador.placaSom = som;
	}

	public void setPlacaAceleradora(String aceleradora) {
		computador.placaAceleradora = aceleradora;
	}
	
	public Computer build() {
		return computador;
	}
}
