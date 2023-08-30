import java.util.Scanner;

import entitites.Luta;
import entitites.Lutadores;
public class Ringue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("INSIRA ABAIXO A QUANTIDADE DE LUTADORES QUE PARTICIPARAM DO TORNEIO DE UFC :");
		int n= sc.nextInt();
		
		//atributos
		Lutadores inf[] = new Lutadores[n];
		String nome,nacionalidade;
		int idade,vitorias,derrotas,empates,escolha,indiceLutador, indiceDesafiante, indiceDesafiado;
		double altura,peso;
		
		// desenrolar do codigo
		System.out.println("PREENCHA AS INFORMAÇOES ABAIXO :");
		
		for(int i=0;i<inf.length;i++) {
			
			System.out.println("INSCRIÇÃO : ");
			System.out.println();
			System.out.println("NUMERO DO LUTADOR : "+i);
			System.out.print("NOME DO LUTADOR  :");
			nome=sc.next();
			System.out.print("NACIONALIDADE : ");
		    nacionalidade = sc.next();
			System.out.print("IDADE : ");
			idade = sc.nextInt();
			System.out.print("ALTURA : ");
			altura = sc.nextDouble();
			System.out.print("PESO : ");
			peso = sc.nextDouble();
			System.out.print("VITORIAS : ");
			vitorias = sc.nextInt();
			System.out.print("DERROTAS : ");
			derrotas = sc.nextInt();
			System.out.print("EMPATES : ");
			empates = sc.nextInt();
			
			inf[i]= new Lutadores(nome,nacionalidade,idade,altura,peso,vitorias,derrotas,empates);
			
		}
	
		do {
			System.out.println("----MENU----");
			System.out.println("1- APRESENTAÇÃO DOS LUTADORES");
			System.out.println("2- STATUS DOS LUTADORES");
			System.out.println("3- ADICIONAR VITORIA");
			System.out.println("4- ADICIONAR DERROTA");
			System.out.println("5-ADICIONAR EMPATE");
			System.out.println("6- LUTA");
			System.out.println("7-SAIR DO PROGRAMA");
			System.out.println("INSIRA A OPÇÃO DESEJADA : ");
			escolha = sc.nextInt();
			System.out.println();
			
			
			// 1- APRESENTAÇÃO LUTADORES
			if(escolha==1) {
				System.out.println("----OS LUTADORES INSCRITOS SÃO :---- ");
				for(int i=0;i<inf.length;i++) {
					inf[i].apresentacao();
					System.out.println();
				}
			}
			
			// 2 - STATUS DE TODOS OS LUTADORES 
			else if(escolha==2){
				System.out.println("---- STATUS DOS LUTADORES : ----");
				for(int i=0;i<inf.length;i++) {
					System.out.println("LUTADOR : "+inf[i].getNome());
					inf[i].status();
					System.out.println();
				}
			}
			
			//3- ALTERAÇÃO VITORIA
			else if(escolha==3) {
				System.out.println("INSIRA O NUMERO DO LUTADOR QUE VOCÊ DESEJA MODIFICAR O NUMERO DE VITORIAS :");
				indiceLutador=sc.nextInt();
				inf[indiceLutador].ganharLuta();
				
				    System.out.println("ATUALIZAÇÃO :");
				    
				    for(int i=0;i<inf.length;i++) {
				    	System.out.println("LUTADOR :"+inf[indiceLutador].getNome());
						inf[indiceLutador].status();
					    System.out.println();
				    	
				    }
	        }
			
			//4- ALTERAÇÃO DERROTA
			else if(escolha==4) {
				System.out.println("INSIRA O NUMERO DO LUTADOR QUE VOCÊ DESEJA MODIFICAR O NUMERO DE DERROTAS :");
				indiceLutador=sc.nextInt();
				inf[indiceLutador].perderLuta();
				
				 System.out.println("ATUALIZAÇÃO :");
				    
				    for(int i=0;i<inf.length;i++) {
				    	System.out.println("LUTADOR : "+inf[indiceLutador].getNome());
						inf[indiceLutador].status();
					    System.out.println();
				  }
	         }
			
			//5 - ALTERAÇÃO EMPATE
			else if(escolha==5) {
				System.out.println("INSIRA O NUMERO DO LUTADOR QUE VOCÊ DESEJA MODIFICAR O NUMERO DE EMPATES :");
				indiceLutador=sc.nextInt();
				inf[indiceLutador].empatarLuta();;
				
				 System.out.println("ATUALIZAÇÃO :");
				    
				    for(int i=0;i<inf.length;i++) {
				    	System.out.println("LUTADOR : "+inf[indiceLutador].getNome());
						inf[indiceLutador].status();
					    System.out.println();
				  }
	         }
			
			// 6- LUTA
			else if (escolha == 6) {
				
				System.out.println("INSIRA O NUMERO DO DESAFIANTE : ");
				indiceDesafiante = sc.nextInt();
				
				System.out.println("INSIRA O NUMERO DO DESAFIADO : ");
				indiceDesafiado = sc.nextInt();
				
				
				
	
				Luta lutaAtual = new Luta(); // Crie uma instância da classe Luta
			    lutaAtual.marcarLuta(inf[indiceDesafiante], inf[indiceDesafiado]);
			    lutaAtual.lutar(inf[indiceDesafiante],inf[indiceDesafiado]);
			    System.out.println();
			}
			
			
			
		}while(escolha!=7);
		System.out.println("OBRIGADO POR UTILIZAR OS NOSSOS SISTEMAS DE OPERAÇÕES DA UFC-DEFERENTE.");
		System.out.println("SEGUE ABAIXO A LISTA FINAL DOS LUTADORES : ");
		
		for(int i=0;i<inf.length;i++) {
			inf[i].apresentacao();
			System.out.println();
		}
			
		
	
	}
}