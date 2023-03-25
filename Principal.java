package bebidas;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
//		Bebida minhaBebida = new Bebida();
		Vinho meuVinho = new Vinho();
		Suco meuSuco = new Suco();
		Refrigerante meuRefri = new Refrigerante();
//		String nomev = null, nomes = null, nomer = null;
//		double precov = 0, precos = 0, precor = 0;
		int c=1;
			String[] opcao =  { "Vinho", "Suco", "Refrigerante", "Sair"}; //op��es de bebidas
			String[] cadastro = {"Cadastrar Bebida", "Verificar Pre�o", "Mostrar Bebida", "Sair" }; //cadastro de dados
			String[] RefriRetor = {"Sim", "Não"}; // se � ou n�o retorn�vel
			
			




		
		do {

			
			int r = JOptionPane.showInternalOptionDialog(null, "ESCOLHA UMA OP��O", "OP��ES", JOptionPane.DEFAULT_OPTION,
			        JOptionPane.QUESTION_MESSAGE, null, cadastro, cadastro[0]);
			 		if(r == 0) {
			 			int opcao1 = JOptionPane.showInternalOptionDialog(null, "ESCOLHA UMA BEBIDA PARA CADASTRAR", "OP��ES ", JOptionPane.DEFAULT_OPTION,
							      JOptionPane.QUESTION_MESSAGE, null,  opcao, opcao[0] );
			 			
//			 			CADASTRAR
			 			if(opcao1 == 0) {
			 				//vinho
			 				
			 				meuVinho.setPreco ( Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o pre�o do Vinho")));
			 				meuVinho.setNome  (JOptionPane.showInputDialog(null, "Digite o nome do Vinho"));
			 				meuVinho.setTipo(JOptionPane.showInputDialog(null, "Digite o tipo do Vinho"));
			 				meuVinho.setSafra ( Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a safra do Vinho")));
			 				
			 			}if(opcao1 == 1) {
			 				//suco
			 				
			 				meuSuco.setPreco( Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o pre�o do Suco")));
			 				meuSuco.setNome (JOptionPane.showInputDialog(null, "Digite o nome do Suco"));
			 				meuSuco.setSabor (JOptionPane.showInputDialog(null, "Digite o sabor do Suco"));
			 			}
			 			if(opcao1 == 2) {
			 				//refri
			 				
			 				meuRefri.setPreco      ( Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o pre�o do Refrigerante")));
			 				meuRefri.setNome       (JOptionPane.showInputDialog(null, "Digite o nome do Refrigerante"));
			 				int retorna = (JOptionPane.showOptionDialog(null, "Seu refrigerante vem em garrafas retorn�veis?", "Refrigerantes", 0,
	                                    JOptionPane.QUESTION_MESSAGE, null, RefriRetor, RefriRetor[0]));
			 				
			 				if(retorna == 0) {
			 					meuRefri.setRetornavel(true);
			 				}else if(retorna == 1) {
			 					meuRefri.setRetornavel(false);
			 				}
			 			}
			 			
			 			
			 		}
//			 		SAIR
			 		
			 		if(r == 3) {
			 			c = 5;
			 		}
			 		
//			 		VERIFICAR PRE�O

			 		if(r==1) {
			 			int opcao1 = JOptionPane.showInternalOptionDialog(null, "ESCOLHA UMA BEBIDA PARA VERIFICAR", "OP��ES ", JOptionPane.DEFAULT_OPTION,
							      JOptionPane.QUESTION_MESSAGE, null,  opcao, opcao[0]);
			 			
			 		  if(opcao1==0) {
			 			  
			 			  if (meuVinho.verificarPreco(meuVinho.getPreco())) {
								JOptionPane.showMessageDialog(null, "O pre�o do vinho � R$" +meuVinho.getPreco()+"\n Pre�o na PROMO��O!", "PRE�O", JOptionPane.INFORMATION_MESSAGE);
							}else {
								JOptionPane.showMessageDialog(null,  "O pre�o do vinho � R$" +meuVinho.getPreco()+"\n Pre�o NORMAL", "PRE�O", JOptionPane.INFORMATION_MESSAGE);
							}
			 		  }else if(opcao1 == 1) {
			 			 if (meuSuco.verificarPreco(meuSuco.getPreco())) {
								JOptionPane.showMessageDialog(null, "O pre�o do suco � R$" +meuSuco.getPreco()+"\n Pre�o na PROMO��O!", "PRE�O", JOptionPane.INFORMATION_MESSAGE);
							}else {
								JOptionPane.showMessageDialog(null,  "O pre�o do suco � R$" +meuSuco.getPreco()+"\n Pre�o NORMAL", "PRE�O", JOptionPane.INFORMATION_MESSAGE);
							}
			 		  }else {
			 			 if (meuRefri.verificarPreco(meuRefri.getPreco())) {
								JOptionPane.showMessageDialog(null, "O pre�o do refrigerante � R$" +meuRefri.getPreco()+"\n Pre�o na PROMO��O!", "PRE�O", JOptionPane.INFORMATION_MESSAGE);
							}else {                                                                                                                                                                                                      
								JOptionPane.showMessageDialog(null,  "O pre�o do refrigerante � R$" +meuRefri.getPreco()+"\n Pre�o NORMAL", "PRE�O", JOptionPane.INFORMATION_MESSAGE);
							}
			 		  }
			 		}
//			 		MOSTRAR DADOS
			 		
			 		if(r==2) {
			 		int opcao1 = JOptionPane.showInternalOptionDialog(null, "ESCOLHA UMA BEBIDA PARA MOSTRAR DADOS", "OP��ES ", JOptionPane.DEFAULT_OPTION,
						      JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[0]);
			 		
			 			if(opcao1==0) {
//			 				vinho
			 				JOptionPane.showMessageDialog(null, meuVinho.mostrarBebida());
			 			}
			 			
			 			if(opcao1==1) {
//			 				suco
			 				JOptionPane.showMessageDialog(null, meuSuco.mostrarBebida());
			 			}
			 			
			 			if(opcao1==2) {
//			 				refri
			 				
			 				
			 				JOptionPane.showMessageDialog(null, meuRefri.mostrarBebida());
			 			} 
			 		}
			 		}while(c<4);
			 
	}
}





