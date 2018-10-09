package Factory;
/*
 * Usado quando temos uma super classe com várias sub-classes e com base na entrada, 
 * precisamos retornar uma das sub-classes
 */

import Singleton.ServidorSingleton;

public class ComputerFactory{
	
	public static Computer getComputer(String type, String nome ,String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) return new PC(nome, cpu, ram, hdd);
		
		//Neste caso só fabrica um servidor porque o mesmo é singleton
		else if("Server".equalsIgnoreCase(type)) {
			ServidorSingleton srv = ServidorSingleton.getInstance();
			
			if (srv.getNome()== null && srv.getCPU()== null 
					&& srv.getHDD()== null && srv.getRam()== null) {
				srv.setNome(nome + srv.hashCode());
				srv.setCpu(cpu);
				srv.setHdd(hdd);
				srv.setRam(ram);
			}
			return srv;
		}
		return null;
	}
}
