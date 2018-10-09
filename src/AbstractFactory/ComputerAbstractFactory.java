package AbstractFactory;
/*
 * Fabrica de fabricas
 * No factory pattern, a fábrica recebe o tipo do objeto(computador) para cria-lo
 * No AbstractFactory, a fábrica recebe uma fabrica do objeto(computador) específico e depois a cria.
 */
import Factory.Computer;

public interface ComputerAbstractFactory {

	//cria computador de acordo com o tipo
	public Computer createComputer();
}
