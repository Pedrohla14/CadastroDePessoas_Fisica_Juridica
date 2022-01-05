package etities;

public class Juridica extends Pessoa{
	private Integer numFuncionarios;

	public Juridica() {
		super();
	}

	public Juridica(String nome, Double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}


	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	
	
	@Override
	public Double imposto() {
		
		if(numFuncionarios>10) {
			
			return getRendaAnual()*0.14;
			
		}
		else {
			return getRendaAnual()*0.16;
		}
		
	}
	

}
