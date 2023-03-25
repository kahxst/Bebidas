package bebidas;

public class Suco extends Bebida {
	private String sabor;
	
	public String getSabor() {
		return sabor;
	}
	
	public Suco() {
		this("",0.0,0,"");
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public Suco(String nome, double preco, int safra, String sabor) {
		super(nome, preco);
		this.sabor=sabor;
	}


	public String mostrarBebida() {
		return " NOME: " + this.getNome() +"\n PREÇO: " + this.getPreco() + "\n SABOR: " + this.getSabor();
	}
	
	public boolean verificarPreco(double vPreco){
		if(vPreco<2.5) {
			return true;
		}else {
			return false;
		}
	}
}
