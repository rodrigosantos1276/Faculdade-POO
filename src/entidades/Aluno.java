package entidades;


public class Aluno extends Pessoa {
	private Integer matricula;
	private Double nota1;
	private Double nota2;
	private Double nota3;
	private String curso;
	
	public Aluno(String nome, String cpf, String email, Integer matricula, Double nota1, Double nota2, Double nota3,
			String curso) {
		super(nome, cpf, email);
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.curso = curso;
	}

	public Integer getMatricula() {
		return matricula;
	}



	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}



	public Double getNota1() {
		return nota1;
	}



	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}



	public Double getNota2() {
		return nota2;
	}



	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}



	public Double getNota3() {
		return nota3;
	}



	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [Nome: " + super.getNome() +", Matricula=" + matricula + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3
				+ ", curso=" + curso + "]";
	}

	
	
	

}
