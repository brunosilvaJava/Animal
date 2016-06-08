package animal;

public abstract class Animal {

	private Integer velocidade;
	
	public Animal(){
		
	} 
	
	public Animal(Integer velocidade) {
		this.velocidade = velocidade;
	}
	
	public abstract String emitirSom();
	
	@Override
	public String toString() {
		return this.getClass().toString().substring(13);
	}	

	public Integer getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}
	
}
