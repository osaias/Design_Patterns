package Singleton;

import Factory.Computer;

/*
 * 1. Toda a aplicação usa essa classe do mesmo jeito
 * 2. A aplicação nessecita só de uma instancia dessa classe
 * 3. Se os clientes desta classe não tiverem conhecimento da aplicação
eles são parte
 */
public class ServidorSingleton extends Computer{
	
	private String nome;
	private String cpu;
	private String ram;
	private String hdd;
	
	private volatile static ServidorSingleton INSTANCE;
	
	private ServidorSingleton() {
		
	}
	
	public static ServidorSingleton getInstance() {
        if (INSTANCE == null){
           synchronized(ServidorSingleton.class){
              if(INSTANCE == null){
                 INSTANCE = new ServidorSingleton();
              }
           }
        }
		return INSTANCE;
     }
	
	protected Object readResolve() {
	    return getInstance();
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
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getNome() {
		return this.nome;
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
	
	
}
