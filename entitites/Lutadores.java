package entitites;

public class Lutadores {


    private String nome,nacionalidade,categoria;
	private int idade,vitorias,derrotas,empates;
	private double altura,peso;
	
	
	// metodo especial
	public Lutadores(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas , int empates) {
		
		this.nome= nome;
		this.nacionalidade= nacionalidade;
		this.idade=idade;
		this.altura=altura;
		this.setPeso(peso);
		this.vitorias=vitorias;
		this.derrotas=derrotas;
		this.empates=empates;
	}


	// getters and setters nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


    // getters and setters nacionalidade
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	// getters and setters Idade

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}


    // getters and setters Altura
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}


    // getters and setters Peso
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		setCategoria();
	}
	
	private void setCategoria() {
		
		if(peso<52.2) {
			categoria="INVÁLIDO";
		}
		else if(peso<=70.3) {
			categoria="LEVE";
		}
		else if(peso<=83.9) {
			categoria="MEDIO";
		}
		else if(peso<=120.2) {
			categoria = "MUTANTE MALUCO DEVORADOR DE IDOSOS";
		}
		else {
			categoria ="INVALIDO";
		}
			
	}
	
	public String getCategoria() {
		
		return categoria;
	}

	public int getVitorias() {
		return vitorias;
	}



	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}



	public int getDerrotas() {
		return derrotas;
	}



	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}


	public int getEmpates() {
		return empates;
	}



	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	public void apresentacao() {
		
		System.out.println("LUTADOR : "+nome);
		System.out.println("ORIGEM : "+nacionalidade);
		System.out.println("IDADE :"+idade+" anos");
		System.out.println("ALTURA : "+altura+" m(s)");
		System.out.println("PESO : "+peso+" KG");
		System.out.println("GANHOU :"+getVitorias());
		System.out.println("EMPATOU :" +getDerrotas());
		System.out.println("PERDEU : "+ getEmpates());
	}
	
	public void status() {
		
		System.out.println("VITORIAS : "+vitorias);
		System.out.println("DERROTAS : "+derrotas);
		System.out.println("EMPATES : "+empates);
	}
	
	public void ganharLuta() {
		
		this.setVitorias(this.getVitorias()+1);
	}
	
	public void perderLuta() {
		
		this.setDerrotas(this.getDerrotas()+1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
	}
	

}
    

