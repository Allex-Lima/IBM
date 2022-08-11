
public class Empregado {
	
	// Declaração dos atributos
	private String nome;
	private double salario;
	
	// Declaração do método construtor
	public Empregado(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	// Declaração dos métodos getters e setters
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String exibir() {
		return this.nome + ": R$ " + this.salario;
	}
	
	public void aumentarSalario(double percentual) {
		this.salario += (this.salario * percentual) / 100;
	}
}
