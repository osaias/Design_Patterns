package Builder;

public class Computer {
	protected String nome;
	protected String cpu;
	protected String ram;
	protected String hdd;
	protected String placaVideo;
	protected String placaSom;
	protected String placaAceleradora;
	
	public String toString() {
		return nome + " " + cpu + " " + ram + " "
				+ hdd + " " + placaVideo + " " + placaSom
				+ " " + placaAceleradora;
	}
}
