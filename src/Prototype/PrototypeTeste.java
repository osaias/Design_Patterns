package Prototype;
/*
 * Este padrão permite criar novos objetos a partir de um clone.
 * Neste caso ele cria um novo objeto(computador) a partir de um protótipo
 * (computador) já montado e o configura com os intens desejados.
 */
public class PrototypeTeste {

	public static void main(String[] args) {
		
		ComputerPrototype pc = new ComputerPrototype();
		//retorna o construtor/objeto vazio
		System.out.println(pc.toString());
		
		ComputerPrototype pc1 = (ComputerPrototype) pc.clone();
		//retorna o construtor/objeto clone
		pc1.setNome("pc DELL");
		System.out.println(pc1.toString());
		
		ComputerPrototype pc2 = (ComputerPrototype) pc.clone();
		//retorna o construtor/objeto clone
		pc2.setNome("tablet DELL");
		System.out.println(pc2.toString());
	}

}
