package entitites;

import java.util.Random;

public class Luta {

    private Lutadores desafiado;
	private Lutadores desafiante;
	private int rounds;
	private boolean aprovada;
	
	
	
	
	// getters and setters
	
	
	// getters and setters Desafiado
	public Lutadores getDesafiado() {
		
		return desafiado;
	}
	
	public void setDesafiado(Lutadores desafiado) {
		this.desafiado=desafiado;
		
	}
	
	// getters and setters Desafiante
	public Lutadores getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutadores desafiante) {
		
		this.desafiante=desafiante;
	}
	
	
	// getters and setters rounds
	public int getRounds() {
		return rounds;
	}
	
	public void setRounds(int rounds) {
		
		this.rounds=rounds;
	}
	
	
	// getters and setters aprovado
	public boolean getAprovado() {
		return aprovada;
	}
	
	public void setAprovada(boolean aprovada) {
		this.aprovada=aprovada;
	}
	
	
	public void marcarLuta(Lutadores ft, Lutadores ft2) {
		
		if(ft.getCategoria().equals(ft2.getCategoria()) && ft!=ft2 ) {
			
			aprovada =true;
			this.desafiante =ft;
			this.desafiado = ft2;
			
		}
		
		else {
			
			System.out.println("Essa luta nao foi aprovada pela federaçao");
			aprovada = false;
			this.desafiado=null;
			this.desafiante = null;
		}
		
		
	}
	
	public void lutar(Lutadores ft, Lutadores ft2) {
		
		if ( aprovada == true) {
			
			System.out.println("----DESAFIANTE----");
			ft.apresentacao();
			System.out.println();
			
			System.out.println("----DESAFIADO----");
			ft2.apresentacao();
			System.out.println();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			switch(vencedor) {
			
			case 0:
				System.out.println("LUTA TERMINOU EM EMPATE");
				ft.empatarLuta();
				ft2.empatarLuta();
				break;
				
			case 1 :
				
				System.out.println(ft.getNome()+ "VENCEU !!!");
				ft.ganharLuta();
				ft2.perderLuta();
				break;
				
			case 2 :
				
				System.out.println(ft2.getNome()+" VENCEU !!!");
				ft.perderLuta();
				ft2.ganharLuta();
				break;
				
				
			}
			
			
		}
		
		else {
			System.out.println("NAO HOUVE LUTA.");
		}
		
	}
	
	

}
    
