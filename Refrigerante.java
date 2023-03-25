package bebidas;


	public class Refrigerante extends Bebida {
		private boolean retornavel;
		
		public boolean getRetornavel() {
			return retornavel;
		}


		public void setRetornavel(boolean retornavel) {
			this.retornavel = retornavel;
		}


		public Refrigerante() {
			this("",0.0, false);
		}

		public Refrigerante(String nome, double preco, boolean retornavel) {
			super(nome, preco);
		      this.retornavel = retornavel;
		}




	    public String mostrarBebida(){
	    	String retor = " RETORNÁVEL";
				
				if(retornavel == false) {
					retor = " N�O RETORNÁVEL";
				}else if(retornavel == true) {
					retor = " RETORNÁVEL";
				}
				return " NOME: " + this.getNome() +"\n PRE�O: " + this.getPreco() + "\n RETORNÁVEL?: " +retor;
	    }
	    
	    
	    public boolean verificarPreco(double vPreco){
			if(vPreco<5) {
				return true;
			}else {
				return false;
			}
		}
	}



