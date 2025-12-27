package executavel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import entidades.Aluno;
import entidades.Professor;
import entidades.Turma;

public class Programa {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String nome, email, departamento, curso, turno, cpf;
		double nota1, nota2, nota3, salario;
		int matricula, codTurma, op, qtdAlunos, op2, op3;
		List<Professor> listaProfessor = new ArrayList<>();
		List<Aluno> listaAluno = new ArrayList<>();
		List<Turma> listaTurma = new ArrayList<>();
		
		listaProfessor.add(new Professor ("João", "152.789.789-21", "jao@hotmail.com", 4000.00, "TI"));
		listaProfessor.add(new Professor ("Pedro", "789.899.455-02", "pedro@hotmail.com", 4000.00, "TI"));
		listaProfessor.add(new Professor ("Gabriel", "189.578.356-89", "gabriel@hotmail.com", 4000.00, "TI"));
		listaProfessor.add(new Professor ("Certinho", "789.562.489-78", "certinho@hotmail.com", 10000.00, "TI"));
		
		listaAluno.add(new Aluno ("Rodrigo", "789.456.123-03", "rd@gmail.com", 156897, 22.00, 78.0, 89.5, "Ciencia da computação"));
		listaAluno.add(new Aluno ("Leticia", "456.788.455-12", "leticia@gmail.com", 789655, 22.00, 78.0, 89.5, "Ciencia da computação"));
		listaAluno.add(new Aluno ("Walter", "003.789.665-88", "walter@gmail.com", 123456, 22.00, 78.0, 89.5, "Ciencia da computação"));
		listaAluno.add(new Aluno ("Fabricio", "987.654.321.01", "fabri@gmail.com", 89995, 22.00, 78.0, 89.5, "Ciencia da computação"));
		
		listaTurma.add(new Turma (78999, "Matutino", 10, listaProfessor.get(3)));
		listaTurma.add(new Turma (88988, "Noturno", 10, listaProfessor.get(0)));
		listaTurma.add(new Turma (123456, "Noturno", 10, listaProfessor.get(2)));
		
		Turma turma = null;
		do {

			op = menuPrincipal();
			switch (op) {
			case 1:
				do {
					op2 = menuCRUD();
					switch (op2) {
					case 1:
						System.out.println("Nome: ");
						sc.nextLine();
						nome = sc.nextLine();
						System.out.println("Matricula: ");
						matricula = sc.nextInt();
						System.out.println("CPF: ");
						sc.nextLine();
						cpf = sc.nextLine();
						System.out.println("E-mail: ");
						email = sc.next();
						System.out.println("Curso: ");
						sc.nextLine();
						curso = sc.nextLine();
						System.out.println("Nota 1: ");
						nota1 = sc.nextDouble();
						System.out.println("Nota 2: ");
						nota2 = sc.nextDouble();
						System.out.println("Nota 3: ");
						nota3 = sc.nextDouble();
						Aluno aluno = new Aluno(nome, cpf, email, matricula, nota1, nota2, nota3, curso);
						listaAluno.add(aluno);
						break;
					case 2:
						System.out.println("Informe a matrícula do aluno: ");
						matricula = sc.nextInt();
						boolean achou = false;
						for (Aluno obj : listaAluno) {
							if (matricula == obj.getMatricula()) {
								listaAluno.remove(obj);
								System.out.println("Aluno " + obj.getNome() + " removido com sucesso!");
								achou = true;
								break;
							} 
						}
						if (achou == false) {
							System.out.println("Aluno não encontrado!");
						}
						break;
					case 3:
						for (Aluno objAluno : listaAluno) {
							System.out.println(objAluno);
						}
						break;
					case 4:
						listaAluno.sort(Comparator.comparing(Aluno::getNome));
						System.out.println("Lista ordenada!");
						break;

					case 5:
						System.out.println("Informa a matricula do aluno: ");
						matricula = sc.nextInt();
						boolean achou3 = false;
						for (Aluno obj : listaAluno) {
							if (obj.getMatricula() == matricula) {
								achou3 = true;
								System.out.println("Qual dado deseja alterar? ");
								System.out.println("1. Nome");
								System.out.println("2. Matricula");
								System.out.println("3. CPF");
								System.out.println("4. E-mail");
								System.out.println("5. Curso");
								System.out.println("6. Nota 1");
								System.out.println("7. Nota 2");
								System.out.println("8. Nota 3");
								op3 = sc.nextInt();
								if (op3 == 1) {
									System.out.println("Informa o novo nome");
									sc.nextLine();
									nome = sc.nextLine();
									obj.setNome(nome);
									System.out.println("Nome alterado");
								} else if (op3 == 2) {
									System.out.println("Informe a nova matricula");
									matricula = sc.nextInt();
									obj.setMatricula(matricula);
									System.out.println("Matricula alterada!");
								} else if (op3 == 3) {
									System.out.println("Informe o novo CPF");
									cpf = sc.nextLine();
									obj.setCpf(cpf);
									System.out.println("CPF alterado!");
								} else if (op3 == 4) {
									System.out.println("Informe o novo e-mail");
									email = sc.next();
									obj.setEmail(email);
									System.out.println("E-mail alterado!");
								} else if (op3 == 5) {
									System.out.println("Informe o novo curso");
									sc.nextLine();
									curso = sc.nextLine();
									obj.setCurso(curso);
									System.out.println("Curso alterado!");
								} else if (op3 == 6) {
									System.out.println("Informe uma nova nota 1");
									nota1 = sc.nextDouble();
									obj.setNota1(nota1);
									System.out.println("Nota 1 alterada!");
								} else if (op3 == 7) {
									System.out.println("Informe uma nova nota 2 ");
									nota2 = sc.nextDouble();
									obj.setNota2(nota2);
									System.out.println("Nota 2 alterada!");
								} else if (op3 == 8) {
									System.out.println("Informe uma nova nota 3");
									nota3 = sc.nextDouble();
									obj.setNota3(nota3);
									System.out.println("Nota 3 alterada!");
								} else {
									System.out.println("Opção inválida");
								}
							}
							break;
						}
						if (achou3 == false) {
							System.out.println("Aluno não encontrado");
						}
						break;
					case 6:
						break;
					default:
						System.out.println("Opção inválida");
					}
				} while (op2 != 6);
				break;
			case 2:
				do {
					op = menuCRUD();
					switch (op) {
					case 1:
						System.out.println("Nome: ");
						sc.nextLine();
						nome = sc.nextLine();
						System.out.println("CPF: ");
						cpf = sc.nextLine();
						System.out.println("E-mail: ");
						email = sc.next();
						System.out.println("Salário: ");
						salario = sc.nextDouble();
						System.out.println("Departamento: ");
						departamento = sc.next();
						Professor professor = new Professor(nome, cpf, email, salario, departamento);
						listaProfessor.add(professor);
						break;
					case 2:
						System.out.println("Informe o CPF: ");
						sc.nextLine();
						cpf = sc.nextLine();
						boolean achou = false;
						for (Professor obj : listaProfessor) {
							if (cpf.equals(obj.getCpf())) {
								listaProfessor.remove(obj);
								System.out.println("Professor removido");
								achou = true;
								break;
							}
						}
						if (achou == false) {
							System.out.println("Professor não encontrado");
						}
						break;
					case 3:
						for (Professor obj : listaProfessor) {
							System.out.println(obj);
						}
						break;
					case 4:
						listaProfessor.sort(Comparator.comparing(Professor::getNome));
						System.out.println("Lista ordenada!");
						break;
					case 5:
						System.out.println("Informe o CPF: ");
						sc.nextLine();
						cpf = sc.nextLine();
						boolean achou3 = false;
						for (Professor obj : listaProfessor) {
							if (cpf.equals(obj.getCpf())) {
								achou3 = true;
								System.out.println("Qual dado deseja alterar?");
								System.out.println("1. Nome");
								System.out.println("2. CPF");
								System.out.println("3. E-mail");
								System.out.println("4. Salario");
								System.out.println("5. Departamento");
								op3 = sc.nextInt();
								if (op3 == 1) {
									System.out.println("Informe o novo nome: ");
									sc.nextLine();
									nome = sc.nextLine();
									obj.setNome(nome);
									System.out.println("Nome alterado!");
								} else if (op3 == 2) {
									System.out.println("Informe o novo CPF: ");
									sc.nextLine();
									cpf = sc.nextLine();
									obj.setCpf(cpf);
									System.out.println("CPF alterado!");
								} else if (op3 == 3) {
									System.out.println("Informe o novo E-mail: ");
									email = sc.next();
									obj.setEmail(email);
									System.out.println("E-mail alterado!");
								} else if (op3 == 4) {
									System.out.println("Salário alterado : ");
									salario = sc.nextDouble();
									obj.setSalario(salario);
									System.out.println("Salário atualizado!");
								} else if (op3 == 5) {
									System.out.println("Informe o novo departamento: ");
									departamento = sc.next();
									obj.setDepartamento(departamento);
									System.out.println("Departamento atualizado!");
								} else {
									System.out.println("Opção inválida!");
								}
							} 
							break;
						}
						if (achou3 == false) {
							System.out.println("Professor não encontrado");
						}
						break;
					case 6:
						break;
					default:
						System.out.println("Opção inválida!");
						break;
					}
				} while (op != 6);
				break;
			case 3:
				do {
					op2 = menuCRUD();
					switch (op2) {
					case 1:
						System.out.println("Código da turma: ");
						codTurma = sc.nextInt();
						System.out.println("Turno: ");
						turno = sc.next();
						System.out.println("Quantidade de alunos: ");
						qtdAlunos = sc.nextInt();
						System.out.println("Informe o CPF do Professor: ");
						sc.nextLine();
						cpf = sc.nextLine();
						Professor professor = null;
						for (Professor obj : listaProfessor) {
							if (cpf.equals(obj.getCpf())) {
								professor = obj;
							}
						}
						if (professor == null) {
							System.out.println("Professor não cadastrado");
						} else {
							turma = new Turma(codTurma, turno, qtdAlunos, professor);
							listaTurma.add(turma);
						}
						break;
					case 2:
						System.out.println("Informe o código da turma");
						codTurma = sc.nextInt();
						boolean achou = false;
						for (Turma obj : listaTurma) {
							if (codTurma == obj.getCodTurma()) {
								listaTurma.remove(obj);
								System.out.println("Turma removida!");
								achou = true;
								break;
							}
						}
						if (achou == false) {
							System.out.println("Turma não encontrada!");
						}
						break;
					case 3:
						for (Turma obj : listaTurma) {
							System.out.println(obj);
						}
						break;
					case 4:
						listaTurma.sort(Comparator.comparing(Turma::getCodTurma));
						System.out.println("Lista ordenada!");
						break;
					case 5:
						System.out.println("Informe o código da turma: ");
						codTurma = sc.nextInt();
						boolean achei = false;
						for (Turma obj : listaTurma) {
							if (codTurma == obj.getCodTurma()) {
								achei = true;
								System.out.println("Escolha uma opção: ");
								System.out.println("1. codTurma");
								System.out.println("2. Quantidade de alunos");
								System.out.println("3. Turno");
								System.out.println("4. Professor");
								op2 = sc.nextInt();
								if (op2 == 1) {
									System.out.println("Informe o novo código: ");
									codTurma = sc.nextInt();
									obj.setCodTurma(codTurma);
									System.out.println("Código alterado!");
								} else if (op2 == 2) {
									System.out.println("Informe a nova quantidade de alunos: ");
									qtdAlunos = sc.nextInt();
									obj.setQtdAlunos(qtdAlunos);
									System.out.println("Quantidade alterada!");
								} else if (op2 == 3) {
									System.out.println("Informe o novo turno");
									turno = sc.next();
									obj.setTurno(turno);
									System.out.println("Turno alterado!");
								} else if (op2 == 4) {
									for (Professor obj2 : listaProfessor) {
										System.out.println(obj2);
									}
									boolean achou2 = false;
									System.out.println("Informe o CPF do novo professor: ");
									sc.nextLine();
									cpf = sc.nextLine();
									for (Professor obj3 : listaProfessor) {
										if (cpf.equals(obj3.getCpf())) {
											obj.setProfessor(obj3);
											System.out.println("Professor alterado");
											achou2 = true;
											break;
										}
									}
									if (achou2 == false) {
										System.out.println("Professor não cadastrado");
									}
								} else {
									System.out.println("Opção inválida!");
								}
							break;
							}
						}
						if (achei == false) {
							System.out.println("Turma não encontrada");
						}
						break;

					}
				} while (op2 != 6);
				break;
			case 4:
				do {
					System.out.println("1. Adicionar aluno");
					System.out.println("2. Remover aluno");
					System.out.println("3. Listar Aluno X Turma");
					System.out.println("4. Sair");
					op2 = sc.nextInt();
					switch (op2) {
					case 1:
						for (Aluno obj : listaAluno) {
							System.out.println(obj);
						}
						System.out.println("Matricula: ");
						matricula = sc.nextInt();
						boolean achou = false;
						boolean achou2 = false;
						for (Aluno obj : listaAluno) {
							if (matricula == obj.getMatricula()) {
								achou = true;
								System.out.println("Código da turma: ");
								codTurma = sc.nextInt();
								for (Turma obj2 : listaTurma) {
									if (codTurma == obj2.getCodTurma()) {
										obj2.addAluno(obj);
										System.out.println("Aluno adicionado!");
										achou2 = true;
										break;
									}
								}
								break;
							}
						}
						if (achou == false) {
							System.out.println("Aluno não encontrado");
						}
						if (achou2 == false) {
							System.out.println("Turma não encontrada");
						}
						break;
					case 2:
						System.out.println("Informe o código da turma: ");
						codTurma = sc.nextInt();
						boolean achouu = false;
						boolean achouu2 = false;
						for (Turma obj : listaTurma) {
							if (codTurma == obj.getCodTurma()) {
								achouu = true;
								System.out.println("Matricula do aluno: ");
								matricula  = sc.nextInt();
								for (Aluno obj2: obj.getLista()) {
									if (matricula == obj2.getMatricula()) {
										achouu2 = true;
										obj.removeAluno(obj2);
										System.out.println("Aluno removido!");
										break;
									}
								}
							break;	
							}
						}
						if (achouu == false) {
							System.out.println("Turma não encontrada");
						}
						if (achouu2 == false) {
							System.out.println("Aluno não encontrado");
						}
						break;
					case 3:
						System.out.println("Informe o código da turma: ");
						codTurma = sc.nextInt();
						boolean achei = false;
						for (Turma obj : listaTurma) {
							if (codTurma == obj.getCodTurma()) {
								achei = true;
								System.out.println(obj.getLista());
								break;
							}
						}
						if (achei == false) {
							System.out.println("Turma não encontrada");
						}
						break;
					}
				} while (op2 !=4);
				break;

			}
		}while(op!=5);
		System.out.println("Saindo...");

	}

	public static int menuPrincipal() {
		System.out.println("Escolha uma opção: ");
		System.out.println("1. Aluno");
		System.out.println("2. Professor");
		System.out.println("3. Turmas");
		System.out.println("4. Associar Aluno X Turma");
		System.out.println("5. Sair");
		int op = sc.nextInt();
		return op;

	}

	public static int menuCRUD() {
		System.out.println("Escolha uma opção: ");
		System.out.println("1. Adicionar");
		System.out.println("2. Remover");
		System.out.println("3. Listar");
		System.out.println("4. Ordenar");
		System.out.println("5. Alterar");
		System.out.println("6. Sair");
		int op = sc.nextInt();
		return op;
	}

}
