package bebidas;

public class Vinho extends Bebida{

	private int safra;
	private String tipo;
	
	public Vinho() {
		this("",0.0,0,"");
	}

	public Vinho(String nome, double preco, int safra, String tipo) {
		super(nome, preco);
		this.safra=safra;
		this.tipo=tipo;
	}


	public int getSafra() {
		return safra;
	}

	public void setSafra(int safra) {
		this.safra = safra;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String mostrarBebida() {

		
		return  " NOME: " + this.getNome() +"\n PREÇO: " + this.getPreco() +"\n SAFRA: " + this.getSafra() +"\n TIPO: "+ this.getTipo();
	}
	
	public boolean verificarPreco(double vPreco){
		if(vPreco<25) {
			return true;
		}else {
			return false;
		}
	}
}
