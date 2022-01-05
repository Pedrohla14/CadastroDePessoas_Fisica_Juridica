package etities;

public class Fisica extends Pessoa {

	private Double gastoSaude;
	
	public Fisica() {
		super();
	}
	public Fisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	public Double getGastoSaude() {
		return gastoSaude;
	}
	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public Double imposto() {
		double DescontoNoGastoSaude=0.5;//porcetagem em cima do gasto saúde
		if(getRendaAnual()<20000) {
			return getRendaAnual()*0.15 - gastoSaude*DescontoNoGastoSaude;
			
		}
		else {
			return getRendaAnual()*0.25 - gastoSaude*DescontoNoGastoSaude;
		}
	}

}









