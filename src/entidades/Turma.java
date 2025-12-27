package entidades;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private Integer codTurma;
	private String turno;
	private Integer qtdAlunos;
	private Professor professor;
	private List <Aluno> lista = new ArrayList<>();
	
	public Turma(Integer codTurma, String turno, Integer qtdAlunos, Professor professor) {
		this.codTurma = codTurma;
		this.turno = turno;
		this.qtdAlunos = qtdAlunos;
		this.professor = professor;
	}

	public Integer getCodTurma() {
		return codTurma;
	}

	public void setCodTurma(Integer codTurma) {
		this.codTurma = codTurma;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Integer getQtdAlunos() {
		return qtdAlunos;
	}

	public void setQtdAlunos(Integer qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getLista() {
		return lista;
	}

	public void setLista(List<Aluno> lista) {
		this.lista = lista;
	}
	
	public void addAluno(Aluno aluno) {
		lista.add (aluno);
	}
	
	public void removeAluno (Aluno aluno) {
		lista.remove(aluno);
	}
	

	@Override
	public String toString() {
		return "Turma [codTurma=" + codTurma + ", turno=" + turno + ", qtdAlunos=" + qtdAlunos + ", professor="
				+ professor.getNome() + "]";
	}
	
	

}
