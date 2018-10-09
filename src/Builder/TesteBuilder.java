package Builder;
/*
 * Este padrão permite construir cada item que forma o objeto
 * Pode-se personalizar cada objeto na construção.
 */
public class TesteBuilder {

	public static void main(String[] args) {
		
		ComputerBuilder pcBuilder = new ComputerBuilder();
		
		pcBuilder.setCPU("I5 7.0 GHZ");
		pcBuilder.setHDD("Samsung 1TB");
		pcBuilder.setNome("PC DELL");
		pcBuilder.setRam("DDR3 GB");
		pcBuilder.setPlacaVideo("Asus VGA");
		System.out.println(pcBuilder.build().toString());
		
		pcBuilder.setCPU("I5 7.0 GHZ");
		pcBuilder.setHDD("Samsung 1TB");
		pcBuilder.setNome("Notebook DELL");
		pcBuilder.setRam("DDR3 GB");
		pcBuilder.setPlacaVideo("Asus VGA");
		System.out.println(pcBuilder.build().toString());
		
		pcBuilder.setCPU("I5 7.0 GHZ");
		pcBuilder.setHDD("Samsung 1TB");
		pcBuilder.setNome("Ultrabook DELL");
		pcBuilder.setRam("DDR3 GB");
		pcBuilder.setPlacaVideo("Asus VGA");
		System.out.println(pcBuilder.build().toString());
	}
	
}
