package Prototype;

public class ComputerPrototype implements Cloneable{

	private String nome;
	private String cpu;
	private String ram;
	private String hdd;
	private String placaVideo;
	private String placaSom;
	private String placaAceleradora;
	
	public ComputerPrototype() {
		this.nome = "DELL";
		this.cpu = "Intel i7";
		this.ram = "DDR3";
		this.hdd = "Seagate 1TB";
		this.placaAceleradora = "";
		this.placaSom = "";
		this.placaVideo = "";
	}
	
	public ComputerPrototype(ComputerPrototype prototype) {
		this.nome = prototype.getNome();
		this.cpu = prototype.getCpu();
		this.ram = prototype.getRam();
		this.hdd = prototype.getHdd();
		this.placaAceleradora = prototype.getPlacaAceleradora();
		this.placaSom = prototype.getPlacaSom();
		this.placaVideo = prototype.getPlacaVideo();
	}

	public String getNome() {
		return nome;
	}

	public String getCpu() {
		return cpu;
	}

	public String getRam() {
		return ram;
	}

	public String getHdd() {
		return hdd;
	}

	public String getPlacaVideo() {
		return placaVideo;
	}

	public String getPlacaSom() {
		return placaSom;
	}

	public String getPlacaAceleradora() {
		return placaAceleradora;
	}
	
	@Override
	public Object clone() {
		return new ComputerPrototype(this);
		
	}
	
	public String toString() {
		return nome + " " + cpu + " " + ram + " "
				+ hdd + " " + placaVideo + " " + placaSom
				+ " " + placaAceleradora;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public void setPlacaVideo(String placaVideo) {
		this.placaVideo = placaVideo;
	}

	public void setPlacaSom(String placaSom) {
		this.placaSom = placaSom;
	}

	public void setPlacaAceleradora(String placaAceleradora) {
		this.placaAceleradora = placaAceleradora;
	}
}
