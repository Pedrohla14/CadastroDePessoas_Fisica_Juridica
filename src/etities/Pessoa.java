package etities;
// classe abstrata pois tem método abstrato, logo essa classe não pode ser instanciadas só as subclasses.
public abstract class Pessoa {
private String nome;
private Double rendaAnual;

public Pessoa() {
	
}

public Pessoa(String nome, Double rendaAnual) {
	
	this.nome = nome;
	this.rendaAnual = rendaAnual;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Double getRendaAnual() {
	return rendaAnual;
}

public void setRendaAnual(Double rendaAnual) {
	this.rendaAnual = rendaAnual;
}

public abstract Double imposto();
	




}
