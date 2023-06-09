package bebidas;

public abstract class Bebida {
	
	private String nome;
	private double preco;

	public Bebida() {
		this("",0.0);
	}
	
	public Bebida(String nome, double preco) {
		this.preco=preco;
		this.nome=nome;
	}
	
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public abstract String mostrarBebida();
    public abstract boolean verificarPreco(double vPreco);
 

	
}
