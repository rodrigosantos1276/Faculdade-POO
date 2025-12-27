package entidades;

public class Professor extends Pessoa {
	private Double salario;
	private String departamento;
	
	public Professor(String nome, String cpf, String email, Double salario, String departamento) {
		super(nome, cpf, email);
		this.salario = salario;
		this.departamento = departamento;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
		
	@Override
	public String toString() {
		return "Professor " + super.toString() + String.format(" Salario: %.2f ", getSalario())+ " Departamento: " + departamento;
	}
	
	
	
	
	
	

}
